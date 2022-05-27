package com.stage.ProjetPharma.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	private DetailsAdministrateurService detailsAdministrateurService;

	public SecurityConfiguration(DetailsAdministrateurService detailsAdministrateurService) {
		this.detailsAdministrateurService = detailsAdministrateurService;
	} 
	
	
	/*
	  
	  
	//AuthenticationManagerBuilder : effectue l'authentification dans le système 
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.authenticationProvider(getAuthenticationProvider());
	}
	
	@Bean //permet de definir une méthode ou une class comme un composant
	public PasswordEncoder getPasswordEncoder() { //PasswordEncoder = algorithmede hachage 
		return new BCryptPasswordEncoder(); //autre méthode à hachage 
	}
	
	//charge encoder et details 
	@Bean
	public AuthenticationProvider getAuthenticationProvider() {
		//DaoAuthenticationProvider = objet qui permet de renseigner les user details à partir du username et aussi de renseigner la méthode de hachage
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(detailsAdministrateurService);
		daoAuthenticationProvider.setPasswordEncoder(getPasswordEncoder());
		return daoAuthenticationProvider; 	
	}
	
	// méthode qui retourne un objet AuthenticationManager
	// c'est à travers l'objet AuthenticationManager qu'on va ecrire une seule instruction qui va permettre de gerer toutes les authentifications 
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
		.csrf().disable()//desactive la gestion des jetons de csrf
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) //precise la politique de gestion de session //Statful permet de garder une session et utilise des jetons csrf //Stateless permet de le pas garder de session ouverte
		.and()
		.authorizeRequests()//permet d'accepter les requetes qui arrive au systeme 
		.antMatchers("/api/secured").authenticated();//analyse la requete et il faut que la personne soit authentifier
	}

	
	*/
	

}
