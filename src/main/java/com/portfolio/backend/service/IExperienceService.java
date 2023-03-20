package com.portfolio.backend.service;

import com.portfolio.backend.model.Experience;
import java.util.List;


public interface IExperienceService {
    
    public List<Experience> getExperiences();
    
    public void saveExperience(Experience exp);
    
    public void deleteExperience(Long id);
    
    public Experience findExperience(Long id);
}
