package com.stage.ProjetPharma.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.stage.ProjetPharma.entity.Actualite;
import com.stage.ProjetPharma.repository.ActualiteRepository;

@RestController
@RequestMapping("/api/actualite")
public class ActualiteController {
	private ActualiteRepository actualiteRepository;

	public ActualiteController(ActualiteRepository actualiteRepository) {
		this.actualiteRepository = actualiteRepository;
	}
	// methode lister 
	@GetMapping
	public List<Actualite> listerActualite(){
		return actualiteRepository.findAll();
	}
	// methode ajouter , qui retourne le status en reponse de la requete.
	// on enregistre l'objet dans le repository , et on retourne la reponse de la requete.
	@PostMapping
	public ResponseEntity<?> ajouter(@RequestBody Actualite actualite) {
		actualiteRepository.save(actualite);
		return ResponseEntity.status(HttpStatus.CREATED).body("AJOUT ACTUS OK");
	}

	
}
