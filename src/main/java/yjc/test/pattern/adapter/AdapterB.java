package yjc.test.pattern.adapter;

/**
 * Created by yangjiachang on 2016/9/9.
 */
public class AdapterB implements Target{

    private Adaptee adaptee = new Adaptee();

    public void targetMethod() {
        System.out.println("2.对象适配器，采用对象组合的方式实现");
        adaptee.doSomething();
    }
}
