package com.efigenioluiz.models;

public class Produto {

    //variaveis
    private int id;
    private String nome;
    private Double preco;
    private boolean ativo = true;
    //private Integer estoque;

    //construtores
    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
        //this.estoque = 0;
    }

    public Produto(int id,String nome, Double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        //this.estoque = 0;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}