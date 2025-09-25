package com.efigenioluiz;

import java.util.Map;

import com.efigenioluiz.controllers.ProdutoController;
import com.efigenioluiz.repositories.ProdutoRepositoryImpl;

import freemarker.template.Configuration;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.rendering.template.JavalinFreemarker;

public class App {
    // public static ArrayList<Produto> bdProdutos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //configurações
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_34);
        cfg.setClassForTemplateLoading(App.class, "/templates");
        cfg.setDefaultEncoding("UTF-8");

        //criando e configurando o javalin
        Javalin app = Javalin.create(config ->{
            config.staticFiles.add(staticFiles -> {
                staticFiles.directory = "/public";
                staticFiles.location = Location.CLASSPATH;
                config.fileRenderer(new JavalinFreemarker(cfg));
            });
        }).start(7070);

        //repositories e controllers
        ProdutoRepositoryImpl produtoRepository = new ProdutoRepositoryImpl();
        ProdutoController produtoController = new ProdutoController(produtoRepository);

        // rotas
        app.get("/", ctx ->{
            Map<String, String> model = Map.of("nome", "Carol");
            ctx.render("index.ftl", model);
        });

        app.get("/produtos", produtoController::listAll);
        app.post("/produtos", produtoController::save);

        app.get("/cadastro", ctx ->{
            ctx.render("cadastro.ftl");
        });
    }
}