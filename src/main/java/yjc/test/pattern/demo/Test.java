package yjc.test.pattern.demo;

/**
 * Created by yangjiachang on 2016/12/9.
 */
public class Test {

    public static void main(String[] args) {
        //创建责任链节点
        EcouponCategoryHandler handler1 = new General();
        EcouponCategoryHandler handler2 = new Cash();
        //EcouponCategoryHandler handler3 = new mjq();
        //组装责任链
        handler1.setHandler(handler2);
        //handler2.setHandler(handler3);

        //每次都从链头开始执行
        handler1.calc(Category.CASH);
        handler1.edit(Category.GENERAL);



    }
}
