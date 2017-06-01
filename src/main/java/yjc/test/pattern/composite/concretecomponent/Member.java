package yjc.test.pattern.composite.concretecomponent;

import yjc.test.pattern.composite.component.Role;

/**
 * Created by yangjiachang on 2016/9/18.
 */
public class Member extends Role {

    public Member(){};

    public Member(String name){
        super(name);
    }

    @Override
    public void add(Role role) {
        System.out.println(this.getName()+"不能够添加组员");
    }

    @Override
    public void remove(Role role) {
        System.out.println(this.getName()+"不能够删除组员");
    }

    @Override
    public void display() {
        System.out.println(this.getName());
    }

    @Override
    public Role getChild(int i) {
        System.out.println(this.getName()+"没有组员");
        return null;
    }
}
