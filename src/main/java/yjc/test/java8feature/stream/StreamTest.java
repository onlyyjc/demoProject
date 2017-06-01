package yjc.test.java8feature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yangjiachang on 2016/9/27.
 */
public class StreamTest {

    public static void main(String[] args) {
        List<Integer> foreachList = new ArrayList<>();
        List<List<Integer>> totalList = new ArrayList<>();
        for (int i = 1 ; i<= 1000 ; i++){
            List<Integer> list = new ArrayList<>();
            for (int j = 0 ; j<i;j++){
                list.add(j);
            }
            totalList.add(list);
        }
        long one = System.currentTimeMillis();
        List<Integer> streamList = totalList.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
        long two = System.currentTimeMillis();
        System.out.println(two-one);

        for (List<Integer> temp : totalList){
            foreachList.addAll(temp);
        }
        long three = System.currentTimeMillis();
        System.out.println(three-two);
        System.out.println(streamList.size() == foreachList.size());
        System.out.println(streamList.size());



        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

}
