package yjc.test.pattern.decorator.concretecomponent;

import yjc.test.pattern.decorator.component.Animal;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class Dog implements Animal {
    public void behavior() {
        System.out.println("小狗会跑");
    }
}
