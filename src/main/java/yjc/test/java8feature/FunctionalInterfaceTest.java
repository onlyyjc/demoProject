package yjc.test.java8feature;

import java.util.function.Predicate;

/**
 * Created by yangjiachang on 2016/9/21.
 */
public class FunctionalInterfaceTest{

    public static void main(String[] args) throws InterruptedException {
        Predicate<Integer> p = a -> a % 2 == 1;
        System.out.println(p.test(5));
        System.out.println(p.test(2));
    }
}
