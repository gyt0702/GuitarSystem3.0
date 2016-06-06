/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50629
Source Host           : localhost:3306
Source Database       : guitarshop

Target Server Type    : MYSQL
Target Server Version : 50629
File Encoding         : 65001

Date: 2016-06-05 20:27:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for guitar
-- ----------------------------
DROP TABLE IF EXISTS `guitar`;
CREATE TABLE `guitar` (
  `serialNumber` varchar(255) CHARACTER SET armscii8 NOT NULL COMMENT '序列号',
  `price` double(10,2) DEFAULT NULL COMMENT '价格',
  `builder` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '制造商',
  `model` varchar(255) DEFAULT NULL COMMENT '模型',
  `type` varchar(255) DEFAULT NULL COMMENT '类型',
  `backWood` varchar(255) DEFAULT NULL COMMENT '背木',
  `topWood` varchar(255) NOT NULL COMMENT '顶木',
  PRIMARY KEY (`serialNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of guitar
-- ----------------------------
INSERT INTO `guitar` VALUES ('0001', '123.00', '郭玉婷', 'haha', 'rock', 'wood', 'wood');
INSERT INTO `guitar` VALUES ('0002', '199.00', '郭玉婷', 'xixi', 'rock', 'rosewood', 'rosewood');
