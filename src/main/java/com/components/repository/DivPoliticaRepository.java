package com.components.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.components.model.DivPolitica;

public interface DivPoliticaRepository extends JpaRepository<DivPolitica, Long> {

	@Query(value="SELECT  p.div_id,p.provincia,p.canton from div_politica p INNER JOIN RIG R on p.id=r.id  where r.nombre  = :nombre",nativeQuery = true) 
    public List<String> findByCountry(@Param("nombre") String nombre);
	
	
	@Query(value="SELECT  p.div_id,p.provincia,p.canton from div_politica p   where p.provincia  like %:provincia%",nativeQuery = true) 
    public List<String> findByProvincia(@Param("provincia") String provincia);
	
}
