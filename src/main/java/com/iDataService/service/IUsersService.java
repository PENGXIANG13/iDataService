package com.iDataService.service;

import com.iDataService.pojo.Users;

import java.util.List;

public interface IUsersService {
    Users getUsersById(Integer id);

    List<Users> getUsers();

}