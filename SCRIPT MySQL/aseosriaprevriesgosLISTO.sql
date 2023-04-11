DROP DATABASE asesoriaprevriesgos;
CREATE DATABASE asesoriaPrevRiesgos;
USE asesoriaPrevRiesgos;

CREATE TABLE usuario (
idusuario int not null auto_increment primary key, 
nombre varchar(30) not null, 
apellido varchar(30) not null, 
fechanacimiento varchar(10) not null, 
run int not null unique
);

CREATE TABLE cliente (
idcliente INT not null auto_increment PRIMARY KEY,
clitelefono VARCHAR (20) NOT NULL,
cliafp VARCHAR(30),
clisistemasalud VARCHAR(10) NOT NULL,
clidireccion VARCHAR(100) NOT NULL,
clicomuna VARCHAR(50) NOT NULL,
cliedad INT NOT NULL,
rutcliente int not null
);

CREATE TABLE administrativo (
idadministrativo int not null auto_increment primary key, 
email varchar(20) not null, 
area varchar(20) not null,
rutadmin int not null
);

CREATE TABLE profesional (
idprofesional int not null auto_increment primary key, 
telefono int, 
tituloprofesional varchar(50) not null, 
proyecto varchar(30) not null,
rutprof int not null
);

CREATE TABLE capacitacion (
idcapacitacion INT PRIMARY KEY,
capfecha DATE NOT NULL,
caphora TIME,
caplugar VARCHAR(100) NOT NULL,
capduracion INT,
idusuario_run int not null
);

CREATE TABLE asistente (
idasistente INT PRIMARY KEY,
asistnombrecompleto VARCHAR(100) NOT NULL,
asistedad INT NOT NULL,
asistcorreo VARCHAR(70),
asisttelefono VARCHAR(30),
/*F*/capacitacion_idcapacitacion INT NOT NULL,
idusuario_asistente varchar(15) not null
);

CREATE TABLE accidente (
idaccidente INT PRIMARY KEY,
accifecha DATE NOT NULL,
accihora TIME NOT NULL,
accilugar VARCHAR(150) NOT NULL,
acciorigen VARCHAR(100) NOT NULL,
acciconsecuencias VARCHAR(100),
/*F*/cliente_rutcliente INT NOT NULL
);

CREATE TABLE visitas (
idvisita INT PRIMARY KEY,
visfecha DATE NOT NULL,
vishora TIME,
vislugar VARCHAR(50) NOT NULL,
viscomentarios VARCHAR(250) NOT NULL,
/*F*/cliente_rutcliente INT NOT NULL
);

alter table cliente add 
constraint fk_rutcliente 
foreign key(rutcliente) references usuario(run);

alter table administrativo add 
constraint fk_rutadmin 
foreign key(rutadmin) references usuario(run);

alter table profesional add 
constraint fk_rutprof 
foreign key(rutprof) references usuario(run);