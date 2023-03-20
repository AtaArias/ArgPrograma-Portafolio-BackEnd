package com.portfolio.backend.controller;

import com.portfolio.backend.model.Usuario;
import com.portfolio.backend.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    
    @Autowired
    private IUsuarioService interUsuario;
    
    @PostMapping("/user/login")
    public ResponseEntity<?> loginUsuario(@RequestBody Usuario userData){
        Usuario user = interUsuario.findUsuario(userData.getUsername());
        
        if(user != null){
            if(user.getPassword().equals(userData.getPassword())){
                System.out.println("Ok login");
                return ResponseEntity.ok(user);
            }
        }
        
        return (ResponseEntity<?>)ResponseEntity.internalServerError();
    }
}
