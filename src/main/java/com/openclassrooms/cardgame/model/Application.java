package com.openclassrooms.cardgame.model;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("context.xml");
        context.refresh();
        context.close();
    }
}
