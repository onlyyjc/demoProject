package yjc.test.pattern.factory.simplefactory;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class Test {
    public static void main(String[] args) {
        Car c1 = SimpleFactory.produce("bmw");
        c1.description();
        Car c2 = SimpleFactory.produce("benz");
        c2.description();
    }
}
