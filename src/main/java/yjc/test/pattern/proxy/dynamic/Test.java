package yjc.test.pattern.proxy.dynamic;


import java.lang.reflect.Proxy;

/**
 * Created by yangjiachang on 2016/9/27.
 */
public class Test {

    /**
     * 总结：
     *
     * 1.定义自己的InvocationHandler实现类BrokerInvocationHandler
     *
     * 2.通过Proxy类的newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)方法创建动态代理类
     *
     * 3.通过反射获取动态代理类的构造函数，并通过该构造函数创建代理类实例singer
     *
     * 4.被创建出来的实例singer继承了Proxy类(因此java动态代理只能代理接口，这是由java不支持多继承的设计决定的)，实现了目标接口SuperStar
     *
     * 5.调用singer的任意方法，实际上都会先调用到BrokerInvocationHandler中的invoke方法，
     * 然后通过反射调用Method的invode方法调用实际被代理的方法
     *
     * 6.调用到BrokerInvocationHandler中的invoke方法时，可以获得被代理方法的信息，
     * 因此可以在真正调用invoke方法前、后写上自己的业务逻辑
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        SuperStar singer = BrokerProxy.newProxyInstance(new Singer());
        singer.sing();
        singer.call();
        singer.dance();
        //true：说明singer的父类就是Proxy
        System.out.println(singer.getClass().getSuperclass() == Proxy.class);




    }
}
