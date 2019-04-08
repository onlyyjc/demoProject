package yjc.test.java8feature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author yangjiachang
 * @Description:
 * @date 2018/9/21 16:35
 */
public class ParallelStreamTest {

    public static void main(String[] args) {
        AtomicInteger num = new AtomicInteger(0);
        System.out.println(num);
        long starTime = System.currentTimeMillis();
        List<Integer> resultList = new ArrayList<>();
        //100个任务
        List<Integer> totalList = new ArrayList<>();
        IntStream.range(0,100000).forEach(totalList::add);
//        totalList.parallelStream().forEach(temp -> {
//            System.out.println("当前任务"+ temp+"  线程："+ Thread.currentThread().getName());
//            if (temp%2 == 0){
//                resultList.add(temp);
//            }
//
//        });

        totalList.parallelStream().forEach(temp -> {
            System.out.println("当前任务"+ temp+"  线程："+ Thread.currentThread().getName());
            resultList.add(temp);
            num.getAndIncrement();
        });
        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - starTime)/1000);
        System.out.println(resultList.size());
        System.out.println(num);
        System.out.println(totalList.size());
    }
}
