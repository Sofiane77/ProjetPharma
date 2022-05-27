package com.stage.ProjetPharma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*
 * attributs de class -> fait
 */

//  /!\ l'attribut date est en String par defaut /!\ à voir le type que tu préfères 

 /* 
 * constructeur vide et complet -> fait 
 * getters et setters -> fait
 * to string -> à faire si besoin 
*/

@Entity
public class Actualite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //génération automatique des id
	private Long id; 
	
	@Column(nullable = false) //le titre ne peut pas être null en BDD
	private String titre; 
	
	@Column(nullable = false) //la description ne peut pas être null en BDD
	private String description;
	
	@Column(nullable = true) //la date peut être nulle en BDD
	private String date;

	public Actualite() {
	}

	public Actualite(String titre, String description, String date) {
		this.titre = titre;
		this.description = description;
		this.date = date;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	} 
		
}
