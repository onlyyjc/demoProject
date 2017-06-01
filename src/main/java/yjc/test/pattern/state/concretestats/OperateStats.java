package yjc.test.pattern.state.concretestats;

import yjc.test.pattern.state.Stats;
import yjc.test.pattern.state.context.StatsMachine;

/**
 * 操作摇杆状态，抓娃娃
 * Created by yangjiachang on 2016/9/12.
 */
public class OperateStats extends Stats {

    public OperateStats(StatsMachine machine){
        this.machine = machine;
    }
    public OperateStats(){
    }


    public void insertCoins() {
        System.out.println("已经投过钱币了，不要再投了，多的钱退给你");
    }

    /**
     * 摇杆
     */
    public void rock() {
        System.out.println("寻找一个最好的娃娃");
    }

    /**
     * 抓娃娃
     */
    public void get() {
        System.out.println("正在抓取娃娃……");
        int count = machine.getCount()-1;
        if(count > 0){
            machine.setCount(count);
            machine.setStats(machine.getWaitStats());
        }else {
            machine.setCount(count);
            machine.setStats(machine.getEmptyStats());
        }
        System.out.println("抓到娃娃，剩余："+machine.getCount());

    }

    public void supplement(int count) {
        System.out.println("用户正在操作，请稍后补货");
    }
}
