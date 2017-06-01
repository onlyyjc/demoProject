package yjc.test.pattern.command;

import yjc.test.pattern.command.concretecommand.LightOnCommand;
import yjc.test.pattern.command.concretecommand.TVOnCommand;
import yjc.test.pattern.command.invoker.MacroCommandController;
import yjc.test.pattern.command.receiver.Light;
import yjc.test.pattern.command.receiver.TV;

/**
 * Created by yangjiachang on 2016/9/11.
 */
public class Test {

    public static void main(String[] args) {
        MacroCommandController macro = new MacroCommandController();
        macro.execute(new LightOnCommand(new Light()),new TVOnCommand(new TV()));
        macro.undo();
        macro.redo();
    }


//    public static void main(String[] args) {
//        RemoteController remoteController = new RemoteController();
//        remoteController.execute(new LightOnCommand(new Light()));
//        remoteController.execute(new TVOnCommand(new TV()));
//        remoteController.undo();
//        remoteController.undo();
//        remoteController.redo();
//        remoteController.redo();
//    }
}
