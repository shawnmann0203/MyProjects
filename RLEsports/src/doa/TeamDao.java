package doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Team;

public class TeamDao {
	
	private Connection connection;
	private PlayerDao playerDao;
	private String GET_RLCS_TEAMS_QUERY = "Select * from teams";
	private String GET_RLCS_TEAM_BY_ID_QUERY = "Select * from teams where id = ?";
	private String CREATE_NEW_TEAM_QUERY = "Insert into teams(name, region) values(?,?)";
	private String DELETE_TEAM_BY_ID_QUERY = "Delete from teams where id = ?";
	
	public TeamDao() {
		connection = DBConnection.getConnection();
		playerDao = new PlayerDao();
	}
	
	public List<Team> getTeams() throws SQLException{
		ResultSet rs = connection.prepareStatement(GET_RLCS_TEAMS_QUERY).executeQuery();
		List<Team> teams = new ArrayList<Team>();
		
		while(rs.next()) {
			teams.add(populateTeam(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		
		return teams;
		
		
	}
	
	public Team getTeamById(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_RLCS_TEAM_BY_ID_QUERY);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return populateTeam(rs.getInt(1), rs.getString(2), rs.getString(3));
	}
	
	private Team populateTeam(int id, String name, String region) throws SQLException {
		return new Team(id, name, region, playerDao.getPlayerByTeamId(id));
	}
	
	public void createNewteam(String teamName, String region) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_TEAM_QUERY);
		ps.setString(1, teamName);
		ps.setString(2, region);
		ps.executeUpdate();
		
	}
	
	public void deleteTeamById(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_TEAM_BY_ID_QUERY);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

}
