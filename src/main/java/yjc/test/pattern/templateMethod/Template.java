package yjc.test.pattern.templateMethod;

/**
 * Created by yangjiachang on 2016/9/12.
 */
public abstract class Template {
    /**
     * 模板方法
     * 定义了这个业务逻辑的步骤，作为统一的入口
     */
    public final void templateMethod(){
        //1.通用的参数校验
        check();
        //2.查询数据,子类根据自身的逻辑查询数据
        queryData();
        //3.排序，提供默认的排序方法
        sort();
        //4.分页
        if(needPage()){
            page();
        }
        // …………
    }

    private void check(){
        System.out.println("接口参数校验成功");
    }
    protected void sort(){
        System.out.println("模板方法提供默认的排序规则");
    }
    protected void page(){
        System.out.println("模板方法提供默认的分页规则");
    }
    protected boolean needPage(){
        return true;
    }
    protected abstract void queryData();
}
