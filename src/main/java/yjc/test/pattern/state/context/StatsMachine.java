package yjc.test.pattern.state.context;

import yjc.test.pattern.state.Stats;
import yjc.test.pattern.state.concretestats.EmptyStats;
import yjc.test.pattern.state.concretestats.OperateStats;
import yjc.test.pattern.state.concretestats.WaitStats;

/**
 * 定义一个状态机，这里就是娃娃机
 * Created by yangjiachang on 2016/9/12.
 */
public class StatsMachine {
    //娃娃机存在的三个状态
    private Stats emptyStats = new EmptyStats(this);
    private Stats waitStats = new WaitStats(this);
    private Stats operateStats = new OperateStats(this);
    //记录当前状态
    private Stats stats;
    //娃娃数量
    private int count;

    //初始化
    public StatsMachine(int count){
        if (count <= 0){
            this.count = 0;
            this.stats = emptyStats;
        }else {
            this.count = count;
            this.stats = waitStats;
        }
    }

    /* 行为start */
    public void insertCoins(){
        stats.insertCoins();
    }
    public void rock(){
        stats.rock();
    }
    public void get(){
        stats.get();
    }
    public void supplement(int count){
        stats.supplement(count);
    }
    /* 行为end */

    //setting  getting
    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Stats getEmptyStats() {
        return emptyStats;
    }

    public Stats getWaitStats() {
        return waitStats;
    }

    public Stats getOperateStats() {
        return operateStats;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
