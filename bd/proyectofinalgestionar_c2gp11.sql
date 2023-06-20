-- MySQL Workbench Forward Engineering
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ProyectoFinalGestionAR_C2Gp11
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ProyectoFinalGestionAR_C2Gp11` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci ;
USE `ProyectoFinalGestionAR_C2Gp11` ;

-- -----------------------------------------------------
-- Table `ProyectoFinalGestionAR_C2Gp11`.`Proyecto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProyectoFinalGestionAR_C2Gp11`.`Proyecto` (
  `idProyecto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(300) NOT NULL,
  `fechaInicio` DATE NOT NULL,
  `estado` TINYINT NOT NULL,
  PRIMARY KEY (`idProyecto`),
  UNIQUE INDEX `nombre_UNIQUE` (`nombre` ASC))
ENGINE = InnoDB;

INSERT INTO `proyecto` (`idProyecto`, `nombre`, `descripcion`, `fechaInicio`, `estado`) VALUES
    (1, 'Chiariani SA', 'Sistema de gestion de patentes automotriz', '2023-01-23', 1),
    (2, 'Milaye', 'Sistema de gestion de inventario comercio', '2023-05-03', 1),
    (3, 'FruTars', 'Sistema de gestion de inventario comercio', '2023-05-20', 1),
    (4, 'Almacen el Gringo', 'Sistema de gestion de inventario ', '2023-05-01', 1);

-- -----------------------------------------------------
-- Table `ProyectoFinalGestionAR_C2Gp11`.`Equipo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProyectoFinalGestionAR_C2Gp11`.`Equipo` (
  `idEquipo` INT NOT NULL AUTO_INCREMENT,
  `idProyecto` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `fechaCreacion` DATE NOT NULL,
  `estado` TINYINT NOT NULL,
  PRIMARY KEY (`idEquipo`),
  INDEX `idProyecto_idx` (`idProyecto` ASC),
  CONSTRAINT `idProyecto`
    FOREIGN KEY (`idProyecto`)
    REFERENCES `ProyectoFinalGestionAR_C2Gp11`.`Proyecto` (`idProyecto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `equipo` (`idEquipo`, `idProyecto`, `nombre`, `fechaCreacion`, `estado`) VALUES
    (1, 1, 'Equipo de Desarrollo 1', '2023-03-23', 1),
    (2, 2, 'Equipo de Desarrollo 2', '2023-02-20', 1),
    (3, 3, 'Equipo de Desarrollo 3', '2023-01-13', 1),
    (4, 4, 'Equipo de Desarrollo 4', '2023-04-15', 1);

-- -----------------------------------------------------
-- Table `ProyectoFinalGestionAR_C2Gp11`.`Miembro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProyectoFinalGestionAR_C2Gp11`.`Miembro` (
  `idMiembro` INT NOT NULL AUTO_INCREMENT,
  `dni` INT NOT NULL,
  `password` VARCHAR(15) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `estado` TINYINT NOT NULL,
  `rolSistema` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idMiembro`),
  UNIQUE INDEX `dni_UNIQUE` (`dni` ASC))
ENGINE = InnoDB;

INSERT INTO `miembro` (`idMiembro`, `dni`, `password`, `apellido`, `nombre`, `estado`, `rolSistema`) VALUES
    (1, 1, '123', 'user', 'desarrollo', 1, 'admin'),
    (2, 35475532, '123', 'Soria', 'Cristian', 1, 'admin'),
    (3, 34738473, '123', 'Gonzalez', 'Federico', 1, 'usuario'),
    (4, 21437839, '123', 'Perez', 'Roberto', 1, 'usuario'),
    (5, 37463263, '123', 'Perez', 'Gisela', 1, 'usuario'),
    (6, 31425678, '123', 'Lucero', 'Lorena', 1, 'usuario'),
    (7, 25367899, '123', 'Lucero', 'Carlos', 1, 'usuario'),
    (8, 39872635, '123', 'Fernandez', 'Francisco', 1, 'usuario');

