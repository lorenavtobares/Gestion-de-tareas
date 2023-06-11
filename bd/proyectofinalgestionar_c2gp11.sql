-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-06-2023 a las 00:12:11
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

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
(1, 'hace bien tu trabajo Marcos', '2023-06-09', 1);

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
(0, 0, 'sin nombre', '2023-06-16', 1),
(1, 1, 'equipoTest', '2023-06-09', 1);

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
(1, 'payaso', '2023-06-09', 1, 1);

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
(1, 25765432, '1234', 'arjona', 'pepe', 1, 'admin');

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
(1, 'proyectoPrueba', 'prueba para verificar ', '2023-06-09', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarea`
--

CREATE TABLE `tarea` (
  `idTarea` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `fechaCreacion` date NOT NULL,
  `fechaCierre` date NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `idEquipoMiembros` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `tarea`
--

INSERT INTO `tarea` (`idTarea`, `nombre`, `fechaCreacion`, `fechaCierre`, `estado`, `idEquipoMiembros`) VALUES
(1, 'tareaPruebas', '2023-06-09', '2023-06-16', 1, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD PRIMARY KEY (`idComentarios`),
  ADD UNIQUE KEY `idTarea` (`idTarea`),
  ADD KEY `idTarea_2` (`idTarea`),
  ADD KEY `idTarea_3` (`idTarea`),
  ADD KEY `idTarea_4` (`idTarea`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`idEquipo`),
  ADD KEY `idProyecto` (`idProyecto`);

--
-- Indices de la tabla `equipomiembros`
--
ALTER TABLE `equipomiembros`
  ADD PRIMARY KEY (`idEquipoMiembros`),
  ADD KEY `idEquipo` (`idEquipo`),
  ADD KEY `idMiembro` (`idMiembro`);

--
-- Indices de la tabla `miembro`
--
ALTER TABLE `miembro`
  ADD PRIMARY KEY (`idMiembro`),
  ADD KEY `dni` (`dni`);

--
-- Indices de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`idProyecto`),
  ADD KEY `nombre` (`nombre`);

--
-- Indices de la tabla `tarea`
--
ALTER TABLE `tarea`
  ADD PRIMARY KEY (`idTarea`),
  ADD KEY `idEquipoMiembros` (`idEquipoMiembros`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tarea`
--
ALTER TABLE `tarea`
  MODIFY `idTarea` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
