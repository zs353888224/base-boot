package cn.wscq.name.web.controller;

import cn.wscq.name.domain.dao.mybatis.TTestMapper;
import cn.wscq.name.domain.model.dto.APIResult;
import cn.wscq.name.domain.model.form.TestForm;
import cn.wscq.name.domain.model.mybatis.TTest;
import cn.wscq.name.domain.service.test.CommonTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author shuai
 * @version 1.0
 * @description
 * @date 2017/12/6 16:33
 */
@RestController
@RequestMapping("/test")
public class DomeController {

    @Autowired
    private TTestMapper testMapper;

    @Autowired
    private CommonTestService commonTestService;

    @GetMapping("/{testId}")
    public APIResult testGet(@PathVariable Long testId) {
//        commonTestService.findOne(1L);

        TTest test = testMapper.selectByPrimaryKey(1L);
        return APIResult.success().setMessage("get test success").setData(test);
    }

    @PostMapping
    public APIResult testPost(@RequestBody TestForm form) {
        TTest test = new TTest();
        test.setTestId(form.getTestId());
        test.setTestName(form.getName());
        testMapper.insert(test);
        return APIResult.success().setMessage("post test success").setData(test);
    }

    @DeleteMapping("/{testId}")
    public APIResult testDelete(@PathVariable Long testId) {
        TTest test = new TTest();
        test.setTestId(testId);
        test.setTestName("delete");
        return APIResult.success().setMessage("delete test success");
    }

    @PutMapping
    public APIResult testPut(@RequestBody TestForm form) {
        TTest test = new TTest();
        test.setTestId(form.getTestId());
        test.setTestName(form.getName());
        testMapper.updateByPrimaryKeySelective(test);
        return APIResult.success().setMessage("put test success");
    }
}