package yjc.test.pattern.templateCallback;

/**
 * Created by yangjiachang on 2018/2/26.
 */
public class DoneTemplate {

    public void execute(WriterCallback callback){
        System.out.println("step 1");
        System.out.println("step 2");
        System.out.println(callback.doWrite());
        System.out.println("step 4");

    }

    public static void main(String[] args) {
        DoneTemplate template = new DoneTemplate();
        template.execute(() -> "step 3");
    }
}
