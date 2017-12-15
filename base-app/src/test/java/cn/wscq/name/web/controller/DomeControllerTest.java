package cn.wscq.name.web.controller;

import cn.wscq.name.MyTestsConfiguration;
import cn.wscq.name.domain.model.dto.APIResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author shuai
 * @version 1.0
 * @description
 * @date 2017/12/13 16:04
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(MyTestsConfiguration.class)
public class DomeControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void test1() {
//        APIResult rs = testRestTemplate.getForObject("/test", APIResult.class);
//        Assert.assertEquals("test", rs.getMessage());
//
//        rs = testRestTemplate.getForObject("/test", APIResult.class);


    }

    @Test
    public void testPost() {
//        APIResult rs = testRestTemplate.postForObject("/test", null, APIResult.class);
//        Assert.assertEquals("test", rs.getMessage());
    }

    @Test
    public void testDelete() {
//        ResponseEntity<APIResult> rs = testRestTemplate.exchange("/test", HttpMethod.DELETE, (HttpEntity<?>) null, APIResult.class);
//        System.out.println(rs);
    }

    @Test
    public void testPut() {
//        testRestTemplate.put("/test", "");
    }
}