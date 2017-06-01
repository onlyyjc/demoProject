import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yangjiachang on 2016/7/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-context.xml")
public class JUnitDemoTest extends AbstractJUnit4SpringContextTests {
    private static final Logger logger = Logger.getLogger(JUnitDemoTest.class);

    @Test
    public void test1(){
        logger.trace("trace");
        logger.debug("debug");

        String arg1="arg1";
        String arg2="arg2";
        //log4j
        if (logger.isInfoEnabled()){
            logger.info("arg1:"+arg1+" , arg2:"+arg2);
        }
        logger.warn("warn");
        logger.error("error");
        System.out.println("JUnit测试方法1");
    }

}
