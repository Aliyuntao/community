create table user
(
	id int auto_increment,
	account_id varchar(100),
	name varchar(30),
	token char(36),
	gmt_modified int,
	gmt_create bigint,
	avatar varchar(100)
	constraint user_pk
		primary key (id)
);