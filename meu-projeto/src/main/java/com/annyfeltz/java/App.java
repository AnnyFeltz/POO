package com.annyfeltz.java;

import io.javalin.Javalin;

public class App {
    public static void main( String[] args ){
        Javalin app = Javalin.start(8000);

        indexController = new IndexController();

        app.get('/', indexController.get);
    }
}
