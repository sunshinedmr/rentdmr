package com.yc.biz;

import java.util.List;
import java.util.Map;

import com.yc.bean.House;
import com.yc.bean.JsonModel;

public interface HouseBiz {

	/**
	 * 根据id查某个房子的信息
	 * @param h
	 * @return
	 */
	public House getHouseBean(House h);

	public boolean addHouse(House house);

	public boolean updateHouse(House house);

	public boolean delHouse(int id);

	public boolean delHouses(List<House> ids);
	
	public List<House> searchHouse(Map<String,Object> map);
	
	public int getTotal();
}
