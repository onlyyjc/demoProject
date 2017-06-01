package yjc.test.pattern.decorator.decorator;

import yjc.test.pattern.decorator.component.Animal;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class Sports implements Animal {
    private Animal animal;

    public Sports(Animal animal){
        this.animal = animal;
    }

    public void behavior(){
        this.animal.behavior();
    }
}
