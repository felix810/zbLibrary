package com.zb.fincore.library.dao;

import com.zb.fincore.library.entity.BookRecordEntity;

public interface BookRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(BookRecordEntity record);

    int insertSelective(BookRecordEntity record);

    BookRecordEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookRecordEntity record);

    int updateByPrimaryKey(BookRecordEntity record);
}