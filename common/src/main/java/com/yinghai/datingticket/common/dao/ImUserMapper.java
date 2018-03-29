package com.yinghai.datingticket.common.dao;

import com.yinghai.datingticket.common.model.ImUser;

public interface ImUserMapper {
    int deleteByPrimaryKey(Integer iuId);

    int insert(ImUser record);

    int insertSelective(ImUser record);

    ImUser selectByPrimaryKey(Integer iuId);

    int updateByPrimaryKeySelective(ImUser record);

    int updateByPrimaryKey(ImUser record);
}