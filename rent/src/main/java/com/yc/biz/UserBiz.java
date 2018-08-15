package com.yc.biz;

import com.yc.bean.User;

public interface UserBiz {
	public boolean register(User user);

	public boolean isvalid(User user);

	public User login(User user);

	/**
	 * 根据id查用户
	 * 
	 * @param id
	 * @return
	 */
	public User getByUserId(int id);

}
