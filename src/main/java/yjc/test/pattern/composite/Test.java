package yjc.test.pattern.composite;

import yjc.test.pattern.composite.component.Role;
import yjc.test.pattern.composite.concretecomponent.Member;
import yjc.test.pattern.composite.concretecomponent.TeamLeader;

/**
 * Created by yangjiachang on 2016/9/18.
 */
public class Test {

    public static void main(String[] args) {
        Role p1 = new TeamLeader("张组长");
        Role p2 = new TeamLeader("陈组长");
        Role p3 = new Member("组员a");
        Role p4 = new Member("组员b");
        Role p5 = new Member("组员c");
        Role p6 = new Member("组员d");
        Role p7 = new Member("组员e");
        p1.add(p2);
        p1.add(p3);
        p1.add(p4);
        p1.add(p5);
        p2.add(p6);
        p2.add(p7);
        p1.display();
        p2.getChild(1);
        p5.getChild(1);
    }
}
