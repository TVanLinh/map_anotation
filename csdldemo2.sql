-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 17, 2017 at 10:26 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `csdldemo2`
--

-- --------------------------------------------------------

--
-- Table structure for table `Child`
--

CREATE TABLE `Child` (
  `id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `id_parent` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `Child`
--

INSERT INTO `Child` (`id`, `name`, `id_parent`) VALUES
(7, 'Child', NULL),
(8, 'Child', NULL),
(9, 'Child1', 9);

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

CREATE TABLE `class` (
  `id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`id`, `name`) VALUES
(1, 'A'),
(2, 'B'),
(3, 'C'),
(4, 'A'),
(5, 'A');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `IDEMPLOYEE` int(11) NOT NULL,
  `FIRST_NAME` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `LAST_NAME` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`IDEMPLOYEE`, `FIRST_NAME`, `LAST_NAME`) VALUES
(1, 'Tran Van ', 'Linh'),
(2, 'Tran Van ', 'Hoang'),
(3, 'Le Tat ', 'thanh'),
(4, 'Bui Van Bao', 'Nam');

-- --------------------------------------------------------

--
-- Table structure for table `One`
--

CREATE TABLE `One` (
  `id` int(11) NOT NULL,
  `name` varchar(20) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `One`
--

INSERT INTO `One` (`id`, `name`) VALUES
(1, 'One 1'),
(2, 'o1'),
(3, 'o2'),
(4, 'o3'),
(5, 'o4'),
(6, 'o1'),
(7, 'o2'),
(8, 'o3'),
(9, 'o4'),
(10, 'o1'),
(11, 'o2'),
(12, 'o3'),
(13, 'o4'),
(14, 'oo1'),
(15, 'oo2'),
(16, 'oo3'),
(17, 'oo4'),
(18, 'oo2'),
(19, 'oo3'),
(20, 'oo4'),
(21, 'oo2'),
(22, 'oo3'),
(23, 'oo4');

-- --------------------------------------------------------

--
-- Table structure for table `One_True`
--

CREATE TABLE `One_True` (
  `id_one` int(11) DEFAULT NULL,
  `id_true` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `One_True`
--

INSERT INTO `One_True` (`id_one`, `id_true`) VALUES
(1, 2),
(1, 3),
(1, 4),
(10, 6),
(11, 6),
(12, 6),
(13, 6),
(14, 1),
(21, 1),
(22, 1),
(23, 1);

-- --------------------------------------------------------

--
-- Table structure for table `Parent`
--

CREATE TABLE `Parent` (
  `id` int(11) NOT NULL,
  `name` varchar(40) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `Parent`
--

INSERT INTO `Parent` (`id`, `name`) VALUES
(2, 'Tran '),
(3, 'Tran '),
(4, 'Tran '),
(5, 'Tran Van Bao'),
(6, 'Tran Van Bao'),
(7, 'parent'),
(8, 'parent'),
(9, 'parent1');

-- --------------------------------------------------------

--
-- Table structure for table `Person`
--

CREATE TABLE `Person` (
  `id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `birth_day` datetime DEFAULT NULL,
  `weight` double DEFAULT NULL,
  `address` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `Person`
--

INSERT INTO `Person` (`id`, `name`, `birth_day`, `weight`, `address`) VALUES
(1, 'Tran Van Linh', '2017-04-14 08:56:07', 56, 'Hoa Binh'),
(2, 'Bui thi Thao', '2017-05-12 08:58:06', 45, 'Thai Binh'),
(3, 'Le tat tung', '2017-08-18 08:59:30', 48, 'Ha Noi'),
(4, 'Ma Van Tai', '1995-08-18 09:03:38', 70, 'Ha Noi'),
(5, 'Tran Van Linh', '1995-08-18 09:03:38', 55, 'Binh Duong');

-- --------------------------------------------------------

--
-- Table structure for table `PHONE`
--

CREATE TABLE `PHONE` (
  `IDPHONE` int(11) NOT NULL,
  `PROVIDER` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `PHONENUMBER` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `OWNER_IDEMPLOYEE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `PHONE`
--

INSERT INTO `PHONE` (`IDPHONE`, `PROVIDER`, `PHONENUMBER`, `OWNER_IDEMPLOYEE`) VALUES
(1, 'Ha noi', '01644952648', 1),
(2, 'Hai Phong', '0948628725', 1);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) DEFAULT NULL,
  `student_name` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `student_name`) VALUES
(3, 'La Van Tai'),
(3, 'Hoang Tat Tai');

-- --------------------------------------------------------

--
-- Table structure for table `Two`
--

CREATE TABLE `Two` (
  `id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `Two`
--

INSERT INTO `Two` (`id`, `name`) VALUES
(1, 't1'),
(2, 't2'),
(3, 't3'),
(4, 't4'),
(5, 'Moi'),
(6, 'Moi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Child`
--
ALTER TABLE `Child`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Child_Parent_id_fk` (`id_parent`);

--
-- Indexes for table `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`IDEMPLOYEE`);

--
-- Indexes for table `One`
--
ALTER TABLE `One`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Parent`
--
ALTER TABLE `Parent`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Person`
--
ALTER TABLE `Person`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `PHONE`
--
ALTER TABLE `PHONE`
  ADD PRIMARY KEY (`IDPHONE`);

--
-- Indexes for table `Two`
--
ALTER TABLE `Two`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Child`
--
ALTER TABLE `Child`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `class`
--
ALTER TABLE `class`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `IDEMPLOYEE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `One`
--
ALTER TABLE `One`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `Parent`
--
ALTER TABLE `Parent`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `Person`
--
ALTER TABLE `Person`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `PHONE`
--
ALTER TABLE `PHONE`
  MODIFY `IDPHONE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `Two`
--
ALTER TABLE `Two`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `Child`
--
ALTER TABLE `Child`
  ADD CONSTRAINT `Child_Parent_id_fk` FOREIGN KEY (`id_parent`) REFERENCES `Parent` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
