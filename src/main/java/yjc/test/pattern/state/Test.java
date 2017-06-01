package yjc.test.pattern.state;

import yjc.test.pattern.state.context.StatsMachine;

/**
 * Created by yangjiachang on 2016/9/12.
 */
public class Test {

    public static void main(String[] args) {
        int count = 2;
        StatsMachine machine = new StatsMachine(count);
        for(int i=0 ; i<count+1 ; i++){
            System.out.println("当前状态:"+machine.getStats().getClass().getSimpleName());
            machine.insertCoins();
            System.out.println("当前状态:" + machine.getStats().getClass().getSimpleName());
            machine.rock();
            System.out.println("当前状态:" + machine.getStats().getClass().getSimpleName());
            machine.get();
            System.out.println();
        }
        machine.supplement(3);
        System.out.println("剩余数量：" + machine.getCount());
    }
}
