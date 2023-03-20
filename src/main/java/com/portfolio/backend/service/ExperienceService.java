package com.portfolio.backend.service;

import com.portfolio.backend.model.Experience;
import com.portfolio.backend.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{
 
    @Autowired
    private ExperienceRepository experienceRepository;

    @Override
    public List<Experience> getExperiences() {
        List<Experience> experiences = experienceRepository.findAll();
        return experiences;
    }

    @Override
    public void saveExperience(Experience exp) {
        experienceRepository.save(exp);
    }

    @Override
    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }

    @Override
    public Experience findExperience(Long id) {
        Experience exp = experienceRepository.findById(id).orElse(null);
        return exp;
    }
    
    
    
    
}
