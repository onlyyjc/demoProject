package yjc.test.pattern.proxy.simple;

/**
 * Created by yangjiachang on 2016/9/27.
 */
public class ConcreteTarget extends AbstractTarget {
    @Override
    public void dosomething() {
        System.out.println("go home");
    }
}
