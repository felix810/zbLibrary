package com.zb.fincore.library.dao;

import com.zb.fincore.library.entity.BookEntity;

public interface BookDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(BookEntity record);

    int insertSelective(BookEntity record);

    BookEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookEntity record);

    int updateByPrimaryKey(BookEntity record);
}