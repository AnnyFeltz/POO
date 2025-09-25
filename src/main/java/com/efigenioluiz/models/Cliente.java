package com.efigenioluiz.models;

public class Cliente extends Usuario {

    private Carrinho carrinho;

    public Cliente(int id,String email, String nome) {
        super(id, email, nome);
    }

    public void setCarrinho(Carrinho carrinho){
        this.carrinho = carrinho;
    }


    // public Boolean adicionarProdutoCarrinho(Produto newProduto) {
    //     if (newProduto == null)
    //         return false;

    //     this.carrinho.add(newProduto);
    //     return true;
    // }

}