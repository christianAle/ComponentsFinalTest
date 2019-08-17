package com.components.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.components.model.RIG;

public interface RigRepository extends JpaRepository<RIG, Long> {
 
}
