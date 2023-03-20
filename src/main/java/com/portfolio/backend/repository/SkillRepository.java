package com.portfolio.backend.repository;

import com.portfolio.backend.model.Skill;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    
    @Query(value  = "select * from skill where type=?1",
            nativeQuery = true)
    List<Skill> findAllOfType(String type);
}
