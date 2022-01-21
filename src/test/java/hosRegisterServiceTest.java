import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Hosregister;
import com.kkb.service.hosService;
import com.kkb.vo.QueryHosVO;
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
        QueryHosVO vo = new QueryHosVO();
        PageInfo<Hosregister> test = hosService.queryByPage(1, vo);
        System.out.println(test);

    }
}
