package com.portfolio.backend.controller;

import com.portfolio.backend.dto.ProjectDTO;
import com.portfolio.backend.model.Chip;
import com.portfolio.backend.model.Project;
import com.portfolio.backend.service.IChipService;
import com.portfolio.backend.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    
    @Autowired
    private IProjectService interProj;
    
    @Autowired
    private IChipService interChip;
    
    @GetMapping("/project/traer")
    public List<Project> traerProyectos() {
        return interProj.getProjects();
    }
    
    @PostMapping("/project/crear")
    public String crearProyecto(@RequestBody ProjectDTO projDto)  {
        interProj.saveProject(projDto.getProject());
        
        interChip.saveChips(projDto.getChips());
        
        return "Proyecto creado correctamente";
    }
    
    @DeleteMapping("project/delete/chip/{id}")
    public String deleteChip(@PathVariable Long id) {
        interChip.deleteChip(id);
        
        return "Chip eliminado correctamente";
    }
    
    @DeleteMapping("/project/delete/{id}")
    public String eliminarProyecto(@PathVariable Long id) {
        
        // eliminar proyecto
        interProj.deleteProject(id);
        
        // eliminar chips
        interChip.deleteChipsProj(id);
        
        return "Proyecto eliminado correctamente";
    }
    
    @GetMapping("/project/chips/{id}")
    public List<Chip> traerChips(@PathVariable Long id){
        return interChip.getChipsProj(id);
    }
}
