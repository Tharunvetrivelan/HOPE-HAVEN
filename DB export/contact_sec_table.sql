-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Generation Time: Jan 30, 2024 at 11:37 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hope_haven`
--

-- --------------------------------------------------------

--
-- Table structure for table `contact_sec_table`
--

CREATE TABLE `contact_sec_table` (
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone_no` int(20) NOT NULL,
  `message` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `contact_sec_table`
--

INSERT INTO `contact_sec_table` (`name`, `email`, `phone_no`, `message`) VALUES
('sdkjskdfj', 'sdsdf@sdfsd', 654654, 'sfsfd'),
('egsdgsg', 'gdfg@bdn.gfv', 343243, 'hrrsGsg'),
('gsdgsdg', 'sdsdgs@fbdb.lll', 99999, 'ttttttttttttt'),
('dbsdkf', 'sdkjsdbg@gmail.com', 8483993, 'aebfkb'),
('fafasf', 'sdfs@sddsf.cosdfj', 234324324, 'fsdfsdfffef'),
('dfgbfhgb', 'aakash@gmail.com', 329492384, 'sekfsedfesgegglocalhostworks'),
('sdkdvkd', 'g@g.g', 64838338, 'testing'),
('tharun', 'hari@gmail.com', 777, 'secondt'),
('prannav', 'fourth@gmail.c', 780, 'tenchuren'),
('sfdsfdsf', 'tron@gmai.com', 555455, 'nani'),
('dsgdsgdsg', 'myna@sdgnsng.sdjngksdg', 345453464, 'sysbdgsdgssoudnsdkjsd'),
('nalina', 'myna@gmail.koko', 93829235, 'subhasound'),
('haha', 'tharunvetrivelans@drngpit.ac.in', 88888888, 'hey buddy'),
('johny', 'john@gmail.com', 998548221, 'hey //');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
