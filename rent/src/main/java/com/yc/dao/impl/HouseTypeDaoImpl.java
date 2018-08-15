package com.yc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.yc.bean.HouseType;
import com.yc.dao.HouseTypeDao;

@Repository
public class HouseTypeDaoImpl implements HouseTypeDao {

	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;


	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<HouseType> getTypeList() {

		return sqlSession.selectList("com.yc.dao.houseTypeMapper.getAllType");
	}

}
