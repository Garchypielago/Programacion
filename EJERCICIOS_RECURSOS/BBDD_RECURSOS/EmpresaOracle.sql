-- Con Oracle SQL developer creamos desde el usuario system/oracle un usuario empresa/empresa:
create user empresa identified by empresa;
-- le damos permisos de administrador:
grant dba to empresa;
conn empresa/empresa;
-- Con Oracle SQL developer creamos una conexi�n empresaC con un usuario empresa/empresa
-- y nos conectamos. Creamos las tablas y las rellenamos:

--
-- TABLA DEPARTAMENTOS
--
ALTER SESSION SET NLS_DATE_FORMAT='YYYY-MM-DD';
ALTER SESSION SET NLS_LANGUAGE='SPANISH';
CREATE TABLE departamentos (
 dept_no  NUMERIC(2) NOT NULL PRIMARY KEY,
 dnombre  VARCHAR(15), 
 loc      VARCHAR(15)
);

INSERT INTO departamentos VALUES (10,'CONTABILIDAD','SEVILLA');
INSERT INTO departamentos VALUES (20,'INVESTIGACI�N','MADRID');
INSERT INTO departamentos VALUES (30,'VENTAS','BARCELONA');
INSERT INTO departamentos VALUES (40,'PRODUCCI�N','BILBAO');
COMMIT;

--
-- TABLA EMPLEADOS
--

CREATE TABLE empleados (
 emp_no    NUMERIC(4) NOT NULL PRIMARY KEY,
 apellido  VARCHAR(10),
 oficio    VARCHAR(10),
 dir       NUMERIC,
 fecha_alt DATE,
 salario   NUMERIC(6,2),
 comision  NUMERIC(6,2),
 dept_no   NUMERIC(2) NOT NULL REFERENCES departamentos(dept_no)
);

INSERT INTO empleados VALUES (7369,'S�NCHEZ','EMPLEADO',7902,'1990/12/17',
                        1040,NULL,20);
INSERT INTO empleados VALUES (7499,'ARROYO','VENDEDOR',7698,'1990/02/20',
                        1500,390,30);
INSERT INTO empleados VALUES (7521,'SALA','VENDEDOR',7698,'1991/02/22',
                        1625,650,30);
INSERT INTO empleados VALUES (7566,'JIM�NEZ','DIRECTOR',7839,'1991/04/02',
                        2900,NULL,20);
INSERT INTO empleados VALUES (7654,'MART�N','VENDEDOR',7698,'1991/09/29',
                        1600,1020,30);
INSERT INTO empleados VALUES (7698,'NEGRO','DIRECTOR',7839,'1991/05/01',
                        3005,NULL,30);
INSERT INTO empleados VALUES (7782,'CEREZO','DIRECTOR',7839,'1991/06/09',
                        2885,NULL,10);
INSERT INTO empleados VALUES (7788,'GIL','ANALISTA',7566,'1991/11/09',
                        3000,NULL,20);
INSERT INTO empleados VALUES (7839,'REY','PRESIDENTE',NULL,'1991/11/17',
                        4100,NULL,10);
INSERT INTO empleados VALUES (7844,'TOVAR','VENDEDOR',7698,'1991/09/08',
                        1350,0,30);
INSERT INTO empleados VALUES (7876,'ALONSO','EMPLEADO',7788,'1991/09/23',
                        1430,NULL,20);
INSERT INTO empleados VALUES (7900,'JIMENO','EMPLEADO',7698,'1991/12/03',
                        1335,NULL,30);
INSERT INTO empleados VALUES (7902,'FERN�NDEZ','ANALISTA',7566,'1991/12/03',
                        3000,NULL,20);
INSERT INTO empleados VALUES (7934,'MU�OZ','EMPLEADO',7782,'1992/01/23',
                        1690,NULL,10);
INSERT INTO empleados VALUES (7901,'L�PEZ','ANALISTA',7782,'1993/02/23',
                        1000,1000,10);

COMMIT;
