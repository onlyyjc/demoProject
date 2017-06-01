package yjc.test.pattern.command.concretecommand;

import yjc.test.pattern.command.command.Command;
import yjc.test.pattern.command.receiver.Light;

/**
 * 关灯命令
 * Created by yangjiachang on 2016/9/11.
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