-- -----------------------------------------------------
-- Table `ProyectoFinalGestionAR_C2Gp11`.`EquipoMiembros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProyectoFinalGestionAR_C2Gp11`.`EquipoMiembros` (
  `idEquipoMiembros` INT NOT NULL AUTO_INCREMENT,
  `rol` VARCHAR(45) NOT NULL,
  `fechaIncorporacion` DATE NOT NULL,
  `idEquipo` INT NOT NULL,
  `idMiembro` INT NOT NULL,
  PRIMARY KEY (`idEquipoMiembros`),
  INDEX `idEquipo_idx` (`idEquipo` ASC),
  INDEX `idMiembro_idx` (`idMiembro` ASC),
  CONSTRAINT `idEquipo`
    FOREIGN KEY (`idEquipo`)
    REFERENCES `ProyectoFinalGestionAR_C2Gp11`.`Equipo` (`idEquipo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idMiembro`
    FOREIGN KEY (`idMiembro`)
    REFERENCES `ProyectoFinalGestionAR_C2Gp11`.`Miembro` (`idMiembro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `equipomiembros` (`idEquipoMiembros`, `rol`, `fechaIncorporacion`, `idEquipo`, `idMiembro`) VALUES
    (1, 'Project Manager', '2021-01-23', 1, 1),
    (2, 'Lider de Equipo', '2021-01-23', 1, 2),
    (3, 'Diseñador UX y UI', '2021-01-23', 1, 3),
    (4, 'Desarrollador de Software', '2021-01-23', 1, 4),
    (5, 'Project Manager', '2021-01-23', 2, 8),
    (6, 'Lider de Equipo', '2021-01-23', 2, 7),
    (7, 'Diseñador UX y UI', '2021-01-23', 2, 6),
    (8, 'Desarrollador de Software', '2021-01-23', 2, 5),
    (9, 'Project Manager', '2021-01-23', 3, 2),
    (11, 'Lider de Equipo', '2021-01-23', 3, 4),
    (12, 'Diseñador UX y UI', '2021-01-23', 3, 6),
    (13, 'Desarrollador de Software', '2021-01-23', 3, 8),
    (14, 'Project Manager', '2021-01-23', 4, 1),
    (15, 'Lider de Equipo', '2021-01-23', 4, 3),
    (16, 'Diseñador UX y UI', '2021-01-23', 4, 5),
    (17, 'Desarrollador de Software', '2021-01-23', 4, 7);

-- -----------------------------------------------------
-- Table `ProyectoFinalGestionAR_C2Gp11`.`Tarea`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProyectoFinalGestionAR_C2Gp11`.`Tarea` (
  `idTarea` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `fechaCreacion` DATE NOT NULL,
  `fechaCierre` DATE NOT NULL,
  `estado` INT(11) NOT NULL,
  `descripcion` VARCHAR(300) NOT NULL,
  `idEquipoMiembros` INT NOT NULL,
  PRIMARY KEY (`idTarea`),
  INDEX `idEquipoMiembros_idx` (`idEquipoMiembros` ASC),
  CONSTRAINT ``
    FOREIGN KEY (`idEquipoMiembros`)
    REFERENCES `ProyectoFinalGestionAR_C2Gp11`.`EquipoMiembros` (`idEquipoMiembros`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `tarea` (`idTarea`, `nombre`, `fechaCreacion`, `fechaCierre`, `estado`, `descripcion`, `idEquipoMiembros`) VALUES
(1, 'Presentacion del proyecto al equipo', '2023-01-23', '2023-04-23', 1, 'Descripcion 1', 1),
(2, 'Presentacion del proyecto al equipo', '2023-01-23', '2023-04-23', 1, 'Descripcion 2', 5),
(3, 'Presentacion del proyecto al equipo', '2023-01-23', '2023-04-23', 1, 'Descripcion 3', 9),
(4, 'Presentacion del proyecto al equipo', '2023-01-23', '2023-04-23', 1, 'Descripcion 4', 14),
(5, 'Designar tareas a los integrantes del equipo', '2023-01-24', '2023-04-23', 1, 'Descripcion 5', 2),
(6, 'Designar tareas a los integrantes del equipo', '2023-01-24', '2023-04-23', 1, 'Descripcion 6', 6),
(7, 'Designar tareas a los integrantes del equipo', '2023-01-24', '2023-04-23', 1, 'Descripcion 7', 11),
(8, 'Designar tareas a los integrantes del equipo', '2023-01-24', '2023-04-23', 1, 'Descripcion 8', 15),
(9, 'Diseñar maqueta del proyecto', '2023-01-30', '2023-04-23', 1, 'Descripcion 9', 3),
(10, 'Diseñar maqueta del proyecto', '2023-01-30', '2023-04-23', 1, 'Descripcion 10', 7),
(11, 'Diseñar maqueta del proyecto', '2023-01-30', '2023-04-23', 1, 'Descripcion 11', 12),
(12, 'Diseñar maqueta del proyecto', '2023-01-30', '2023-04-23', 1, 'Descripcion 12', 16),
(13, 'Programar', '2023-01-30', '2023-04-23', 1, 'Descripcion 13', 4),
(14, 'Programar', '2023-01-30', '2023-04-23', 1, 'Descripcion 14', 8),
(15, 'Programar', '2023-01-30', '2023-04-23', 1, 'Descripcion 15', 13),
(16, 'Programar', '2023-01-30', '2023-04-23', 1, 'Descripcion 16', 17);


-- -----------------------------------------------------
-- Table `ProyectoFinalGestionAR_C2Gp11`.`Comentarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProyectoFinalGestionAR_C2Gp11`.`Comentarios` (
  `idComentarios` INT NOT NULL AUTO_INCREMENT,
  `comentario` VARCHAR(300) NOT NULL,
  `fechaAvance` DATE NOT NULL,
  `idTarea` INT NOT NULL,
  PRIMARY KEY (`idComentarios`),
  INDEX `idTarea_idx` (`idTarea` ASC),
  CONSTRAINT `idTarea`
    FOREIGN KEY (`idTarea`)
    REFERENCES `ProyectoFinalGestionAR_C2Gp11`.`Tarea` (`idTarea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `Comentarios` (`idComentarios`, `comentario`, `fechaAvance`, `idTarea`) VALUES
(1, 'Comentando tarea 1 ', '2023-01-23', 1),
(2, 'Comentando tarea 2 ', '2023-01-23', 2),
(3, 'Comentando tarea 3 ', '2023-01-23', 3),
(4, 'Comentando tarea 4 ', '2023-01-23', 4),
(5, 'Comentando tarea 5 ', '2023-01-23', 5),
(6, 'Comentando tarea 6 ', '2023-01-23', 6),
(7, 'Comentando tarea 7 ', '2023-01-23', 7),
(8, 'Comentando tarea 8 ', '2023-01-23', 8),
(9, 'Comentando tarea 9 ', '2023-01-23', 9),
(10, 'Comentando tarea 10 ', '2023-01-23', 10),
(11, 'Comentando tarea 11 ', '2023-01-23', 11),
(12, 'Comentando tarea 12 ', '2023-01-23', 12),
(13, 'Comentando tarea 13 ', '2023-01-23', 13),
(14, 'Comentando tarea 14 ', '2023-01-23', 14),
(15, 'Comentando tarea 15 ', '2023-01-23', 15),
(16, 'Comentando tarea 16 ', '2023-01-23', 16);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;