package com.efigenioluiz.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.efigenioluiz.models.Produto;

public class ProdutoRepositoryImpl implements ProdutoRepository{
    //variaveis
    private final List<Produto> produtos = new ArrayList<>();
    private int nextId = 1;

    @Override
    public List<Produto> findAll() {
        return new ArrayList<>(produtos);
    }

    @Override
    public Optional<Produto> findById(int id) {
        return produtos.stream()
            .filter(p -> p.getId() == id)
            .findFirst();
    }

    @Override
    public void save(Produto produto) {
        Optional<Produto> existingProduto = findById(produto.getId());

        if (existingProduto.isPresent()) {
            //atualizar
            Produto foundProduto = existingProduto.get();
            foundProduto.setNome(produto.getNome());
            foundProduto.setPreco(produto.getPreco());
        } else {
            //salvar novo
            produto.setId(nextId++);
            produtos.add(produto);
        }
    }

    @Override
    public void desativar(int id) {
        findById(id).ifPresent(p -> p.setAtivo(false));
    }
    
    @Override
    public void reativar(int id) {
        findById(id).ifPresent(p -> p.setAtivo(true));
    }

}
