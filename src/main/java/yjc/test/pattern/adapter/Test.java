package yjc.test.pattern.adapter;

/**
 * Created by yangjiachang on 2016/9/9.
 */
public class Test {

    public static void main(String[] args) {
        //最初的实现方法，在项目迭代过程中逐渐不再适用，需要新的逻辑来实现这个接口
        Target target = new TargetImpl();
        target.targetMethod();

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        //1.类适配器，采用继承的方式实现
        Target adapterA = new AdapterA();
        adapterA.targetMethod();

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        //2.对象适配器，采用对象组合的方式实现
        Target adapterB = new AdapterB();
        adapterB.targetMethod();
    }
}
