package com.itau.spring02.controller;


import java.util.List;

import com.itau.spring02.dto.UsuarioDTO;
import com.itau.spring02.model.Usuario;
import com.itau.spring02.repository.UsuarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController // indica que a classe é um controller REST
@RequestMapping("/user")
@CrossOrigin("*") //liberando para acesso de diferentes origens
public class UsuarioController {

    @Autowired // pede para implementar a classe e os métodos de acesso
    private UsuarioRepo repo;
    
    @GetMapping()
    public List<Usuario> obterTodos() {
        return (List<Usuario>) repo.findAll();
    }

    @GetMapping("order")
    public List<Usuario> obterTodosOrdenado() {
        return (List<Usuario>) repo.findAllByOrderByNome();
    }
    
    @GetMapping("/id/{codigo}")
    public ResponseEntity<Usuario> obterUsuario(@PathVariable long codigo) {
        // procura um usuario cujo id = codigo do parãmetro
        // se não encontrar coloca null no usuario encontrado
        Usuario usuarioEncontrado = repo.findById(codigo).orElse(null);

        if(usuarioEncontrado != null) {
            return ResponseEntity.ok(usuarioEncontrado); // retrona 200 - ok
        }else {
            return ResponseEntity.notFound().build(); // resposta vazia com 404
        }
        
    }

    @GetMapping("/idfiltro/{codigo}")
    public ResponseEntity<UsuarioDTO> obterUsuarioFiltro(@PathVariable long codigo) {

        Usuario usuarioEncontrado = repo.findById(codigo).orElse(null);

        if(usuarioEncontrado != null) {
            UsuarioDTO userDTO = new UsuarioDTO(usuarioEncontrado);
            return ResponseEntity.ok(userDTO); 
        }else {
            return ResponseEntity.notFound().build(); 
        }
        
    }

    @PostMapping("/new")
    // os dados virão do Body = Corpo da requisição
    public ResponseEntity<Usuario> novoUsuario(@RequestBody Usuario usuario) {
        if (usuario.getId() != 0) {
            return ResponseEntity.status(400).build();
        } 
        Usuario novoUsuario = repo.save(usuario);
        return ResponseEntity.status(201).body(novoUsuario);
    }

    @PutMapping()
    public ResponseEntity<Void> atualizaUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioEncontrado = repo.findById(usuario.getId()).orElse(null);

        if (usuarioEncontrado == null) {
            return ResponseEntity.status(404).build();
        }
        repo.save(usuario);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> apagarUsuario(@PathVariable long id) {
        Usuario usuarioEncontrado = repo.findById(id).orElse(null);

        if (usuarioEncontrado == null) {
            return ResponseEntity.status(404).build();
        }
        repo.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/cod/{id}")
    public Object buscarPorId(@PathVariable long id) {
        return repo.buscaUsuario(id);
    }
}   