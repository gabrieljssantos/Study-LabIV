drop schema if exists spring;

drop user if exists 'user'@'localhost';

create schema spring;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on spring.* to user@'localhost';

use spring;

create table usr_usuario (
  usr_id bigint unsigned not null auto_increment,
  usr_nome varchar(20) not null,
  usr_senha varchar(150) not null,
  primary key (usr_id),
  unique key uni_usuario_nome (usr_nome)
);

create table aut_autorizacao (
  aut_id bigint unsigned not null auto_increment,
  aut_nome varchar(20) not null,
  primary key (aut_id),
  unique key uni_aut_nome (aut_nome)
);

create table uau_usuario_autorizacao (
  usr_id bigint unsigned not null,
  aut_id bigint unsigned not null,
  primary key (usr_id, aut_id),
  foreign key aut_usuario_fk (usr_id) references usr_usuario (usr_id) on delete restrict on update cascade,
  foreign key aut_autorizacao_fk (aut_id) references aut_autorizacao (aut_id) on delete restrict on update cascade
);

create table ant_anotacao (
  ant_id bigint unsigned not null auto_increment,
  ant_texto varchar(256) not null,
  ant_data_hora datetime not null,
  ant_usr_id bigint unsigned not null,
  primary key (ant_id),
  foreign key ant_usr_fk (ant_usr_id) references usr_usuario(usr_id)
);

create table tra_trabalho (
  tra_id bigint primary key auto_increment,
  tra_titulo varchar(100) not null unique,
  tra_data_hora_entrega datetime not null,
  tra_descricao varchar(200),
  tra_grupo varchar(20) not null,
  tra_nota bigint,
  tra_justificativa varchar(100)
);

create table rac_racao (
  rac_id bigint primary key auto_increment,
  rac_marca varchar(100) not null unique,
  rac_data_hora_ultima_compra datetime not null,
  rac_quantidade_estoque float,
  rac_nota int not null
);

insert into usr_usuario (usr_nome, usr_senha)
  values ('admin', '$2a$10$i3.Z8Yv1Fwl0I5SNjdCGkOTRGQjGvHjh/gMZhdc3e7LIovAklqM6C');
insert into aut_autorizacao (aut_nome)
  values ('ROLE_ADMIN');
insert into uau_usuario_autorizacao (usr_id, aut_id) 
  values (1, 1);
insert into ant_anotacao(ant_texto, ant_data_hora, ant_usr_id)
  values('Projeto Novo', '2024-08-01 20:00', 1);


insert into rac_racao (rac_marca, rac_data_hora_ultima_compra, rac_quantidade_estoque, rac_nota)
value ('Purina', current_timestamp(), 10.5, 7),
      ('Pedigree', '2024-03-15 23:59:59', null, 5);


insert into tra_trabalho (tra_titulo, tra_data_hora_entrega, tra_grupo, tra_nota, tra_justificativa)
 values ('Teste 1', current_timestamp(), 'Alpha', 6, 'Bom, mas falta conteúdo'),
 ('Teste 2', current_timestamp(), 'Beta', 3, 'Incompleto');  