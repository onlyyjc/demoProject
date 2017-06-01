package yjc.test.pattern.composite.concretecomponent;

import yjc.test.pattern.composite.component.Role;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangjiachang on 2016/9/18.
 */
public class TeamLeader extends Role {

    private List<Role> list;

    public TeamLeader(){
        list = new ArrayList<Role>();
    }

    public TeamLeader(String name){
        super(name);
        list = new ArrayList<Role>();
    }

    @Override
    public void add(Role role) {
        list.add(role);
    }

    @Override
    public void remove(Role role) {
        list.remove(role);
    }

    @Override
    public void display() {
        System.out.println(this.getName());
        for (Role p : list){
            p.display();
        }

    }

    @Override
    public Role getChild(int i) {
        System.out.println(this.getName()+"的第"+(i+1)+"个组员是"+list.get(i).getName());
        return list.get(i);
    }
}
