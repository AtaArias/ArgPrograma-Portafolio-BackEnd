package com.portfolio.backend.dto;

import com.portfolio.backend.model.Chip;
import com.portfolio.backend.model.Project;
import java.util.List;

public class ProjectDTO extends Project{    
    private List<Chip> chips;
    
    
    public List<Chip> getChips() {
        return chips;
    }
    
    public Project getProject() {
        Project thisProject = new Project();
        
        thisProject.setDate(this.getDate());
        thisProject.setId(this.getId());
        thisProject.setName(this.getName());
        thisProject.setImageUrl(this.getImageUrl());
        thisProject.setSourceUrl(this.getSourceUrl());
        thisProject.setDescription(this.getDescription());
        
        return thisProject;
    }
}
