package com.yc.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yc.bean.District;
import com.yc.bean.Street;
import com.yc.biz.DistrictBiz;
import com.yc.dao.DistrictDao;

@Service
public class DistrictBizImpl implements DistrictBiz {

	@Resource(name = "districtDaoImpl")
	private DistrictDao districtDao;

	@Override
	public List<District> getDistrictList() {

		return districtDao.getDistrictList();
	}

	@Override
	public List<Street> getStreetByDistrictId(Integer id) {
		List<Street> streets=null;
		Map<String,String> map=new HashMap<String,String>();
		map.put("id", id+"");
		return districtDao.getStreetByDistrictId(id);
	}

}
