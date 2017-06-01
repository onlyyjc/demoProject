package dao;

import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yjc.demo.dao.UserDao;
import yjc.demo.entities.User;
import yjc.framework.orm.db.OrderType;
import yjc.framework.orm.db.Pager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by yangjiachang on 2016/7/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-context.xml")
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

//    @Test()
//    public void insertTest(){
//            User user = new User();
//            user.setMobileNumber(RandomStringUtils.random(10,"abcdefghijkmn" ));
//            user.setGender(RandomUtils.nextBoolean() == true ? "male" : "female");
//            user.setNickName(RandomStringUtils.random(3,"abcdefghijkmnpqrstuvwxyz" ));
//            user.setPassword(RandomStringUtils.random(10,"abcdefghijkmnpqrstuvwxyz" ));
//            user.setSalt(RandomStringUtils.random(5,"abcdefghijkmnpqrstuvwxyz" ));
//            user.setUserName(user.getNickName() );
//            user.setAge(RandomUtils.nextInt(100));
//            user.setNativePlace(RandomStringUtils.random(1,"abcdefghijkmn" ));
//            userDao.insert(user);
//    }

    @Test
    public void batchInsertTest(){
            List<User> list = new ArrayList<>();
            for (int i = 1 ; i <100 ; i++){
                User user = new User();
                user.setMobileNumber((131000000+i)+"");
                user.setGender(RandomUtils.nextBoolean() == true ? "male" : "female");
                user.setNickName(RandomStringUtils.random(3,"abcdefghijkmnpqrstuvwxyz" ));
                user.setPassword(RandomStringUtils.random(10,"abcdefghijkmnpqrstuvwxyz" ));
                user.setSalt(RandomStringUtils.random(5,"abcdefghijkmnpqrstuvwxyz" ));
                user.setUserName(user.getNickName() + i);
                user.setAge(RandomUtils.nextInt(100));
                user.setNativePlace(RandomStringUtils.random(1,"abcdefghijkmn" ));
                list.add(user);
            }
            userDao.batchInsert(list);
    }

    @Test
    public void pageTest(){
        User user = new User();
        user.setGender("MALE");
        user.setStatus(1);
        Pager<User> pager = new Pager<>();
        pager.setCurrentPage(2);
        pager.setPageSize(5);
        pager.setOrderColumns("id");
        pager.setOrderType(OrderType.DESC);
        List<User> list =  userDao.query(pager ,user);
        list.forEach(e -> System.out.println(e.getId()));
    }

    @Test
    public void mybatisTest() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        DefaultSqlSessionFactory defaultSqlSessionFactory = (DefaultSqlSessionFactory) applicationContext.getBean("demoSqlSessionFactory");
        SqlSession sqlSession = defaultSqlSessionFactory.openSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setGender("MALE");
        user.setStatus(1);
        Pager<User> pager = new Pager<>();
        pager.setCurrentPage(2);
        pager.setPageSize(5);
        pager.setOrderColumns("id");
        pager.setOrderType(OrderType.DESC);

        List<User> list =  dao.query(pager, user);
        list.forEach(e -> System.out.println(e.getId()));
    }

}
