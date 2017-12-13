package cn.wscq.name.web.common.error.exception;

/**
 * @author shuai
 * @version 1.0
 * @description
 * @date 2017/12/11 15:18
 */
public class BusinessException extends RuntimeException {

    private String code;
    private Object[] args;
    private Object data;

    public BusinessException(String code) {
        super();
        this.code = code;
    }

    public BusinessException(String code, Object[] args) {
        super();
        this.code = code;
        this.args = args;
    }

    public BusinessException(String code, Object data) {
        super();
        this.code = code;
        this.data = data;
    }

    public BusinessException(String code, Object[] args, Object data) {
        super();
        this.code = code;
        this.data = data;
        this.args = args;
    }

    public String getCode() {
        return code;
    }

    public Object[] getArgs() {
        return args;
    }

    public Object getData() {
        return data;
    }
}
