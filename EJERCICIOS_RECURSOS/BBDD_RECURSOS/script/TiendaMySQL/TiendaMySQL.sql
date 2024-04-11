create database Tienda2;
use Tienda2;

create table Productos(
  CodProd int Primary Key,
  Nombre varchar(30),
  Precio int,
  Cantidad int
);

insert into Productos values(1,'Teclado',100,32);
insert into Productos values(2,'Disco Duro 300Gb',500,500);
insert into Productos values(3,'Mouse',80,300);
insert into Productos values(4,'Memoria USB',140,40);
insert into Productos values(5,'Memoria Ram',290,120);
insert into Productos values(6,'Disco Duro Extraible 250 Gb',650,50);
insert into Productos values(7,'Memoria USB',279,100);
insert into Productos values(8,'DVD Rom',450,20);
insert into Productos values(9,'CD Rom',200,240);
insert into Productos values(10,'Tarjeta de Red',180,380);
