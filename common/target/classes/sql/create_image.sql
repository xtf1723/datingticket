CREATE TABLE `image` (
  `img_id` int(11) NOT NULL AUTO_INCREMENT,
  `i_type` int(11) NOT NULL DEFAULT '1' COMMENT '图片类型，1为用户头像图片，2为票的封面图片,3为票的其他图片，4为商品封面图片,5为商品的其他图片',
  `i_key_id` int(11) NOT NULL COMMENT '用户或票或商品的id',
  `i_url` varchar(255) NOT NULL COMMENT '图片url（服务器访问路径）',
  `i_create_time` datetime NOT NULL COMMENT '创建时间',
  `i_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `i_absolute` varchar(255) DEFAULT NULL COMMENT '服务器绝对路径（用于删除图片使用）',
  `it_is_userd` int(2) DEFAULT '0' COMMENT '该图片是否使用',
  `it_app_path` varchar(255) DEFAULT NULL COMMENT 'APP前端的访问路径',
  `it_size` varchar(255) DEFAULT NULL COMMENT '图片尺寸大小',
  PRIMARY KEY (`img_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='图片表'

