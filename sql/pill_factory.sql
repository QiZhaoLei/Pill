/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : storage

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2022-09-25 15:48:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pill_factory
-- ----------------------------
DROP TABLE IF EXISTS `pill_factory`;
CREATE TABLE `pill_factory` (
  `factory_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '厂家ID',
  `factory_name` varchar(50) DEFAULT NULL COMMENT '厂家名称',
  `factory_code` varchar(50) DEFAULT NULL COMMENT '厂家编码',
  `contact` varchar(30) DEFAULT NULL COMMENT '联系人',
  `phone` varchar(30) DEFAULT NULL COMMENT '电话',
  `keyword` varchar(20) DEFAULT NULL COMMENT '关键字',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`factory_id`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8 COMMENT='生产厂家信息';

-- ----------------------------
-- Records of pill_factory
-- ----------------------------
INSERT INTO `pill_factory` VALUES ('101', '云南白药集团股份有限公司', '000011', 'admin', '023-88887777', 'ynby', '0', 'admin', '2022-09-26 16:15:29', null, null, null);
INSERT INTO `pill_factory` VALUES ('102', '哈药集团股份有限公司', '000022', 'admin', '023-88887777', 'hyjt', '0', 'admin', '2022-09-26 16:15:29', 'admin', '2022-09-26 20:34:01', null);
INSERT INTO `pill_factory` VALUES ('103', '太极集团有限公司', '000033', 'admin', '023-88887777', 'tjjt', '0', 'admin', '2022-09-26 16:15:29', null, null, null);
INSERT INTO `pill_factory` VALUES ('104', '上海医药集团有限公司', '000033', 'admin', '023-99998888', 'shyy', '0', 'admin', '2022-09-26 20:12:57', null, null, null);
