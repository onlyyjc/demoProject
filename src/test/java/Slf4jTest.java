import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yangjiachang on 2016/9/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-context.xml")
public class Slf4jTest extends AbstractJUnit4SpringContextTests {

    private static final Logger logger = LoggerFactory.getLogger(Slf4jTest.class);
    @Test
    public void test1() {
        System.out.println("slf4j测试方法");
        String arg1 = "arg1";
        String arg2 = "arg2";
        String arg3 = "arg3";
        String arg4 = "arg4";
        logger.info("info");
        //slf4j
        logger.info("参数一：{}，参数二:{}", arg1, arg2);
        //slf4j-ap1 1.7以上版本支持3个以上参数
        logger.info("参数一：{}，参数二:{}，参数三:{}，参数四:{}", arg1, arg2, arg3, arg4);
    }

}
