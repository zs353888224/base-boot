package cn.wscq.name.domain.service.test;

import cn.wscq.name.MyTestsConfiguration;
import cn.wscq.name.domain.model.mybatis.TTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author shuai
 * @version 1.0
 * @description
 * @date 2017/12/13 13:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Import(MyTestsConfiguration.class)
public class CommonTestServiceImplTest {

    @Autowired
    private CommonTestService commonTestService;

    @Test
    public void addData() {
        TTest test = commonTestService.findOne(1L);
        if (test == null) {
            test = new TTest();
            test.setTestId(1L);
            test.setTestName("zs");
            commonTestService.create(test);
        }
    }

    @Test
    public void getTTestByName() {
//        TTest test = commonTestService.getTTestById(1L);
//        Assert.assertNotNull(test);
//        Assert.assertEquals("zs", test.getTestName());
    }
}