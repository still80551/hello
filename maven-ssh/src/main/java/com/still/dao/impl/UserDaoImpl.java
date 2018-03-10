package com.still.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.still.dao.UserDao;
import com.still.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User findById(Integer id) {
		return getHibernateTemplate().get(User.class, id);
	}

}
