package cn.wscq.name.domain.dao.mybatis;

import cn.wscq.name.domain.dao.BaseMapper;
import cn.wscq.name.domain.model.mybatis.TTest;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shuai
 * @version 1.0
 * @description
 * @date 2017/12/12 18:31
 */
@Mapper
public interface CommonTTestMapper extends BaseMapper<TTest, Long> {
}
