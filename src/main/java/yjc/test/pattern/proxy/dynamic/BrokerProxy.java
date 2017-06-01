package yjc.test.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by yangjiachang on 2016/9/27.
 */
public class BrokerProxy {

    public static SuperStar newProxyInstance(SuperStar superStar){
        return (SuperStar) Proxy.newProxyInstance(superStar.getClass().getClassLoader(),
                superStar.getClass().getInterfaces(),new BrokerInvocationHandler(superStar) );
    }
}
