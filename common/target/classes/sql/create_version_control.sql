CREATE TABLE `version_control` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `version_id` varchar(765) DEFAULT NULL COMMENT '版本号',
  `force_update` tinyint(1) DEFAULT NULL COMMENT '是否强制更新0否1是',
  `device_type` varchar(3) DEFAULT NULL COMMENT '设备类型：1 ios 2 Android',
  `realm` varchar(765) DEFAULT NULL COMMENT '客户端类型,user为用户端',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `priority` int(11) DEFAULT NULL COMMENT '优先级别',
  `describe` varchar(500) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8
