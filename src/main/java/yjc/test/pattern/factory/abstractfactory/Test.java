package yjc.test.pattern.factory.abstractfactory;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class Test {
    public static void main(String[] args) {
        Bmw bmwSedanCar = new SedanCarFactory().produceBmw();
        bmwSedanCar.description();
        Bmw bmwSportsCar = new SportsCarFactory().produceBmw();
        bmwSportsCar.description();
        Benz benzSportsCar = new SportsCarFactory().produceBenz();
        benzSportsCar.description();
        Benz benzSedanCar = new SedanCarFactory().produceBenz();
        benzSedanCar.description();
    }
}
