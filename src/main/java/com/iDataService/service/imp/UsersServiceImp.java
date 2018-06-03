package com.iDataService.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iDataService.dao.IUsersDao;
import com.iDataService.pojo.Users;
import com.iDataService.service.IUsersService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImp implements IUsersService {

	@Resource
	private IUsersDao usersDao;

	public Users getUsersById(Integer id) {
		return usersDao.findUserByid(id);
	}

	@Override
	public List<Users> getUsers() {
		return usersDao.getUsers();
	}

}
