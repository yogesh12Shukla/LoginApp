package com.login.service;

import com.login.dao.LoginDao;
import com.login.dao.LoginDaoImpl;
import com.login.model.User;

public class LoginServiceImpl implements LoginService{

	@Override
	public User create(User user) {
		return null;
	}

	@Override
	public User readByUserIdAndPasswordService(User user) {
		//handle of data base
		User userDummy=null;
		if(user!=null)
		{
			LoginDao loginDao=new LoginDaoImpl();
			userDummy=loginDao.readByUserIdAndPassword(user);  
		}
		
		
		return userDummy;
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
