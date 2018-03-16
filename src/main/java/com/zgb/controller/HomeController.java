package com.zgb.controller;

import com.zgb.entity.User;
import com.zgb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2018/3/16.
 */
@Controller
public class HomeController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("home.html")
    public String home(HttpServletRequest request){

        User user = userMapper.getUserByName("zhou");
        request.setAttribute("user", user);
        return "home";
    }

}
