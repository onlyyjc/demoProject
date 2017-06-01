package yjc.test.pattern.command.concretecommand;

import yjc.test.pattern.command.command.Command;
import yjc.test.pattern.command.receiver.Light;

/**
 * 开灯命令
 * Created by yangjiachang on 2016/9/11.
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
