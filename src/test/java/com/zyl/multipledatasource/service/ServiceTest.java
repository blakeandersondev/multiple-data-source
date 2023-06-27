package com.zyl.multipledatasource.service;

import com.zyl.multipledatasource.MultipleDataSourceApplication;
import com.zyl.multipledatasource.dao.mysql.MysqlTableDao;
import com.zyl.multipledatasource.dao.postgresql.PostgresqlTableDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.List;

@Slf4j
@SpringBootTest(classes = MultipleDataSourceApplication.class)
public class ServiceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private MysqlTableDao mysqlTableDao;

    @Autowired
    private PostgresqlTableDao postgresqlTableDao;

    @Test
    public void test(){
        List<MysqlTableDao> mysqlTableList = this.mysqlTableDao.list();
        log.info(mysqlTableList.toString());

        List<PostgresqlTableDao> postgresqlTableList = this.postgresqlTableDao.list();
        log.info(postgresqlTableList.toString());
    }
}
