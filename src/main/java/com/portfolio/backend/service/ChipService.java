package com.portfolio.backend.service;

import com.portfolio.backend.model.Chip;
import com.portfolio.backend.repository.ChipRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChipService implements IChipService{
    
    @Autowired
    private ChipRepository chipRepo;

    @Override
    public List<Chip> getChipsProj(Long id) {
        return chipRepo.findAllOfProject(id);
    }
    
    @Override
    public void saveChip(Chip chip){
        chipRepo.save(chip);
    }
    
    @Override
    public void saveChips(List<Chip> chips){
        chipRepo.saveAll(chips);
    }
    
    @Override
    public void deleteChip(Long id){
        chipRepo.deleteById(id);
    }
    
    @Override
    public void deleteChipsProj(Long id){
        chipRepo.deleteAll(this.getChipsProj(id));
    }
}
