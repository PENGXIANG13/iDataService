package com.iDataService.dao;

import com.iDataService.pojo.Users;
import com.iDataService.service.IUsersService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class IUsersDaoTest {
    private static Logger logger = Logger.getLogger(IUsersDaoTest.class);
    @Autowired
    private IUsersService usersService;

    @Test
    public void findUserByid() {
        Users users = usersService.getUsersById(1);
        logger.info("姓名為：" + users.getUsername());
    }

    @Test
    public void getUsers() {
        List<Users> users = usersService.getUsers();
        for (Users user : users) {
            System.out.println(user.getUsername());
        }
    }
}