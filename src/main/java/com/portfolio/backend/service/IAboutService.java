package com.portfolio.backend.service;

import com.portfolio.backend.model.About;

public interface IAboutService {
    
    public About getAbout();
    
    public void saveAbout(About about);
    
}
