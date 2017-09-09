package org.lanqiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ssc on 2017/9/1.
 */
@Controller
@RequestMapping("/test")
public class helloController {

    @RequestMapping("/hello.do")
    public String hello(){
        System.out.println("===123");
        return "hello";
    }

    @RequestMapping("/test.do")
    public String test(){
        //redirect重定向
        return "redirect:/test/hello.do";
    }
    @RequestMapping("/fortest.do")
    public String forword(){
        Map map=new HashMap();
        map.put("name","ssc");
        return "forward:/hello.jsp";
    }
    @RequestMapping("/forwardtest.do")
    public ModelAndView forwardtest(){
        Map map=new HashMap();
        map.put("name","ssc");
        return new ModelAndView("forward:/hello.jsp",map);
    }



}
