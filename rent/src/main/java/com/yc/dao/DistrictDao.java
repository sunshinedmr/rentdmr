package com.yc.dao;

import java.util.List;
import java.util.Map;

import com.yc.bean.District;
import com.yc.bean.Street;

public interface DistrictDao {
	public List<District> getDistrictList();

	public List<Street> getStreetByDistrictId(Integer id);
}
