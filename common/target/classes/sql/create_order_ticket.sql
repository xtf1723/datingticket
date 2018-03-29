CREATE TABLE `order_ticket` (
  `order_ticket_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '票务订单id',
  `ot_order_id` int(11) NOT NULL unique COMMENT '对应订单id',
  `ot_ticket_type` int(3) NOT NULL COMMENT '票的类型，1为无座位类型，2为有座位类型',
  `ot_ts_id` int(11) NOT NULL COMMENT '对应计划id',
  `ot_price_id` int(11) NOT NULL COMMENT '对应票价',
  `ot_use_status` int(11) NOT NULL DEFAULT '0' COMMENT '使用状态，0为未支付,1为未取票,2为已取票,3为已使用,4为已过期,5为已取消',
  `ot_get_no` varchar(255) DEFAULT NULL COMMENT  '取票编码',
  `ot_pay_no` varchar(255) DEFAULT NULL COMMENT '订单支付编号',
  PRIMARY KEY (`order_ticket_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='票务订单表'