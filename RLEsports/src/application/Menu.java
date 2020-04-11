package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import doa.PlayerDao;
import doa.TeamDao;
import entity.Player;
import entity.Team;



public class Menu {
	private TeamDao teamDao = new TeamDao();
	private PlayerDao playerDao = new PlayerDao();
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display RLCS Teams",
			"Display a Team and Roster",
			"Create a Team",
			"Delete a Team",
			"Create a Player",
			"Delete a Player",
			"Player Transfer",
			"Exit");
	
	public void start(){
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			
			try {
			if(selection.equals("1")) {
				displayTeams();
			} else if (selection.equals("2")) {
				displayTeam();
			} else if (selection.equals("3")) {
				createTeam();
			} else if (selection.equals("4")) {
				deleteTeam();
			} else if (selection.equals("5")) {
				createPlayer();
			} else if (selection.equals("6")) {
				deleteMember();
			} else if (selection.equals("7")) {
			  playerTransfer();
			} else if (!selection.equals("8")){
				System.out.println("Invalid entry. Please enter a valid option.");
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Press enter to continue....");
			scanner.nextLine();
			
		} while(!selection.contentEquals("8"));
	}

	private void playerTransfer() throws SQLException {
		System.out.println("Enter the Id of the player you wish to transfer: ");
		int playerId = Integer.parseInt(scanner.nextLine());
		displayTeams();
		System.out.println("Please select a team you would like to transfer player(" + playerId + ") to: ");
		int teamId = Integer.parseInt(scanner.nextLine());
		playerDao.updatePlayerById(playerId, teamId);
		System.out.println("Congrats, player " + playerId + " has been transfered to team " + teamId);
		Team team = teamDao.getTeamById(teamId);
		List<Player> players = playerDao.getPlayerByTeamId(teamId);
		System.out.println(team.toString());
		System.out.println("--------------ROSTE R--------------");
		for(Player player : players) {
			System.out.println("| " + player.toString() + " |");
		}
		System.out.println("----------------------------------");
		
		
	}

	private void deleteMember() throws SQLException {
		System.out.println("Please enter the id of the player you'd like to delete: ");
		int id = Integer.parseInt(scanner.nextLine());
		playerDao.deletePlayerById(id);
	}

	private void createPlayer() throws SQLException {
		System.out.println("Please enter the players username: ");
		String username = scanner.nextLine();
		String role = getRole();
		displayTeams();
		System.out.println("Please select a team id: ");
		int teamId = Integer.parseInt(scanner.nextLine());
		playerDao.createNewPlayer(username, role, teamId);
		
	}



	private void deleteTeam() throws SQLException {
		displayTeams();
		String choice = "";
		int id = 0;
		System.out.print("\nPlease enter the ID of the team you'd like to delete: ");
		choice = scanner.nextLine();
		id = Integer.parseInt(choice);
		teamDao.deleteTeamById(id);
		System.out.println("Deleted team ID: " + id);
		
		
		
		
	}

	private void createTeam() throws SQLException {
		System.out.print("Enter the name of the team:");
		String teamName = scanner.nextLine();
		String region = getRegion();
		teamDao.createNewteam(teamName, region);
		
	}

	private void displayTeam() throws SQLException {
		displayTeams();
		System.out.print("Please enter the Id of the team you'd like to see:\n");
		int teamId = Integer.parseInt(scanner.nextLine());
		Team team = teamDao.getTeamById(teamId);
		List<Player> players = playerDao.getPlayerByTeamId(teamId);
		System.out.println(team.toString());
		System.out.println("--------------ROSTER--------------");
		for(Player player : players) {
			System.out.println("| " + player.toString() + " |");
		}
		System.out.println("----------------------------------");
		
		
	}

	private void printMenu() {
		int counter = 1;
		System.out.println("Please select an option: \n------------------------------------");
		for(String option : options) {
			System.out.println("[" + counter + "] " + option);
			counter++;
		}
		System.out.println("------------------------------------");
		
	}
	
	private void displayTeams() throws SQLException {
		List<Team> teams = teamDao.getTeams();
		for (Team team : teams) {
			System.out.println(team.toString());
		}
	}
	
	private String getRegion() {
		String choice = "";
		String region = "";
		int exit = 0;
		do {
			System.out.print("Please choose a region by number: 1) North America 2) Europe");
			choice = scanner.nextLine();
			if(choice.equals("1")) {
				region = "North America";
				exit = 1;
			} else if (choice.equals("2")) {
				region = "Europe";
				exit = 1;
			} else {
				System.out.println("Please choose a valid option.");
			}
		
		
		} while (exit != 1);
		
		return region;

		
	}
	
	private String getRole() {
		String choice = "";
		String role = "";
		int exit = 0;
		do {
			System.out.print("Please choose a player role by number: 1) Starter 2) Sub 3) Coach ");
			choice = scanner.nextLine();
			if(choice.equals("1")) {
				role = "Starter";
				exit = 1;
			} else if (choice.equals("2")) {
				role = "Sub";
				exit = 1;
			} else if (choice.equals("3")){
				role = "Coach";
				exit = 1;
			}else {
				System.out.println("Please choose a valid option.");
			}
		
		
		} while (exit != 1);		
		return role;
	}

}
