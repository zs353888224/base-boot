package cn.wscq.name;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author shuai
 * @version 1.0
 * @description
 * @date 2017/12/12 14:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Import(MyTestsConfiguration.class)
public interface BaseTest {
}
