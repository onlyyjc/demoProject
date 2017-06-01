package yjc.test.pattern.decorator.concretedecorator;

import yjc.test.pattern.decorator.component.Animal;
import yjc.test.pattern.decorator.decorator.Sports;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class Sleep extends Sports{
    public Sleep(Animal animal) {
        super(animal);
    }

    public void behavior(){
        super.behavior();
        System.out.println("累了会睡觉");
    }

}
