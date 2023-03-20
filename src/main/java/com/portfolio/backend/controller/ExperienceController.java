package com.portfolio.backend.controller;

import com.portfolio.backend.model.Experience;
import com.portfolio.backend.service.IExperienceService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienceController {
    
    @Autowired
    private IExperienceService interExperience;
    
    @GetMapping("/experience/traer")
    public List<Experience> getExperiences(){
        return interExperience.getExperiences();
    }
    
    @PostMapping("/experience/crear")
    public String createExperience(@RequestBody Experience exp){
        interExperience.saveExperience(exp);
        
        return "Experince saved"; 
    }
    
    @DeleteMapping("/experience/borrar/{id}")
    public String deleteExperience(@PathVariable Long id){
        interExperience.deleteExperience(id);
        
        return "Experience deleted";
    }
    
    @PutMapping("/experience/editar/{id}")
    public Experience editExperience(@PathVariable Long id,
                @RequestParam Optional<String> title,
                @RequestParam Optional<String> iconUrl,
                @RequestParam Optional<String> content
            ){
        Experience exp = interExperience.findExperience(id);
        
        if(title.isPresent())
            exp.setTitle(title.get());
        
        if(iconUrl.isPresent())
            exp.setIconUrl(iconUrl.get());
        
        if(content.isPresent())
            exp.setContent(content.get());
        
        interExperience.saveExperience(exp);
        
        return exp;
    }
}
