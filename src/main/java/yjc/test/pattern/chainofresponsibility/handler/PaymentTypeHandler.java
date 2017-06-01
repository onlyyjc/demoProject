package yjc.test.pattern.chainofresponsibility.handler;

/**
 * Created by yangjiachang on 2016/9/18.
 */
public abstract class PaymentTypeHandler {

    //保存下一个handler节点
    private PaymentTypeHandler handler;

    public PaymentTypeHandler(){}

    public PaymentTypeHandler(PaymentTypeHandler handler){
        this.handler = handler;
    }

    public final void pay(String type){
        if (getType().equals(type)){
            //符合当前方式，直接调用方法
            this.handler();
        }else {
            //如果不符合当前方式，则换用下一种方式
            if (getHandler() != null){
                getHandler().pay(type);
            }else {
                //不符合当前方式，也没有指定下一种方式，则使用默认方式
                System.out.println("默认使用现金支付");
            }
        }
    }
    //子类实现，用于判断是否符合该handler类型
    protected abstract String getType();
    //子类实现具体的处理逻辑
    protected abstract void handler();

    public PaymentTypeHandler getHandler() {
        return handler;
    }

    public void setHandler(PaymentTypeHandler handler) {
        this.handler = handler;
    }
}
