package com.pigindustry.springbootMybatisTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pigindustry.springbootMybatisTest.entity.User;
import com.pigindustry.springbootMybatisTest.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/login")
    public String login(User user) {
        return "login";
    }
    
    @RequestMapping(value = "/dologin")
    public String dologin(User user,Model model) {
        User user1 = userService.selectUser(user) ;
        if(user1 == null){
            model.addAttribute("msg", "用户名或者密码错误！！");
            return "result";
        }else {
            model.addAttribute("msg", "登录成功！！！");
            return "result";
        }
    }

}
