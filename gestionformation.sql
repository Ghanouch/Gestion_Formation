-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 31, 2015 at 01:08 AM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gestionformation`
--
CREATE DATABASE IF NOT EXISTS `gestionformation` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `gestionformation`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id_admin` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(30) DEFAULT NULL,
  `mot_de_passe` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `login`, `mot_de_passe`) VALUES
(2, 'p283385', 'azerty');

-- --------------------------------------------------------

--
-- Table structure for table `departement`
--

CREATE TABLE IF NOT EXISTS `departement` (
  `id_dept` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(20) DEFAULT NULL,
  `chef_departement` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_dept`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `departement`
--

INSERT INTO `departement` (`id_dept`, `libelle`, `chef_departement`) VALUES
(8, 'Math/Info', 'EZZATI Abdelilah'),
(9, 'Physique/Chime', 'SAADANI chi7aja'),
(10, 'Biologie/Giologie', 'AMRANI Zakaria');

-- --------------------------------------------------------

--
-- Table structure for table `enseignant`
--

CREATE TABLE IF NOT EXISTS `enseignant` (
  `cin` varchar(10) NOT NULL DEFAULT '',
  `ppr` varchar(10) DEFAULT NULL,
  `login` varchar(30) DEFAULT NULL,
  `mot_de_passe` varchar(30) DEFAULT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Tel` varchar(10) DEFAULT NULL,
  `filiere` varchar(30) DEFAULT NULL,
  `departement` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `enseignant`
--

INSERT INTO `enseignant` (`cin`, `ppr`, `login`, `mot_de_passe`, `nom`, `prenom`, `Email`, `Tel`, `filiere`, `departement`) VALUES
('11200566', 'G3667677', '11200566', 'G3667677', 'EZZATI', 'Abdelilah', 'Ezzati@gmail.com', '066000890', NULL, 'MAth/Info'),
('FG7788', '222222222', '222222222', 'FG7788', 'BOUCHAIB', 'NaserEddine', 'Bouchaib@gmail.com', '0677895649', NULL, 'Math/Info'),
('H678899', '225566', '225566', 'H678899', 'GADI', 'Taoufik', 'Gadi@gmail.com', '0666757788', NULL, 'Math/Info');

-- --------------------------------------------------------

--
-- Table structure for table `etudiant`
--

CREATE TABLE IF NOT EXISTS `etudiant` (
  `cin` varchar(10) NOT NULL DEFAULT '',
  `cne` int(11) DEFAULT NULL,
  `login` varchar(30) DEFAULT NULL,
  `mot_de_passe` varchar(30) DEFAULT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `date_naissance` date DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Tel` varchar(10) DEFAULT NULL,
  `adresse` varchar(100) DEFAULT NULL,
  `filiere` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `etudiant`
--

INSERT INTO `etudiant` (`cin`, `cne`, `login`, `mot_de_passe`, `nom`, `prenom`, `date_naissance`, `Email`, `Tel`, `adresse`, `filiere`) VALUES
('D34555', 10305466, 'D34555', '10305466', 'ZIANI', 'Anass', NULL, 'ziani@gmail.com', '067098776', 'Agadir', 'MEM'),
('D564777', 1220335466, 'D564777', '1220335466', 'SAFRAOUI', 'Majdouline', NULL, 'Safraoui@gmail.com', '0655671890', 'Casablanca', 'GI'),
('F34444', 1090000, 'F34444', '1090000', 'Alaoui', 'Sara', NULL, 'alaoui@gmail.com', '066666666', 'Settat', 'RTT'),
('FD4566', 123456778, 'FD4566', '123456778', 'DAIF', 'Badr', NULL, 'Daif@gmail.com', '0699345277', 'Settat', 'GI'),
('G898889', 10887222, 'G898889', '10887222', 'LHMAM', 'Ismail', NULL, 'lhmam@gmail.com', '0653453911', 'Agadir', 'MEM'),
('H5667887', 1125633788, 'H5667887', '1125633788', 'GHANOUCH', 'ISSAM', NULL, 'ghanouch@gmail.com', '0600675418', 'CASA', 'GI'),
('P283385', 12901603, 'P283385', '12901603', 'ZAKI', 'Younesse', NULL, 'youness.zaki30@gmail.com', '0610210331', 'SETTAT', 'GI');

-- --------------------------------------------------------

--
-- Table structure for table `filiere`
--

CREATE TABLE IF NOT EXISTS `filiere` (
  `id_fil` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(20) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  `departement` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_fil`),
  KEY `fk_departement` (`dept_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `filiere`
--

INSERT INTO `filiere` (`id_fil`, `libelle`, `dept_id`, `departement`) VALUES
(4, 'Mactronique', NULL, 'Physique/Chime'),
(5, 'Genie Informatique', NULL, 'Math/Info'),
(6, 'Genie Electrique', NULL, 'Physique/Chime'),
(7, 'Genie Civil', NULL, 'Biologie/Giologie');

-- --------------------------------------------------------

--
-- Table structure for table `module`
--

CREATE TABLE IF NOT EXISTS `module` (
  `id_mod` int(11) NOT NULL AUTO_INCREMENT,
  `intitule` varchar(60) DEFAULT NULL,
  `nbre_heure` int(11) DEFAULT NULL,
  `niv_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_mod`),
  KEY `fk_niveau` (`niv_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `module`
--

INSERT INTO `module` (`id_mod`, `intitule`, `nbre_heure`, `niv_id`) VALUES
(1, 'm1', 12, NULL),
(2, 'm2', 20, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `niveau`
--

CREATE TABLE IF NOT EXISTS `niveau` (
  `id_niv` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(20) DEFAULT NULL,
  `fil_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_niv`),
  KEY `fk_filiere` (`fil_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `filiere`
--
ALTER TABLE `filiere`
  ADD CONSTRAINT `fk_departement` FOREIGN KEY (`dept_id`) REFERENCES `departement` (`id_dept`);

--
-- Constraints for table `module`
--
ALTER TABLE `module`
  ADD CONSTRAINT `fk_niveau` FOREIGN KEY (`niv_id`) REFERENCES `niveau` (`id_niv`);

--
-- Constraints for table `niveau`
--
ALTER TABLE `niveau`
  ADD CONSTRAINT `fk_filiere` FOREIGN KEY (`fil_id`) REFERENCES `filiere` (`id_fil`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
