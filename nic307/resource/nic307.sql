/*[13:44:44][23 ms]*/ CREATE DATABASE `nic307`CHARACTER SET utf8; 
/*[13:44:45][0 ms]*/ USE `nic307`; 
/* user 表*/
/*DDL 信息*/------------

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  `user_password` varchar(20) NOT NULL,
  `user_major` varchar(50) DEFAULT NULL,
  `user_collage` varchar(50) DEFAULT NULL,
  `user_grade` varchar(50) DEFAULT NULL,
  `user_qq` varchar(30) DEFAULT NULL,
  `user_number` varchar(40) DEFAULT NULL,
  `user_sex` varchar(10) DEFAULT NULL,
  `user-email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=173 DEFAULT CHARSET=utf8;

/*故障表*/
 CREATE TABLE `nic307`.`fault`(
  `fault_id` INT(8) ZEROFILL NOT NULL AUTO_INCREMENT, 
  `fault_master` VARCHAR(40) NOT NULL COMMENT '故障负责人', 
  `fault_number` VARCHAR(20) NOT NULL, 
  `fault_address` VARCHAR(255) COMMENT '故障地址', 
  `fault_handle_time` DATE,
   `fault_desc` VARCHAR(255) COMMENT '故障描述',
   `fault_ip` VARCHAR(50), 
   `is_fault` INT(4) NOT NULL DEFAULT 0 COMMENT '标记是否已处理',
    PRIMARY KEY (`fault_id`) ) CHARSET=utf8; 
    
 /*user扩展信息表*/
 /*DDL 信息*/------------

CREATE TABLE `umi` (
  `umi_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `umi_head` varchar(100) DEFAULT NULL COMMENT '用户头像',
  `umi_profession` varchar(255) DEFAULT NULL,
  `umi_addr` varchar(255) DEFAULT NULL,
  `umi_point` int(11) DEFAULT NULL,
  `umi_intr` varchar(255) DEFAULT NULL,
  `umi_company` varchar(255) DEFAULT NULL,
  `umi_job` varchar(255) DEFAULT NULL,
  `user_ref` int(11) NOT NULL,
  PRIMARY KEY (`umi_id`),
  KEY `user_idfk` (`user_ref`),
  CONSTRAINT `user_idfk` FOREIGN KEY (`user_ref`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
 