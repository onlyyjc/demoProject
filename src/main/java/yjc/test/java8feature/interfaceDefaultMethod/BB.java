package yjc.test.java8feature.interfaceDefaultMethod;

/**
 * Created by yangjiachang on 2016/9/26.
 */
public interface BB {

    default void doSomething(){
        System.out.println("doSomething in BB");
    }
}
