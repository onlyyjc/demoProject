package yjc.test.pattern.command.command;

/**
 * 命令接口
 * Created by yangjiachang on 2016/9/11.
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();
    /**
     * 撤销命令
     */
    void undo();
}
