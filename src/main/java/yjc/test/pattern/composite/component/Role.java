package yjc.test.pattern.composite.component;

/**
 * Created by yangjiachang on 2016/9/18.
 */
public abstract class Role {

    private String name;

    public Role(){}

    public Role(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Role role);
    public abstract void remove(Role role);
    public abstract void display();
    public abstract Role getChild(int i);
}
