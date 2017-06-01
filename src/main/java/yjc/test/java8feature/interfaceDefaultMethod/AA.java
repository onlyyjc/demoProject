package yjc.test.java8feature.interfaceDefaultMethod;

/**
 * Created by yangjiachang on 2016/9/26.
 */
public interface AA {

    static void helloWorld(){
        System.out.println("hello world");
    }

    default void doSomething(){
        System.out.println("doSomething in AA");
    }
}
