/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : spring_boot

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2019-08-19 15:37:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` varchar(255) NOT NULL,
  `role_name` varchar(255) NOT NULL,
  `role_type` varchar(255) NOT NULL,
  `role_remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` varchar(255) NOT NULL,
  `username` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL,
  `name` varchar(64) DEFAULT NULL,
  `user_role` varchar(256) DEFAULT NULL,
  `user_phone` varchar(64) DEFAULT NULL,
  `user_email` varchar(64) DEFAULT NULL,
  `user_photo` varchar(256) DEFAULT NULL,
  `user_remarks` varchar(256) DEFAULT NULL,
  `user_company` varchar(64) DEFAULT NULL,
  `user_department` varchar(64) DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', 'admin', '卢嘉兴', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('10', 'test9', '123456', '手术', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('11', 'test10', '123456', '大幅度发', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('12', 'test11', '123456', '大幅度', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('13', 'test12', '123456', '用', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('14', 'test13', '123456', '经济法', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('15', 'test14', '123456', '地方', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('16', 'test15', '123456', '等待', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('17', 'test16', '123456', 'SaaS', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('18', 'test17', '123456', '手术', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('19', 'test18', '123456', '萨达的', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('2', 'test1', '123456', '测试1', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('20', 'test19', '123456', '股份', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('21', 'test20', '123456', '嗯嗯', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('25', 'hsoft', '123456', 'gongda', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('3', 'test2', '123456', '测试2', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('5', 'test4', '123456', 'u', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('6', 'test5', '123456', '辅导费', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('7', 'test6', '123456', '是', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('8', 'test7', '123456', '啊啊', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('9', 'test8', '123456', '等待', null, null, null, null, null, null, null, null, null, null, null);
