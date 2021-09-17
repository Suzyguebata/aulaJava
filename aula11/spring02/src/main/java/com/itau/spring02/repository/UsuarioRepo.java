package com.itau.spring02.repository;

import com.itau.spring02.model.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepo extends CrudRepository<Usuario, Long> {
    
}
