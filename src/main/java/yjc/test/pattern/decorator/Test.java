package yjc.test.pattern.decorator;

import yjc.test.pattern.decorator.component.Animal;
import yjc.test.pattern.decorator.concretecomponent.Dog;
import yjc.test.pattern.decorator.concretedecorator.Jump;
import yjc.test.pattern.decorator.concretedecorator.Sleep;
import yjc.test.pattern.decorator.concretedecorator.Thought;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class Test {
    public static void main(String[] args) {
        //透明的装饰模式
        Animal animal = new Dog();
        animal.behavior();
        System.out.println();
        animal = new Jump(animal);
        animal.behavior();
        System.out.println();
        animal = new Sleep(animal);
        animal.behavior();
        System.out.println();
        //半透明的装饰模式
        Thought thought = new Thought(new Dog());
        thought.think();
        thought.behavior();
    }
}
