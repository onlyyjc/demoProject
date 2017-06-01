package yjc.test.pattern.chainofresponsibility.concretehandler;

import yjc.test.pattern.chainofresponsibility.handler.PaymentTypeHandler;

/**
 * Created by yangjiachang on 2016/9/18.
 */
public class CMB extends PaymentTypeHandler {

    public CMB(){}

    public CMB(PaymentTypeHandler handler){
        super(handler);
    }

    protected String getType(){
        return "CMB";
    }

    protected void handler() {
        System.out.println("使用招行卡支付");
    }
}
