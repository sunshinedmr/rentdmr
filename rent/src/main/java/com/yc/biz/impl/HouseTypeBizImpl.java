package com.yc.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.bean.HouseType;
import com.yc.biz.HouseTypeBiz;
import com.yc.dao.HouseTypeDao;
@Service
public class HouseTypeBizImpl implements HouseTypeBiz {

	@Resource(name="houseTypeDaoImpl")
	private HouseTypeDao houseTypeDao;

	@Override
	public List<HouseType> getTypeList() {

		return houseTypeDao.getTypeList();
	}

}
