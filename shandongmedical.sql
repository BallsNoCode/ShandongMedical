/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : shandongmedical

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 10/06/2022 21:18:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for behospital
-- ----------------------------
DROP TABLE IF EXISTS `behospital`;
CREATE TABLE `behospital`  (
  `beH_id` int NOT NULL,
  `beH_nursePeoPle` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `beH_patBed` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `beH_antecedent` decimal(19, 4) NULL DEFAULT NULL,
  `beH_illness` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `beH_closePrice` int NULL DEFAULT NULL,
  `beH_state` int NULL DEFAULT NULL,
  PRIMARY KEY (`beH_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of behospital
-- ----------------------------
INSERT INTO `behospital` VALUES (1001, '王小丫', '1103', 2000.0000, '心律不齐，先天营养不良', 1, 1);
INSERT INTO `behospital` VALUES (1002, '王小丫', '1188', 3000.0000, NULL, 1, 1);
INSERT INTO `behospital` VALUES (1003, '王丫', '1188', 1000.0000, '心律不齐，先天营养不良', 1, 1);
INSERT INTO `behospital` VALUES (1005, '王小丫6', '1099', 1500.0000, '无', 0, 1);
INSERT INTO `behospital` VALUES (1006, '张娜', '1144', 500.0000, 'ss', 0, 0);
INSERT INTO `behospital` VALUES (1012, '王小丫', '1156', 1000.0000, NULL, 1, 0);
INSERT INTO `behospital` VALUES (1013, 'dd', '1011', 500.0000, NULL, 0, 0);
INSERT INTO `behospital` VALUES (1014, 'ii', '1012', 500.0000, NULL, 0, 1);
INSERT INTO `behospital` VALUES (1024, '张娜', '1088', 500.0000, '未知', 0, 1);
INSERT INTO `behospital` VALUES (1029, '王小丫', '1057', 1000.0000, NULL, 0, 1);

-- ----------------------------
-- Table structure for chargeproject
-- ----------------------------
DROP TABLE IF EXISTS `chargeproject`;
CREATE TABLE `chargeproject`  (
  `chaP_id` int NOT NULL,
  `chaP_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `chaP_money` decimal(19, 4) NULL DEFAULT NULL,
  PRIMARY KEY (`chaP_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chargeproject
-- ----------------------------

-- ----------------------------
-- Table structure for doctor
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor`  (
  `d_id` int NOT NULL AUTO_INCREMENT,
  `d_idCar` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_phone` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_telPhone` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_sex` int NULL DEFAULT NULL,
  `d_birthday` date NULL DEFAULT NULL,
  `d_age` int NULL DEFAULT NULL,
  `d_email` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_keshi` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_xueli` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_desc` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_inTime` date NULL DEFAULT NULL,
  `d_state` int NULL DEFAULT NULL,
  PRIMARY KEY (`d_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1060 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of doctor
-- ----------------------------
INSERT INTO `doctor` VALUES (1054, '1234567888', '陈晓', '12222222111', '66666666', 0, '1996-01-04', 26, '8888888888@tt.com', '内科', '博士', NULL, '2004-02-11', 0);
INSERT INTO `doctor` VALUES (1055, '767676777', '程俊', '13333333333', '88888888', 0, '1991-01-12', 31, '1111111111@email.com', '外科', '博士', '', '1999-07-17', 0);
INSERT INTO `doctor` VALUES (1056, '68764', '张彦', '19999999999', '44444444', 0, '1991-11-17', 31, '777777@dd.com', '内科', '博士', NULL, '2006-01-17', 0);
INSERT INTO `doctor` VALUES (1057, '468768764146546', 'test', '13333333333', '88888888', 0, '2022-01-23', 31, '1111111111@email.com', '外科', '博士后', NULL, '2022-01-23', 0);
INSERT INTO `doctor` VALUES (1058, '87354343', 'test2', '13333333333', '88888888', 1, '2022-01-23', 56, '1111111111@email.com', '放射科', '本科', NULL, '2022-01-23', 0);
INSERT INTO `doctor` VALUES (1059, '123456', '陈十八', '13333333333', '88888888', 1, '2022-01-23', 28, '1111111111@email.com', '妇科', '本科', NULL, '2022-01-23', 0);

-- ----------------------------
-- Table structure for drug
-- ----------------------------
DROP TABLE IF EXISTS `drug`;
CREATE TABLE `drug`  (
  `dr_id` int NOT NULL,
  `dr_url` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dr_inPrice` decimal(19, 4) NULL DEFAULT NULL,
  `dr_outPrice` decimal(19, 4) NULL DEFAULT NULL,
  `dr_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dr_type` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dr_simDesc` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dr_` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dr_detaDesc` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dr_fatory` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dr_direction` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dr_remark` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dr_number` int NULL DEFAULT NULL,
  PRIMARY KEY (`dr_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of drug
-- ----------------------------

-- ----------------------------
-- Table structure for drugpeople
-- ----------------------------
DROP TABLE IF EXISTS `drugpeople`;
CREATE TABLE `drugpeople`  (
  `dr_id` int NOT NULL,
  `peopleId` int NULL DEFAULT NULL,
  `dr_number` int NULL DEFAULT NULL,
  `dr_sent_number` int NULL DEFAULT NULL,
  PRIMARY KEY (`dr_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of drugpeople
-- ----------------------------

-- ----------------------------
-- Table structure for hosregister
-- ----------------------------
DROP TABLE IF EXISTS `hosregister`;
CREATE TABLE `hosregister`  (
  `hosR_id` int NOT NULL AUTO_INCREMENT,
  `hosR_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `hosR_idCard` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `hosR_medical` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `hosR_regPrice` decimal(19, 4) NULL DEFAULT NULL,
  `hosR_phone` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `hosR_selfPrice` int NULL DEFAULT NULL,
  `hosR_sex` int NULL DEFAULT NULL,
  `hosR_age` int NULL DEFAULT NULL,
  `hosR_work` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `hosR_lookDoctor` int NULL DEFAULT NULL,
  `d_id` int NULL DEFAULT NULL,
  `hosR_remark` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `hosR_state` int NULL DEFAULT NULL,
  `hosR_time` date NULL DEFAULT NULL,
  PRIMARY KEY (`hosR_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1031 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hosregister
-- ----------------------------
INSERT INTO `hosregister` VALUES (1001, '陆小凤', '1546546676677', '46546545646886', 20.0000, '1333333334', 0, 0, 20, '无', 0, 1055, NULL, 3, '2022-01-15');
INSERT INTO `hosregister` VALUES (1002, '张三', '13215465465', '456465465464', 5.0000, '1666666666', 0, 1, 13, '学生', 0, 1056, NULL, 3, '2022-01-15');
INSERT INTO `hosregister` VALUES (1003, '俊陆', '87878765164654', '464654654654', 15.0000, '1888888888', 0, 0, 18, '老师', 1, 1055, NULL, 3, '2022-01-17');
INSERT INTO `hosregister` VALUES (1004, '程威威', '748676154654', '654764654654', 10.0000, '17777777777', 0, 0, 26, '记者', 1, 1054, NULL, 0, '2022-01-12');
INSERT INTO `hosregister` VALUES (1005, '杜风', '687612165465', '6546541313', 10.0000, '12222222222', 1, 0, 32, '记者', 0, 1054, NULL, 0, '2022-01-04');
INSERT INTO `hosregister` VALUES (1006, '李四', '746546512311', '1346547156456', 5.0000, '15555555555', 0, 0, 34, '程序员', 0, 1054, NULL, 0, '2022-01-17');
INSERT INTO `hosregister` VALUES (1007, 'test', 'test', 'test', 0.0000, '13333333333', 0, 0, 11, '', 0, 1056, NULL, 0, '2022-01-19');
INSERT INTO `hosregister` VALUES (1008, 'test', 'test', 'test', 0.0000, '13333333333', 0, 0, 14, '无', 1, 1055, NULL, 0, '2022-01-20');
INSERT INTO `hosregister` VALUES (1009, 'test', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1055, NULL, 3, NULL);
INSERT INTO `hosregister` VALUES (1010, 'test', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1054, NULL, 3, NULL);
INSERT INTO `hosregister` VALUES (1011, 'test', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1056, NULL, 0, NULL);
INSERT INTO `hosregister` VALUES (1012, '俊陆流', '65465465465', '13547677', 10.0000, '1333333333', NULL, NULL, 13, '学生', NULL, 1054, '无', NULL, NULL);
INSERT INTO `hosregister` VALUES (1013, '杜风琳', '78841465465465', '7987987131464', 5.0000, '1666666666', 1, 1, 20, '学生', 1, 1056, '无', NULL, NULL);
INSERT INTO `hosregister` VALUES (1014, '程威威', '87878765164654', '464654654654', 15.0000, '17777777777', 0, 0, 18, '老师', 0, 1056, '', NULL, NULL);
INSERT INTO `hosregister` VALUES (1024, '俊陆', '13215465465', '456465465464', 20.0000, '1333333333', 1, 0, 32, '记者', 1, 1055, '', 0, NULL);
INSERT INTO `hosregister` VALUES (1025, '俊陆流', '87878765164654', '465465456464', 5.0000, '12222222222', 0, 0, 26, '老师', 0, 1056, '', 0, NULL);
INSERT INTO `hosregister` VALUES (1026, '程威威', '87878765164654', '464654654654', 10.0000, '17777777777', 1, 1, 26, '记者', 0, 1055, '', 3, NULL);
INSERT INTO `hosregister` VALUES (1027, '俊陆', '13215465465', '464654654654', 15.0000, '1666666666', 0, 1, 18, '外卖员', 0, 1055, '', 3, NULL);
INSERT INTO `hosregister` VALUES (1029, '程威威', '13215465465', '456465465464', 5.0000, '17777777777', 1, 1, 48, '老师', 0, 1055, '', 3, NULL);
INSERT INTO `hosregister` VALUES (1030, '张三', '441900200207012614', '654764654654', 5.0000, '18888888888', 0, 0, 20, '学生', 0, 1054, '', 0, '2022-01-23');
INSERT INTO `hosregister` VALUES (1031, 'tets', '441900200207012614', '465465464654', 20.0000, '13333333333', 0, 0, 28, '老师', 0, 1054, '', 0, '2022-03-10');

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `m_id` int NOT NULL,
  `m_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_state` int NULL DEFAULT NULL,
  PRIMARY KEY (`m_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for pricepeople
-- ----------------------------
DROP TABLE IF EXISTS `pricepeople`;
CREATE TABLE `pricepeople`  (
  `chaP_id` int NOT NULL,
  `beH_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`chaP_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pricepeople
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `r_id` int NOT NULL,
  `r_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `r_state` int NULL DEFAULT NULL,
  PRIMARY KEY (`r_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for role-menu
-- ----------------------------
DROP TABLE IF EXISTS `role-menu`;
CREATE TABLE `role-menu`  (
  `r_id` int NOT NULL,
  `m_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`r_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role-menu
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `u_loginName` int NOT NULL,
  `u_passWord` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_trueName` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_email` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_state` int NULL DEFAULT NULL,
  `r_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`u_loginName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (111, '123456', '测试', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
