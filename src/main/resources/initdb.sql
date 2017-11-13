	
	drop table if exists Campanha;
	drop table if exists Socio;
	
	create table Campanha (
		id numeric(20) not null,
		nome varchar(50) not null,
		nome_time varchar(50) not null,
		dt_inclusao date,
		dt_vigencia date,
		vigencia_alterada boolean not null,
		primary key (id)
	);
	
	create table Socio (
		id numeric(20) not null,
		s_nome varchar(100) not null,
		s_email varchar(100) not null,
		s_time varchar(50) not null,
		s_data_nascimento date,
		primary key (id)
	);
	
	commit;
