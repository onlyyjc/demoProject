package yjc.test.pattern.command.invoker;

import yjc.test.pattern.command.command.Command;

import java.util.Stack;

/**
 * 调用者：遥控器
 * 可对对电灯、电视进行开关、撤销、重做命令
 *
 * Created by yangjiachang on 2016/9/11.
 */
public class RemoteController {
    /**
     * 记录重做命令
     */
    private Stack<Command> redoCommands = new Stack<Command>();
    /**
     * 记录撤销命令
     */
    private Stack<Command> undoCommands = new Stack<Command>();;

    public void execute(Command command){
        System.out.println("执行命令");
        command.execute();
        undoCommands.add(command);
    }

    public void undo(){
        System.out.println("撤销命令");
        if (undoCommands.empty()){
            return;
        }
        Command lastCommand = undoCommands.pop();
        lastCommand.undo();
        redoCommands.push(lastCommand);
    }

    public void redo(){
        System.out.println("重新执行命令");
        if (redoCommands.empty()){
            return;
        }
        Command lastCommand = redoCommands.pop();
        lastCommand.execute();
        undoCommands.push(lastCommand);
    }
}
