package com.portfolio.backend.service;

import com.portfolio.backend.model.Chip;
import java.util.List;
import org.springframework.stereotype.Service;


public interface IChipService {
    
    public List<Chip> getChipsProj(Long id);
    
    public void saveChip(Chip chip);
    
    public void saveChips(List<Chip> chips);
    
    public void deleteChip(Long id);
    
    public void deleteChipsProj(Long id);
}
