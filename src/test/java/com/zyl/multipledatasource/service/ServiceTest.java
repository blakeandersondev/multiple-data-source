package com.zyl.multipledatasource.service;

import com.zyl.multipledatasource.MultipleDataSourceApplication;
import com.zyl.multipledatasource.dao.MysqlTableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.List;

@SpringBootTest(classes = MultipleDataSourceApplication.class)
public class ServiceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private MysqlTableDao mysqlTableDao;

    @Test
    public void test(){
        List<MysqlTableDao> mysqlTableList = this.mysqlTableDao.list();
        System.out.println(mysqlTableList.toString());
    }
}
