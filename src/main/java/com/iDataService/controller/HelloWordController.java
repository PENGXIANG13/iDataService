package com.iDataService.controller;

import com.iDataService.pojo.Users;
import com.iDataService.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloWordController {

    @Autowired
    private IUsersService usersService;

    @RequestMapping(value = "getUsers")
    public @ResponseBody
    List<Users> getUsers() {
        List<Users> users = usersService.getUsers();
        return users;
    }

}
