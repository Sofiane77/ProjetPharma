package com.stage.ProjetPharma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * attributs de class -> fait
 */

 //  /!\ il faudrait qu'on voit pour que les utilisateurs puisse envoyer un message sans ordonnance mais qu'il ne soit pas add en BDD pour pas la surcharger /!\
 
/* 
 * constructeur vide et complet -> fait 
 * getters et setters -> fait
 * to string -> à faire si besoin 
*/
@Entity
public class Ordonnance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //génération automatique des id
	private Long id; 
	
	@Column(nullable = false) //la référence patient ne peut pas être null en BDD
	private String refPatient;
	
	@Column(nullable = false) //le fichier ne peut être null en BDD 
	private String fichier;

	public Ordonnance() {
	}

	public Ordonnance(String refPatient, String fichier) {
		this.refPatient = refPatient;
		this.fichier = fichier;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRefPatient() {
		return refPatient;
	}

	public void setRefPatient(String refPatient) {
		this.refPatient = refPatient;
	}

	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	} 
	
	
	
}
