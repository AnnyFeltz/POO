package com.efigenioluiz.models;

public class Produto {
    private String nome;
    private Double preco;
    private Integer estoque;


    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    @Override
    public String toString() {
        return this.nome + " - " +  this.preco;
    }

}
