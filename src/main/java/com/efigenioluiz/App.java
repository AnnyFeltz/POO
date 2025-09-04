package com.efigenioluiz;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class App {
    // public static ArrayList<Produto> bdProdutos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Javalin app = Javalin.create(config ->{
            config.staticFiles.add(staticFiles -> {
                staticFiles.directory = "/public";
                staticFiles.location = Location.CLASSPATH;
            });
        }).start(7070);

        app.get("/", ctx ->{
            ctx.redirect("index.html");
        });

    }
}