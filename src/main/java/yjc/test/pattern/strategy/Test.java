package yjc.test.pattern.strategy;

import yjc.test.pattern.strategy.context.Context;
import yjc.test.pattern.strategy.strategy.BubbleSort;
import yjc.test.pattern.strategy.strategy.ShellSort;

/**
 * Created by yangjiachang on 2016/9/13.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("1.客户端需要用希尔排序");
        Context contextA = new Context(new ShellSort());
        contextA.sort();
        System.out.println();
        System.out.println("2.客户端需要用冒泡排序");
        Context contextB = new Context(new BubbleSort());
        contextB.sort();
    }
}
