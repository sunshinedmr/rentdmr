package com.yc.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.bean.House;
import com.yc.bean.JsonModel;
import com.yc.biz.HouseBiz;
import com.yc.dao.HouseDao;
@Service
public class HouseBizImpl implements HouseBiz {

	@Resource(name = "houseDaoImpl")
	private HouseDao houseDao;

	@Override
	public House getHouseBean(House h) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("id", h.getId()+"");
		List<House> list=(List<House>) houseDao.getHouseBean(h);
		if(list!=null && list.size()>0){
			list.get(0);
		}else{
			return null;
		}
		return null;
	}

	@Override
	public boolean addHouse(House house) {
		
		return houseDao.addHouse(house);
	}

	@Override
	public boolean updateHouse(House house) {
		
		return houseDao.updateHouse(house);
	}

	@Override
	public boolean delHouse(int id) {

		return houseDao.delHouse(id);
	}

	@Override
	public boolean delHouses(List<House> ids) {

		return houseDao.delHouses(ids);
	}

	@Override
	public List<House> searchHouse(Map<String, Object> map) {

		return houseDao.searchHouse(map);
	}

	@Override
	public int getTotal() {
		return houseDao.getTotal();
	}

}
