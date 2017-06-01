package yjc.test.pattern.factory.factorymethod;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class Test {
    public static void main(String[] args) {
        Car c1 = new BenzFactory().produce();
        c1.description();
        Car c2 = new BmwFactory().produce();
        c2.description();
    }
}
