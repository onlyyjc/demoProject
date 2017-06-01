package yjc.demo.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by yangjiachang on 2016/7/21.
 */
@Component
public class SchedulerDemo {

    /**
     * 每隔5秒执行一次
     */
    @Scheduled(fixedRate = 1000*5)
    public void test1(){
        System.out.println("test1:"+System.currentTimeMillis());
    }

    /**
     * 每隔5秒执行一次
     */
    @Scheduled(cron = "*/5 * * * * ?")
    public void test2(){
        System.out.println("test2:"+System.currentTimeMillis());
    }


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-context.xml") ;
    }
}
