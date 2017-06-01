package yjc.test.pattern.decorator.concretedecorator;

import yjc.test.pattern.decorator.component.Animal;
import yjc.test.pattern.decorator.decorator.Sports;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class Thought extends Sports{
    public Thought(Animal animal) {
        super(animal);
    }

    public void think(){
        System.out.println("这是一只会思考的动物");
    }
}
