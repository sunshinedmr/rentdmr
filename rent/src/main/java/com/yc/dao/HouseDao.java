package com.yc.dao;

import java.util.List;
import java.util.Map;

import com.yc.bean.House;

public interface HouseDao {

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
