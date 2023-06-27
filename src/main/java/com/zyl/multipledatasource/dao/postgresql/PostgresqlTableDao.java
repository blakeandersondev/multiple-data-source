package com.zyl.multipledatasource.dao.postgresql;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostgresqlTableDao {

    List<PostgresqlTableDao> list();
}
