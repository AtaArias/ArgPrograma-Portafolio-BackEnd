package com.portfolio.backend.service;

import com.portfolio.backend.model.Education;
import com.portfolio.backend.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
    
    @Autowired
    private EducationRepository educationRepository;

    @Override
    public List<Education> getEducations() {
        return educationRepository.findAll();
    }

    @Override
    public void saveEducation(Education edu) {
        educationRepository.save(edu);
    }

    @Override
    public void deleteEducation(Long id) {
        educationRepository.deleteById(id);
    }

    @Override
    public Education findEducation(Long id) {
        return educationRepository.findById(id).orElse(null);
    }
    
}
