package com.login.service;

import com.login.model.User;

public interface LoginService {
	public abstract   User create(User user);
	public abstract User readByUserIdAndPasswordService (User user);
	//public abstract User readByUserIdAndPassword(userId,password);
	
	public abstract User update(User user);
	public abstract User delete(int userid);
	

}
