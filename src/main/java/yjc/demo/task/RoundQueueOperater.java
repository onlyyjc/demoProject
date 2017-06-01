package yjc.demo.task;


import org.apache.commons.lang3.RandomStringUtils;
import yjc.demo.task.roundqueue.RoundQueue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by yangjiachang on 2017/3/13.
 */
public class RoundQueueOperater {

    public Integer DEFAULT_INITIAL_CAPACITY = 10 ;

    public RoundQueue<Set<Integer>> queue;

    public Map<String,Integer> map = new HashMap<>();



    public void init() {
        //定义一个长度为10的环形队列（slot=10的数组）
        queue = new RoundQueue<>(DEFAULT_INITIAL_CAPACITY);
        for(int i = 0 ; i < DEFAULT_INITIAL_CAPACITY ; i++){
            Set set = new HashSet<>();
            setRandomNumeric(set, i);
            queue.addLast(set);
        }
        System.out.println("init data success");
        print();

    }

    private void print(){
        for (int index = 0 ; index < queue.realSize() ; index++ ){
            System.out.println("slot:"+index+" "+queue.get(index).toString());
        }
    }

    private void setRandomNumeric(Set set , int slot){
        for (int i = 0 ; i < 20 ; i++){
            String random = RandomStringUtils.randomNumeric(2);
            if (map.containsKey(random)){
                int index = map.get(random);
                if (null != queue.get(index)){
                    ((Set)queue.get(index)).remove(random);
                }
            }
            set.add(random);
            map.put(random,slot);
        }
    }

    public static void main(String[] args) {
        RoundQueueOperater roundQueueOperater = new RoundQueueOperater();
        roundQueueOperater.init();
    }

}
