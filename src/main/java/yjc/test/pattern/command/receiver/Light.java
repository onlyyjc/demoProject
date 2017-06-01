package yjc.test.pattern.command.receiver;

/**
 * 定义了一个电灯作为命令的接受（执行）者
 * Created by yangjiachang on 2016/9/11.
 */
public class Light {
    public void on(){
        System.out.println("    开灯");
    }
    public void off(){
        System.out.println("    关灯");
    }
}
