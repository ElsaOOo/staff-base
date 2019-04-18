package com.yezi.demob.config;

import com.yezi.demob.utils.OperationResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: yezi
 * @Date: 2019/4/18 07 55
 * @Description: 异常处理类
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(Exception.class)
    public OperationResult jsonErrorHandler(HttpServletRequest req, HttpServletResponse res, Exception e) {
        res.setStatus(HttpStatus.BAD_REQUEST.value());
        OperationResult result = new OperationResult();
        result.setMsg(e.getMessage());
        result.setReturnCode(res.getStatus() + "");
        return result;
    }

//    @ExceptionHandler(Exception.class)
//    public Object viewErrorHandler(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("error");
//        return  modelAndView;
//    }
}
