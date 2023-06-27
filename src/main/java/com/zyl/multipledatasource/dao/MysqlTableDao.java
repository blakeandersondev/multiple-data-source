package com.zyl.multipledatasource.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MysqlTableDao {

    List<MysqlTableDao> list();
}
