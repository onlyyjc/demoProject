package yjc.test.java8feature.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangjiachang
 * @Description:
 * @date 2018/9/21 16:35
 */
public class ParallelStreamTest {

    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        //100个任务
        List<Integer> totalList = new ArrayList<>();
        for (int i = 1 ; i<= 100 ; i++){
            totalList.add(i);
        }
        totalList.parallelStream().forEach(temp -> {
            System.out.println("当前任务"+ temp+"  线程："+ Thread.currentThread().getName());
            try {
                //每个任务2秒
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        long endTime = System.currentTimeMillis();
        System.out.println("耗时："+ (endTime-starTime)/1000);
    }
}
