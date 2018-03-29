package com.yinghai.datingticket.common.dao;

import com.yinghai.datingticket.common.model.Image;

public interface ImageMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(Image record);

    int insertSelective(Image record);

    Image selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
}