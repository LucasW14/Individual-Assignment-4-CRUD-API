-- phpMyAdmin SQL Dump
-- version 5.2.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 10, 2025 at 06:10 PM
-- Server version: 8.0.39
-- PHP Version: 8.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `snake-database`
--

-- --------------------------------------------------------

--
-- Table structure for table `snakes`
--

CREATE TABLE `snakes` (
  `snake_id` int NOT NULL,
  `about` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `age` int NOT NULL,
  `description` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `habitat` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lengthm` double NOT NULL,
  `snake_name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `title` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `snakes`
--

INSERT INTO `snakes` (`snake_id`, `about`, `age`, `description`, `habitat`, `lengthm`, `snake_name`, `title`) VALUES
(1, 'cobra', 5, NULL, 'africa', 6.5, NULL, 'leoooo'),
(3, 'cobra', 5, NULL, 'africa', 6.5, NULL, 'ron'),
(5, 'cobra', 6, NULL, 'africa', 6.5, NULL, 'leo'),
(6, 'viper', 6, NULL, 'asia', 5.5, NULL, 'lonnie'),
(7, 'cobra', 5, NULL, 'south america', 6.5, NULL, 'leon'),
(8, 'cobra', 5, NULL, 'south america', 6.5, NULL, 'leon'),
(10, 'cobra', 6, NULL, 'africa', 6.5, NULL, 'bertram');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `snakes`
--
ALTER TABLE `snakes`
  ADD PRIMARY KEY (`snake_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `snakes`
--
ALTER TABLE `snakes`
  MODIFY `snake_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
