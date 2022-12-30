package com.game;

import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;

public class UserDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	
	//Create User Account
	
	public static boolean insertUser(String name , String fname , String lname , String email , String phone , String gender , String dob , String password) {
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into user(id, email, password, admin_privileges, user_name, first_name, last_name, phone, gender, date_of_birth)"
					+ "values (0 , '"+email+"' , '"+password+"' , 0 , '"+name+"' , '"+fname+"' , '"+lname+"' , '"+phone+"' ,  '"+gender+"' , '"+dob+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
}
