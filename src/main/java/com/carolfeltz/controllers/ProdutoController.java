package com.carolfeltz.controllers;

import java.util.List;
import java.util.Map;

import com.carolfeltz.models.Produto;
import com.carolfeltz.repositories.ProdutoRepository;

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
        produtoRepository.save(produto); //usando o repositorio para salvar

        // Após salvar, redireciona o usuário para a página de listagem de produtos
        // Isso evita o problema da variável "produtos" não existir aqui.
        ctx.redirect("/produtos");
    }

    public void listAll(Context ctx) {
        List<Produto> produtos = produtoRepository.findAll();

        ctx.render("produtos.ftl", Map.of("produtos", produtos));
    }
}