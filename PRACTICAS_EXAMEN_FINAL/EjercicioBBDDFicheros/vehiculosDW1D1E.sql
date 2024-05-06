CREATE DATABASE vehiculos;
USE vehiculos;
	
CREATE TABLE coches (
  matricula VARCHAR(25),
  marca VARCHAR(40) NOT NULL,
  modelo VARCHAR(40) NOT NULL,  
  anioFabricacion INT,
  PRIMARY KEY (matricula));
	

