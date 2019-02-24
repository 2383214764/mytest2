package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/***
 *
 * @Author:shenkunlin
 * @Description:itheima
 * @date: 2019/1/24 10:21
 *
 ****/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    /****
     * 查询测试
     */
    @RequestMapping(value = "/list")
    public String list(Model model){

        //查询所有数据
        List<User> users = userService.findAll();;
        //数据存储回显
        model.addAttribute("users",users);
        System.out.println(users);
        return "list";
    }
    @RequestMapping(value = "/denglu",method = RequestMethod.POST)
    public String login(User user){
        //到Dao层去查找数据
       int arr= userService.findone(user);
      return "index";
    }
}
