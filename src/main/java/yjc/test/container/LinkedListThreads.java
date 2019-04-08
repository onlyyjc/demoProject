package yjc.test.container;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author yangjiachang
 * @Description:
 * @date 2018/9/27 14:16
 */
public class LinkedListThreads {

//    public static LinkedList list = new LinkedList();
    public static ConcurrentLinkedQueue list = new ConcurrentLinkedQueue();

    public static void main(String [] args) throws InterruptedException{
        for(int i=0;i<100;i++){
            new Thread(new ListPut()).start();
        }
        Thread.sleep(3000L);
        System.out.println("List的变量size值为："+list.size());

        for(int i=0;i<list.size();i++){
            String temp = (String) list.poll();
            if(temp==null){
                System.out.println("第"+i+"个元素取出为null");
                return;
            }
        }
    }

}

class ListPut implements Runnable{

    @Override
    public void run() {
        //synchronized(ListPut.class){
        for(int i=0;i<1000;i++){
            LinkedListThreads.list.add("");
        }
        //}
        //System.out.println("线程"+Thread.currentThread().getId()+"已经结束了");
    }
}
