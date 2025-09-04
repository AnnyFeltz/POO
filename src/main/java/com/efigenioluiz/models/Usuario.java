package com.efigenioluiz.models;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String email, String nome){
        this.email = email;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Email: " + this.email;
    }
}
