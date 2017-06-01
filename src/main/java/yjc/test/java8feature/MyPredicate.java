package yjc.test.java8feature;

/**
 * Created by yangjiachang on 2016/9/22.
 */
@FunctionalInterface
public interface MyPredicate<T> {

    boolean test(T t);
}
