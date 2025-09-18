package com.efigenioluiz.models;

import com.efigenioluiz.App;

public class Administrador  extends Usuario{

    public Administrador(String email, String nome) {
        super(email, nome);
    }

    public Boolean cadastrarProduto(Produto newProduto){
        if (newProduto == null) return false;

        // App.bdProdutos.add(newProduto);
        return true;
    }
}