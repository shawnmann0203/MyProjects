package entity;

import java.util.List;

public class Team {
	
	private int teamId;
	private String name;
	private String region;
	private List<Player> players;
	
	public Team(int teamId, String name, String region, List<Player> players) {
		this.setTeamId(teamId);
		this.setName(name);
		this.setRegion(region);
		this.setPlayers(players);
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	public String toString() {
		return "Team ID: " + Integer.toString(teamId) + " Name: " + this.name + " Region: " + this.region;
	}

}