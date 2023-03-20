package com.portfolio.backend.service;

import com.portfolio.backend.model.Usuario;

public interface IUsuarioService {

    public Usuario findUsuario(String username);
    
}
