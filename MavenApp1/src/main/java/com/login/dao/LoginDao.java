package com.login.dao;
 
import com.login.model.User;

public interface LoginDao {
	
	public abstract   User create(User user);
	public abstract User readByUserIdAndPassword(User user);
	//public abstract User readByUserIdAndPassword(userId,password);
	
	public abstract User update(User user);
	public abstract User delete(int userid);
	
	
}


