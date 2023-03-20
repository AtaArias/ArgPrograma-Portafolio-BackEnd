package com.portfolio.backend.repository;

import com.portfolio.backend.model.Chip;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ChipRepository extends JpaRepository<Chip, Long> {
    
    @Query(value  = "select * from chip where project_id=?1",
            nativeQuery = true)
    List<Chip> findAllOfProject(Long projectId);
}
