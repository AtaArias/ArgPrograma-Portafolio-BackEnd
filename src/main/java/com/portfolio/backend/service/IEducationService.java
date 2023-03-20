package com.portfolio.backend.service;

import com.portfolio.backend.model.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> getEducations();
    
    public void saveEducation(Education edu);
    
    public void deleteEducation(Long id);
    
    public Education findEducation(Long id);
}
