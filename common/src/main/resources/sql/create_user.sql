CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `u_nick` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `u_head_img` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `u_area_code` varchar(50) NOT NULL COMMENT '手机区号',
  `u_tel` varchar(50) NOT NULL COMMENT '用户手机号',
  `u_password` varchar(225) DEFAULT NULL COMMENT '登录密码',
  `u_status` int(10) DEFAULT '1' COMMENT '用户状态,1为在线,0为离线',
  `u_birthday` date DEFAULT NULL COMMENT '生日',
  `u_sex` tinyint(1) DEFAULT '1' COMMENT '性别：0女1男',
  `u_create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `u_update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `u_device_id` varchar(255) NOT NULL DEFAULT '0' COMMENT '设备id',
  `u_device_type` int(1) NOT NULL DEFAULT '1' COMMENT '设备类型1 IOS 2 Android',
  `u_deleted` tinyint(1) DEFAULT '0' COMMENT '是否拉黑,1为拉黑',
  `u_im` varchar(255) DEFAULT NULL COMMENT 'IM的id',
  `u_token` varchar(500) DEFAULT NULL COMMENT 'IM登录token',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户表'
