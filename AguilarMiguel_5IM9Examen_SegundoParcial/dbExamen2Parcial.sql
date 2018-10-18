create database dbExamen2Parcial;
use dbExamen2Parcial;

drop table if exists Usuario;
create table Usuario
(
	nombre varchar (30) primary key,
    apPat varchar (30),
    apMat varchar(30),
    escuela varchar(60),
    matFav varchar (60),
    deporFav varchar (60)
);