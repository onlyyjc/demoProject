package yjc.test.pattern.chainofresponsibility;

import yjc.test.pattern.chainofresponsibility.concretehandler.Alipay;
import yjc.test.pattern.chainofresponsibility.concretehandler.CMB;
import yjc.test.pattern.chainofresponsibility.concretehandler.ICBC;
import yjc.test.pattern.chainofresponsibility.concretehandler.WXPay;
import yjc.test.pattern.chainofresponsibility.handler.PaymentTypeHandler;

/**
 * Created by yangjiachang on 2016/9/18.
 */
public class Test {

    public static void main(String[] args) {
        //创建责任链节点
        PaymentTypeHandler handler1 = new Alipay();
        PaymentTypeHandler handler2 = new WXPay();
        PaymentTypeHandler handler3 = new ICBC();
        PaymentTypeHandler handler4 = new CMB();
        //组装责任链
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler3.setHandler(handler4);
        //每次都从链头开始执行
        handler1.pay("ICBC");
        handler1.pay("微信");
        handler1.pay("预付卡");
    }
}
