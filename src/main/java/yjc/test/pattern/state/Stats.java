package yjc.test.pattern.state;

import yjc.test.pattern.state.context.StatsMachine;

/**
 * 定义了4个娃娃机的行为
 * Created by yangjiachang on 2016/9/12.
 */
public abstract class Stats {

    //娃娃机实例
    protected StatsMachine machine;
    /**
     * 投币
     */
    public abstract void insertCoins();
    /**
     * 摇杆
     */
    public abstract void rock();
    /**
     * 抓娃娃
     */
    public abstract void get();
    /**
     * 补货
     */
    public abstract void supplement(int count);
}
