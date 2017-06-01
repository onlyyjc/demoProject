package yjc.test.pattern.command.concretecommand;

import yjc.test.pattern.command.command.Command;
import yjc.test.pattern.command.receiver.TV;

/**
 * 关电视命令
 * Created by yangjiachang on 2016/9/11.
 */
public class TVOffCommand implements Command {

    private TV tv;

    public TVOffCommand(TV tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
