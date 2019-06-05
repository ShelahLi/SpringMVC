package com.lucky.controller;

import com.lucky.entity.Goods;
import com.lucky.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LTH.
 */

@RequestMapping("/AnnotationHandler")
@Controller
public class AnnotationHandler {
    /**
     * 业务方法：Model传值，String进行视图解析
     * @param model
     * @return
     */
    @RequestMapping("/ModelTest")
    public String ModelTest(Model model) {
        User user = new User();
        user.setName("Tom");
        model.addAttribute("user", user);
        return "index";
    }

    /**
     * 业务方法：Map传值进行，String进行视图解析
     * @param map
     * @return
     */
    @RequestMapping("/MapTest")
    public String MapTest(Map<String,User> map){
        User user = new User();
        user.setName("Jerry");
        map.put("user",user);
        return "index";
    }

    /**
     * 业务方法ModelAndView完成数据传递，视图解析
     * @return
     */
    @RequestMapping("/ModelAndViewTest")
    public ModelAndView ModelAndViewTest(){
        User user = new User();
        user.setName("Cat");
        //ModelAndView装载模型数据和逻辑视图
        ModelAndView modelAndView = new ModelAndView();
        //添加模型数据
        modelAndView.addObject("user",user);
        //添加模型视图
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/add")
    public ModelAndView add(Goods goods){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods",goods);
        modelAndView.setViewName("show");
        System.out.println(goods.getName()+":"+goods.getPrice());
        return modelAndView;
    }

}
