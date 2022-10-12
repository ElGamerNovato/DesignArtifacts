package com.duberlyguarnizo.designartifacts.repository;

import com.duberlyguarnizo.designartifacts.model.GraphDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GraphRepository extends JpaRepository<GraphDefinition, Long> {
    GraphDefinition findByName(String graphName);

    List<GraphDefinition> findByCreationAdmin_AdminId(Long adminId);

    List<GraphDefinition> findByUpdateAdmin_AdminId(Long adminId);
}
