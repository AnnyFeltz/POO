package com.carolfeltz.repositories;

import java.util.List;
import java.util.Optional;

import com.carolfeltz.models.Usuario;

public interface UsuarioRepository {
    List<Usuario> findAll();
    Optional<Usuario> findById(int id);
    void save(Usuario usuario);
    void delete(int id);
}
