package yjc.test.pattern.state.concretestats;

import yjc.test.pattern.state.Stats;
import yjc.test.pattern.state.context.StatsMachine;

/**
 * 空仓状态,没有娃娃了
 * Created by yangjiachang on 2016/9/12.
 */
public class EmptyStats extends Stats {

    public EmptyStats(StatsMachine machine){
        this.machine = machine;
    }

    public EmptyStats(){
    }

    public void insertCoins() {
        System.out.println("没有娃娃了，不能投币，钱退还给你");
    }

    public void rock() {
        System.out.println("摇杆无效");
    }

    public void get() {
        System.out.println("不能抓娃娃");
    }

    public void supplement(int count) {
        machine.setCount(machine.getCount() + count);
        machine.setStats(machine.getWaitStats());
        System.out.println("补货完成，又有" + machine.getCount()+"个娃娃了");
    }
}
