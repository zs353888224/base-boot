package cn.wscq.name.domain.model.form;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @author shuai
 * @version 1.0
 * @description
 * @date 2017/12/14 14:18
 */
public class TestForm implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long testId;

    private String name;

    @Min(5)
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
