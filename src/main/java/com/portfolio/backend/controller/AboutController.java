package com.portfolio.backend.controller;

import com.portfolio.backend.model.About;
import com.portfolio.backend.service.IAboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {
    
    @Autowired
    private IAboutService interAbout;
    
    @GetMapping("/about/traer")
    public About traerAbout(){
        return interAbout.getAbout();
    }
    
    @PostMapping("/about/crear")
    public String crearAbout(@RequestBody About about){
        interAbout.saveAbout(about);
        
        return "About saved to db";
    }
}
