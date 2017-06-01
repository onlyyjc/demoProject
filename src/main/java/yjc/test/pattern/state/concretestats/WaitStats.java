package yjc.test.pattern.state.concretestats;

import yjc.test.pattern.state.Stats;
import yjc.test.pattern.state.context.StatsMachine;

/**
 * 等待投币状态
 * Created by yangjiachang on 2016/9/12.
 */
public class WaitStats extends Stats {
    public WaitStats(StatsMachine machine){
        this.machine = machine;
    }

    public WaitStats(){}

    public void insertCoins() {
        System.out.println("投币成功，你可以开始抓娃娃了");
        machine.setStats(machine.getOperateStats());
    }

    public void rock() {
        System.out.println("摇杆无效，请先投币");
    }

    public void get() {
        System.out.println("不能抓娃娃，请先投币");
    }

    public void supplement(int count) {
        machine.setCount(machine.getCount() + count);
        System.out.println("补货完成，又有" + machine.getCount()+"个娃娃了");
    }
}
