package com.daoof.user;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.connectors.DbUtil;
import com.userspackage.Users;

public class UserDao implements AutoCloseable {
	
	private Connection con;
	public UserDao() throws SQLException {
		con = DbUtil.getConnection();		
	}
	
	@Override
	public void close() {
		try {
			if(con != null) 
				con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
public int AddUser(int id,String fName,String lName,String email,String password,Date dob,Boolean status,String role) {
	String sql = "Insert into users values(?,?,?,?,?,?,?,?)";
	try(PreparedStatement stmt = con.prepareStatement(sql)){
		stmt.setInt(1, id);
		stmt.setString(2, fName);
		stmt.setString(3, lName);
		stmt.setString(4, email);
		stmt.setString(5, password);
		java.sql.Date sDate =new java.sql.Date(dob.getTime()); 
		stmt.setDate(6, sDate);
		stmt.setBoolean(7, status);
		stmt.setString(8, role);
				
		return stmt.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
	
}

public int UpdateUser(int id,String fName,String lName,String email,String password,Date dob,Boolean status,String role) throws SQLException {
	String sql = "update users set first_name= ?,last_name=?,email=?,password=?,dob=?,status=?,role=? where id =?";
	try(PreparedStatement stmt = con.prepareStatement(sql)){
	stmt.setString(1, fName);
	stmt.setString(2, lName);
	stmt.setString(3, email);
	stmt.setString(4, password);
	java.sql.Date sDate =new java.sql.Date(dob.getTime()); 
	stmt.setDate(5, sDate);
	stmt.setBoolean(6, status);
	stmt.setString(7, role);
	stmt.setInt(8, id);
			
	return stmt.executeUpdate();
	
} 
}
public int DeleteUser(int id)throws SQLException {
	String sql = "Delete from users where id=?";
	try(PreparedStatement stmt = con.prepareStatement(sql)){
		stmt.setInt(1, id);
		return stmt.executeUpdate();
	}
	}


public List<Users> DisplayUser(int id) throws SQLException {
	List<Users> u = new ArrayList<>();
	String sql = "select * from users where id = ?";
	
	try(PreparedStatement stmt = con.prepareStatement(sql)){
		stmt.setInt(1, id);
		try(ResultSet rs =  stmt.executeQuery()){
			
			while(rs.next()) {
				int uid = rs.getInt("id");
				String fName = rs.getString("first_name");
				String lName = rs.getString("last_name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String dob = rs.getString("dob");
				Boolean status = rs.getBoolean("status");
				String role = rs.getString("role");
				
				Users us = new Users(uid,fName,lName,email,password,dob,status,role);
				u.add(us);
			}
		}
		
	}
	return u;
}
	
}
	
