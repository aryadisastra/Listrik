-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 24, 2020 at 04:32 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `listrik`
--

-- --------------------------------------------------------

--
-- Table structure for table `biayaadmin`
--

CREATE TABLE `biayaadmin` (
  `id` varchar(20) NOT NULL,
  `biaya` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `biayaadmin`
--

INSERT INTO `biayaadmin` (`id`, `biaya`) VALUES
('12020', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `daya`
--

CREATE TABLE `daya` (
  `id` int(11) NOT NULL,
  `watt` int(11) NOT NULL,
  `hargakwh` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daya`
--

INSERT INTO `daya` (`id`, `watt`, `hargakwh`) VALUES
(2, 7869750, 75984),
(3, 7869750, 75984),
(4, 7869750, 75984),
(5, 7869750, 75984),
(6, 7869750, 75984),
(7, 7869750, 75984),
(8, 7869750, 75984),
(9, 7869750, 75984),
(10, 7869750, 75984),
(11, 7869750, 75984),
(12, 7869750, 75984),
(13, 7869750, 75984);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `idpel` varchar(20) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `email` text,
  `kode_pos` varchar(6) DEFAULT NULL,
  `id_daya` int(11) DEFAULT NULL,
  `alamat` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id` int(11) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `tmptlhr` varchar(20) NOT NULL,
  `tgllhr` text NOT NULL,
  `gender` varchar(10) NOT NULL,
  `alamat` text NOT NULL,
  `nohp` varchar(15) DEFAULT NULL,
  `akses` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id`, `nama`, `tmptlhr`, `tgllhr`, `gender`, `alamat`, `nohp`, `akses`, `username`, `password`) VALUES
(1, 'ghdjt', 'cihj', '10-12-1998', 'laki-laki', 'vbcjghfjg', '089754424644', 'admin', 'admin', 'admin'),
(2, 'arya', 'cimahi', '2002-09-09', 'laki-laki', 'sariwangi', '0896974570166', 'Petugas', 'petugas1', 'petugas1'),
(3, 'Ian S', 'Bandung', '2020-01-25', 'PRIA', 'moon', '08136457545', 'User', 'Ian', '2355+');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(11) NOT NULL,
  `idpel` varchar(20) NOT NULL,
  `idpet` int(11) DEFAULT NULL,
  `biayahari` int(11) DEFAULT NULL,
  `waktu` text,
  `id_biaya` varchar(20) DEFAULT NULL,
  `denda` int(11) DEFAULT NULL,
  `tagihan` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `biayaadmin`
--
ALTER TABLE `biayaadmin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `daya`
--
ALTER TABLE `daya`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`idpel`),
  ADD KEY `id_daya` (`id_daya`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idpet` (`idpet`),
  ADD KEY `idpel` (`idpel`),
  ADD KEY `id_biaya` (`id_biaya`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `daya`
--
ALTER TABLE `daya`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD CONSTRAINT `pelanggan_ibfk_1` FOREIGN KEY (`id_daya`) REFERENCES `daya` (`id`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`idpet`) REFERENCES `petugas` (`id`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`idpel`) REFERENCES `pelanggan` (`idpel`),
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`id_biaya`) REFERENCES `biayaadmin` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
