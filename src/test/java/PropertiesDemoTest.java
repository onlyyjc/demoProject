import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yangjiachang on 2016/7/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-context.xml")
public class PropertiesDemoTest extends AbstractJUnit4SpringContextTests {

    @Value("${user.username}")
    private String username;
    @Value("${user.password}")
    private String password;

    @Test
    public void test(){
        System.out.println(username);
        System.out.println(password);

    }

}
