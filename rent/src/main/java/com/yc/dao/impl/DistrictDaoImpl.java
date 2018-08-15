package com.yc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.yc.bean.District;
import com.yc.bean.Street;
import com.yc.dao.DistrictDao;

@Repository
public class DistrictDaoImpl implements DistrictDao {

	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<District> getDistrictList() {
		return sqlSession.selectList("com.yc.dao.districtMapper.getDistrictList");
		
	}

	@Override
	public List<Street> getStreetByDistrictId(Integer id) {
		
		return sqlSession.selectList("com.yc.dao.streetMapper.getAllStreetById",id);
	}

}
