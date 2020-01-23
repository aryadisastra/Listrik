-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 16 Jan 2020 pada 19.42
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 5.6.40

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
-- Struktur dari tabel `biayaadmin`
--

CREATE TABLE `biayaadmin` (
  `id` varchar(20) NOT NULL,
  `biaya` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `biayaadmin`
--

INSERT INTO `biayaadmin` (`id`, `biaya`) VALUES
('12020', 5000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `daya`
--

CREATE TABLE `daya` (
  `id` int(11) NOT NULL,
  `watt` int(11) NOT NULL,
  `hargakwh` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `daya`
--

INSERT INTO `daya` (`id`, `watt`, `hargakwh`) VALUES
(1, 900, 20000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `idpel` varchar(20) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `email` text,
  `kode_pos` varchar(6) DEFAULT NULL,
  `id_daya` int(11) DEFAULT NULL,
  `alamat` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`idpel`, `nama`, `email`, `kode_pos`, `id_daya`, `alamat`) VALUES
('111222333', 'aaaaa', 'gdghdggd@gfj.com', '40521', 1, 'yjhf,,vhjjhy');

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas`
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
-- Dumping data untuk tabel `petugas`
--

INSERT INTO `petugas` (`id`, `nama`, `tmptlhr`, `tgllhr`, `gender`, `alamat`, `nohp`, `akses`, `username`, `password`) VALUES
(1, 'ghdjt', 'cihj', '10-12-1998', 'laki-laki', 'vbcjghfjg', '089754424644', 'admin', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
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
-- Indeks untuk tabel `biayaadmin`
--
ALTER TABLE `biayaadmin`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `daya`
--
ALTER TABLE `daya`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`idpel`),
  ADD KEY `id_daya` (`id_daya`);

--
-- Indeks untuk tabel `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idpet` (`idpet`),
  ADD KEY `idpel` (`idpel`),
  ADD KEY `id_biaya` (`id_biaya`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `petugas`
--
ALTER TABLE `petugas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD CONSTRAINT `pelanggan_ibfk_1` FOREIGN KEY (`id_daya`) REFERENCES `daya` (`id`);

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`idpet`) REFERENCES `petugas` (`id`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`idpel`) REFERENCES `pelanggan` (`idpel`),
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`id_biaya`) REFERENCES `biayaadmin` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
