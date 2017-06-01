package yjc.test.exception;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yangjiachang on 2016/9/9.
 */
public class ArrayStoreException {
//    public static void main(String[] args) {
//        String[] array = {"a","b"};
//        Object[] o = array;
//        System.out.println(o.getClass());
//        o[0] = new Object();
//    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b");
        System.out.println(list.getClass());
        Object[] o = list.toArray();
        System.out.println(o.getClass());
        o[0] = new Object();
    }
}
