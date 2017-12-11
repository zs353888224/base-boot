package cn.wscq.name.web.common.error;

import cn.wscq.name.domain.model.dto.APIResult;
import cn.wscq.name.web.common.error.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author shuai
 * @version 1.0
 * @description
 * @date 2017/12/11 15:51
 */
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public APIResult handleGlobalException(HttpServletRequest request, BusinessException ex) {
        logger.error(ex.getMessage());
        return APIResult.failure().setMessage(messageSource.getMessage(ex.getCode(), ex.getArgs(), LocaleContextHolder.getLocale()));
    }
}
