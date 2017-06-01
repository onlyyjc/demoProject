package yjc.test.pattern.factory.abstractfactory;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class SportsCarFactory implements AbstractFactory {
    public Bmw produceBmw() {
        return new BmwSportsCar();
    }

    public Benz produceBenz() {
        return new BenzSportsCar();
    }
}
