package com.carolfeltz.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.carolfeltz.models.Usuario;

public class UsuarioRepositoryImpl implements UsuarioRepository{
    //variaveis
    //simulação: banco de dados em memória
    private final List<Usuario> usuarios = new ArrayList<>();
    private int nextId = 1;

    public UsuarioRepositoryImpl(){
        //popular a lsita com alguns dados iniciais
        usuarios.add(new Usuario(nextId++, "carol@gmail.com", "Carol"));
        usuarios.add(new Usuario(nextId++, "luana@gmail.com", "Luana"));
        usuarios.add(new Usuario(nextId++, "julia@gmail.com", "Julia"));
    }

    @Override
    public List<Usuario> findAll(){
        return new ArrayList<>(usuarios); //retorna uma copia para evitar modificações externas
    }

    @Override
    public Optional<Usuario> findById(int id){
        return usuarios.stream()
            .filter(u -> u.getId() == id)
            .findFirst();
    }

    @Override
    public void save(Usuario usuario){
        Optional<Usuario> existingUser = findById(usuario.getId());

        if (existingUser.isPresent()) {
            //atualizar
            Usuario foundUser = existingUser.get();
            foundUser = new Usuario(usuario.getId(), usuario.getEmail(), usuario.getNome());
        } else {
            //salavr um novo
            usuarios.add(usuario);
        }
    }

    @Override
    public void delete(int id){
        usuarios.removeIf(u -> u.getId() == id);  
    }
}
