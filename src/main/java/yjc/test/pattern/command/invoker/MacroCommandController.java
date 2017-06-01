package yjc.test.pattern.command.invoker;

import yjc.test.pattern.command.command.Command;

import java.util.Stack;

/**
 * 宏命令处理
 *
 * Created by yangjiachang on 2016/9/11.
 */
public class MacroCommandController {

    /**
     * 宏命令
     */
    private Command[] commands;
    /**
     * 重新执行宏命令
     */
    private Stack<Command[]> redoMacroCommand = new Stack<Command[]>();
    /**
     * 撤销宏命令
     */
    private Stack<Command[]> undoMacroCommand = new Stack<Command[]>();

    public void execute(Command... commands){
        System.out.println("执行宏命令");
        this.commands = commands;
        for (Command command : commands){
            command.execute();
        }
        undoMacroCommand.add(commands);
    }

    public void undo(){
        System.out.println("撤销宏命令");
        if (undoMacroCommand.empty()){
            return;
        }
        Command[] lastCommand = undoMacroCommand.pop();
        for (Command command : lastCommand){
            command.undo();
        }
        redoMacroCommand.push(lastCommand);
    }

    public void redo(){
        System.out.println("重新执行宏命令");
        if (redoMacroCommand.empty()){
            return;
        }
        Command[] lastCommand = redoMacroCommand.pop();
        for (Command command : lastCommand){
            command.execute();
        }
        undoMacroCommand.push(lastCommand);
    }
}
