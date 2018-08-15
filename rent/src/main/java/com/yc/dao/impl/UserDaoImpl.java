package com.yc.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.yc.bean.User;
import com.yc.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {
	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;

	@Override
	public boolean register(User user) {
		int result = sqlSession.insert("com.yc.dao.userMapper.saveUser",user);
		return result>0?true:false;
	}

	@Override
	public boolean isvalid(User user) {
		User result=sqlSession.selectOne("com.yc.dao.userMapper.getUserByName",user);
		if(result!=null){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public User login(User user) {

		return sqlSession.selectOne("com.yc.dao.userMapper.getUserByName",user);
	}

	@Override
	public User getByUserId(int id) {
		
		return sqlSession.selectOne("com.yc.dao.userMapper.getUserById",id);
	}

}
