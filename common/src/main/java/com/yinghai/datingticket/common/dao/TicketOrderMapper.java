package com.yinghai.datingticket.common.dao;

import com.yinghai.datingticket.common.model.TicketOrder;

public interface TicketOrderMapper {
    int deleteByPrimaryKey(Integer orderTicketId);

    int insert(TicketOrder record);

    int insertSelective(TicketOrder record);

    TicketOrder selectByPrimaryKey(Integer orderTicketId);

    int updateByPrimaryKeySelective(TicketOrder record);

    int updateByPrimaryKey(TicketOrder record);
}