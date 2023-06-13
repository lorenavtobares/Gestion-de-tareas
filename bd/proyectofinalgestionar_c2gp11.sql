SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectofinalgestionar_c2gp11`
--
CREATE DATABASE IF NOT EXISTS `proyectofinalgestionar_c2gp11` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `proyectofinalgestionar_c2gp11`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentarios`
--

CREATE TABLE `comentarios` (
  `idComentarios` int(11) NOT NULL,
  `comentario` varchar(45) NOT NULL,
  `fechaAvance` date NOT NULL,
  `idTarea` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `comentarios`
--

INSERT INTO `comentarios` (`idComentarios`, `comentario`, `fechaAvance`, `idTarea`) VALUES
(3, 'Comentario 1 creado despues del delete', '2021-01-23', 3),
(4, 'Comentario 2 nuevo comentario', '2021-01-23', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `idEquipo` int(11) NOT NULL,
  `idProyecto` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `fechaCreacion` date NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`idEquipo`, `idProyecto`, `nombre`, `fechaCreacion`, `estado`) VALUES
(1, 1, 'Equipo de Desarrollo 1', '2023-03-23', 1),
(2, 2, 'Equipo de Desarrollo 2', '2023-02-20', 1),
(3, 3, 'Equipo de Desarrollo 3', '2023-01-13', 1),
(4, 4, 'Equipo de Desarrollo 4', '2023-04-15', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipomiembros`
--

CREATE TABLE `equipomiembros` (
  `idEquipoMiembros` int(11) NOT NULL,
  `rol` varchar(45) NOT NULL,
  `fechaIncorporacion` date NOT NULL,
  `idEquipo` int(11) NOT NULL,
  `idMiembro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `equipomiembros`
--

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `miembro`
--

CREATE TABLE `miembro` (
  `idMiembro` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `password` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `rolSistema` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `miembro`
--

INSERT INTO `miembro` (`idMiembro`, `dni`, `password`, `apellido`, `nombre`, `estado`, `rolSistema`) VALUES
(1, 1, '123', 'user', 'desarrollo', 1, 'admin'),
(2, 35475532, '123', 'Soria', 'Cristian', 1, 'admin'),
(3, 34738473, '123', 'Gonzalez', 'Federico', 1, 'usuario'),
(4, 21437839, '123', 'Perez', 'Roberto', 1, 'usuario'),
(5, 37463263, '123', 'Perez', 'Gisela', 1, 'usuario'),
(6, 31425678, '123', 'Lucero', 'Lorena', 1, 'usuario'),
(7, 25367899, '123', 'Lucero', 'Carlos', 1, 'usuario'),
(8, 39872635, '123', 'Fernandez', 'Francisco', 1, 'usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE `proyecto` (
  `idProyecto` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `fechaInicio` date NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`idProyecto`, `nombre`, `descripcion`, `fechaInicio`, `estado`) VALUES
(1, 'Chiariani SA', 'Sistema de gestion de patentes automotriz', '2023-01-23', 1),
(2, 'Milaye', 'Sistema de gestion de inventario comercio', '2023-05-03', 1),
(3, 'FruTars', 'Sistema de gestion de inventario comercio', '2023-05-20', 1),
(4, 'Almacen el Gringo', 'Sistema de gestion de inventario ', '2023-05-01', 1);