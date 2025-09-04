package com.efigenioluiz.models;

import java.util.ArrayList;

public class Cliente extends Usuario {

    private Carrinho carrinho;

    public Cliente(String email, String nome) {
        super(email, nome);
    }

    public void setCarrinho(Carrinho carrinho){
        this.carrinho = carrinho;
    }


    public Boolean adicionarProdutoCarrinho(Produto newProduto) {
        if (newProduto == null){
            return false;
        }

        this.carrinho.getProduto().add(newProduto);
        return true;
    }

}
