package com.example.config.dbinfo;

public class MongoDbInfo implements DatabaseInfo {

    @Override
    public void connect() {
        System.out.println("Connected to MongoDb");
    }
}
