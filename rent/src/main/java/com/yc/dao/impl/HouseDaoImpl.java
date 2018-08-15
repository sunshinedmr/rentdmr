package com.yc.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.yc.bean.House;
import com.yc.bean.JsonModel;
import com.yc.dao.HouseDao;

@Repository
public class HouseDaoImpl implements HouseDao {
	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public House getHouseBean(House h) {

		return sqlSession.selectOne("com.yc.dao.houseMapper.findHouseCondition",h);
	}

	@Override
	public boolean addHouse(House house) {
		int result=sqlSession.insert("com.yc.dao.houseMapper.insertHouse",house);
		return result>0?true:false; 
	}

	@Override
	public boolean updateHouse(House house) {
		int result=sqlSession.update("com.yc.dao.houseMapper.updateHouse",house);
		return result>0?true:false; 
	}

	@Override
	public boolean delHouse(int id) {
		int result=sqlSession.update("com.yc.dao.houseMapper.delHouse",id);

		return result>0?true:false; 
	}

	@Override
	public boolean delHouses(List<House> ids) {

		//int result=sqlSession.update("com.yc.dao.houseMapper.delHouse",ids);

		return true; 
	}

	@Override
	public List<House> searchHouse(Map<String, Object> map) {
		return sqlSession.selectList("com.yc.dao.houseMapper.findHouseCondition", map);
		
	}

	@Override
	public int getTotal() {
		int r=sqlSession.selectOne("com.yc.dao.houseMapper.findHouseConditionCount");
		return r;
	}

}
