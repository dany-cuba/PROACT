-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-12-2022 a las 17:27:16
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proact`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estación`
--

CREATE TABLE `estación` (
  `Nombre_E` varchar(30) NOT NULL,
  `Clasificación` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estación`
--

INSERT INTO `estación` (`Nombre_E`, `Clasificación`) VALUES
('E. Caibarién', 'Sinóptica'),
('E. La Piedra', 'Sinóptica'),
('E. Sagua la Grande', 'Sinóptica'),
('E. Santo Domingo', 'Sinóptica'),
('E. Yabú', 'Sinóptica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `observación`
--

CREATE TABLE `observación` (
  `Fecha` varchar(20) NOT NULL,
  `Temp_max` float NOT NULL,
  `Temp_min` float NOT NULL,
  `Precipitaciones` float NOT NULL,
  `Media_viento` float NOT NULL,
  `Evaporización_agua` float NOT NULL,
  `Nombre_E` varchar(30) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `organización`
--

CREATE TABLE `organización` (
  `Nombre_O` varchar(30) NOT NULL,
  `Municipio` varchar(30) NOT NULL,
  `Tipo` varchar(50) NOT NULL,
  `Nombre_E` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estación`
--
ALTER TABLE `estación`
  ADD PRIMARY KEY (`Nombre_E`);

--
-- Indices de la tabla `observación`
--
ALTER TABLE `observación`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Nombre_E` (`Nombre_E`);

--
-- Indices de la tabla `organización`
--
ALTER TABLE `organización`
  ADD PRIMARY KEY (`Nombre_O`),
  ADD KEY `Nombre_E` (`Nombre_E`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `observación`
--
ALTER TABLE `observación`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `observación`
--
ALTER TABLE `observación`
  ADD CONSTRAINT `observación_ibfk_1` FOREIGN KEY (`Nombre_E`) REFERENCES `estación` (`Nombre_E`);

--
-- Filtros para la tabla `organización`
--
ALTER TABLE `organización`
  ADD CONSTRAINT `organización_ibfk_1` FOREIGN KEY (`Nombre_E`) REFERENCES `estación` (`Nombre_E`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
