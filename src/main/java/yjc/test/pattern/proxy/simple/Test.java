package yjc.test.pattern.proxy.simple;

/**
 * Created by yangjiachang on 2016/9/27.
 */
public class Test {

    public static void main(String[] args) {
        AbstractTarget target = new MyProxy();
        target.dosomething();
    }
}
