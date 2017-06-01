package yjc.test.java8feature.interfaceDefaultMethod;

/**
 * Created by yangjiachang on 2016/9/26.
 */
public interface CC extends AA,BB{
    //重新了父接口的默认方法
    default void doSomething(){
        System.out.println("doSomething in CC");
        //只有直接父类才可以通过XX.super.xxMethod()的方式调用父类默认方法
        AA.super.doSomething();
        BB.super.doSomething();
    }
}
