CREATE TABLE `ticket_schedule` (
	`ts_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '计划表ID',
	`ts_ticket_id` int(11) NOT NULL COMMENT '票的id',




  `ticket_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主题票ID',
  `t_name` varchar(255) NOT NULL COMMENT '票的名称',
  `t_img` varchar(255) DEFAULT NULL COMMENT '票的封面图',
  `t_start_time` datetime NOT NULL COMMENT '开始时间',
  `t_end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `t_price_range` varchar(64) NOT NULL DEFAULT '价格待定' COMMENT '价格范围',
  `t_city` varchar(64) NOT NULL COMMENT '城市',
  `t_locale` varchar(255) NOT NULL COMMENT '地点',
  `t_loc_x` double DEFAULT NULL COMMENT '纬度',
  `t_loc_y` double DEFAULT NULL COMMENT '经度',
  `t_brief` varchar(510) DEFAULT NULL COMMENT '简介',
  `t_notes` varchar(510) DEFAULT NULL COMMENT '购票须知',
  `t_details` varchar(1000) DEFAULT NULL COMMENT '详情',
  `t_type` int(11) NOT NULL COMMENT '票的类型，1为无座位,2为有座位',
  `t_content_type` varchar(64) NOT NULL COMMENT '内容类型',
  `t_shelf` int(11) NOT NULL DEFAULT '1' COMMENT '上架状态，1表示未上架，2表示已上架，3表示进行中，4表示已过期，5表示已删除',
  `t_video` varchar(255) DEFAULT NULL COMMENT '票的视频地址',
  `t_create_time` datetime NOT NULL COMMENT '创建时间',
  `t_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ticket_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='主题票表'
