-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2017 at 01:13 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `accounts`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_table`
--

CREATE TABLE `admin_table` (
  `id` int(11) NOT NULL,
  `user_type` varchar(10) DEFAULT NULL,
  `user_name` varchar(100) NOT NULL,
  `user_pass` varchar(200) NOT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_table`
--

INSERT INTO `admin_table` (`id`, `user_type`, `user_name`, `user_pass`, `firstname`, `lastname`, `email`) VALUES
(1, 'admin', 'admin', 'd033e22ae348aeb5660fc2140aec35850c4da997', 'aj', 'maniti', 'aj@gmail.com'),
(2, 'client', 'user', '12dea96fec20593566ab75692c9949596833adc9', 'huan', 'cruz', 'cruz@mail.com'),
(3, 'sp', 'sprovider', '991b63e6d7aa2915e61742eebf1ce8263381c0a4', 'jan', 'horhe', 'horhe@mail.com'),
(21, 'sp', 'sadf', '3da541559918a808c2402bba5012f6c60b27661c', NULL, NULL, 'asdf@asdf'),
(20, '', 'aldrienne', '1131065f52c48b4fbe4b95600db46ab82d4312db', NULL, NULL, 'aj@gmail.com'),
(19, NULL, 'aldrienne', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', NULL, NULL, 'aj@gmail.com'),
(18, NULL, 'ajmaniti', '202cb962ac59075b964b07152d234b70', NULL, NULL, '123@sdfa'),
(22, 'sp', 'ajsd', '2048b22ac0881f917af3e938105055ab85498548', NULL, NULL, 'aj@aj'),
(23, 'client', 'jokeslites', '6c973e8803b3fbaabfb09dd916e295ed24da1d43', NULL, NULL, 'joker@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_table`
--
ALTER TABLE `admin_table`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_table`
--
ALTER TABLE `admin_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
