package yjc.test.java8feature;

import java.util.function.Predicate;

/**
 * Created by yangjiachang on 2016/9/21.
 */
@FunctionalInterface
public interface A<T> extends Predicate, MyPredicate {

    /**
     * 1.
     * 父接口 MyPredicate与 Predicate中存在相同的抽象方法：boolean test(T t);
     * 因此子接口中的功能也只有 boolean test(T t);
     */

    /**
     * 2.
     * 如果多个父接口有各自不同的抽象方法，则子接口也会存在继承多个抽象方法
     * 此时，子接口就不是函数式接口
     */
}
