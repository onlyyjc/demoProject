package yjc.demo.task.roundqueue;

/**
 * Created by yangjiachang on 2017/3/13.
 */
public class Test {
    public static void main(String[] args) {
        RoundQueue<Integer> queue=new RoundQueue<>(12);

        /* 添加数据 */
        for(int i=0;!queue.isFull();i++){
            queue.addLast(i);
        }

        System.out.println(" 1 indexOf :>"+queue.indexOf(1));
        System.out.println(" real size before :>"+queue.realSize());
        System.out.println(" first element :>"+queue.removeFirst());
        System.out.println(" real size after:>"+queue.realSize());

        if(!queue.isFull()){
            queue.addLast(10);
        }

        /*遍历结果*/
        while(!queue.isEmpty()){
            System.out.println(queue.removeFirst());
        }


    }
}
