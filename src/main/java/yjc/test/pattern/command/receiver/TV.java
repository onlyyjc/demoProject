package yjc.test.pattern.command.receiver;

/**
 * 定义了一个电视机作为命令的接受（执行）者
 * Created by yangjiachang on 2016/9/11.
 */
public class TV {
    public void on(){
        System.out.println("    打开电视");
    }
    public void off(){
        System.out.println("    关闭电视");
    }
}
