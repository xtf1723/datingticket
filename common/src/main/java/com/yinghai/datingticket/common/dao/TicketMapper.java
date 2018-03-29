package com.yinghai.datingticket.common.dao;

import com.yinghai.datingticket.common.model.Ticket;

public interface TicketMapper {
    int deleteByPrimaryKey(Integer ticketId);

    int insert(Ticket record);

    int insertSelective(Ticket record);

    Ticket selectByPrimaryKey(Integer ticketId);

    int updateByPrimaryKeySelective(Ticket record);

    int updateByPrimaryKeyWithBLOBs(Ticket record);

    int updateByPrimaryKey(Ticket record);
}