import com.kkb.pojo.User;
import com.kkb.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class LoginServiceTest {
    @Resource
    private AdminService loginService = new AdminService();

    @Test
    public void loginInTest(){
        List<User> userList = loginService.checkLogin(1333333333, "123456");
        userList.forEach(System.out::println);
    }

}
