package yjc.test.pattern.proxy.dynamic;

/**
 * Created by yangjiachang on 2016/9/27.
 */
public class Singer implements SuperStar {

    @Override
    public void call() {
        System.out.println("我正在休息，不要打扰我");
    }

    @Override
    public void sing() {
        System.out.println("唱歌我在行，让我来");
    }

    @Override
    public void dance() {
        System.out.println("跳舞找dancer去");
    }
}
