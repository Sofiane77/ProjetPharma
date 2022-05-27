package com.stage.ProjetPharma.security;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.stage.ProjetPharma.entity.Administrateur;
import com.stage.ProjetPharma.repository.AdministrateurRepository;

public class DetailsAdministrateurService implements UserDetailsService {
	private AdministrateurRepository administrateurRepository; 
	
	public DetailsAdministrateurService(AdministrateurRepository administrateurRepository) {
		this.administrateurRepository = administrateurRepository;
	}

	//méthode qui charge l'administrateur par son username
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Administrateur> optionalAdministrateur = administrateurRepository.findByNom(username);
		if(optionalAdministrateur.isPresent()) { //si l'administrateur existe on le retourne 
			return optionalAdministrateur.get();
		}
		
		throw new UsernameNotFoundException("Le nom : " + username + " n'existe pas"); // sinon on génère une nouvelle exception qui indique que l'admin existe pas 
	}

}
