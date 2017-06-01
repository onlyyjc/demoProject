package yjc.test.pattern.proxy.simple;

/**
 * Created by yangjiachang on 2016/9/27.
 */
public class MyProxy extends AbstractTarget {
    //静态代理
    //编译期就已经明确指定了真实需要代理的类就是ConcreteTarget
    private AbstractTarget target = new ConcreteTarget();

    @Override
    public void dosomething() {
        target.dosomething();
    }
}
