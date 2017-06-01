package yjc.test.pattern.observer.subject;



import org.apache.commons.lang.StringUtils;

import java.util.Observable;

/**
 * 作为一个具体主题，当message发生更新时，向他所有的观察者发布最新的消息
 * Created by yangjiachang on 2016/8/25.
 */
public class MessageProducer extends Observable{

    private String message;

    public void pushMessage(String msg){
        if (StringUtils.isBlank(msg)){
            throw new NullPointerException();
        }
        if (StringUtils.equals(message,msg)){
            return;
        }
        message = msg;
        System.out.println("发布消息");
        //内部状态发生改变
        setChanged();
        //向观察者发布最新消息
        notifyObservers();
    }

    public String getMessage() {
        return message;
    }
}
