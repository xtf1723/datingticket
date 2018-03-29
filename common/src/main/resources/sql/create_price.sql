CREATE TABLE `price` (
	`price_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '票价id',
	`p_ticket_id` int(11) NOT NULL COMMENT '对应的票id',
	`p_ts_id` int(11) NOT NULL COMMENT '对应场次id',
	`p_type` int(11) NOT NULL COMMENT '票价类型,1为正常票,2为儿童票,3为预售票,11为区域票,12为区域预售票',
	`p_type_name` varchar(64) DEFAULT NULL COMMENT '票价类型名',
	`p_price` int(11) NOT NULL COMMENT '票价',
	`p_area` int(11) DEFAULT NULL COMMENT '所属区域',
	`p_used` int(3) NOT NULL DEFAULT '0' COMMENT '票价是否可用，0为不可用，1为可用',
	`p_create_time` datetime NOT NULL COMMENT '创建时间',
	`p_update_time` datetime DEFAULT NULL COMMENT '更新时间',
  	PRIMARY KEY (`price_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='票价表'
