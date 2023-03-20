package com.portfolio.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class About {
    
    @Id
    private Long id = 1L; 
    private String title, content, iconUrl, iconDescription;
}
