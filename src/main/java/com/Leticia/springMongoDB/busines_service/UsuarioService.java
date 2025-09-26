package com.Leticia.springMongoDB.busines_service;

import com.Leticia.springMongoDB.entitys.Usuario;
import com.Leticia.springMongoDB.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository){
        this.repository = repository;
    }

    public Usuario salvar(Usuario usuario){
        return repository.save(usuario);
    }

    public List<Usuario> listar(){
        return repository.findAll();
    }

    public Usuario buscarId(String id){
        return repository.findById(id).orElse(null);
    }

    public void deletar(String id){
        repository.deleteById(id);
    }

}
