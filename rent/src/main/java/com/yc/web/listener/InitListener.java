package com.yc.web.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.yc.bean.District;
import com.yc.bean.HouseType;
import com.yc.biz.DistrictBiz;
import com.yc.biz.HouseTypeBiz;

public class InitListener implements ServletContextListener {
	private ApplicationContext ac;

	public InitListener() {

	}

	public void contextInitialized(ServletContextEvent sce) {
		// 取application
		ServletContext application = sce.getServletContext();
		ac = WebApplicationContextUtils
				.getRequiredWebApplicationContext(application);
		HouseTypeBiz typeBiz = (HouseTypeBiz) ac.getBean("houseTypeBizImpl");
		List<HouseType> houseTypeList = typeBiz.getTypeList();

		application.setAttribute("houseTypeList", houseTypeList);
		System.out.println("houseTypeList=="+houseTypeList);
		DistrictBiz districtBiz = (DistrictBiz) ac.getBean("districtBizImpl");
		List<District> districtList = districtBiz.getDistrictList();
		application.setAttribute("districtList", districtList);

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
