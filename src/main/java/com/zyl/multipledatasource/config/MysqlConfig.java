package com.zyl.multipledatasource.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.zyl.multipledatasource.dao.mysql"}, sqlSessionFactoryRef = "mysqlSessionFactory")
public class MysqlConfig {

    @Autowired
    @Qualifier("mysql")
    private DataSource mysqlDataSource;

    @Bean
    public SqlSessionFactory mysqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(mysqlDataSource);
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/mysql/*.xml"));
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate mysqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(mysqlSessionFactory());
    }
}
