package yjc.test.pattern.facade;

/**
 * Created by yangjiachang on 2016/9/9.
 */
public class Service {
    private ServiceA a = new ServiceA();
    private ServiceB b = new ServiceB();
    private ServiceC c = new ServiceC();

    public void service(){
        System.out.println("Facade Pattern提供访问入口，解耦客户端程序调用");
        a.methodA();
        b.methodB();
        c.methodC();
    }
}
