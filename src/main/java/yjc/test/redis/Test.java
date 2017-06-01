package yjc.test.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import java.io.UnsupportedEncodingException;

/**
 * Created by 杨家昌 on 2017/5/25.
 */
public class Test {

    public void demo () throws UnsupportedEncodingException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        JedisConnectionFactory jedisConnectionFactory = (JedisConnectionFactory) applicationContext.getBean("jedisConnectionFactory");
        RedisConnection redisConnection = null;
        try {
            redisConnection = jedisConnectionFactory.getConnection();
            byte[] key = "test-demo".getBytes("UTF-8");
            byte[] value = "hello world".getBytes("UTF-8");
            redisConnection.set(key, value);
            System.out.println(new String(redisConnection.get(key)));
        }finally {
            if (redisConnection != null){
                redisConnection.close();
            }
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {

    }


}
