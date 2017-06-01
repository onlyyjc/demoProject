package yjc.test.pattern.decorator.concretedecorator;

import yjc.test.pattern.decorator.component.Animal;
import yjc.test.pattern.decorator.decorator.Sports;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class Jump extends Sports {
    public Jump(Animal animal) {
        super(animal);
    }

    @Override
    public void behavior() {
        super.behavior();
        System.out.println("会跳");
    }
}
