package yjc.test.pattern.strategy.context;

import yjc.test.pattern.strategy.strategy.Sort;

/**
 * Created by yangjiachang on 2016/9/13.
 */
public class Context {
    private Sort sort;

    public Context(Sort sort){
        this.sort = sort;
    }

    public void sort(){
        System.out.println("创建一个数组");
        sort.sort();
        System.out.println("排序完成，返回结果");
    }
}
