package com.portfolio.backend.service;

import com.portfolio.backend.model.Project;
import java.util.List;
import org.springframework.stereotype.Service;


public interface IProjectService {
    
    public List<Project> getProjects();
            
    public void saveProject(Project proj);
    
    public void deleteProject(Long Id);
}
