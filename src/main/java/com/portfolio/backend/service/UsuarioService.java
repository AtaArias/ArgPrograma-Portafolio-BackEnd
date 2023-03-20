package com.portfolio.backend.service;

import com.portfolio.backend.model.Usuario;
import com.portfolio.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario findUsuario(String username) {
        return usuarioRepository.findById(username).orElse(null);
    }
    
    
}
