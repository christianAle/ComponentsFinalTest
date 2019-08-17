package com.components.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.components.model.BIODIVERSIDAD;

public interface BiodiversidadRepository  extends JpaRepository<BIODIVERSIDAD, Long>{
	@Query(value="SELECT  p. region_id,p. region,p.Provincia from REGION p INNER JOIN RIG R on p.id=r.id  where r.nombre  = :pais",nativeQuery = true) 
    public List<String> findByCountry(@Param("pais") String pais);
}
