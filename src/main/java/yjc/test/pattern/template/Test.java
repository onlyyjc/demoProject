package yjc.test.pattern.template;

/**
 * Created by yangjiachang on 2016/9/12.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("A:");
        Template a = new ConcreteA();
        a.templateMethod();
        System.out.println("-------------------");
        System.out.println("B:");
        Template b = new ConcreteB();
        b.templateMethod();

    }
}
