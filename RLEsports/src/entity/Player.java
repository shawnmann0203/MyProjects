package entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Player {
	
	private int playerId;
	private String username;
	private String role;
	
	public Player(int playerId, String username, String role) {
		this.setPlayerId(playerId);
		this.setUsername(username);
		this.setRole(role);
		
	}
	
	
	
	
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}
	
	public String toString() {
		return "Player ID: " + Integer.toString(playerId) + " Username: " + this.username + " Role: " + this.role;
	}

	

}
