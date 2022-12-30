package com.game;

public class Game {
	private int gameID;
	private int devID;
	private String name;
	private String description;
	private double price;
	
	public Game(int gameID, int devID, String name, String description, double price) {
		this.gameID = gameID;
		this.devID = devID;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}

	public int getDevID() {
		return devID;
	}

	public void setDevID(int devID) {
		this.devID = devID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
