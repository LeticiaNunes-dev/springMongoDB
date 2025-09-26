package com.Leticia.springMongoDB.controller;

import com.Leticia.springMongoDB.busines_service.UsuarioService;
import com.Leticia.springMongoDB.entitys.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }
    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario){
        return service.salvar(usuario);
    }
    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    }
    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable String id){
        return service.buscarId(id);
    }

    @PutMapping("/{id}")
    public Usuario atualizarPorId(@PathVariable String id, @RequestBody Usuario usuario){
        usuario.setId(id);
        return service.salvar(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id){
        service.deletar(id);
    }

}
