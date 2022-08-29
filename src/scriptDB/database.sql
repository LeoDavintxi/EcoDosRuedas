create database ecodosruedas;
use ecodosruedas;

create table vehiculo(
	id_vehiculo integer not null primary key AUTO_INCREMENT,
    precio_unitario integer not null,
    nombre_fabricante varchar(45) not null
);
INSERT INTO vehiculo (precio_unitario, nombre_fabricante) VALUES ('1200000', 'Cannondale');
INSERT INTO vehiculo (precio_unitario, nombre_fabricante) VALUES ('1450000', 'Trek');
INSERT INTO vehiculo (precio_unitario, nombre_fabricante) VALUES ('2000000', 'Yeti');
INSERT INTO vehiculo (precio_unitario, nombre_fabricante) VALUES ('950000', 'Fuji');
INSERT INTO vehiculo (precio_unitario, nombre_fabricante) VALUES ('1950000', 'Bmc');
INSERT INTO vehiculo (precio_unitario, nombre_fabricante) VALUES ('4200000', 'Starker');
INSERT INTO vehiculo (precio_unitario, nombre_fabricante) VALUES ('5600000', 'Lucky Lion');
INSERT INTO vehiculo (precio_unitario, nombre_fabricante) VALUES ('4600000', 'Be Electric');
INSERT INTO vehiculo (precio_unitario, nombre_fabricante) VALUES ('8000000', 'Aima');
INSERT INTO vehiculo (precio_unitario, nombre_fabricante) VALUES ('5900000', 'Mec de Colombia');
INSERT INTO vehiculo (precio_unitario, nombre_fabricante) VALUES ('4500000', 'Atom Electric');

create table proveedor(
	id_proveedor integer not null primary key AUTO_INCREMENT,
    nombre varchar(45) not null,
    direccion varchar(45) not null,
    telefono varchar(45) not null
);
INSERT INTO proveedor (nombre, direccion, telefono) VALUES ('Auteco', 'calle 7 No. 45-17', '05713224459');
INSERT INTO proveedor (nombre, direccion, telefono) VALUES ('Hitachi', 'calle 19 No. 108-26', '05714223344');
INSERT INTO proveedor (nombre, direccion, telefono) VALUES ('Bosch', 'carrera 68 No. 26-45', '05715678798');
INSERT INTO proveedor (nombre, direccion, telefono) VALUES ('Teco', 'calle 77 No. 68-33', '05712213243');
INSERT INTO proveedor (nombre, direccion, telefono) VALUES ('General Electric', 'calle 29 No. 26-12', '05717239919');

create table clientes(
	alias varchar(45) not null primary key,
    nombre varchar(45) not null,
    apellido varchar(45) not null,
    email varchar(45) not null,
    celular varchar(11) not null,
    fecha_nacimiento date not null,
    contrasenia char(8) not null
);
INSERT INTO clientes (alias, nombre, apellido, email, celular, fecha_nacimiento, contrasenia) VALUES ('lucky', 'Pedro', 'Perez', 'pperez@mail.com', '3161111111', '1981-01-01', '11111111');
INSERT INTO clientes (alias, nombre, apellido, email, celular, fecha_nacimiento, contrasenia) VALUES ('malopez', 'Maria', 'Lopez', 'mlopez@mail.com', '3162222222', '1982-01-01', '22222222');
INSERT INTO clientes (alias, nombre, apellido, email, celular, fecha_nacimiento, contrasenia) VALUES ('diva', 'Ana', 'Diaz', 'adiaz@mail.com', '3163333333', '1983-01-01', '33333333');
INSERT INTO clientes (alias, nombre, apellido, email, celular, fecha_nacimiento, contrasenia) VALUES ('dreamer', 'Luis', 'Rojas', 'lrojas@mail.com', '3164444444', '1984-01-01', '44444444');
INSERT INTO clientes (alias, nombre, apellido, email, celular, fecha_nacimiento, contrasenia) VALUES ('ninja', 'Andres', 'Cruz', 'acruz@mail.com', '3165555555', '1985-01-01', '55555555');
INSERT INTO clientes (alias, nombre, apellido, email, celular, fecha_nacimiento, contrasenia) VALUES ('neon', 'Nelson', 'Ruiz', 'nruiz@mail.com', '3166666666', '1986-01-01', '66666666');
INSERT INTO clientes (alias, nombre, apellido, email, celular, fecha_nacimiento, contrasenia) VALUES ('rose', 'Claudia', 'Mendez', 'cmendez@mail.com', '3167777777', '1987-01-01', '77777777');
INSERT INTO clientes (alias, nombre, apellido, email, celular, fecha_nacimiento, contrasenia) VALUES ('green', 'Jorge', 'Rodriguez', 'jrodriguez@mail.com', '3168888888', '1988-01-01', '88888888');

