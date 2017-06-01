package yjc.test.java8feature.interfaceDefaultMethod;

/**
 * Created by yangjiachang on 2016/9/26.
 */
public class Test1 implements CC{

    public static void main(String[] args) {
        CC cc = new Test1();
        //调用接口的默认方法
        cc.doSomething();
        //调用接口的静态方法
        AA.helloWorld();
    }
}
