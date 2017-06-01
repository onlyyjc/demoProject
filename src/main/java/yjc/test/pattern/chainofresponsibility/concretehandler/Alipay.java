package yjc.test.pattern.chainofresponsibility.concretehandler;

import yjc.test.pattern.chainofresponsibility.handler.PaymentTypeHandler;

/**
 * Created by yangjiachang on 2016/9/18.
 */
public class Alipay extends PaymentTypeHandler {

    public Alipay(){}

    public Alipay(PaymentTypeHandler handler){
        super(handler);
    }

    protected String getType(){
        return "支付宝";
    }

    protected void handler() {
        System.out.println("使用支付宝支付");
    }
}
