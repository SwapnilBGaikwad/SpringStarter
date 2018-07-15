package com.example.config.dbinfo;

public class MySqlDbInfo implements DatabaseInfo {

    @Override
    public void connect() {
        System.out.println("Connected to MySql");
    }
}
