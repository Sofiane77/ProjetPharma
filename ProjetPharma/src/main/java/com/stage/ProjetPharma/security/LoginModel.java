package com.stage.ProjetPharma.security;

//récupère les données login et password à partir du controller et c'est avec ces données qu'on fait l'authentification
public class LoginModel {
	private String login; 
	private String password;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 
	
}
