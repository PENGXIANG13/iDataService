package com.iDataService.dao;

import com.iDataService.pojo.Users;

import java.util.List;

public interface IUsersDao {

    Users findUserByid(Integer id);

    List<Users> getUsers();
}
