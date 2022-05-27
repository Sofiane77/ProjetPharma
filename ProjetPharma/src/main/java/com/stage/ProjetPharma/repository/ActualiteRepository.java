package com.stage.ProjetPharma.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.stage.ProjetPharma.entity.Actualite;

public interface ActualiteRepository extends JpaRepository<Actualite, Long>{
	
}
