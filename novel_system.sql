/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50739
Source Host           : localhost:3306
Source Database       : novel_system

Target Server Type    : MYSQL
Target Server Version : 50739
File Encoding         : 65001

Date: 2022-11-08 06:26:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for audios
-- ----------------------------
DROP TABLE IF EXISTS `audios`;
CREATE TABLE `audios` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `label` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of audios
-- ----------------------------

-- ----------------------------
-- Table structure for movies
-- ----------------------------
DROP TABLE IF EXISTS `movies`;
CREATE TABLE `movies` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `movie` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of movies
-- ----------------------------

-- ----------------------------
-- Table structure for novels
-- ----------------------------
DROP TABLE IF EXISTS `novels`;
CREATE TABLE `novels` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT '',
  `img` varchar(233) DEFAULT '' COMMENT '小说图片',
  `label` varchar(10) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of novels
-- ----------------------------
INSERT INTO `novels` VALUES ('1', '\r\n武侠：开局奖励满级神功', 'http://img4ts.faloo.com/Listen/166x235/0/1/000001138.jpg', '武侠', null);
INSERT INTO `novels` VALUES ('2', '不科学御兽', '', '玄幻', null);
INSERT INTO `novels` VALUES ('3', '深空彼岸', '', '都市', null);
INSERT INTO `novels` VALUES ('4', '我在亮剑搞援助', '', '军事', '可以的 已经完成了基本功能，哈哈哈哈哈，占位符，看看屏幕宽度哈哈哈哈哈，占位符，看看屏幕宽度哈哈哈哈哈，占位符，看看屏幕宽度哈哈哈哈哈，占位符，看看屏幕宽度哈哈哈哈哈，占位符，看看屏幕宽度哈哈哈哈哈，占位符，看看屏幕宽度哈哈哈哈哈，占位符，看看屏幕宽度');
INSERT INTO `novels` VALUES ('5', '神话版三国', '', '历史', null);
INSERT INTO `novels` VALUES ('6', '高天之上', '', '奇幻', null);
INSERT INTO `novels` VALUES ('7', '\r\n镇妖博物馆', '', '悬疑', null);
INSERT INTO `novels` VALUES ('8', '灵境行者', '', '科幻', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `state` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'haohao', '123456', '浩浩', '1917390625@qq.com', '0');
INSERT INTO `user` VALUES ('2', 'admin', '123321', null, null, '1');
INSERT INTO `user` VALUES ('3', '13419892283', '123451', 'sasaa', '962910144@qq.com', null);
INSERT INTO `user` VALUES ('4', '13419892283', '123451', 'sasaa', '962910144@qq.com', null);
INSERT INTO `user` VALUES ('5', '1', '1', '', '2309180553@qq.com', null);
INSERT INTO `user` VALUES ('6', '1', '3', '', '2309180553@qq.com', null);
INSERT INTO `user` VALUES ('7', '1', '1', '', '962910144@qq.com', null);
