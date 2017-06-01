package yjc.test.pattern.chainofresponsibility.concretehandler;

import yjc.test.pattern.chainofresponsibility.handler.PaymentTypeHandler;

/**
 * Created by yangjiachang on 2016/9/18.
 */
public class WXPay extends PaymentTypeHandler {

    public WXPay(){}

    public WXPay(PaymentTypeHandler handler){
        super(handler);
    }

    protected String getType(){
        return "微信";
    }

    protected void handler() {
        System.out.println("使用微信支付");
    }
}
