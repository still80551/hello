package com.still.serice.impl;

import org.springframework.transaction.annotation.Transactional;

import com.still.dao.UserDao;
import com.still.domain.User;
import com.still.serice.UserService;

@Transactional
public class UserServiceImpl implements UserService {

	
	private UserDao UserDao;
	public void setUserDao(UserDao userDao) {
		UserDao = userDao;
	}
	
	
	@Override
	public User findById(Integer id) {
		
		
		
		return UserDao.findById(id);
		
	}

}
