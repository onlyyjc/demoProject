package yjc.test.pattern.factory.factorymethod;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class BmwFactory implements CarFactory{
    public Car produce() {
        return new Bmw();
    }
}
