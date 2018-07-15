package com.example.config;

import com.example.config.dbinfo.DatabaseInfo;
import com.example.config.dbinfo.MongoDbInfo;
import com.example.config.dbinfo.MySqlDbInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    @DatabaseType("mysql")
    public DatabaseInfo getMySqlInfo() {
        return new MySqlDbInfo();
    }

    @Bean
    @DatabaseType("mongodb")
    public DatabaseInfo getMongoDbInfo() {
        return new MongoDbInfo();
    }
}
