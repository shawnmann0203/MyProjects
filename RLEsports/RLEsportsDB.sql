create database if not exists RLCSTeams;

use RLCSTeams;
drop table if exists players;
drop table if exists teams;

create table teams (
	id int(10) not null auto_increment,
	name varchar(50) not null,
	region set('North America', 'Europe') not null,
	primary key(id)

);

create table players (
	id int(10) not null auto_increment,
	user_name varchar(25) not null,
	role set('Starter', 'Sub', 'Coach') not null,
	team_id int(10) not null,
	primary key(id),
	foreign key(team_id) references teams(id)
);	