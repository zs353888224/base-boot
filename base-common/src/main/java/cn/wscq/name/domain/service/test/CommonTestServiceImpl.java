package cn.wscq.name.domain.service.test;

import cn.wscq.name.domain.dao.mybatis.CommonTTestMapper;
import cn.wscq.name.domain.model.mybatis.TTest;
import cn.wscq.name.domain.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shuai
 * @version 1.0
 * @description
 * @date 2017/12/13 13:17
 */
@Service
public class CommonTestServiceImpl extends BaseServiceImpl<TTest, Long, CommonTTestMapper> implements CommonTestService {

    @Autowired
    @Override
    public void setRepository(CommonTTestMapper repository) {
        super.repository = repository;
    }

}
