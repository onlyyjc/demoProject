package yjc.test.pattern.demo;


/**
 * Created by yangjiachang on 2016/9/18.
 */
public class Cash extends EcouponCategoryHandler {

    public Cash(){}

    public Cash(EcouponCategoryHandler handler){
        super(handler);
    }

    protected Category getType(){
        return Category.CASH;
    }

    protected void concretecalc() {
        System.out.println("计算代金券的门槛");
    }

    @Override
    protected void concreteedit() {
        System.out.println("判断代金券能不能编辑");
    }
}
