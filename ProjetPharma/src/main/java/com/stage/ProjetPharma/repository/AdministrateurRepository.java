package com.stage.ProjetPharma.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stage.ProjetPharma.entity.Administrateur;

public interface AdministrateurRepository extends JpaRepository<Administrateur, Long>{
	Optional<Administrateur> findByNom(String nom);
}
