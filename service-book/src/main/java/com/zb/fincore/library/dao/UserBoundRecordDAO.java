package com.zb.fincore.library.dao;

import com.zb.fincore.library.entity.UserBoundRecordEntity;

public interface UserBoundRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBoundRecordEntity record);

    int insertSelective(UserBoundRecordEntity record);

    UserBoundRecordEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBoundRecordEntity record);

    int updateByPrimaryKey(UserBoundRecordEntity record);
}