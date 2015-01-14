drop table if exists hb_task;
drop table if exists hb_user;

create table hb_task (
	id INT auto_increment,
	title varchar(128) not null,
	description varchar(255),
	user_id INT not null,
    primary key (id)
) engine=InnoDB;

create table hb_user (
	id INT auto_increment,
	login_name varchar(64) not null unique,
	name varchar(64) not null,
	password varchar(255) not null,
	salt varchar(64) not null,
	roles varchar(255) not null,
	register_date timestamp not null default 0,
	primary key (id)
) engine=InnoDB;
