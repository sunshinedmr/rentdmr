package com.yc.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.yc.bean.House;
import com.yc.bean.JsonModel;
import com.yc.bean.User;
import com.yc.biz.HouseBiz;

@Controller
public class HouseController {

	@Resource(name="houseBizImpl")
	private HouseBiz houseBiz;
	
	@RequestMapping("house_list.action")
	public String houseList(HttpServletRequest request,Integer pages,Integer pagesize,HttpSession session){
		Map<String,Object> map=new HashMap<String,Object>();
		int start=(pages-1)*pagesize;
		
		map.put("start", start);
		map.put("pagesize", pagesize);
		map.put("page", pages);
		List list=houseBiz.searchHouse(map);
		JsonModel jm=new JsonModel();
		jm.setCode(1);
		jm.setRows(list);
		jm.setPage(pages);
		jm.setTotal(houseBiz.getTotal());
		jm.setPagesize(pagesize);
		request.setAttribute("jsonModel", jm);
		
		session.setAttribute("list", jm.getRows());
		return "showList";
		
	}
	
	@RequestMapping("user/house_toAdd.action")
	public String houseToAdd(){
		return "add";
	}
	@RequestMapping(value="/user/house_doAdd.action", method=RequestMethod.POST)
	public String houseDoAdd(HttpSession session,House house){
		User user=(User) session.getAttribute("user");
		house.setUser_id(user.getId());
		boolean result=houseBiz.addHouse(house);
			return "list";
	}
	
	@RequestMapping("house_toUpdate.action")
	public String toUpdate(int id,HttpSession session,HttpServletRequest request){
		List<House> list=(List<House>) session.getAttribute("list");
		System.out.println("list==="+list);
		for(House house:list){
			if(house.getId()==id){
				request.setAttribute("house", house);
				System.out.println(house);
				break;
			}
		}
		//查出id所代表的house对象
		return "update";
	}
	@RequestMapping("user/house_doUpdate.action")
	public String doUpdate(House house,HttpSession session){
		User user=(User)session.getAttribute("user");
		house.setUser_id(user.getId());
		boolean result=houseBiz.updateHouse(house);
		System.out.println(result);
		return "list";
	
	}

	@RequestMapping("house_doDel.action")
	public String doDel(int id,HttpServletRequest request){
		boolean r=houseBiz.delHouse(id);
		JsonModel jm=new JsonModel();
		if(r){
			jm.setCode(1);
		}else{
			jm.setCode(0);
		}
		
		Gson gson=new Gson();
		String result=gson.toJson(jm);
		request.setAttribute("jsonModel",result);
		return "result";
	}
}
