package yjc.test.pattern.state;


import yjc.test.pattern.state.context.StatsMachine;

/**
 * Created by yangjiachang on 2016/9/12.
 */
public enum  AllStats {

    EMPTY{

        private StatsMachine machine;
        public void insertCoins() {
            System.out.println("没有娃娃了，不能投币，钱退还给你");
        }

        public void rock() {
            System.out.println("摇杆无效");
        }

        public void get() {
            System.out.println("不能抓娃娃");
        }

        public void supplement() {
            System.out.println("补货完成，又有娃娃了");
//        machine.setStats(new WaitStats());
        }

        public StatsMachine getMachine() {
            return machine;
        }

        public void setMachine(StatsMachine machine) {
            this.machine = machine;
        }
    }

}
