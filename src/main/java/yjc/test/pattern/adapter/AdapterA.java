package yjc.test.pattern.adapter;

/**
 * Created by yangjiachang on 2016/9/9.
 */
public class AdapterA extends Adaptee implements Target{
    public void targetMethod() {
        System.out.println("1.类适配器，采用继承的方式实现");
        doSomething();
    }
}
