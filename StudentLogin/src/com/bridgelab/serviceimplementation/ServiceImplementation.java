package com.bridgelab.serviceimplementation;

import javax.servlet.http.HttpServletRequest;

import com.bridgelab.dao.UserDao;
import com.bridgelab.model.UserDetail;
import com.bridgelab.service.Services;

public class ServiceImplementation implements Services  {
	UserDao access=new UserDao();
	
	public int doRegister(HttpServletRequest request) {
		UserDetail userdata=new UserDetail();
		String username = (String) request.getParameter("username");
		userdata.setUsername(username);
		String password = (String) request.getParameter("password");
		userdata.setPassword(password);
		String mobno = (String) request.getParameter("mobno");
		userdata.setMobno(mobno);
		String email = (String) request.getParameter("email");
		userdata.setEmail(email);
		int status=access.register();
		return status;
	
		
		
		
		
	}

	@Override
	public void doLogin() {
		
		
	}

}
