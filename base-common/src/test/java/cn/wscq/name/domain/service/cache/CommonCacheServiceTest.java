package cn.wscq.name.domain.service.cache;

import cn.wscq.name.MyTestsConfiguration;
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
 * @date 2017/12/12 14:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Import(MyTestsConfiguration.class)
public class CommonCacheServiceTest {

    @Autowired
    private CommonCacheService commonCacheService;


    @Test
    public void saveString() {
        commonCacheService.saveString("redis-saveString", "saveString");
        Assert.assertEquals("saveString", commonCacheService.getString("redis-saveString"));
    }

    @Test
    public void saveString1() {
        commonCacheService.saveString("redis-saveString1", "saveString1", 10);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String rs = commonCacheService.getString("redis-saveString1");
                    Assert.assertEquals("saveString1", rs);
                    Thread.sleep(3);
                    rs = commonCacheService.getString("redis-saveString1");
                    Assert.assertEquals(null, rs);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
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