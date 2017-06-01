package yjc.test;

/**
 * Created by yangjiachang on 2016/8/30.
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        Test.Do d = test.new Do();
        Thread thread = new Thread(d);
        System.out.println(thread.getId());
        thread.run();

        Thread u = new Test.Undo();
        u.run();
    }

    public class Do implements Runnable{
        public void run() {
            System.out.println("do something");
        }
    }

    public static class Undo extends Thread{
        public void run(){
            System.out.println(this.getId()+" undo something");
        }
    }
}
