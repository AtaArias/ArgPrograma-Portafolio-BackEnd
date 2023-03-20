package com.portfolio.backend.service;

import com.portfolio.backend.model.Skill;
import java.util.List;

public interface ISkillService {
    
    public List<Skill> getSkills(String type);
    
    public void saveSkill(Skill skill);
    
    public void deleteSkill(Long id);
}
