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
@MapperScan(basePackages = {"com.zyl.multipledatasource.dao.postgresql"}, sqlSessionFactoryRef = "postgresqlSessionFactory")
public class PostgresqlConfig {

    @Autowired
    @Qualifier("postgresql")
    private DataSource mysqlDataSource;

    @Bean
    public SqlSessionFactory postgresqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(mysqlDataSource);
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/postgresql/*.xml"));
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate postgresqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(postgresqlSessionFactory());
    }
}
