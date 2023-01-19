package org.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Componentes {
    @Autowired
    private Repositories repository;

    public void showAppInfo() {
        System.out.println("Now is: " + repository.getSystemDateTime());
        System.out.println("App Name: " + repository.getAppName());
    }
}
