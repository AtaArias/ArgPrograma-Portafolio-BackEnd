package com.portfolio.backend.service;

import com.portfolio.backend.model.Project;
import com.portfolio.backend.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjectService implements IProjectService{

    @Autowired
    private ProjectRepository projectRepo;
    
    @Override
    public List<Project> getProjects() {
        return projectRepo.findAll();
    }

    @Override
    public void saveProject(Project proj) {
        projectRepo.save(proj);
    }

    @Override
    public void deleteProject(Long Id) {
        projectRepo.deleteById(Id);
    }
    
}
