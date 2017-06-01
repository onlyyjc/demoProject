package yjc.test.pattern.demo;

/**
 * Created by yangjiachang on 2016/12/9.
 */
public abstract class EcouponCategoryHandler {

    //保存下一个渠道节点
    private EcouponCategoryHandler handler;

    public EcouponCategoryHandler(){}

    public EcouponCategoryHandler(EcouponCategoryHandler handler){
        this.handler = handler;
    }


    /**
     * 计算是否符合门槛
     * @param type
     */
    public final void calc(Category type){
        if (getType()==type){
            //符合当前方式，直接调用方法
            this.concretecalc();
        }else {
            //如果不符合当前方式，则换用下一种方式
            if (getHandler() != null){
                getHandler().calc(type);
            }else {
                //不符合当前方式，也没有指定下一种方式，则使用默认方式
                System.out.println("使用默认方法");
            }
        }
    }

    public final void edit(Category type){
        if (getType()==type){
            //符合当前方式，直接调用方法
            this.concreteedit();
        }else {
            //如果不符合当前方式，则换用下一种方式
            if (getHandler() != null){
                getHandler().edit(type);
            }else {
                //不符合当前方式，也没有指定下一种方式，则使用默认方式
                System.out.println("使用默认方法");
            }
        }
    }






    //子类实现，用于判断是否符合该handler类型
    protected abstract Category getType();
    //子类实现具体的处理逻辑
    protected abstract void concretecalc();
    protected abstract void concreteedit();

    public EcouponCategoryHandler getHandler() {
        return handler;
    }

    public void setHandler(EcouponCategoryHandler handler) {
        this.handler = handler;
    }
}
