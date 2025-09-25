package com.carolfeltz.models;

public class Administrador extends Usuario{

    public Administrador(int id, String email, String nome) {
        super(id, email, nome);
    }

    public Boolean cadastrarProduto(Produto newProduto){
        if (newProduto == null) {
            return false;
        }

        // App.bdProdutos.add(newProduto);
        return true;
    }
}