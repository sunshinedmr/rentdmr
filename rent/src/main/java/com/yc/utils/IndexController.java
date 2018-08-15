package com.yc.utils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yc.bean.User;
import com.yc.biz.UserBiz;

@Controller
public class IndexController {
	@Resource(name="userBizImpl")
	private UserBiz userBiz;

	@RequestMapping(value="index.action",method=RequestMethod.GET)
	public String index(){
		return "login";
	}
	
	@RequestMapping(value="toRegister.action",method=RequestMethod.GET)
	public String toRegister(){
		return "register";
	}
	
	@RequestMapping(value="User_register.action",method=RequestMethod.POST)
	public String register(User user){
		boolean result=userBiz.register(user);
		if(result){
			return "login";
		}else{
			return "register";
		}
		
	}
	
	@RequestMapping(value="page/User_login.action",method=RequestMethod.POST)
	public ModelAndView login(User user,HttpSession session,HttpServletRequest request){
		
		ModelAndView mav=new ModelAndView();
		String zccode=(String)request.getParameter("zccode");
		String rand=session.getAttribute("rand").toString();
		if(!rand.equals(zccode)){
			request.setAttribute("msg", "验证码错误");
			mav.setViewName("login");
		}else{
			User u=userBiz.login(user);
			if(u!=null && !"".equals(u)){
			session.setAttribute("user", u);
				mav.setViewName("list");
				return mav;
			}else{
				request.setAttribute("msg", "用户名或密码错误");
				mav.setViewName("login");
			}
		}
		
		return mav;
	}
	
	//以为用户登录时通过submit提交的，既不支持ajax 也不用回传数据，而是回应一个页面名字，这样springmvc视图解析器就可以运行
	@RequestMapping("logout.action")
	public ModelAndView logout(User user,HttpSession session,HttpServletRequest request){
		ModelAndView mav=new ModelAndView();
		session.removeAttribute("user");
		mav.setViewName("login");
		return mav;
	}

}
