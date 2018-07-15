package com.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Greeting {
    @Value("${welcome.message}")
    private String message;
    private int no;

    public void setNumber(int no) {
        this.no = no;
    }

    public String getNumber() {
        return message + " " + fact(no);
    }

    private int fact(int no) {
        int res = 1;
        for (int i = 1; i <= no; i++) {
            res *= i;
        }
        return res;
    }
}
