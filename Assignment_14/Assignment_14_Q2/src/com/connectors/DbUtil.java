package com.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static  final String  DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final  String  LOADER = "jdbc:mysql://localhost:3306/sunbeam";
	public static final String USER_NAME = "kd3_80201_afnan";
	public static final String PASSWORD = "manager";
	
	static {
		try {
			Class.forName(DRIVER);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		Connection con = DriverManager.getConnection(LOADER,USER_NAME,PASSWORD);
		return con;
		
	}
	
	
}

