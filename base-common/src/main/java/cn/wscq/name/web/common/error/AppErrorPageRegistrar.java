package cn.wscq.name.web.common.error;

import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.stereotype.Component;

/**
 * @author shuai
 * @version 1.0
 * @description 处理系统之外的错误
 * @date 2017/12/11 16:09
 */
@Component
public class AppErrorPageRegistrar implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
//        registry.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/errors/errorRedirect"));
    }
}
