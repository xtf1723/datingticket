package com.yinghai.datingticket.common.dao;

import com.yinghai.datingticket.common.model.VersionControl;

public interface VersionControlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VersionControl record);

    int insertSelective(VersionControl record);

    VersionControl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VersionControl record);

    int updateByPrimaryKey(VersionControl record);
}