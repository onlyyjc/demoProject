package yjc.test.pattern.command.concretecommand;

import yjc.test.pattern.command.command.Command;
import yjc.test.pattern.command.receiver.TV;

/**
 * 开电视命令
 * Created by yangjiachang on 2016/9/11.
 */
public class TVOnCommand implements Command {

    private TV tv;

    public TVOnCommand(TV tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
