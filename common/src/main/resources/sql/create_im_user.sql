CREATE TABLE `im_user` (
  `iu_id` int(11) NOT NULL AUTO_INCREMENT,
  `iu_user_id` varchar(500) NOT NULL COMMENT 'im的id唯一的',
  `iu_name` varchar(255) NOT NULL COMMENT 'im昵称',
  `iu_token` varchar(500) NOT NULL COMMENT 'IM登录token',
  `iu_img` varchar(500) NOT NULL DEFAULT 'http://www.rongcloud.cn/images/logo.png' COMMENT '图标url',
  `iu_type` int(11) DEFAULT NULL COMMENT 'IM用户类型1用户',
  `iu_create_time` datetime NOT NULL COMMENT '创建时间',
  `iu_update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`iu_id`),
  UNIQUE KEY `iu_user_id` (`iu_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='IM账号记录表'
