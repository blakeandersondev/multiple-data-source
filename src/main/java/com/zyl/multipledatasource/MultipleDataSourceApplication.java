package com.zyl.multipledatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

//@MapperScan({"com.zyl.multipledatasource.dao"})
@ServletComponentScan
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MultipleDataSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultipleDataSourceApplication.class, args);
    }

}
