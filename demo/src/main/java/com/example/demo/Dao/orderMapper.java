package com.example.demo.Dao;

import com.example.demo.Model.order;

public interface orderMapper {
    int insert(order record);

    int insertSelective(order record);
}