package yjc.test.pattern.adapter;

/**
 * Created by yangjiachang on 2016/9/9.
 */
public class TargetImpl implements Target {
    public void targetMethod() {
        System.out.println("最初TargetImpl实现的targetMethod()，可是逐渐的不再适用");
    }
}
