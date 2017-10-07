package com.zb.fincore.library.dao;

import com.zb.fincore.library.entity.BookCornerEntity;

public interface BookCornerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(BookCornerEntity record);

    int insertSelective(BookCornerEntity record);

    BookCornerEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookCornerEntity record);

    int updateByPrimaryKey(BookCornerEntity record);
}