package org.lanqiao.controller;

import org.lanqiao.bean.User;
import org.lanqiao.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ssc on 2017/9/2.
 */
@Controller
@RequestMapping("/user")
public class userController {
    @Autowired
    UserServiceImpl userService;
    //请求地址
    @RequestMapping("/reg.do")
    public String reg(User user){
        System.out.println(user);
        return "result";
    }

    @RequestMapping("/idtest.do")
    @ResponseBody
    public String id(Integer id){
        return "id="+id;
    }
    @RequestMapping("/alluser.do")
    public ModelAndView getAllUser(){
        List<User> list=userService.getAllUser();
        ModelAndView modelAndView=new ModelAndView("lookuser");
        modelAndView.addObject("userList",list);
        return modelAndView;
    }

    @RequestMapping("/condition.do")
    public ModelAndView getUserByCondition(User user){
        List<User> list=userService.getUserByCondition(user);
        System.out.println(list);
        Map map=new HashMap();
        map.put("userList",list);
        return new ModelAndView("lookuser",map);
    }

    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public  User findall(@PathVariable int id){
        User user=userService.getUserById(id);
        return user;
    }

}
