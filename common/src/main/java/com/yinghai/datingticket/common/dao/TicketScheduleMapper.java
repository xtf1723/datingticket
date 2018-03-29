package com.yinghai.datingticket.common.dao;

import com.yinghai.datingticket.common.model.TicketSchedule;

public interface TicketScheduleMapper {
    int deleteByPrimaryKey(Integer tsId);

    int insert(TicketSchedule record);

    int insertSelective(TicketSchedule record);

    TicketSchedule selectByPrimaryKey(Integer tsId);

    int updateByPrimaryKeySelective(TicketSchedule record);

    int updateByPrimaryKey(TicketSchedule record);
}