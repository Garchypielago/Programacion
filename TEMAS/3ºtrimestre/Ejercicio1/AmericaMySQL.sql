Create table Paises(
    Id tinyint primary key,
    Nombre Varchar(15),
    Tamanio varchar(15)) Engine=InnoDB;

Create table Personas(
    Id int primary key,
    Nombre Varchar(15),
    Apellido varchar(15),
    Edad tinyint,
    Pais tinyint)Engine=InnoDB;

Alter Table Personas add Foreign key (Pais) References Paises(Id);

Insert into Paises values (1, 'Chile', 'Grande');
Insert into Paises values (2, 'Costa Rica', 'Pequenio');
Insert into Paises values (3, 'Mexico', 'Mediano');
Insert into Paises values (4, 'Venezuela', 'Mediano');


Insert into Personas values (1, 'Frank', 'Malfoy', 16,1);
Insert into Personas values (2, 'Alis', 'Rodriguez', 30,2);
Insert into Personas values (3, 'Karen', 'Juarez', 22,1);
Insert into Personas values (4, 'Andrea', 'Fernandez', 21,3);
Insert into Personas values (5, 'Alesa', 'Benede', 13,4);
Insert into Personas values (6, 'Henry', 'Gonzalez', 21,2);
Insert into Personas values (7, 'Daniel', 'Hidalgo', 16,1);
Insert into Personas values (8, 'Roy', 'Castro', 20,4);
Insert into Personas values (9, 'Sabrina', 'de la Torre', 18,2);


