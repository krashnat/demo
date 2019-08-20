package com.bridgelab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bridgelab.model.UserDetail;

public class UserDao {
	Connection con = null;
	PreparedStatement pstmt;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			System.out.println("Not regisrtering database");
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Not connecting to data base");
		}
		return con;
	}
	public  int register() {
		UserDetail detail=new UserDetail();
		int status=0;
		con=getConnection();
		try {
			pstmt=con.prepareStatement("insert into student value(?,?,?,?)");
			pstmt.setString(1, detail.getUsername());
			pstmt.setString(2, detail.getMobno());
			pstmt.setString(3, detail.getPassword());
			pstmt.setString(4, detail.getEmail());
			status=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Excep[tion in inserting");
		}
		return status;
		
	}
	

}
