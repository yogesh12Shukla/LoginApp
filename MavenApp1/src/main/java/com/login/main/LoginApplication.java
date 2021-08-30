package com.login.main;

import java.util.Scanner;

import com.login.model.User;
import com.login.service.LoginService;
import com.login.service.LoginServiceImpl;

public class LoginApplication {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id");
		int id=sc.nextInt();
		
		System.out.println("Enter password");
		String pwd=sc.next();
		
		//invoke Service
		
		LoginService loginService=new LoginServiceImpl();
		User user=new User();
		user.setUserId(id);
		user.setPassword(pwd);
		
		User ans=loginService.readByUserIdAndPasswordService(user);
		if(ans!=null) {
			System.out.println("welcome"+ ans.getUserName());
		}
	}

}
