package yjc.test.pattern.factory.simplefactory;

import org.apache.commons.lang.StringUtils;

/**
 * Created by yangjiachang on 2016/8/28.
 */
public class SimpleFactory {
    public static Car produce(String car){
        if (StringUtils.equals("bmw",car)){
            return new Bmw();
        }
        if (StringUtils.equals("benz",car)){
            return new Benz();
        }
        return null;
    }
}
