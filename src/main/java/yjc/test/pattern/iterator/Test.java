package yjc.test.pattern.iterator;

import java.util.*;

/**
 * 迭代器模式（Iterator），提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示。
 * Created by yangjiachang on 2016/9/18.
 */
public class Test {

    /**
     * 迭代器模式，使用JDK中的Iterator
     * 这里的聚合元素指的就是List<String>，Set<Integer>，当然也可以是其他类型
     * 通过统一封装的方法，来访问不同的聚合元素：hasNext()方法判断是否有下一个元素，iterator.next()方法获取下一个元素
     * 不暴露该对象的内部表示：不管这里是String，Integer或者其他任务类型，通过迭代器模式不用关心内部表示
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","g","s","t");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("---------------------");

        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
