CREATE SCHEMA `genadx` DEFAULT CHARACTER SET latin1 ;

DROP TABLE IF EXISTS `genadx`.`employee`;

CREATE TABLE `employee` (
  `EmployeeID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(50) NOT NULL,
  `MiddleInitial` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) NOT NULL,
  `DOB` varchar(50) NOT NULL,
  `DOE` varchar(50) DEFAULT NULL,
  `Status` varchar(50) NOT NULL DEFAULT 'ACTIVE',
  PRIMARY KEY (`EmployeeID`),
  UNIQUE KEY `EmployeeID` (`EmployeeID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;







