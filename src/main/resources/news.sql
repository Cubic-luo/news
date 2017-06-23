/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50634
Source Host           : localhost:3306
Source Database       : news

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2017-06-23 11:47:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for news_news
-- ----------------------------
DROP TABLE IF EXISTS `news_news`;
CREATE TABLE `news_news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `question` varchar(255) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  `content` text NOT NULL,
  `creatTime` datetime DEFAULT NULL,
  `state` int(11) DEFAULT '0',
  `answer1` varchar(255) DEFAULT NULL,
  `answer2` varchar(255) DEFAULT NULL,
  `answer3` varchar(255) DEFAULT NULL,
  `answer4` varchar(255) DEFAULT NULL,
  `rightAnswer` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_news
-- ----------------------------
INSERT INTO `news_news` VALUES ('13', '店铺地址', '4', '曙光新城奶茶店开张', '新店开张，地址是的点点滴滴多多', '2017-06-21 10:26:01', '0', '地址1', '地址2', '地址3', '地址4', 'A');
INSERT INTO `news_news` VALUES ('14', '西瓜价格多少', '4', '卖西瓜', '又大又甜的西瓜', '2017-06-21 14:51:58', '0', '1', '2', '3', '4', 'A');
INSERT INTO `news_news` VALUES ('15', '狗的颜色是什么？', '3', '寻狗启示', '寻找一条可爱的白色迪拜狗狗', '2017-06-21 16:02:25', '0', '白色', '黑色', '绿色', '棕色', 'A');
INSERT INTO `news_news` VALUES ('16', '解除游戏', '3', '解除LOL', '666', '2017-06-22 15:10:59', '0', '我', '饿', '人', '去', 'A');
INSERT INTO `news_news` VALUES ('17', '啦啦啦', '3', '好热', '这天气好热', '2017-06-22 18:12:59', '0', '大姐夫', '大家开放力度', '大家给', '啦啦啦', 'A');
INSERT INTO `news_news` VALUES ('18', '是什么菜？', '5', '我是一颗', '小小的白菜', '2017-06-22 22:10:27', '0', '白菜', '青菜', '花椰菜', '假的', 'A');
INSERT INTO `news_news` VALUES ('19', '卖的是什么', '5', '卖一个二手电动车', '一个9成新电动车', '2017-06-22 22:11:21', '0', '电动车', '摩托车', '拖拉机', '桑塔卡', 'A');

-- ----------------------------
-- Table structure for news_task
-- ----------------------------
DROP TABLE IF EXISTS `news_task`;
CREATE TABLE `news_task` (
  `userId` bigint(20) NOT NULL,
  `newsId` bigint(20) NOT NULL,
  `myAnswer` varchar(255) DEFAULT NULL,
  `creatTime` datetime DEFAULT NULL,
  PRIMARY KEY (`userId`,`newsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_task
-- ----------------------------
INSERT INTO `news_task` VALUES ('3', '13', 'A', '2017-06-22 17:42:26');
INSERT INTO `news_task` VALUES ('3', '14', 'A', '2017-06-22 17:42:38');
INSERT INTO `news_task` VALUES ('3', '17', 'A', '2017-06-22 18:13:25');
INSERT INTO `news_task` VALUES ('4', '14', 'A', '2017-06-22 22:20:30');
INSERT INTO `news_task` VALUES ('4', '16', 'A', '2017-06-22 22:20:34');
INSERT INTO `news_task` VALUES ('4', '17', 'A', '2017-06-22 21:50:34');

-- ----------------------------
-- Table structure for news_user
-- ----------------------------
DROP TABLE IF EXISTS `news_user`;
CREATE TABLE `news_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `imgUrl` varchar(255) DEFAULT NULL,
  `role` int(50) DEFAULT '0',
  `point` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_user
-- ----------------------------
INSERT INTO `news_user` VALUES ('3', '九儿', '0394f9f734fa546f04aa74a062d806e74ffcccda00d9dbfc046e714f10ebc473e1a426ac61f68244', 'logo.png', '0', '3');
INSERT INTO `news_user` VALUES ('4', 'root', '50066b77260b1ea346b74066425c382419a81ceea7877112c1226a80f9e4666b431cdbcaee0781e0', 'logo.png', '1', '3');
INSERT INTO `news_user` VALUES ('5', '小小', '4371a5bd8c24e577f7b0ad8381e1800d534603b92c2d4e5e6a49403de56a544207439aa96800b823', 'logo.png', '0', '0');
