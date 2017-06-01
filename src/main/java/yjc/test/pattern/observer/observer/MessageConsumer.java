package yjc.test.pattern.observer.observer;



import yjc.test.pattern.observer.subject.MessageProducer;

import java.util.Observable;
import java.util.Observer;

/**
 * 作为具体观察者，接受主题发送过来的消息，并完成自身业务逻辑
 * Created by yangjiachang on 2016/8/25.
 */
public class MessageConsumer implements Observer {

    public void update(Observable o, Object arg) {
        if(o instanceof MessageProducer){
            MessageProducer messageProducer = (MessageProducer)o;
            //获取消息
            String message = messageProducer.getMessage();
            //处理业务逻辑
            view(message);
        }
    }

    private void view(String message){
        System.out.println("阅读消息："+message);
    }
}
