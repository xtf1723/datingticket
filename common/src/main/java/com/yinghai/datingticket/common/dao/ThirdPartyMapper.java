package com.yinghai.datingticket.common.dao;

import com.yinghai.datingticket.common.model.ThirdParty;

public interface ThirdPartyMapper {
    int deleteByPrimaryKey(Integer tpId);

    int insert(ThirdParty record);

    int insertSelective(ThirdParty record);

    ThirdParty selectByPrimaryKey(Integer tpId);

    int updateByPrimaryKeySelective(ThirdParty record);

    int updateByPrimaryKey(ThirdParty record);
}