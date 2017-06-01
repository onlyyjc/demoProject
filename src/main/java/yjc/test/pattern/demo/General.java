package yjc.test.pattern.demo;


/**
 * Created by yangjiachang on 2016/9/18.
 */
public class General extends EcouponCategoryHandler{

    public General(){}

    public General(EcouponCategoryHandler handler){
        super(handler);
    }

    protected Category getType(){
        return Category.GENERAL;
    }

    protected void concretecalc() {
        System.out.println("计算凭证券的门槛");
    }

    @Override
    protected void concreteedit() {
        System.out.println("判断凭证券能不能编辑");
    }
}
