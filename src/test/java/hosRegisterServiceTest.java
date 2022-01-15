import com.github.pagehelper.PageInfo;
import com.kkb.service.hosService;
import com.kkb.vo.HosResultVO;
import javafx.application.HostServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class hosRegisterServiceTest {

    @Resource
    private hosService hosService;

    @Test
    public void queryAllTest(){
        HosResultVO hosResultVO = hosService.queryLook(1002);
        System.out.println(hosResultVO);
    }
}
