import com.suyu.Application;
import com.suyu.domain.User;
import com.suyu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestCase {
@Autowired
private UserService userService;
    @Test
    public void test1(){
        User user = new User();
        user.setPassword("123456");
        user.setUsername("nima");
        System.out.println(userService.insertSelective(user));
    }
}
