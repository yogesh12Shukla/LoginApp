package com.login.dao;

import com.login.model.User;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User create(User user) {
		return null;
	}

	@Override
	public User readByUserIdAndPassword(User user) {
		if(user.getUserId()==123456 && user.getPassword().equals("secret12"))
		{
			user.setUserName("Hello");
		}
		
		if(user.getUserId()==423678 && user.getPassword().equals("hello12"))
		{
			user.setUserName("world");
		}
		return user;
	}

	

	@Override
	public User update(User user) {
		return null;
	}

	@Override
	public User delete(int userid) {
		return null;
	}

}
