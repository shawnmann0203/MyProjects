create database if not exists socialnetwork;

use socialnetwork;
drop table if exists users;
drop table if exists posts;
drop table if exists comments;

create table users (
		id int(11) not null auto_increment,
		username varchar(15) not null,
		email varchar(15) not null,
		pass varchar(12) not null,
		first_name varchar(11) not null,
		last_name varchar(12) not null,
		date_of_birth datetime not null,
		primary key(id)

);

create table posts (
		id int(11) not null auto_increment,
		user_id int(11) not null,
		post_created datetime default current_timestamp,
		post varchar(255) not null,
		primary key(id),
		foreign key(user_id) references users(id)

);

create table comments (
		id int(11) not null auto_increment,
		user_id int(11) not null,
		post_id int(11) not null,
		comment_created datetime default current_timestamp,
		comment varchar(255) not null,
		primary key(id),
		foreign key(user_id) references users(id),
		foreign key(post_id) references posts(id)

);

show databases;
use socialnetwork;

insert into users (username, email, pass, first_name, last_name, date_of_birth) 
values ('SS0203', 'shawn@gmail.com', 'password', 'Shawn', 'Stroh', '1998-03-02');

insert into posts (user_id, post)
value (1, 'This is my first post ever!!!');

insert into comments (user_id, post_id, comment)
values (1, 1, 'Congrats on your first post!');

select * from users;

select u.username, c.comment, c.comment_created, p.post as "The post you commented on" from users u inner join comments c
on u.id = c.user_id 
inner join posts p on p.id = c.post_id
group by u.username;

show tables;