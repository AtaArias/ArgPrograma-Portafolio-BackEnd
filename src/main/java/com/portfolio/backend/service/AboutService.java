package com.portfolio.backend.service;

import com.portfolio.backend.model.About;
import com.portfolio.backend.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService {
    
    @Autowired
    private AboutRepository aboutRepo;

    @Override
    public About getAbout() {
        return aboutRepo.findById(1L).orElse(null);
    }

    @Override
    public void saveAbout(About about) {
        aboutRepo.save(about);
    }
    
    
    
}
