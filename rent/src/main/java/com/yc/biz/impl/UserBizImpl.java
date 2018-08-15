package com.yc.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.bean.User;
import com.yc.biz.UserBiz;
import com.yc.dao.UserDao;
@Service
public class UserBizImpl implements UserBiz {

	@Resource(name = "userDaoImpl")
	private UserDao userDao;

	@Override
	public boolean register(User user) {
		
		return userDao.register(user);
	}

	@Override
	public boolean isvalid(User user) {

		return userDao.isvalid(user);
	}

	@Override
	public User login(User user) {

		return userDao.login(user);
	}

	@Override
	public User getByUserId(int id) {

		return userDao.getByUserId(id);
	}

}
