package com.game;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GameDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	//Create game
	
	public static boolean insertGame(String name , String des , String price) {
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into games(game_id, dev_id, name, price, description)"
					+ "values(0 , 0 , '"+name+"' , '"+price+"' , '"+des+"')";
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
	
	
	//Search Game
	
	public static List<Game> search(String name) {
		
		ArrayList<Game> game = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from games where name = '"+name+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int gameId = rs.getInt(1);
				int devId = rs.getInt(2);
				String gname = rs.getString(3);
				double price = rs.getDouble(4);
				String des = rs.getString(5);
				
				Game g = new Game(gameId , devId , gname , des , price);
				game.add(g);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return game;
	}
	
	
	//Update Game
	
	public static boolean updateGame(String id , String name , String des , String price) {
		int convertedID = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update games set name='"+name+"', price='"+price+"', description='"+des+"' where game_id='"+convertedID+"'";
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
	
	
	//Delete Game
	
	public static boolean deleteGame(String id) {
		int convertedID = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from games where game_id = '"+convertedID+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			
		}
		
		return isSuccess;
	}
	
	
	//Display Game
	
	public static List<Game> getGameDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Game> game = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from game where game_id = '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int gameId = rs.getInt(1);
				int devId = rs.getInt(2);
				String gname = rs.getString(3);
				double price = rs.getDouble(4);
				String des = rs.getString(5);
				
				Game g = new Game(gameId , devId , gname , des , price);
				game.add(g);
			}
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return game;
	}
}
