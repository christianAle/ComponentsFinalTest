package com.components.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.components.model.REGION;

public interface RegionRepository extends JpaRepository<REGION, Long> {
	@Query(value="SELECT  p. region_id,p. region,p.Provincia from REGION p INNER JOIN RIG R on p.id=r.id  where r.nombre  = :pais",nativeQuery = true) 
    public List<String> findByCountry(@Param("pais") String pais);
	
}
