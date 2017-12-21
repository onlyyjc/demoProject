package yjc.test.container.RoundQueueScheduler;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.util.CollectionUtils;
import yjc.demo.task.roundqueue.RoundQueue;

import java.util.*;

/**
 * Created by yangjiachang on 2017/12/21.
 */
public class Test {

    public static RoundQueue<Set<Order>> queue = new RoundQueue<>(60);

    /**
     * 模拟处理大数据量订单过期
     *
     * 订单失效时间为1分钟
     *
     * 创建一个slot为60的环形队列，每秒钟处理一个slot，然后将其他slot向前移动一个
     * */
    public static void main(String[] args) throws InterruptedException {
        /** 初始化: 创建一个订单，放于队列末端，等待60秒后由系统处理失效逻辑 */
        init();
        /** 定义一个定时器，每隔一秒钟处理一遍失效逻辑 */
        scheduler();
        /** 模拟真实场景，随机创建订单 */
        createOrder();

    }

    public static void createOrder() throws InterruptedException {
        while (true){
            Order order = new Order();
            Set<Order> set = queue.getLast();
            set.add(order);
            System.out.println(Thread.currentThread() +"createOrder: " + order);
            long ms = RandomUtils.nextLong(1, 1000);
            Thread.sleep(ms);
        }
    }

    public static void scheduler(){
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println("" + Thread.currentThread() + new Date());
                doBiz();
            }
        }, new Date(), 1000 );// 每秒执行一次
    }

    public static void doBiz(){
        Thread t = new Thread(()->{
            /** 取出队列头，获取需要处理的订单集合 */
            Set<Order> set = queue.removeFirst();
            queue.addLast(new HashSet<>());
            if (CollectionUtils.isEmpty(set)){
                return;
            }
            try {
                Thread.sleep(2000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /** 将订单失效 */
            for (Order item : set){
                item.setExpireTime(new Date());
                System.out.println(Thread.currentThread() + item.toString());
            }
        });
        t.start();


    }

    public static void init(){
        System.out.println("init queue start.");
        for (int i = 0 ; i < 60 ; i++){
            Set<Order> set = new HashSet<>();
            queue.addLast(set);
        }
        System.out.println("queue real size : " + queue.realSize());
        System.out.println("init queue end.");
    }
}