create table bicicleta(
	id_vehiculo integer not null primary key,
    anio_construccion integer not null,
    foreign key (id_vehiculo) references vehiculo(id_vehiculo)
);
INSERT INTO bicicleta (id_vehiculo, anio_construccion) VALUES ('1', '2020');
INSERT INTO bicicleta (id_vehiculo, anio_construccion) VALUES ('2', '2019');
INSERT INTO bicicleta (id_vehiculo, anio_construccion) VALUES ('3', '2020');
INSERT INTO bicicleta (id_vehiculo, anio_construccion) VALUES ('4', '2021');
INSERT INTO bicicleta (id_vehiculo, anio_construccion) VALUES ('5', '1018');

create table motocicleta(
	id_vehiculo integer not null primary key,
    autonomia integer not null,
    id_proveedor integer not null,
    foreign key (id_proveedor) references proveedor(id_proveedor)
);
INSERT INTO motocicleta (id_vehiculo, autonomia, id_proveedor) VALUES ('6', '18', '1');
INSERT INTO motocicleta (id_vehiculo, autonomia, id_proveedor) VALUES ('7', '14', '2');
INSERT INTO motocicleta (id_vehiculo, autonomia, id_proveedor) VALUES ('8', '26', '1');
INSERT INTO motocicleta (id_vehiculo, autonomia, id_proveedor) VALUES ('9', '36', '3');
INSERT INTO motocicleta (id_vehiculo, autonomia, id_proveedor) VALUES ('10', '20', '4');
INSERT INTO motocicleta (id_vehiculo, autonomia, id_proveedor) VALUES ('11', '12', '5');

create table registro_intenciones(
	id_registro integer not null AUTO_INCREMENT,
    alias varchar(45) not null,
    id_vehiculo integer not null,
	fecha_hora datetime not null,
    primary key (id_registro, id_vehiculo, alias),
	foreign key (id_vehiculo) references vehiculo(id_vehiculo),
    foreign key (alias) references clientes(alias)
);
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('lucky', '1', '2017-10-25 20:00:00');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('lucky', '2', '2019-03-15 18:30:00');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('lucky', '6', '2019-05-20 20:30:00');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('malopez', '1', '2018-05-20 20:30:00');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('malopez', '6', '2020-01-20 20:30:00');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('diva', '3', '2019-05-20 20:30:00');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('diva', '4', '2018-06-22 21:30:00');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('diva', '7', '2020-03-17 15:30:20');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('dreamer', '2', '2020-03-17 15:30:20');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('dreamer', '8', '2020-04-10 18:30:20');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('ninja', '9', '2020-02-17 20:30:20');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('ninja', '6', '2020-02-20 16:30:20');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('ninja', '10', '2020-03-27 18:30:20');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('rose', '11', '2020-03-20 21:30:20');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('green', '3', '2020-01-10 17:30:20');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('green', '2', '2020-02-15 20:30:20');
INSERT INTO registro_intenciones (alias, id_vehiculo, fecha_hora) VALUES ('green', '5', '2020-03-17 18:30:20');