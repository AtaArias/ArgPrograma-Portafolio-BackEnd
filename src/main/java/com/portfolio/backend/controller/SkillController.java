package com.portfolio.backend.controller;

import com.portfolio.backend.model.Skill;
import com.portfolio.backend.service.ISkillService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
    
    @Autowired
    private ISkillService interService;
    
    @GetMapping("/skill/traer/{tipo}")
    public List<Skill> getSkills(@PathVariable String tipo) {
        return interService.getSkills(tipo);
    }
    
    @DeleteMapping("/skill/borrar/{id}")
    public String deleteSkill(@PathVariable Long id) {
        interService.deleteSkill(id);
        
        return "Skill deleted";
    }
    
    @PostMapping("/skill/crear")
    public String createSkill(@RequestBody Skill skill) {
        String[] acceptedTypes = {"hard", "soft"};
        
        if (Arrays.asList(acceptedTypes).contains(skill.getType())){
            interService.saveSkill(skill);
            return "Skill guardada";
        }
        
        return "No se encuentra el tipo en la lista";
    }
}
