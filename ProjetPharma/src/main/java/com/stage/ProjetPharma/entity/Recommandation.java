package com.stage.ProjetPharma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * attributs de class -> fait
 * constructeur vide et complet -> fait 
 * getters et setters -> fait
 * to string -> à faire si besoin  
*/
@Entity
public class Recommandation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //génération automatique des id
	private Long id;
	
	@Column(nullable = false) //le titre ne peut pas être null en BDD
	private String titre; 
	
	@Column(nullable = false) //la description ne peut pas être null en BDD
	private String description;

	public Recommandation() {
	}

	public Recommandation(String titre, String description) {
		this.titre = titre;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
