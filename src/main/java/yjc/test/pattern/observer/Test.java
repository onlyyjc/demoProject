package yjc.test.pattern.observer;

import yjc.test.pattern.observer.observer.MessageConsumer;
import yjc.test.pattern.observer.subject.MessageProducer;

/**
 *
 *
 * @Description
 * @Date 2015-7-31 下午4:47:31
 * @Author yangjiachang
 */
public class Test {

	public static void main(String[] args){
		MessageProducer producer = new MessageProducer();
		producer.addObserver(new MessageConsumer());
		producer.addObserver(new MessageConsumer());
		producer.addObserver(new MessageConsumer());
		System.out.println("当前共有" + producer.countObservers() + "个观察者");
		producer.pushMessage("您有一条新消息:aaa");
		producer.pushMessage("您有一条新消息:bbb");
	}
}
