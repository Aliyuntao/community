##项目练习-简单的社区
##
markdown:http://editor.md.ipandao.com/
         https://github.com/pandao/editor.md
##脚本

create table user
(
	id int auto_increment,
	account varchar(100),
	name varchar(30),
	token char(36),
	gmt_modified int,
	gmt_create bigint,
	constraint user_pk
		primary key (id)
);

create table question
(
	id int auto_increment,
	title varchar(50),
	description text,
	gmt_create bigint,
	gmt_modified int,
	creator int,
	comment_count int default 0,
	view_count int default 0,
	like_count int default 0,
	tag varchar(256),
	constraint question_pk
		primary key (id)
);

## mybatis自动生成命令
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
