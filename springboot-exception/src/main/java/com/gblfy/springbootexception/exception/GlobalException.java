package com.gblfy.springbootexception.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: springboot_workspace
 * @description: 通过实现HandlerExceptionResolver接口，
 * 做全局异常处理
 * @author: gblfy
 * @create: 2019-02-24 10:53
 */
@Configuration
public class GlobalException implements HandlerExceptionResolver {
    /**
     * 这个方法返回值类型ModelAndView，可以左视图的定位，
     * 也可以做异常对象信息的传递
     * Exception 这个参数，当出现异常以后，他会将这个异常对象，
     * 注入给resolveException对象，在这个方法里，只要对异常
     * 类型进行判断，就可以创建不同的ModelAndView，然后再Mo
     * delAndView对象当中，通过设置视图的名称，添加异常对象，
     * 既可以实现异常页面的跳转了
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        //判断不同异常类型，做不同视图跳转
        if (ex instanceof NullPointerException) {
            mv.setViewName("error1");
        }
        if (ex instanceof ArithmeticException) {
            mv.setViewName("error2");
        }
        //key和页面取error信息的key相同
        mv.addObject("error", ex.toString());
        return mv;
    }
}
