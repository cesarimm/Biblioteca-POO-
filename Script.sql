


CREATE DATABASE if not exists Biblioteca;

CREATE TABLE IF NOT EXISTS Biblioteca.usuario (
  `idUsuario` INT NOT NULL,
  `Nombre` VARCHAR(60) NOT NULL,
  `ApellidoP` VARCHAR(60) NOT NULL,
  `ApellidoM` VARCHAR(60) NOT NULL,
  `Direccion` VARCHAR(60) NOT NULL,
  `Telefono` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`idUsuario`));




CREATE TABLE IF NOT EXISTS Biblioteca.Alumnos (
  `Matricula` VARCHAR(60) NOT NULL,
  `Programa` VARCHAR(60) NOT NULL,
  `Grupo` VARCHAR(60) NOT NULL,
  `Semestre` VARCHAR(60) NOT NULL,
  `usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`usuario_idUsuario`),
  CONSTRAINT `fk_Alumnos_usuario1`
    FOREIGN KEY (`usuario_idUsuario`)
    REFERENCES `usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);



CREATE TABLE IF NOT EXISTS Biblioteca.Profesor (
  `clave` VARCHAR(60) NOT NULL,
  `Academia` VARCHAR(60) NOT NULL,
  `usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`usuario_idUsuario`),
  CONSTRAINT `fk_Profesor_usuario1`
    FOREIGN KEY (`usuario_idUsuario`)
    REFERENCES `usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);




CREATE TABLE IF NOT EXISTS Biblioteca.Items (
  `idItems` INT NOT NULL,
  `Autor` VARCHAR(60) NOT NULL,
  `Nombre` VARCHAR(60) NOT NULL,
  `LugarP` VARCHAR(60) NOT NULL,
  `AñoPublicacion` VARCHAR(60) NOT NULL,
  `estadoL` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`idItems`));




CREATE TABLE IF NOT EXISTS Biblioteca.Libros(
  `Editorial` VARCHAR(60) NOT NULL,
  `Items_idItems` INT NOT NULL,
  PRIMARY KEY (`Items_idItems`),
  CONSTRAINT `fk_Libros_Items1`
    FOREIGN KEY (`Items_idItems`)
    REFERENCES `Items` (`idItems`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);





CREATE TABLE IF NOT EXISTS Biblioteca.Tesis (
  `Tema` VARCHAR(60) NOT NULL,
  `Institucion` VARCHAR(60) NOT NULL,
  `Categoria` VARCHAR(60) NOT NULL,
  `Items_idItems` INT NOT NULL,
  PRIMARY KEY (`Items_idItems`),
  CONSTRAINT `fk_Tesis_Items1`
    FOREIGN KEY (`Items_idItems`)
    REFERENCES `Items` (`idItems`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);




CREATE TABLE IF NOT EXISTS Biblioteca.Consultas (
  `FechaP` VARCHAR(60) NOT NULL,
  `Items_idItems` INT NOT NULL,
  PRIMARY KEY (`Items_idItems`),
  CONSTRAINT `fk_Consultas_Items1`
    FOREIGN KEY (`Items_idItems`)
     REFERENCES  `Items` (`idItems`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE IF NOT EXISTS Biblioteca.Prestamo (
  `idPrestamo` INT NOT NULL,
  `idFechaE` VARCHAR(60) NOT NULL,
  `idFechaP` VARCHAR(60) NOT NULL,
  `usuario_idUsuario` INT NOT NULL,
  `Items_idItems` INT NOT NULL,
  PRIMARY KEY (`idPrestamo`),
  INDEX `fk_Prestamo_usuario1_idx` (`usuario_idUsuario` ASC),
  INDEX `fk_Prestamo_Items1_idx` (`Items_idItems` ASC),
  CONSTRAINT `fk_Prestamo_usuario1`
    FOREIGN KEY (`usuario_idUsuario`)
    REFERENCES `usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Prestamo_Items1`
    FOREIGN KEY (`Items_idItems`)
    REFERENCES `Items` (`idItems`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);




CREATE TABLE IF NOT EXISTS Biblioteca.RenovarP (
  `FechaR` VARCHAR(60) NOT NULL,
  `FechaE` VARCHAR(60) NOT NULL,
  `Prestamo_idPrestamo` INT NOT NULL,
  PRIMARY KEY (`Prestamo_idPrestamo`),
  CONSTRAINT `fk_RenovarP_Prestamo1`
    FOREIGN KEY (`Prestamo_idPrestamo`)
    REFERENCES `Prestamo` (`idPrestamo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);




CREATE TABLE IF NOT EXISTS Biblioteca.DevolverP (
  `FechaE` VARCHAR(60) NOT NULL,
  `Prestamo_idPrestamo` INT NOT NULL,
  PRIMARY KEY (`Prestamo_idPrestamo`),
  CONSTRAINT `fk_DevolverP_Prestamo`
    FOREIGN KEY (`Prestamo_idPrestamo`)
    REFERENCES `Prestamo` (`idPrestamo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


