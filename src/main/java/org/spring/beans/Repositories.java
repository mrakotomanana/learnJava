package org.spring.beans;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Repositories {
    public String getAppName() {
        return "Hello Spring App";
    }

    public Date getSystemDateTime() {
        return new Date();
    }
}
