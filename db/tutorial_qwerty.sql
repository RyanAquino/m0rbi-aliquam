CREATE DATABASE  IF NOT EXISTS `tutorial` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tutorial`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: tutorial
-- ------------------------------------------------------
-- Server version	5.7.14

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
-- Table structure for table `appointments`
--

DROP TABLE IF EXISTS `appointments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `appointments` (
  `app_id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `status` enum('done','ongoing') NOT NULL DEFAULT 'ongoing',
  `request_id` int(11) NOT NULL,
  `transaction_id` int(11) NOT NULL,
  PRIMARY KEY (`app_id`),
  KEY `fk_req_app_idx` (`request_id`),
  KEY `fk_trans_app_idx` (`transaction_id`),
  CONSTRAINT `fk_req_app` FOREIGN KEY (`request_id`) REFERENCES `request` (`request_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_trans_app` FOREIGN KEY (`transaction_id`) REFERENCES `transaction` (`transaction_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointments`
--

LOCK TABLES `appointments` WRITE;
/*!40000 ALTER TABLE `appointments` DISABLE KEYS */;
INSERT INTO `appointments` VALUES (1,'2017-05-13','23:00:00','ongoing',2,1),(2,'2017-05-24','12:00:00','ongoing',6,2),(3,'2017-05-14','13:00:00','ongoing',3,3),(4,'2017-05-14','23:00:00','ongoing',19,11),(5,'2017-05-14','23:00:00','ongoing',20,12),(6,'2017-05-18','23:00:00','ongoing',20,12),(7,'2017-05-14','23:00:00','ongoing',21,13),(8,'2017-05-18','23:00:00','ongoing',21,13),(9,'2017-05-25','23:00:00','ongoing',21,13),(10,'2017-05-18','23:00:00','ongoing',22,14),(11,'2017-05-25','23:00:00','ongoing',22,14),(12,'2017-06-01','23:00:00','ongoing',22,14);
/*!40000 ALTER TABLE `appointments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auth_group`
--

DROP TABLE IF EXISTS `auth_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auth_group`
--

LOCK TABLES `auth_group` WRITE;
/*!40000 ALTER TABLE `auth_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `auth_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auth_group_permissions`
--

DROP TABLE IF EXISTS `auth_group_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_group_permissions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_id` int(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `auth_group_permissions_group_id_permission_id_0cd325b0_uniq` (`group_id`,`permission_id`),
  KEY `auth_group_permissio_permission_id_84c5c92e_fk_auth_perm` (`permission_id`),
  CONSTRAINT `auth_group_permissio_permission_id_84c5c92e_fk_auth_perm` FOREIGN KEY (`permission_id`) REFERENCES `auth_permission` (`id`),
  CONSTRAINT `auth_group_permissions_group_id_b120cbf9_fk_auth_group_id` FOREIGN KEY (`group_id`) REFERENCES `auth_group` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auth_group_permissions`
--

LOCK TABLES `auth_group_permissions` WRITE;
/*!40000 ALTER TABLE `auth_group_permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `auth_group_permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auth_permission`
--

DROP TABLE IF EXISTS `auth_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `content_type_id` int(11) NOT NULL,
  `codename` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `auth_permission_content_type_id_codename_01ab375a_uniq` (`content_type_id`,`codename`),
  CONSTRAINT `auth_permission_content_type_id_2f476e4b_fk_django_co` FOREIGN KEY (`content_type_id`) REFERENCES `django_content_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=349 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auth_permission`
--

LOCK TABLES `auth_permission` WRITE;
/*!40000 ALTER TABLE `auth_permission` DISABLE KEYS */;
INSERT INTO `auth_permission` VALUES (1,'Can add log entry',1,'add_logentry'),(2,'Can change log entry',1,'change_logentry'),(3,'Can delete log entry',1,'delete_logentry'),(4,'Can add permission',2,'add_permission'),(5,'Can change permission',2,'change_permission'),(6,'Can delete permission',2,'delete_permission'),(7,'Can add group',3,'add_group'),(8,'Can change group',3,'change_group'),(9,'Can delete group',3,'delete_group'),(10,'Can add user',4,'add_user'),(11,'Can change user',4,'change_user'),(12,'Can delete user',4,'delete_user'),(13,'Can add content type',5,'add_contenttype'),(14,'Can change content type',5,'change_contenttype'),(15,'Can delete content type',5,'delete_contenttype'),(16,'Can add session',6,'add_session'),(17,'Can change session',6,'change_session'),(18,'Can delete session',6,'delete_session'),(19,'Can add appointments',7,'add_appointments'),(20,'Can change appointments',7,'change_appointments'),(21,'Can delete appointments',7,'delete_appointments'),(22,'Can add category',8,'add_category'),(23,'Can change category',8,'change_category'),(24,'Can delete category',8,'delete_category'),(25,'Can add client',9,'add_client'),(26,'Can change client',9,'change_client'),(27,'Can delete client',9,'delete_client'),(28,'Can add message',10,'add_message'),(29,'Can change message',10,'change_message'),(30,'Can delete message',10,'delete_message'),(31,'Can add request',11,'add_request'),(32,'Can change request',11,'change_request'),(33,'Can delete request',11,'delete_request'),(34,'Can add schedule',12,'add_schedule'),(35,'Can change schedule',12,'change_schedule'),(36,'Can delete schedule',12,'delete_schedule'),(37,'Can add service',13,'add_service'),(38,'Can change service',13,'change_service'),(39,'Can delete service',13,'delete_service'),(40,'Can add transaction',14,'add_transaction'),(41,'Can change transaction',14,'change_transaction'),(42,'Can delete transaction',14,'delete_transaction'),(43,'Can add rate',15,'add_rate'),(44,'Can change rate',15,'change_rate'),(45,'Can delete rate',15,'delete_rate'),(46,'Can add sp',16,'add_sp'),(47,'Can change sp',16,'change_sp'),(48,'Can delete sp',16,'delete_sp'),(49,'Can add appointments',17,'add_appointments'),(50,'Can change appointments',17,'change_appointments'),(51,'Can delete appointments',17,'delete_appointments'),(52,'Can add auth group',18,'add_authgroup'),(53,'Can change auth group',18,'change_authgroup'),(54,'Can delete auth group',18,'delete_authgroup'),(55,'Can add auth group permissions',19,'add_authgrouppermissions'),(56,'Can change auth group permissions',19,'change_authgrouppermissions'),(57,'Can delete auth group permissions',19,'delete_authgrouppermissions'),(58,'Can add auth permission',20,'add_authpermission'),(59,'Can change auth permission',20,'change_authpermission'),(60,'Can delete auth permission',20,'delete_authpermission'),(61,'Can add auth user',21,'add_authuser'),(62,'Can change auth user',21,'change_authuser'),(63,'Can delete auth user',21,'delete_authuser'),(64,'Can add auth user groups',22,'add_authusergroups'),(65,'Can change auth user groups',22,'change_authusergroups'),(66,'Can delete auth user groups',22,'delete_authusergroups'),(67,'Can add auth user user permissions',23,'add_authuseruserpermissions'),(68,'Can change auth user user permissions',23,'change_authuseruserpermissions'),(69,'Can delete auth user user permissions',23,'delete_authuseruserpermissions'),(70,'Can add category',24,'add_category'),(71,'Can change category',24,'change_category'),(72,'Can delete category',24,'delete_category'),(73,'Can add client',25,'add_client'),(74,'Can change client',25,'change_client'),(75,'Can delete client',25,'delete_client'),(76,'Can add django admin log',26,'add_djangoadminlog'),(77,'Can change django admin log',26,'change_djangoadminlog'),(78,'Can delete django admin log',26,'delete_djangoadminlog'),(79,'Can add django content type',27,'add_djangocontenttype'),(80,'Can change django content type',27,'change_djangocontenttype'),(81,'Can delete django content type',27,'delete_djangocontenttype'),(82,'Can add django migrations',28,'add_djangomigrations'),(83,'Can change django migrations',28,'change_djangomigrations'),(84,'Can delete django migrations',28,'delete_djangomigrations'),(85,'Can add django session',29,'add_djangosession'),(86,'Can change django session',29,'change_djangosession'),(87,'Can delete django session',29,'delete_djangosession'),(88,'Can add message',30,'add_message'),(89,'Can change message',30,'change_message'),(90,'Can delete message',30,'delete_message'),(91,'Can add request',31,'add_request'),(92,'Can change request',31,'change_request'),(93,'Can delete request',31,'delete_request'),(94,'Can add schedule',32,'add_schedule'),(95,'Can change schedule',32,'change_schedule'),(96,'Can delete schedule',32,'delete_schedule'),(97,'Can add service',33,'add_service'),(98,'Can change service',33,'change_service'),(99,'Can delete service',33,'delete_service'),(100,'Can add transaction',34,'add_transaction'),(101,'Can change transaction',34,'change_transaction'),(102,'Can delete transaction',34,'delete_transaction'),(103,'Can add rate',35,'add_rate'),(104,'Can change rate',35,'change_rate'),(105,'Can delete rate',35,'delete_rate'),(106,'Can add sp',36,'add_sp'),(107,'Can change sp',36,'change_sp'),(108,'Can delete sp',36,'delete_sp'),(109,'Can add appointments',37,'add_appointments'),(110,'Can change appointments',37,'change_appointments'),(111,'Can delete appointments',37,'delete_appointments'),(112,'Can add auth group',38,'add_authgroup'),(113,'Can change auth group',38,'change_authgroup'),(114,'Can delete auth group',38,'delete_authgroup'),(115,'Can add auth group permissions',39,'add_authgrouppermissions'),(116,'Can change auth group permissions',39,'change_authgrouppermissions'),(117,'Can delete auth group permissions',39,'delete_authgrouppermissions'),(118,'Can add auth permission',40,'add_authpermission'),(119,'Can change auth permission',40,'change_authpermission'),(120,'Can delete auth permission',40,'delete_authpermission'),(121,'Can add auth user',41,'add_authuser'),(122,'Can change auth user',41,'change_authuser'),(123,'Can delete auth user',41,'delete_authuser'),(124,'Can add auth user groups',42,'add_authusergroups'),(125,'Can change auth user groups',42,'change_authusergroups'),(126,'Can delete auth user groups',42,'delete_authusergroups'),(127,'Can add auth user user permissions',43,'add_authuseruserpermissions'),(128,'Can change auth user user permissions',43,'change_authuseruserpermissions'),(129,'Can delete auth user user permissions',43,'delete_authuseruserpermissions'),(130,'Can add category',44,'add_category'),(131,'Can change category',44,'change_category'),(132,'Can delete category',44,'delete_category'),(133,'Can add client',45,'add_client'),(134,'Can change client',45,'change_client'),(135,'Can delete client',45,'delete_client'),(136,'Can add django admin log',46,'add_djangoadminlog'),(137,'Can change django admin log',46,'change_djangoadminlog'),(138,'Can delete django admin log',46,'delete_djangoadminlog'),(139,'Can add django content type',47,'add_djangocontenttype'),(140,'Can change django content type',47,'change_djangocontenttype'),(141,'Can delete django content type',47,'delete_djangocontenttype'),(142,'Can add django migrations',48,'add_djangomigrations'),(143,'Can change django migrations',48,'change_djangomigrations'),(144,'Can delete django migrations',48,'delete_djangomigrations'),(145,'Can add django session',49,'add_djangosession'),(146,'Can change django session',49,'change_djangosession'),(147,'Can delete django session',49,'delete_djangosession'),(148,'Can add message',50,'add_message'),(149,'Can change message',50,'change_message'),(150,'Can delete message',50,'delete_message'),(151,'Can add request',51,'add_request'),(152,'Can change request',51,'change_request'),(153,'Can delete request',51,'delete_request'),(154,'Can add schedule',52,'add_schedule'),(155,'Can change schedule',52,'change_schedule'),(156,'Can delete schedule',52,'delete_schedule'),(157,'Can add service',53,'add_service'),(158,'Can change service',53,'change_service'),(159,'Can delete service',53,'delete_service'),(160,'Can add transaction',54,'add_transaction'),(161,'Can change transaction',54,'change_transaction'),(162,'Can delete transaction',54,'delete_transaction'),(163,'Can add rate',55,'add_rate'),(164,'Can change rate',55,'change_rate'),(165,'Can delete rate',55,'delete_rate'),(166,'Can add sp',56,'add_sp'),(167,'Can change sp',56,'change_sp'),(168,'Can delete sp',56,'delete_sp'),(169,'Can add appointments',57,'add_appointments'),(170,'Can change appointments',57,'change_appointments'),(171,'Can delete appointments',57,'delete_appointments'),(172,'Can add auth group',58,'add_authgroup'),(173,'Can change auth group',58,'change_authgroup'),(174,'Can delete auth group',58,'delete_authgroup'),(175,'Can add auth group permissions',59,'add_authgrouppermissions'),(176,'Can change auth group permissions',59,'change_authgrouppermissions'),(177,'Can delete auth group permissions',59,'delete_authgrouppermissions'),(178,'Can add auth permission',60,'add_authpermission'),(179,'Can change auth permission',60,'change_authpermission'),(180,'Can delete auth permission',60,'delete_authpermission'),(181,'Can add auth user',61,'add_authuser'),(182,'Can change auth user',61,'change_authuser'),(183,'Can delete auth user',61,'delete_authuser'),(184,'Can add auth user groups',62,'add_authusergroups'),(185,'Can change auth user groups',62,'change_authusergroups'),(186,'Can delete auth user groups',62,'delete_authusergroups'),(187,'Can add auth user user permissions',63,'add_authuseruserpermissions'),(188,'Can change auth user user permissions',63,'change_authuseruserpermissions'),(189,'Can delete auth user user permissions',63,'delete_authuseruserpermissions'),(190,'Can add category',64,'add_category'),(191,'Can change category',64,'change_category'),(192,'Can delete category',64,'delete_category'),(193,'Can add client',65,'add_client'),(194,'Can change client',65,'change_client'),(195,'Can delete client',65,'delete_client'),(196,'Can add django admin log',66,'add_djangoadminlog'),(197,'Can change django admin log',66,'change_djangoadminlog'),(198,'Can delete django admin log',66,'delete_djangoadminlog'),(199,'Can add django content type',67,'add_djangocontenttype'),(200,'Can change django content type',67,'change_djangocontenttype'),(201,'Can delete django content type',67,'delete_djangocontenttype'),(202,'Can add django migrations',68,'add_djangomigrations'),(203,'Can change django migrations',68,'change_djangomigrations'),(204,'Can delete django migrations',68,'delete_djangomigrations'),(205,'Can add django session',69,'add_djangosession'),(206,'Can change django session',69,'change_djangosession'),(207,'Can delete django session',69,'delete_djangosession'),(208,'Can add message',70,'add_message'),(209,'Can change message',70,'change_message'),(210,'Can delete message',70,'delete_message'),(211,'Can add request',71,'add_request'),(212,'Can change request',71,'change_request'),(213,'Can delete request',71,'delete_request'),(214,'Can add schedule',72,'add_schedule'),(215,'Can change schedule',72,'change_schedule'),(216,'Can delete schedule',72,'delete_schedule'),(217,'Can add service',73,'add_service'),(218,'Can change service',73,'change_service'),(219,'Can delete service',73,'delete_service'),(220,'Can add transaction',74,'add_transaction'),(221,'Can change transaction',74,'change_transaction'),(222,'Can delete transaction',74,'delete_transaction'),(223,'Can add sp',75,'add_sp'),(224,'Can change sp',75,'change_sp'),(225,'Can delete sp',75,'delete_sp'),(226,'Can add rate',76,'add_rate'),(227,'Can change rate',76,'change_rate'),(228,'Can delete rate',76,'delete_rate'),(229,'Can add appointments',77,'add_appointments'),(230,'Can change appointments',77,'change_appointments'),(231,'Can delete appointments',77,'delete_appointments'),(232,'Can add auth group',78,'add_authgroup'),(233,'Can change auth group',78,'change_authgroup'),(234,'Can delete auth group',78,'delete_authgroup'),(235,'Can add auth group permissions',79,'add_authgrouppermissions'),(236,'Can change auth group permissions',79,'change_authgrouppermissions'),(237,'Can delete auth group permissions',79,'delete_authgrouppermissions'),(238,'Can add auth permission',80,'add_authpermission'),(239,'Can change auth permission',80,'change_authpermission'),(240,'Can delete auth permission',80,'delete_authpermission'),(241,'Can add auth user',81,'add_authuser'),(242,'Can change auth user',81,'change_authuser'),(243,'Can delete auth user',81,'delete_authuser'),(244,'Can add auth user groups',82,'add_authusergroups'),(245,'Can change auth user groups',82,'change_authusergroups'),(246,'Can delete auth user groups',82,'delete_authusergroups'),(247,'Can add auth user user permissions',83,'add_authuseruserpermissions'),(248,'Can change auth user user permissions',83,'change_authuseruserpermissions'),(249,'Can delete auth user user permissions',83,'delete_authuseruserpermissions'),(250,'Can add category',84,'add_category'),(251,'Can change category',84,'change_category'),(252,'Can delete category',84,'delete_category'),(253,'Can add client',85,'add_client'),(254,'Can change client',85,'change_client'),(255,'Can delete client',85,'delete_client'),(256,'Can add django admin log',86,'add_djangoadminlog'),(257,'Can change django admin log',86,'change_djangoadminlog'),(258,'Can delete django admin log',86,'delete_djangoadminlog'),(259,'Can add django content type',87,'add_djangocontenttype'),(260,'Can change django content type',87,'change_djangocontenttype'),(261,'Can delete django content type',87,'delete_djangocontenttype'),(262,'Can add django migrations',88,'add_djangomigrations'),(263,'Can change django migrations',88,'change_djangomigrations'),(264,'Can delete django migrations',88,'delete_djangomigrations'),(265,'Can add django session',89,'add_djangosession'),(266,'Can change django session',89,'change_djangosession'),(267,'Can delete django session',89,'delete_djangosession'),(268,'Can add message',90,'add_message'),(269,'Can change message',90,'change_message'),(270,'Can delete message',90,'delete_message'),(271,'Can add request',91,'add_request'),(272,'Can change request',91,'change_request'),(273,'Can delete request',91,'delete_request'),(274,'Can add schedule',92,'add_schedule'),(275,'Can change schedule',92,'change_schedule'),(276,'Can delete schedule',92,'delete_schedule'),(277,'Can add service',93,'add_service'),(278,'Can change service',93,'change_service'),(279,'Can delete service',93,'delete_service'),(280,'Can add transaction',94,'add_transaction'),(281,'Can change transaction',94,'change_transaction'),(282,'Can delete transaction',94,'delete_transaction'),(283,'Can add sp',95,'add_sp'),(284,'Can change sp',95,'change_sp'),(285,'Can delete sp',95,'delete_sp'),(286,'Can add rate',96,'add_rate'),(287,'Can change rate',96,'change_rate'),(288,'Can delete rate',96,'delete_rate'),(289,'Can add appointments',97,'add_appointments'),(290,'Can change appointments',97,'change_appointments'),(291,'Can delete appointments',97,'delete_appointments'),(292,'Can add auth group',98,'add_authgroup'),(293,'Can change auth group',98,'change_authgroup'),(294,'Can delete auth group',98,'delete_authgroup'),(295,'Can add auth group permissions',99,'add_authgrouppermissions'),(296,'Can change auth group permissions',99,'change_authgrouppermissions'),(297,'Can delete auth group permissions',99,'delete_authgrouppermissions'),(298,'Can add auth permission',100,'add_authpermission'),(299,'Can change auth permission',100,'change_authpermission'),(300,'Can delete auth permission',100,'delete_authpermission'),(301,'Can add auth user',101,'add_authuser'),(302,'Can change auth user',101,'change_authuser'),(303,'Can delete auth user',101,'delete_authuser'),(304,'Can add auth user groups',102,'add_authusergroups'),(305,'Can change auth user groups',102,'change_authusergroups'),(306,'Can delete auth user groups',102,'delete_authusergroups'),(307,'Can add auth user user permissions',103,'add_authuseruserpermissions'),(308,'Can change auth user user permissions',103,'change_authuseruserpermissions'),(309,'Can delete auth user user permissions',103,'delete_authuseruserpermissions'),(310,'Can add category',104,'add_category'),(311,'Can change category',104,'change_category'),(312,'Can delete category',104,'delete_category'),(313,'Can add client',105,'add_client'),(314,'Can change client',105,'change_client'),(315,'Can delete client',105,'delete_client'),(316,'Can add django admin log',106,'add_djangoadminlog'),(317,'Can change django admin log',106,'change_djangoadminlog'),(318,'Can delete django admin log',106,'delete_djangoadminlog'),(319,'Can add django content type',107,'add_djangocontenttype'),(320,'Can change django content type',107,'change_djangocontenttype'),(321,'Can delete django content type',107,'delete_djangocontenttype'),(322,'Can add django migrations',108,'add_djangomigrations'),(323,'Can change django migrations',108,'change_djangomigrations'),(324,'Can delete django migrations',108,'delete_djangomigrations'),(325,'Can add django session',109,'add_djangosession'),(326,'Can change django session',109,'change_djangosession'),(327,'Can delete django session',109,'delete_djangosession'),(328,'Can add message',110,'add_message'),(329,'Can change message',110,'change_message'),(330,'Can delete message',110,'delete_message'),(331,'Can add request',111,'add_request'),(332,'Can change request',111,'change_request'),(333,'Can delete request',111,'delete_request'),(334,'Can add schedule',112,'add_schedule'),(335,'Can change schedule',112,'change_schedule'),(336,'Can delete schedule',112,'delete_schedule'),(337,'Can add service',113,'add_service'),(338,'Can change service',113,'change_service'),(339,'Can delete service',113,'delete_service'),(340,'Can add transaction',114,'add_transaction'),(341,'Can change transaction',114,'change_transaction'),(342,'Can delete transaction',114,'delete_transaction'),(343,'Can add rate',115,'add_rate'),(344,'Can change rate',115,'change_rate'),(345,'Can delete rate',115,'delete_rate'),(346,'Can add sp',116,'add_sp'),(347,'Can change sp',116,'change_sp'),(348,'Can delete sp',116,'delete_sp');
/*!40000 ALTER TABLE `auth_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auth_user`
--

DROP TABLE IF EXISTS `auth_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(128) NOT NULL,
  `last_login` datetime(6) DEFAULT NULL,
  `is_superuser` tinyint(1) NOT NULL,
  `username` varchar(150) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `email` varchar(254) NOT NULL,
  `is_staff` tinyint(1) NOT NULL,
  `is_active` tinyint(1) NOT NULL,
  `date_joined` datetime(6) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auth_user`
--

LOCK TABLES `auth_user` WRITE;
/*!40000 ALTER TABLE `auth_user` DISABLE KEYS */;
INSERT INTO `auth_user` VALUES (1,'pbkdf2_sha256$36000$KVfhyqfYXkk3$5ZxZOTj3c10IkA9pjqMzW5AhGAoVK48acLye9EZFayA=','2017-05-10 07:41:01.981914',1,'admin','','','admin@example.com',1,1,'2017-05-10 07:16:09.191230');
/*!40000 ALTER TABLE `auth_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auth_user_groups`
--

DROP TABLE IF EXISTS `auth_user_groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_user_groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `group_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `auth_user_groups_user_id_group_id_94350c0c_uniq` (`user_id`,`group_id`),
  KEY `auth_user_groups_group_id_97559544_fk_auth_group_id` (`group_id`),
  CONSTRAINT `auth_user_groups_group_id_97559544_fk_auth_group_id` FOREIGN KEY (`group_id`) REFERENCES `auth_group` (`id`),
  CONSTRAINT `auth_user_groups_user_id_6a12ed8b_fk_auth_user_id` FOREIGN KEY (`user_id`) REFERENCES `auth_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auth_user_groups`
--

LOCK TABLES `auth_user_groups` WRITE;
/*!40000 ALTER TABLE `auth_user_groups` DISABLE KEYS */;
/*!40000 ALTER TABLE `auth_user_groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auth_user_user_permissions`
--

DROP TABLE IF EXISTS `auth_user_user_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_user_user_permissions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `auth_user_user_permissions_user_id_permission_id_14a6b632_uniq` (`user_id`,`permission_id`),
  KEY `auth_user_user_permi_permission_id_1fbb5f2c_fk_auth_perm` (`permission_id`),
  CONSTRAINT `auth_user_user_permi_permission_id_1fbb5f2c_fk_auth_perm` FOREIGN KEY (`permission_id`) REFERENCES `auth_permission` (`id`),
  CONSTRAINT `auth_user_user_permissions_user_id_a95ead1b_fk_auth_user_id` FOREIGN KEY (`user_id`) REFERENCES `auth_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auth_user_user_permissions`
--

LOCK TABLES `auth_user_user_permissions` WRITE;
/*!40000 ALTER TABLE `auth_user_user_permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `auth_user_user_permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `category` varchar(45) NOT NULL,
  `description` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`category`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES ('music',NULL);
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `client_id` int(11) NOT NULL AUTO_INCREMENT,
  `lastname` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `gender` enum('m','f') DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `logstat` enum('in','out') NOT NULL DEFAULT 'out',
  `image` blob,
  PRIMARY KEY (`client_id`),
  KEY `clientid` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'Makiling','Maria','123 Jupiter, Solar System','f','1997-12-31','client1','1234','mama@gmail.com','out',NULL),(2,'Alba','Pia','69 Kasuluksulukan St., Baguio City','f','1990-05-23','client2','1234','aba@gmail.com','out',NULL),(3,'Ibarra','Crisostomo','Bonifacio St., Baguio City','m','1990-04-30','client3','1234','bolang_kristal@gmail.com','out',NULL);
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `django_admin_log`
--

DROP TABLE IF EXISTS `django_admin_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `django_admin_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `action_time` datetime(6) NOT NULL,
  `object_id` longtext,
  `object_repr` varchar(200) NOT NULL,
  `action_flag` smallint(5) unsigned NOT NULL,
  `change_message` longtext NOT NULL,
  `content_type_id` int(11) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `django_admin_log_content_type_id_c4bce8eb_fk_django_co` (`content_type_id`),
  KEY `django_admin_log_user_id_c564eba6_fk_auth_user_id` (`user_id`),
  CONSTRAINT `django_admin_log_content_type_id_c4bce8eb_fk_django_co` FOREIGN KEY (`content_type_id`) REFERENCES `django_content_type` (`id`),
  CONSTRAINT `django_admin_log_user_id_c564eba6_fk_auth_user_id` FOREIGN KEY (`user_id`) REFERENCES `auth_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `django_admin_log`
--

LOCK TABLES `django_admin_log` WRITE;
/*!40000 ALTER TABLE `django_admin_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `django_admin_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `django_content_type`
--

DROP TABLE IF EXISTS `django_content_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `django_content_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `app_label` varchar(100) NOT NULL,
  `model` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `django_content_type_app_label_model_76bd3d3b_uniq` (`app_label`,`model`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `django_content_type`
--

LOCK TABLES `django_content_type` WRITE;
/*!40000 ALTER TABLE `django_content_type` DISABLE KEYS */;
INSERT INTO `django_content_type` VALUES (1,'admin','logentry'),(3,'auth','group'),(2,'auth','permission'),(4,'auth','user'),(5,'contenttypes','contenttype'),(7,'dashboard','appointments'),(8,'dashboard','category'),(9,'dashboard','client'),(10,'dashboard','message'),(15,'dashboard','rate'),(11,'dashboard','request'),(12,'dashboard','schedule'),(13,'dashboard','service'),(16,'dashboard','sp'),(14,'dashboard','transaction'),(57,'labelmessages','appointments'),(58,'labelmessages','authgroup'),(59,'labelmessages','authgrouppermissions'),(60,'labelmessages','authpermission'),(61,'labelmessages','authuser'),(62,'labelmessages','authusergroups'),(63,'labelmessages','authuseruserpermissions'),(64,'labelmessages','category'),(65,'labelmessages','client'),(66,'labelmessages','djangoadminlog'),(67,'labelmessages','djangocontenttype'),(68,'labelmessages','djangomigrations'),(69,'labelmessages','djangosession'),(70,'labelmessages','message'),(76,'labelmessages','rate'),(71,'labelmessages','request'),(72,'labelmessages','schedule'),(73,'labelmessages','service'),(75,'labelmessages','sp'),(74,'labelmessages','transaction'),(37,'profilePage','appointments'),(38,'profilePage','authgroup'),(39,'profilePage','authgrouppermissions'),(40,'profilePage','authpermission'),(41,'profilePage','authuser'),(42,'profilePage','authusergroups'),(43,'profilePage','authuseruserpermissions'),(44,'profilePage','category'),(45,'profilePage','client'),(46,'profilePage','djangoadminlog'),(47,'profilePage','djangocontenttype'),(48,'profilePage','djangomigrations'),(49,'profilePage','djangosession'),(50,'profilePage','message'),(55,'profilePage','rate'),(51,'profilePage','request'),(52,'profilePage','schedule'),(53,'profilePage','service'),(56,'profilePage','sp'),(54,'profilePage','transaction'),(17,'request','appointments'),(18,'request','authgroup'),(19,'request','authgrouppermissions'),(20,'request','authpermission'),(21,'request','authuser'),(22,'request','authusergroups'),(23,'request','authuseruserpermissions'),(24,'request','category'),(25,'request','client'),(26,'request','djangoadminlog'),(27,'request','djangocontenttype'),(28,'request','djangomigrations'),(29,'request','djangosession'),(30,'request','message'),(35,'request','rate'),(31,'request','request'),(32,'request','schedule'),(33,'request','service'),(36,'request','sp'),(34,'request','transaction'),(6,'sessions','session'),(97,'stats','appointments'),(98,'stats','authgroup'),(99,'stats','authgrouppermissions'),(100,'stats','authpermission'),(101,'stats','authuser'),(102,'stats','authusergroups'),(103,'stats','authuseruserpermissions'),(104,'stats','category'),(105,'stats','client'),(106,'stats','djangoadminlog'),(107,'stats','djangocontenttype'),(108,'stats','djangomigrations'),(109,'stats','djangosession'),(110,'stats','message'),(115,'stats','rate'),(111,'stats','request'),(112,'stats','schedule'),(113,'stats','service'),(116,'stats','sp'),(114,'stats','transaction'),(77,'transactions','appointments'),(78,'transactions','authgroup'),(79,'transactions','authgrouppermissions'),(80,'transactions','authpermission'),(81,'transactions','authuser'),(82,'transactions','authusergroups'),(83,'transactions','authuseruserpermissions'),(84,'transactions','category'),(85,'transactions','client'),(86,'transactions','djangoadminlog'),(87,'transactions','djangocontenttype'),(88,'transactions','djangomigrations'),(89,'transactions','djangosession'),(90,'transactions','message'),(96,'transactions','rate'),(91,'transactions','request'),(92,'transactions','schedule'),(93,'transactions','service'),(95,'transactions','sp'),(94,'transactions','transaction');
/*!40000 ALTER TABLE `django_content_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `django_migrations`
--

DROP TABLE IF EXISTS `django_migrations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `django_migrations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `app` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `applied` datetime(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `django_migrations`
--

LOCK TABLES `django_migrations` WRITE;
/*!40000 ALTER TABLE `django_migrations` DISABLE KEYS */;
INSERT INTO `django_migrations` VALUES (1,'contenttypes','0001_initial','2017-05-09 20:46:40.339484'),(2,'auth','0001_initial','2017-05-09 20:46:58.666159'),(3,'admin','0001_initial','2017-05-09 20:47:01.720543'),(4,'admin','0002_logentry_remove_auto_add','2017-05-09 20:47:01.852176'),(5,'contenttypes','0002_remove_content_type_name','2017-05-09 20:47:03.958775'),(6,'auth','0002_alter_permission_name_max_length','2017-05-09 20:47:05.156817'),(7,'auth','0003_alter_user_email_max_length','2017-05-09 20:47:06.187246'),(8,'auth','0004_alter_user_username_opts','2017-05-09 20:47:06.260802'),(9,'auth','0005_alter_user_last_login_null','2017-05-09 20:47:07.094726'),(10,'auth','0006_require_contenttypes_0002','2017-05-09 20:47:07.150298'),(11,'auth','0007_alter_validators_add_error_messages','2017-05-09 20:47:07.224382'),(12,'auth','0008_alter_user_username_max_length','2017-05-09 20:47:08.400389'),(13,'sessions','0001_initial','2017-05-09 20:47:09.486812'),(14,'dashboard','0001_initial','2017-05-09 20:54:49.674894'),(15,'request','0001_initial','2017-05-10 13:25:20.929461'),(16,'labelmessages','0001_initial','2017-05-10 22:29:58.914945'),(17,'profilePage','0001_initial','2017-05-10 22:29:59.446203'),(18,'stats','0001_initial','2017-05-10 22:29:59.664972'),(19,'transactions','0001_initial','2017-05-10 22:29:59.805597');
/*!40000 ALTER TABLE `django_migrations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `django_session`
--

DROP TABLE IF EXISTS `django_session`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `django_session` (
  `session_key` varchar(40) NOT NULL,
  `session_data` longtext NOT NULL,
  `expire_date` datetime(6) NOT NULL,
  PRIMARY KEY (`session_key`),
  KEY `django_session_expire_date_a5c62663` (`expire_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `django_session`
--

LOCK TABLES `django_session` WRITE;
/*!40000 ALTER TABLE `django_session` DISABLE KEYS */;
INSERT INTO `django_session` VALUES ('0w7w33h09kzr1us5hyetr7a916h6hmsa','ZjM5MjZmNGQwZTI1MDExODA0MTUwMzc4MjUxOTdmNDBhZTFlNGQ2ODp7InVzZXJuYW1lIjoic3AxIn0=','2017-05-29 05:34:24.318507');
/*!40000 ALTER TABLE `django_session` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log`
--

DROP TABLE IF EXISTS `log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `sp_id` int(11) NOT NULL,
  `date_in` date NOT NULL,
  `time_in` time NOT NULL,
  `date_out` date NOT NULL,
  `time_out` time NOT NULL,
  PRIMARY KEY (`log_id`),
  KEY `fk_sp_log_idx` (`sp_id`),
  CONSTRAINT `fk_sp_log` FOREIGN KEY (`sp_id`) REFERENCES `sp` (`sp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log`
--

LOCK TABLES `log` WRITE;
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
/*!40000 ALTER TABLE `log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message` (
  `msg_id` int(11) NOT NULL AUTO_INCREMENT,
  `sp_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `msg` varchar(150) NOT NULL,
  `time` time NOT NULL,
  `date` date NOT NULL,
  `status` enum('read','unread') NOT NULL DEFAULT 'unread',
  `sender` enum('sp','client') NOT NULL DEFAULT 'client',
  PRIMARY KEY (`msg_id`),
  UNIQUE KEY `msg_id_UNIQUE` (`msg_id`),
  KEY `fk_client_msg_idx` (`client_id`),
  KEY `fk_sp_msg_idx` (`sp_id`),
  CONSTRAINT `fk_client_msg` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sp_msg` FOREIGN KEY (`sp_id`) REFERENCES `sp` (`sp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
INSERT INTO `message` VALUES (1,1,1,'Hello','09:00:00','2017-05-06','unread','client'),(2,1,2,'Ayo','05:00:00','2017-05-07','unread','client'),(3,1,3,'Aber','06:00:00','2017-05-07','unread','client'),(4,1,2,'Uy','07:00:00','2017-05-07','unread','client'),(5,2,1,'Hi','08:00:00','2017-05-07','unread','client'),(6,1,2,'Checking','09:00:00','2017-05-14','unread','sp');
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rate`
--

DROP TABLE IF EXISTS `rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rate` (
  `sp_id` int(11) NOT NULL,
  `service_id` int(11) NOT NULL,
  `rate` int(11) NOT NULL,
  PRIMARY KEY (`sp_id`,`service_id`),
  KEY `fk_service_rate_idx` (`service_id`),
  CONSTRAINT `fk_service_rate` FOREIGN KEY (`service_id`) REFERENCES `service` (`service_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sp_rate` FOREIGN KEY (`sp_id`) REFERENCES `sp` (`sp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rate`
--

LOCK TABLES `rate` WRITE;
/*!40000 ALTER TABLE `rate` DISABLE KEYS */;
INSERT INTO `rate` VALUES (1,1,200);
/*!40000 ALTER TABLE `rate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `request`
--

DROP TABLE IF EXISTS `request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `request` (
  `request_id` int(11) NOT NULL AUTO_INCREMENT,
  `sp_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `status` enum('accepted','rejected','pending') NOT NULL DEFAULT 'pending',
  `date` date NOT NULL,
  `time` time NOT NULL,
  `noofdays` int(11) NOT NULL DEFAULT '1',
  `sched_id` int(11) NOT NULL,
  PRIMARY KEY (`request_id`),
  KEY `fk_client_req_idx` (`client_id`),
  KEY `fk_sched_req_idx` (`sched_id`),
  KEY `fk_sp_req_idx` (`sp_id`),
  CONSTRAINT `fk_client_req` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sched_req` FOREIGN KEY (`sched_id`) REFERENCES `schedule` (`sched_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sp_req` FOREIGN KEY (`sp_id`) REFERENCES `sp` (`sp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `request`
--

LOCK TABLES `request` WRITE;
/*!40000 ALTER TABLE `request` DISABLE KEYS */;
INSERT INTO `request` VALUES (1,1,1,'accepted','2017-05-06','13:00:00',0,1),(2,1,1,'accepted','2017-05-05','14:00:00',0,1),(3,1,1,'accepted','2017-05-07','15:00:00',0,1),(6,1,1,'accepted','2017-05-12','08:30:50',0,2),(8,1,1,'rejected','2017-05-15','06:00:00',0,2),(9,1,1,'rejected','2017-05-16','08:00:00',0,2),(13,1,1,'accepted','2017-05-17','13:00:00',3,2),(14,1,1,'accepted','2017-05-17','14:00:00',3,2),(15,1,1,'accepted','2017-05-17','15:00:00',3,2),(16,1,1,'accepted','2017-05-17','16:00:00',3,2),(17,1,1,'accepted','2017-05-17','17:00:00',3,2),(19,1,1,'accepted','2017-05-17','19:00:00',3,1),(20,1,1,'accepted','2017-05-17','20:00:00',3,1),(21,1,1,'accepted','2017-05-17','21:00:00',3,1),(22,1,1,'accepted','2017-05-14','22:00:00',3,1),(23,1,1,'pending','2017-05-15','12:00:00',3,1);
/*!40000 ALTER TABLE `request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schedule` (
  `sched_id` int(11) NOT NULL AUTO_INCREMENT,
  `sp_id` int(11) NOT NULL,
  `time` varchar(18) NOT NULL,
  `day` varchar(10) NOT NULL,
  `status` enum('available','taken') NOT NULL DEFAULT 'available',
  `service_id` int(11) NOT NULL,
  PRIMARY KEY (`sched_id`),
  KEY `fk_service_sched_idx` (`service_id`),
  KEY `fk_sp_sched_idx` (`sp_id`),
  CONSTRAINT `fk_service_sched` FOREIGN KEY (`service_id`) REFERENCES `service` (`service_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sp_sched` FOREIGN KEY (`sp_id`) REFERENCES `sp` (`sp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule`
--

LOCK TABLES `schedule` WRITE;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
INSERT INTO `schedule` VALUES (1,1,'11:00 pm-12:00 pm','Thursday','taken',1),(2,1,'2:00 pm-3:00 pm','Monday','taken',1);
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service` (
  `service_id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(100) NOT NULL,
  `category` varchar(45) NOT NULL,
  PRIMARY KEY (`service_id`),
  KEY `servid` (`service_id`),
  KEY `fk_cat_idx` (`category`),
  CONSTRAINT `fk_cat` FOREIGN KEY (`category`) REFERENCES `category` (`category`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES (1,'violin','music');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sp`
--

DROP TABLE IF EXISTS `sp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sp` (
  `sp_id` int(11) NOT NULL AUTO_INCREMENT,
  `reg_status` enum('approve','reject','pending') NOT NULL DEFAULT 'pending',
  `lastname` varchar(30) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `gender` enum('m','f') NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `address` varchar(45) NOT NULL,
  `log_status` enum('login','logout') NOT NULL DEFAULT 'logout',
  PRIMARY KEY (`sp_id`),
  KEY `spid` (`sp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sp`
--

LOCK TABLES `sp` WRITE;
/*!40000 ALTER TABLE `sp` DISABLE KEYS */;
INSERT INTO `sp` VALUES (1,'approve','Dela Cruz','Juan','m','sp1','1234','1234@gmail.com',NULL,'#123 Magsaysay St., Baguio City','logout'),(2,'approve','Escobar','Pablo','m','sp2','1234','69@gmail.com','09996669999','#234 Magsaysay St., Baguio City','logout');
/*!40000 ALTER TABLE `sp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction` (
  `transaction_id` int(11) NOT NULL AUTO_INCREMENT,
  `status` enum('done','ongoing') NOT NULL DEFAULT 'ongoing',
  `paid` enum('paid','unpaid') NOT NULL DEFAULT 'unpaid',
  `amount` int(11) NOT NULL,
  `request_id` int(11) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`transaction_id`),
  KEY `fk_req_trans_idx` (`request_id`),
  CONSTRAINT `fk_req_trans` FOREIGN KEY (`request_id`) REFERENCES `request` (`request_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES (1,'ongoing','unpaid',100,2,'2017-05-13'),(2,'ongoing','unpaid',2000,6,'2017-05-13'),(3,'ongoing','unpaid',400,3,'2017-05-13'),(5,'ongoing','unpaid',100,1,'2017-05-14'),(6,'ongoing','unpaid',600,13,'2017-05-14'),(7,'ongoing','unpaid',600,14,'2017-05-14'),(8,'ongoing','unpaid',600,15,'2017-05-14'),(9,'ongoing','unpaid',600,16,'2017-05-14'),(10,'ongoing','unpaid',600,17,'2017-05-14'),(11,'ongoing','unpaid',600,19,'2017-05-14'),(12,'ongoing','unpaid',600,20,'2017-05-14'),(13,'ongoing','unpaid',600,21,'2017-05-14'),(14,'ongoing','unpaid',600,22,'2017-05-14');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-15 20:43:40
