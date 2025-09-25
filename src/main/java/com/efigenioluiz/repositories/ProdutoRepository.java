package com.efigenioluiz.repositories;

import java.util.List;
import java.util.Optional;

import com.efigenioluiz.models.Produto;

public interface ProdutoRepository {
    List<Produto> findAll();
    Optional<Produto> findById(int id);
    void save(Produto produto);
    void desativar(int id);
    void reativar(int id);
}
