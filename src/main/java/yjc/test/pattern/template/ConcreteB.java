package yjc.test.pattern.template;

/**
 * Created by yangjiachang on 2016/9/12.
 */
public class ConcreteB extends Template{

    @Override
    protected void queryData() {
        System.out.println("根据B的规则查询数据");
    }

    protected void sort(){
        System.out.println("ConcreteB 排序");
    }

    protected boolean needPage(){
        return false;
    }
}
