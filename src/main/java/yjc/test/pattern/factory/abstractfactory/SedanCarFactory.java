package yjc.test.pattern.factory.abstractfactory;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class SedanCarFactory implements AbstractFactory {
    public Bmw produceBmw() {
        return new BmwSedanCar();
    }

    public Benz produceBenz() {
        return new BenzSedanCar();
    }
}
