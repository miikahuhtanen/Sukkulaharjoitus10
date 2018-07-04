-- MySQL dump 10.13  Distrib 5.7.22, for Win64 (x86_64)
--
-- Host: localhost    Database: Tenttikysymykset
-- ------------------------------------------------------
-- Server version	5.7.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `Tenttikysymykset`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `Tenttikysymykset` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `Tenttikysymykset`;

--
-- Table structure for table `kategoria`
--

DROP TABLE IF EXISTS `kategoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kategoria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teksti` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kategoria`
--

LOCK TABLES `kategoria` WRITE;
/*!40000 ALTER TABLE `kategoria` DISABLE KEYS */;
INSERT INTO `kategoria` VALUES (1,'java');
/*!40000 ALTER TABLE `kategoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kysymys`
--

DROP TABLE IF EXISTS `kysymys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kysymys` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teksti` varchar(255) DEFAULT NULL,
  `tyyppiID` int(11) DEFAULT NULL,
  `kategoriaID` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kysymys`
--

LOCK TABLES `kysymys` WRITE;
/*!40000 ALTER TABLE `kysymys` DISABLE KEYS */;
INSERT INTO `kysymys` VALUES (1,'Mikä seuraavista ei ole Javan muuttuja?',1,1);
/*!40000 ALTER TABLE `kysymys` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kysymysvaihtoehdot`
--

DROP TABLE IF EXISTS `kysymysvaihtoehdot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kysymysvaihtoehdot` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kysymysID` int(11) DEFAULT NULL,
  `teksti` varchar(255) DEFAULT NULL,
  `oikeavastaus` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kysymysvaihtoehdot`
--

LOCK TABLES `kysymysvaihtoehdot` WRITE;
/*!40000 ALTER TABLE `kysymysvaihtoehdot` DISABLE KEYS */;
INSERT INTO `kysymysvaihtoehdot` VALUES (1,1,'String',0),(2,1,'Peruna',1);
/*!40000 ALTER TABLE `kysymysvaihtoehdot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tyyppi`
--

DROP TABLE IF EXISTS `tyyppi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tyyppi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kuvaus` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tyyppi`
--

LOCK TABLES `tyyppi` WRITE;
/*!40000 ALTER TABLE `tyyppi` DISABLE KEYS */;
INSERT INTO `tyyppi` VALUES (1,'monivalinta');
/*!40000 ALTER TABLE `tyyppi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-04 16:19:28
