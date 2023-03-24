package com.example.loginapi.exception;

import com.example.commonutils.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class WebExceptionAdvice {


    @ExceptionHandler(RuntimeException.class)
    public CommonResult handleRuntimeException(RuntimeException e) {
        log.error(e.toString(), e);
        return CommonResult.error("服务器异常");
    }
}
