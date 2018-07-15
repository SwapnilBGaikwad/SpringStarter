package com.example.services;

import com.example.config.dbinfo.DatabaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ValidationService {
    private DatabaseInfo databaseInfo;

    @Autowired
    public ValidationService(DatabaseInfo databaseInfo) {
        this.databaseInfo = databaseInfo;
    }

    public List<String> validations(String no) {
        databaseInfo.connect();
        List<String> errorCodes = new ArrayList<>();
        if (no == null) {
            errorCodes.add("No params");
            return errorCodes;
        }
        try {
            Integer.parseInt(no);
        } catch (NumberFormatException e) {
            errorCodes.add("Invalid number");
        }
        return errorCodes;
    }

}