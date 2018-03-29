CREATE TABLE `third_party` (
  `tp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '第三方登录记录ID',
  `open_id` varchar(64) NOT NULL COMMENT '第三方唯一标识',
  `type` int(3) NOT NULL DEFAULT '0' COMMENT '登录类型1为手机登录，2为facebook，3为微信',
  `tp_key_id` int(11) DEFAULT NULL COMMENT '关联ID',
  `sex` int(3) DEFAULT '1' COMMENT '性别0女1男',
  `city` varchar(64) DEFAULT NULL COMMENT '微信信息：所在城市',
  `country` varchar(128) DEFAULT NULL COMMENT '微信信息：所在国家',
  `province` varchar(128) DEFAULT NULL COMMENT '微信信息：所在省份',
  `nick` varchar(128) DEFAULT NULL COMMENT '昵称',
  `tp_type` int(3) DEFAULT '1' COMMENT '用户类型1为用户',
  `img_url` varchar(256) DEFAULT NULL COMMENT '头像',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`tp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8
