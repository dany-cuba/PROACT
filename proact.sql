-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-12-2022 a las 03:16:10
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
-- Estructura de tabla para la tabla `actor_clave`
--

CREATE TABLE `actor_clave` (
  `Nombre_A` varchar(30) NOT NULL,
  `Tipo` varchar(30) NOT NULL,
  `Nombre_M` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `actor_clave`
--

INSERT INTO `actor_clave` (`Nombre_A`, `Tipo`, `Nombre_M`) VALUES
('Abilio Fernández Herrera', 'Productor agrícola', 'Remedios'),
('Alberto Arencibia Gonzáles', 'Productor agrícola', 'Remedios'),
('Alexander Escobar Franco', 'Productor agrícola', 'Quemado de Gϋines'),
('Asley Orozco Guevara', 'Productor agrícola', 'Encrucijada'),
('Carlos Alberto Pérez Hera', 'Productor agrícola', 'Camajuaní'),
('CCS Crescencio Valdez', 'Entidad productiva', 'Encrucijada'),
('CCS Felipe Rodriguez', 'Entidad productiva', 'Remedios'),
('CCS Juan Francisco Aro', 'Entidad productiva', 'Encrucijada'),
('CCS Juan Ramón Gonzáles', 'Entidad productiva', 'Remedios'),
('CCS Juan Verdecia', 'Entidad productiva', 'Camajuaní'),
('CCS Martires 10 de Abril', 'Entidad productiva', 'Corralillo'),
('CCS Niceto Pérez', 'Entidad productiva', 'Camajuaní'),
('CCS Ñico López', 'Entidad productiva', 'Quemado de Gϋines'),
('CCS Pedro San Martín', 'Entidad productiva', 'Corralillo'),
('CCS Raul Torres', 'Entidad productiva', 'Camajuaní'),
('CCS Rodolfo León Perlancia', 'Entidad productiva', 'Remedios'),
('CCS Tato Madruga', 'Entidad productiva', 'Encrucijada'),
('César Luis Fernández Díaz', 'Productor agrícola', 'Encrucijada'),
('CPA Julio Casales', 'Entidad productiva', 'Quemado de Gϋines'),
('Edel Manuel Alonso Ríos', 'Prouctor agrícola', 'Remedios'),
('Eugenio Bravo Bergolla', 'Prouctor agrícola', 'Remedios'),
('Finca La Matilde', 'Productor agrícola', 'Camajuaní'),
('Finca Leite', 'Productor agrícola', 'Quemado de Gϋines'),
('Finca Picadora', 'Productor agrícola', 'Caibarién'),
('Finca Rojas', 'Productor agrícola', 'Caibarién'),
('Finca Siguanea', 'Productor agrícola', 'Camajuaní'),
('Germán Valentín Broche Molina', 'Productor agrícola', 'Camajuaní'),
('Granja Urbana Caibarién', 'Entidad productiva', 'Caibarién'),
('Granja Urbana Camajuaní', 'Entidad productiva', 'Camajuaní'),
('Granja Urbana Corralillo', 'Entidad productiva', 'Corralillo'),
('Granja Urbana Encrucijada', 'Entidad productiva', 'Encrucijada'),
('Granja Urbana Quemado', 'Entidad productiva', 'Quemado de Gϋines'),
('Granja Urbana Sagua', 'Entidad productiva', 'Sagua la Grande'),
('Gudelia E. Gonzáles López', 'Productor agrícola', 'Remedios'),
('Gustavo Rodriguez', 'Productor agrícola', 'Quemado de Gϋines'),
('Huerto Elpidio Sosa', 'Productor agrícola', 'Sagua la Grande'),
('Huerto EMPROMEC', 'Productor agrícola', 'Sagua la Grande'),
('Isley Curbelo Gutierrez', 'Productor agrícola', 'Encrucijada'),
('Jaime José Molina Guitierrez', 'Productor agrícola', 'Corralillo'),
('Jorge Enrrique Valdivia Alamo', 'Productor agrícola', 'Remedios'),
('Josué Perez Estupiñan', 'Productor agrícola', 'Corralillo'),
('Organopónico Comercio', 'Productor agrícola', 'Caibarién'),
('Organopónico ECOA', 'Productor agrícola', 'Caibarién'),
('Organopónico El Pilar', 'Productor agrícola', 'Caibarién'),
('Organopónico Ferrotalleres', 'Productor agrícola', 'Sagua la Grande'),
('Organopónico Hospital', 'Productor agrícola', 'Caibarién'),
('Organopónico Laportilla', 'Productor agrícola', 'Sagua la Grande'),
('Organopónico Las Tanias', 'Productor agrícola', 'Sagua la Grande'),
('Organopónico Nueva Imagen', 'Productor agrícola', 'Quemado de Gϋines'),
('Organopónico Paraguitas', 'Productor agrícola', 'Caibarién'),
('Organopónico Playa', 'Productor agrícola', 'Caibarién'),
('Organopónico Salud Mental', 'Productor agrícola', 'Caibarién'),
('Orlando Consuegra Jiménez', 'Productor agrícola', 'Encrucijada'),
('Ramón Alonso Campos', 'Productor agrícola', 'Remedios'),
('Ramón Lauce Delgado', 'Productor agrícola', 'Remedios'),
('Rolando E. Perez Gonzales', 'Productor agrícola', 'Remedios'),
('Semiprotegido', 'Productor agrícola', 'Corralillo'),
('Yoel Curbelon Ruiz', 'Productor agrícola', 'Encrucijada'),
('Yurisan Vaitía Pérez', 'Productor agrícola', 'Camajuaní');

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
-- Estructura de tabla para la tabla `municipio`
--

CREATE TABLE `municipio` (
  `Nombre_M` varchar(50) NOT NULL,
  `Extensión_territorial` float NOT NULL,
  `Nombre_E` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `municipio`
--

INSERT INTO `municipio` (`Nombre_M`, `Extensión_territorial`, `Nombre_E`) VALUES
('Caibarién', 212, 'E. Caibarién'),
('Camajuaní', 614, 'E. Yabú'),
('Corralillo', 843, 'E. Sagua la Grande'),
('Encrucijada', 345, 'E. Sagua la Grande'),
('Quemado de Gϋines', 338, 'E. Sagua la Grande'),
('Remedios', 560, 'E. Caibarién'),
('Sagua la Grande', 661, 'E. Sagua la Grande');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `observación`
--

CREATE TABLE `observación` (
  `id` int(11) NOT NULL,
  `Fecha` varchar(30) NOT NULL,
  `Temp_max` float NOT NULL,
  `Temp_min` float NOT NULL,
  `Precipitaciones` float NOT NULL,
  `Media_viento` float NOT NULL,
  `Evaporización_agua` float NOT NULL,
  `Nombre_E` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `observación`
--

INSERT INTO `observación` (`id`, `Fecha`, `Temp_max`, `Temp_min`, `Precipitaciones`, `Media_viento`, `Evaporización_agua`, `Nombre_E`) VALUES
(6, '1ra/Enero/2022', 28.9, 20.5, 3.1, 21.1, 47.2, 'E. Caibarién'),
(7, '1ra/Enero/2022', 28.9, 17.2, 2, 4.1, 27.8, 'E. Sagua la Grande'),
(8, '1ra/Enero/2022', 29.1, 19.2, 0.2, 4.7, 26, 'E. La Piedra'),
(9, '1ra/Enero/2022', 29.9, 16.3, 2.3, 13.3, 36.45, 'E. Santo Domingo'),
(10, '1ra/Enero/2022', 29.1, 17.7, 49.23, 3, 5.1, 'E. Yabú'),
(11, '2da/Enero/2022', 26.6, 20.5, 4.6, 11.8, 40.3, 'E. Caibarién'),
(12, '2da/Enero/2022', 26, 14.8, 34.3, 5.1, 27.5, 'E. Sagua la Grande'),
(13, '2da/Enero/2022', 26.5, 17, 6.6, 4.8, 23.3, 'E. La Piedra'),
(14, '2da/Enero/2022', 27.6, 14.8, 17.6, 9.2, 33.32, 'E. Santo Domingo'),
(15, '2da/Enero/2022', 26.5, 15.1, 44.01, 15.2, 4.8, 'E. Yabú'),
(16, '3ra/Enero/2022', 26.3, 17.6, 39.9, 10.8, 44.4, 'E. Caibarién'),
(17, '3ra/Enero/2022', 26.1, 15.6, 13.7, 6.3, 38.1, 'E. Sagua la Grande'),
(18, '3ra/Enero/2022', 27.4, 15.6, 0.3, 4.1, 37.7, 'E. La Piedra'),
(19, '3ra/Enero/2022', 27.7, 14.5, 1.9, 13.7, 42.5, 'E. Santo Domingo'),
(20, '3ra/Enero/2022', 27.3, 15.2, 51.82, 38.1, 6.1, 'E. Yabú'),
(21, '1ra/Febrero/2022', 27, 20.6, 175.5, 20.7, 44.2, 'E. Caibarién'),
(22, '1ra/Febrero/2022', 27.7, 16.7, 0.3, 5.9, 45.7, 'E. Sagua la Grande'),
(23, '1ra/Febrero/2022', 28.9, 19.1, 2.6, 6.2, 32, 'E. La Piedra'),
(24, '1ra/Febrero/2022', 29.7, 16, 0.3, 10.8, 47.21, 'E. Santo Domingo'),
(25, '1ra/Febrero/2022', 28.2, 17.4, 54.39, 76.9, 6, 'E. Yabú'),
(26, '2da/Febrero/2022', 27.8, 21.8, 18.7, 17.4, 42.7, 'E. Caibarién'),
(27, '2da/Febrero/2022', 27.7, 19.2, 29.6, 7.7, 44.5, 'E. Sagua la Grande'),
(28, '2da/Febrero/2022', 29.4, 20.8, 4.8, 6.2, 26.7, 'E. La Piedra'),
(29, '2da/Febrero/2022', 29.2, 18.7, 62.9, 11, 34.72, 'E. Santo Domingo'),
(30, '2da/Febrero/2022', 27.8, 19.4, 56.78, 38.7, 6.1, 'E. Yabú'),
(31, '3ra/Febrero/2022', 27.3, 22.2, 0, 20.3, 48.8, 'E. Caibarién'),
(32, '3ra/Febrero/2022', 28.1, 17.9, 0.5, 6.9, 31.8, 'E. Sagua la Grande'),
(33, '3ra/Febrero/2022', 29, 19.4, 47.7, 7, 30.9, 'E. La Piedra'),
(34, '3ra/Febrero/2022', 30.2, 16.9, 0.1, 14.9, 42.89, 'E. Santo Domingo'),
(35, '3ra/Febrero/2022', 28.7, 18, 46.75, 0.4, 6.6, 'E. Yabú'),
(36, '1ra/Marzo/2022', 28.2, 21.2, 14.2, 24.8, 56.1, 'E. Caibarién'),
(37, '1ra/Marzo/2022', 28.5, 18.4, 17.2, 4.8, 40.4, 'E. Sagua la Grande'),
(38, '1ra/Marzo/2022', 29.1, 19.1, 10.2, 6.6, 32.2, 'E. La Piedra'),
(39, '1ra/Marzo/2022', 30.4, 18.1, 6.7, 14.7, 53.64, 'E. Santo Domingo'),
(40, '1ra/Marzo/2022', 29.2, 19, 52.69, 49.7, 8.7, 'E. Yabú'),
(41, '2da/Marzo/2022', 29.1, 21.9, 9.3, 24.6, 47.1, 'E. Caibarién'),
(42, '2da/Marzo/2022', 30.3, 19.5, 15.6, 5.1, 36.2, 'E. Sagua la Grande'),
(43, '2da/Marzo/2022', 30.6, 19.9, 50.2, 4.5, 46.3, 'E. La Piedra'),
(44, '2da/Marzo/2022', 32.2, 19, 1.2, 15.2, 51.83, 'E. Santo Domingo'),
(45, '2da/Marzo/2022', 30.5, 20.2, 56.55, 39, 11.5, 'E. Yabú'),
(46, '3ra/Marzo/2022', 28.2, 20.4, 93.6, 19.4, 57.3, 'E. Caibarién'),
(47, '3ra/Marzo/2022', 29.4, 17.9, 17.9, 17.9, 58.9, 'E. Sagua la Grande'),
(48, '3ra/Marzo/2022', 28.4, 18.7, 13.8, 9.6, 47, 'E. La Piedra'),
(49, '3ra/Marzo/2022', 30.8, 16.6, 12.6, 15.5, 67.44, 'E. Santo Domingo'),
(50, '3ra/Marzo/2022', 29, 18, 60.14, 48.4, 9.3, 'E. Yabú'),
(51, '1ra/Abril/2022', 29.9, 21.1, 45.9, 17.8, 40, 'E. Caibarién'),
(52, '1ra/Abril/2022', 31.2, 20.3, 19.8, 4.3, 42.5, 'E. Sagua la Grande'),
(53, '1ra/Abril/2022', 31.5, 20.4, 20.1, 4.1, 29.4, 'E. La Piedra'),
(54, '1ra/Abril/2022', 32.7, 19.8, 111.3, 15.6, 58.39, 'E. Santo Domingo'),
(55, '1ra/Abril/2022', 31.7, 20.5, 57.4, 71.6, 9.3, 'E. Yabú'),
(56, '2da/Abril/2022', 28.5, 22.2, 40.2, 22.5, 55, 'E. Caibarién'),
(57, '2da/Abril/2022', 29.9, 20.2, 7, 7.4, 45.9, 'E. Sagua la Grande'),
(58, '2da/Abril/2022', 30.6, 20.2, 60, 6.1, 20.7, 'E. La Piedra'),
(59, '2da/Abril/2022', 31.6, 19, 31.8, 13.6, 60.1, 'E. Santo Domingo'),
(60, '2da/Abril/2022', 30.3, 19.7, 52.8, 51.1, 10, 'E. Yabú'),
(61, '3ra/Abril/2022', 28.4, 22.1, 134.8, 23.6, 61.3, 'E. Caibarién'),
(62, '3ra/Abril/2022', 29.1, 19.4, 25.2, 7.6, 50.9, 'E. Sagua la Grande'),
(63, '3ra/Abril/2022', 29.1, 20.3, 21.7, 7.5, 19.8, 'E. La Piedra'),
(64, '3ra/Abril/2022', 31, 18.7, 9.2, 12.1, 70.49, 'E. Santo Domingo'),
(65, '3ra/Abril/2022', 29.1, 19.5, 58.07, 34, 11.8, 'E. Yabú'),
(66, '1ra/Mayo/2022', 30.2, 21.5, 46.5, 17.5, 37.9, 'E. Caibarién'),
(67, '1ra/Mayo/2022', 31.1, 20.4, 55.3, 4.9, 39, 'E. Sagua la Grande'),
(68, '1ra/Mayo/2022', 31.8, 21.1, 22.7, 4.7, 22.5, 'E. La Piedra'),
(69, '1ra/Mayo/2022', 32.6, 20.2, 35.8, 6.1, 53.13, 'E. Santo Domingo'),
(70, '1ra/Mayo/2022', 31.2, 20.3, 58.21, 55.6, 7.5, 'E. Yabú'),
(71, '2da/Mayo/2022', 28.9, 21.3, 159.8, 8.2, 27, 'E. Caibarién'),
(72, '2da/Mayo/2022', 30.3, 19.9, 73.2, 2, 26, 'E. Sagua la Grande'),
(73, '2da/Mayo/2022', 29.5, 20.4, 138.2, 5.6, 16, 'E. La Piedra'),
(74, '2da/Mayo/2022', 31.4, 20.1, 75.7, 10.3, 42.24, 'E. Santo Domingo'),
(75, '2da/Mayo/2022', 30.3, 20.2, 51.02, 137.7, 3.8, 'E. Yabú'),
(76, '3ra/Mayo/2022', 29.9, 22.9, 39.7, 19.5, 35.3, 'E. Caibarién'),
(77, '3ra/Mayo/2022', 31, 22.5, 17.9, 4.9, 33.6, 'E. Sagua la Grande'),
(78, '3ra/Mayo/2022', 30.7, 22.6, 20.2, 7.2, 17.5, 'E. La Piedra'),
(79, '3ra/Mayo/2022', 31.9, 22.6, 56.2, 7.9, 57.64, 'E. Santo Domingo'),
(80, '3ra/Mayo/2022', 30.6, 22.6, 61.43, 78.4, 8.2, 'E. Yabú'),
(84, '1ra/Junio/2022', 29.2, 22.4, 112.7, 17.4, 23.1, 'E. Caibarién'),
(85, '1ra/Junio/2022', 29.7, 22, 184.8, 2.1, 15.2, 'E. Sagua la Grande'),
(86, '1ra/Junio/2022', 28.8, 21.1, 238.9, 4.8, 12.6, 'E. La Piedra'),
(87, '2da/Junio/2022', 30.7, 22.6, 28.5, 14.5, 31.3, 'E. Caibarién'),
(88, '2da/Junio/2022', 32.2, 22, 27.4, 3.3, 31, 'E. Sagua la Grande'),
(89, '2da/Junio/2022', 30.9, 21.9, 20.9, 3.9, 24.9, 'E. La Piedra'),
(90, '2da/Junio/2022', 33.1, 21.7, 92.1, 10.7, 60.94, 'E. Santo Domingo'),
(91, '2da/Junio/2022', 32, 21.7, 63.62, 32.7, 6.2, 'E. Yabú'),
(92, '3ra/Junio/2022', 31.1, 23, 62.3, 17.1, 47.9, 'E. Caibarién'),
(93, '3ra/Junio/2022', 31.7, 21.9, 142.9, 3.5, 24.2, 'E. Sagua la Grande'),
(94, '3ra/Junio/2022', 31.4, 21.9, 69.4, 4.7, 20, 'E. La Piedra'),
(95, '3ra/Junio/2022', 32.8, 21.8, 219.7, 8.8, 10.1, 'E. Santo Domingo'),
(96, '3ra/Junio/2022', 32.1, 21.6, 54.78, 119, 4.9, 'E. Yabú'),
(97, '1ra/Julio/2022', 31.4, 23.7, 64.1, 16.8, 54.1, 'E. Caibarién'),
(98, '1ra/Julio/2022', 32.2, 22.9, 73.1, 5.1, 32.4, 'E. Sagua la Grande'),
(99, '1ra/Julio/2022', 32.1, 22.6, 22.6, 5.2, 20.2, 'E. La Piedra'),
(100, '1ra/Julio/2022', 33.2, 22.3, 40.2, 7.5, 70.02, 'E. Santo Domingo'),
(101, '1ra/Julio/2022', 32.5, 22.4, 64.44, 123.3, 6.8, 'E. Yabú'),
(102, '2da/Julio/2022', 31.8, 24, 47.7, 14.9, 70.8, 'E. Caibarién'),
(103, '2da/Julio/2022', 32.4, 23.2, 51.6, 5.3, 37.6, 'E. Sagua la Grande'),
(104, '2da/Julio/2022', 32.3, 22.6, 17.9, 5.7, 26.5, 'E. La Piedra'),
(105, '2da/Julio/2022', 33.4, 22.7, 94.4, 9.5, 56.02, 'E. Santo Domingo'),
(106, '2da/Julio/2022', 32.5, 22.7, 60.62, 53.6, 5.5, 'E. Yabú'),
(107, '3ra/Julio/2022', 31.1, 24.3, 32.9, 18.1, 68.7, 'E. Caibarién'),
(108, '3ra/Julio/2022', 31.8, 23.5, 34, 5.3, 50.1, 'E. Sagua la Grande'),
(109, '3ra/Julio/2022', 31.5, 22.8, 78.7, 5.8, 20.5, 'E. La Piedra'),
(110, '3ra/Julio/2022', 33.3, 22.8, 6.9, 9.6, 65.95, 'E. Santo Domingo'),
(111, '3ra/Julio/2022', 26.5, 22.7, 79.39, 31.4, 7.5, 'E. Yabú'),
(112, '1ra/Agosto/2022', 31.2, 24.6, 16.6, 22, 74.3, 'E. Caibarién'),
(113, '1ra/Agosto/2022', 32.2, 23.8, 2.5, 3.1, 43, 'E. Sagua la Grande'),
(114, '1ra/Agosto/2022', 32, 23.2, 25.6, 6.6, 17.4, 'E. La Piedra'),
(115, '1ra/Agosto/2022', 33.3, 22.6, 9.6, 10.5, 59.3, 'E. Santo Domingo'),
(116, '1ra/Agosto/2022', 32.1, 23, 60.77, 4.8, 7.1, 'E. Yabú'),
(117, '2da/Agosto/2022', 32.1, 24.4, 9.8, 15.6, 72.3, 'E. Caibarién'),
(118, '2da/Agosto/2022', 33.2, 22.8, 23, 4.8, 43.3, 'E. Sagua la Grande'),
(119, '2da/Agosto/2022', 31.6, 21.9, 37.9, 5.1, 22.7, 'E. La Piedra'),
(120, '2da/Agosto/2022', 34.3, 21.9, 67.3, 8.3, 53.31, 'E. Santo Domingo'),
(121, '2da/Agosto/2022', 33.3, 22.4, 53.96, 55.9, 6.5, 'E. Yabú'),
(122, '3ra/Agosto/2022', 31.8, 23.6, 106.5, 14.5, 61.8, 'E. Caibarién'),
(123, '3ra/Agosto/2022', 32.9, 23.2, 103.8, 4.6, 40.4, 'E. Sagua la Grande'),
(124, '3ra/Agosto/2022', 32.2, 22.6, 35.6, 5.2, 27, 'E. La Piedra'),
(125, '3ra/Agosto/2022', 33.7, 22.6, 139, 6.2, 61.21, 'E. Santo Domingo'),
(126, '3ra/Agosto/2022', 32.9, 22.7, 71.4, 56.1, 5.6, 'E. Yabú'),
(127, '1ra/Septiembre/2022', 32.1, 24.3, 5.2, 15.2, 59.9, 'E. Caibarién'),
(128, '1ra/Septiembre/2022', 32.8, 23.1, 76.6, 3.8, 30.4, 'E. Sagua la Grande'),
(129, '1ra/Septiembre/2022', 32.9, 23.1, 33.5, 5, 21.5, 'E. La Piedra'),
(130, '1ra/Septiembre/2022', 33.5, 22.7, 38.9, 7.2, 60.48, 'E. Santo Domingo'),
(131, '1ra/Septiembre/2022', 32.7, 22, 58.49, 27.6, 5.1, 'E. Yabú'),
(132, '2da/Septiembre/2022', 32.2, 23.6, 51.8, 15.6, 50.03, 'E. Caibarién'),
(133, '2da/Septiembre/2022', 32.4, 23, 14.4, 5.8, 29.7, 'E. Sagua la Grande'),
(134, '2da/Septiembre/2022', 32.2, 22.6, 36.1, 5.2, 26, 'E. La Piedra'),
(135, '2da/Septiembre/2022', 33.4, 22.2, 72.1, 5.4, 51.3, 'E. Santo Domingo'),
(136, '2da/Septiembre/2022', 32.3, 22.1, 54.96, 47.8, 3.7, 'E. Yabú'),
(137, '3ra/Septiembre/2022', 31.1, 23.7, 28.8, 12, 39.7, 'E. Caibarién'),
(138, '3ra/Septiembre/2022', 30.9, 22.9, 41.5, 5.9, 29, 'E. Sagua la Grande'),
(139, '3ra/Septiembre/2022', 29.6, 21.8, 150.6, 5.1, 19.5, 'E. La Piedra'),
(140, '3ra/Septiembre/2022', 31.7, 22.5, 66.9, 4.9, 40.74, 'E. Santo Domingo'),
(141, '3ra/Septiembre/2022', 30.8, 22.5, 42.68, 56.2, 4.4, 'E. Yabú'),
(142, '1ra/Octubre/2022', 30.7, 21.4, 2.9, 14.8, 65.7, 'E. Caibarién'),
(143, '1ra/Octubre/2022', 30.8, 20.2, 15.6, 8.8, 30.1, 'E. Sagua la Grande'),
(144, '1ra/Octubre/2022', 30.8, 21.2, 99.2, 4.3, 23.1, 'E. La Piedra'),
(145, '1ra/Octubre/2022', 31.8, 19.4, 21, 6.6, 49.7, 'E. Santo Domingo'),
(146, '1ra/Octubre/2022', 30.6, 20.2, 45.21, 15.1, 7, 'E. Yabú'),
(147, '2da/Octubre/2022', 31.1, 22.8, 75.7, 13.5, 42.9, 'E. Caibarién'),
(148, '2da/Octubre/2022', 31.4, 22.1, 18.3, 5.3, 22.6, 'E. Sagua la Grande'),
(149, '2da/Octubre/2022', 31, 22.5, 14.2, 5.3, 27.8, 'E. La Piedra'),
(150, '2da/Octubre/2022', 31.7, 21.8, 49.7, 6.2, 44.55, 'E. Santo Domingo'),
(151, '2da/Octubre/2022', 31.2, 21.9, 46.12, 24.5, 6.5, 'E. Yabú'),
(152, '3ra/Octubre/2022', 29.2, 22, 5.9, 13.5, 70.7, 'E. Caibarién'),
(153, '3ra/Octubre/2022', 29.7, 18.8, 0.7, 7.3, 29.9, 'E. Sagua la Grande'),
(154, '3ra/Octubre/2022', 30.3, 20.5, 2.7, 3.8, 22.7, 'E. La Piedra'),
(155, '3ra/Octubre/2022', 30.5, 18, 0, 6.3, 44.38, 'E. Santo Domingo'),
(156, '3ra/Octubre/2022', 29.5, 19.2, 38.14, 0, 7, 'E. Yabú');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actor_clave`
--
ALTER TABLE `actor_clave`
  ADD PRIMARY KEY (`Nombre_A`),
  ADD KEY `Nombre_M` (`Nombre_M`);

--
-- Indices de la tabla `estación`
--
ALTER TABLE `estación`
  ADD PRIMARY KEY (`Nombre_E`);

--
-- Indices de la tabla `municipio`
--
ALTER TABLE `municipio`
  ADD PRIMARY KEY (`Nombre_M`),
  ADD KEY `Nombre_E` (`Nombre_E`);

--
-- Indices de la tabla `observación`
--
ALTER TABLE `observación`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Nombre_E` (`Nombre_E`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `observación`
--
ALTER TABLE `observación`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=157;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `actor_clave`
--
ALTER TABLE `actor_clave`
  ADD CONSTRAINT `actor_clave_ibfk_1` FOREIGN KEY (`Nombre_M`) REFERENCES `municipio` (`Nombre_M`);

--
-- Filtros para la tabla `municipio`
--
ALTER TABLE `municipio`
  ADD CONSTRAINT `municipio_ibfk_1` FOREIGN KEY (`Nombre_E`) REFERENCES `estación` (`Nombre_E`);

--
-- Filtros para la tabla `observación`
--
ALTER TABLE `observación`
  ADD CONSTRAINT `observación_ibfk_1` FOREIGN KEY (`Nombre_E`) REFERENCES `estación` (`Nombre_E`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
