package com.carolfeltz.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.carolfeltz.models.Produto;

public class ProdutoRepositoryImpl implements ProdutoRepository{
    //variaveis
    private final List<Produto> produtos = new ArrayList<>();
    private int nextId = 1;

    public ProdutoRepositoryImpl() {
        produtos.add(new Produto(nextId++, "produto 1", 10.00));
        produtos.add(new Produto(nextId++, "produto 2", 20.00));
        produtos.add(new Produto(nextId++, "produto 3", 30.00));
        produtos.add(new Produto(nextId++, "produto 4", 40.00));
        produtos.add(new Produto(nextId++, "produto 5", 50.00));
        produtos.add(new Produto(nextId++, "produto 6", 60.00));
    }

    @Override
    public List<Produto> findAll() {
        return produtos.stream()
            .filter(Produto::isAtivo)
            .collect(Collectors.toList());
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
