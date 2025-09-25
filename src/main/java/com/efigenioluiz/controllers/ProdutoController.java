package com.efigenioluiz.controllers;

import java.util.List;
import java.util.Map;

import com.efigenioluiz.models.Produto;
import com.efigenioluiz.repositories.ProdutoRepository;

import io.javalin.http.Context;

public class ProdutoController {
    //variaveis
    private final ProdutoRepository produtoRepository;

    //construtor
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    //metodos
    public void save(Context ctx) {
        String nomeProduto = ctx.formParam("nome");
        Double precoProduto = Double.parseDouble(ctx.formParam("preco"));

        Produto produto = new Produto(nomeProduto, precoProduto);
        produtoRepository.save(produto); //usnado o repositorio para salvar

        ctx.render("produtos.ftl", Map.of("produto", produto));
    }

    public void listAll(Context ctx) {
        List<Produto> produtos = produtoRepository.findAll();

        ctx.render("produtos.ftl", Map.of("produtos", produtos));
    }
}
