/*[13:44:44][23 ms]*/ CREATE DATABASE `nic307`CHARACTER SET utf8; 
/*[13:44:45][0 ms]*/ USE `nic307`; 
/* user ±í*/
CREATE TABLE `nic307`.`user`(  
  `user_id` INT(5) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(20) NOT NULL,
  `user_password` VARCHAR(20) NOT NULL,
  `user_major` VARCHAR(50),
  `user_collage` VARCHAR(50),
  `user_grade` VARCHAR(50),
  `user_qq` VARCHAR(30),
  `user_number` VARCHAR(40),
  `user_sex` VARCHAR(10),
  `user-email` VARCHAR(50),
  PRIMARY KEY (`user_id`)
) CHARSET=utf8;
