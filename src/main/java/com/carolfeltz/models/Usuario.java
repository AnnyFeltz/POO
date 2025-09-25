package com.carolfeltz.models;

public class Usuario {

    //variaveis
    private int id;
    private String nome;
    private String email;

    //construtor
    public Usuario(int id, String email, String nome){
        this.id = id;
        this.email = email;
        this.nome = nome;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //toString
    @Override
    public String toString() {
        return "ID: " + this.id + ", Nome: " + this.nome + ", Email: " + this.email;
    }
}
