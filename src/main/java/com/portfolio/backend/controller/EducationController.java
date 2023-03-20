package com.portfolio.backend.controller;

import com.portfolio.backend.model.Education;
import com.portfolio.backend.service.IEducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EducationController {
    
    @Autowired
    private IEducationService interEducation;
    
    @GetMapping ("/education/traer")
    public List<Education> getEducations() {
        return interEducation.getEducations();
    }
    
    @PostMapping ("/education/crear")
    public String createEducation(@RequestBody Education edu){
        interEducation.saveEducation(edu);
        
        return "Education added";
    }
    
    @DeleteMapping ("/education/borrar/{id}")
    public String deleteEducation(@PathVariable Long id) {
        interEducation.deleteEducation(id);
        
        return "Education element deleted";
    }
    
}
