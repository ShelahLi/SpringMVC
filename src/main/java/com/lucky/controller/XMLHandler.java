package com.lucky.controller;


import com.lucky.entity.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by LTH.
 */
public class XMLHandler implements Controller{

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        User user = new User();
        user.setName("Mouse");
        //ModelAndView装载模型数据和逻辑视图
        ModelAndView modelAndView = new ModelAndView();
        //添加模型数据
        modelAndView.addObject("user",user);
        //添加模型视图
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
