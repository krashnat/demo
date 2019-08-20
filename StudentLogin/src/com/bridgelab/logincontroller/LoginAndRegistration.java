package com.bridgelab.logincontroller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelab.model.UserDetail;
import com.bridgelab.service.Services;
import com.bridgelab.serviceimplementation.ServiceImplementation;

/**
 * Servlet implementation class LoginAndRegistration
 */
@WebServlet(value = "/LoginAndRegistration")
public class LoginAndRegistration extends HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		Services  implement=new ServiceImplementation();
		int status=implement.doRegister(request);
			
			
		
		}
	}

	


