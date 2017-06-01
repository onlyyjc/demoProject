package yjc.test.pattern.facade;

/**
 * Created by yangjiachang on 2016/9/9.
 */
public class Test {
//    public static void main(String[] args) {
//        ServiceA a = new ServiceA();
//        ServiceB b = new ServiceB();
//        ServiceC c = new ServiceC();
//        a.methodA();
//        b.methodB();
//        c.methodC();
//    }

    public static void main(String[] args) {
        Service service = new Service();
        service.service();
    }
}
