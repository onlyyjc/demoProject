package yjc.test.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yangjiachang on 2016/9/27.
 */
public class BrokerInvocationHandler implements InvocationHandler {

    private SuperStar superStar;

    public BrokerInvocationHandler(SuperStar superStar){
        this.superStar = superStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("sing")){
            method.invoke(superStar,args);
            System.out.println("歌手同意了，我们准备准备就来");
            return null;
        }else if (method.getName().equals("dance")){
            System.out.println("跳舞别来找我们");
            return null;
        }else if (method.getName().equals("call")){
            System.out.println("人不在，有什么事找我好了");
            return null;
        }else {
            return null;
        }
    }
}
