package cn.wscq.name.domain.service.cache;

import cn.wscq.name.BaseTest;
import cn.wscq.name.MyTestsConfiguration;
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
 * @date 2017/12/12 14:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Import(MyTestsConfiguration.class)
public class CommonCacheServiceTest implements BaseTest{

    @Autowired
    private CommonCacheService commonCacheService;

    @Test
    public void saveString() {
        System.out.println("test");
        System.out.println("dsada");
        System.out.println("dsadadasda");
        System.out.println("dsada");
        System.out.println("dsada");
    }

    @Test
    public void saveString1() {
    }

    @Test
    public void saveObject() {
    }

    @Test
    public void saveObject1() {
    }

    @Test
    public void getString() {
    }

    @Test
    public void getObject() {
    }

    @Test
    public void delete() {
    }
}