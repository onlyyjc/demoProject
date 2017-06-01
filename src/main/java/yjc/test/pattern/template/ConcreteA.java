package yjc.test.pattern.template;

/**
 * Created by yangjiachang on 2016/9/12.
 */
public class ConcreteA extends Template{

    @Override
    protected void queryData() {
        System.out.println("根据A的规则查询数据");
    }

    protected void page(){
        System.out.println("ConcreteA 分页");
    }
}
