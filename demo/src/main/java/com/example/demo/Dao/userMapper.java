package com.example.demo.Dao;

import com.example.demo.Model.user;

public interface userMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Long userid);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}