package com.yc.utils;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.yc.bean.District;
import com.yc.bean.JsonModel;
import com.yc.bean.Street;
import com.yc.biz.DistrictBiz;

@Controller
public class StreetController {

	@Resource(name="districtBizImpl")
	private DistrictBiz districtBiz;
	@RequestMapping("street_list.action")
	public String add(District district,HttpSession session){
		List<Street> list=districtBiz.getStreetByDistrictId(district.getId());

		JsonModel jm=new JsonModel();
		jm.setRows(list);  //jm.setObj(list);

		Gson gson = new Gson();
		String result = gson.toJson(jm);

		session.setAttribute("jsonModel", result);
		return "result";
	}
}
