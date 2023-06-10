/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : storage1

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2022-09-25 17:33:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pill_drug
-- ----------------------------
DROP TABLE IF EXISTS `pill_drug`;
CREATE TABLE `pill_drug` (
  `drug_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '药品ID',
  `drug_name` varchar(50) DEFAULT NULL COMMENT '药品名称',
  `drug_code` varchar(50) DEFAULT NULL COMMENT '药品编码',
  `factory_id` bigint(20) DEFAULT NULL COMMENT '生产厂家',
  `drug_type` char(1) DEFAULT NULL COMMENT '药品类型',
  `prescription_type` char(1) DEFAULT NULL COMMENT '处方类型',
  `unit` varchar(10) DEFAULT NULL COMMENT '单位',
  `price` int(10) DEFAULT NULL COMMENT '价格',
  `num` int(10) DEFAULT NULL COMMENT '库存量',
  `warn_value` int(10) DEFAULT NULL COMMENT '预警值',
  `conversion` int(10) DEFAULT NULL COMMENT '换算量',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`drug_id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8 COMMENT='药品信息';

-- ----------------------------
-- Records of pill_drug
-- ----------------------------
INSERT INTO `pill_drug` VALUES ('101', '十全大补丸', 'dbw0001', '101', '0', '0', '瓶', '200', '100', '50', '1', '0', 'admin', '2022-08-27 16:03:29', null, null, null);
INSERT INTO `pill_drug` VALUES ('102', '阿莫西林', 'zcy0002', '102', '1', '1', '盒', '15', '300', '50', '1', '0', 'admin', '2022-09-15 16:03:29', null, null, null);


