package com.yinghai.datingticket.backstage.dao;

import com.yinghai.datingticket.backstage.model.ManagerUser;

public interface ManagerUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ManagerUser record);

    int insertSelective(ManagerUser record);

    ManagerUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ManagerUser record);

    int updateByPrimaryKey(ManagerUser record);
}