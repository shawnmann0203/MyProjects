package doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Player;

public class PlayerDao {
	
	private Connection connection;
	private String GET_PLAYERS_BY_TEAM_ID_QUERY = "Select * from players where team_id = ?";
	private String CREATE_NEW_PLAYER_QUERY = "Insert into players(user_name, role, team_id) values (?,?,?)";
	private String DELETE_PLAYERS_BY_ID_QUERY = "Delete from players where id = ?";
	private String UPDATE_PLAYERS_BY_ID_QUERY = "Update players set team_id = ? where id = ?";
	
	public PlayerDao() {
		connection = DBConnection.getConnection();
	}
	
	public List<Player> getPlayerByTeamId(int teamId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_PLAYERS_BY_TEAM_ID_QUERY);
		ps.setInt(1, teamId);
		ResultSet rs = ps.executeQuery();
		List<Player> players = new ArrayList<Player>();
		
		while(rs.next()) {
			players.add(new Player(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		
		return players;

	}
	
	public void createNewPlayer(String username, String role, int teamId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_PLAYER_QUERY);
		ps.setString(1, username);
		ps.setString(2, role);
		ps.setInt(3, teamId);
		ps.executeUpdate();
	}
	
	public void deletePlayerById(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_PLAYERS_BY_ID_QUERY);
		ps.setInt(1, id);
		ps.executeUpdate();

	}
	
	public void updatePlayerById(int id, int teamId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_PLAYERS_BY_ID_QUERY);
		ps.setInt(1, teamId);
		ps.setInt(2, id);
		ps.executeUpdate();
	}
}
