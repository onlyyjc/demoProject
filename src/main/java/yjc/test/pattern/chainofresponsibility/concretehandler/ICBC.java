package yjc.test.pattern.chainofresponsibility.concretehandler;

import yjc.test.pattern.chainofresponsibility.handler.PaymentTypeHandler;

/**
 * Created by yangjiachang on 2016/9/18.
 */
public class ICBC extends PaymentTypeHandler{

    public ICBC(){}

    public ICBC(PaymentTypeHandler handler){
        super(handler);
    }

    protected String getType(){
        return "ICBC";
    }

    protected void handler() {
        System.out.println("使用工行卡支付");
    }
}
