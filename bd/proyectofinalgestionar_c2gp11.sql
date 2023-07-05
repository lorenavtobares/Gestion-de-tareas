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

-- -----------------------------------------------------
-- Table `ProyectoFinalGestionAR_C2Gp11`.`Equipo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProyectoFinalGestionAR_C2Gp11`.`Equipo` (
  `idEquipo` INT NOT NULL AUTO_INCREMENT,
  `idProyecto` INT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `fechaCreacion` DATE NOT NULL,
  `estado` TINYINT NOT NULL,
  PRIMARY KEY (`idEquipo`),
  INDEX `idProyecto_idx` (`idProyecto` ASC) ,
  UNIQUE INDEX `idProyecto_UNIQUE` (`idProyecto` ASC) ,
  CONSTRAINT `idProyecto`
    FOREIGN KEY (`idProyecto`)
    REFERENCES `ProyectoFinalGestionAR_C2Gp11`.`Proyecto` (`idProyecto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

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
    (1, 1, '123', 'user', 'desarrollo', 1, 'admin');

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

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;