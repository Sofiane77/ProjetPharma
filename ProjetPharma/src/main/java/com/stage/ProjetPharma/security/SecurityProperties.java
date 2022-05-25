package com.stage.ProjetPharma.security;

public class SecurityProperties {
	//attribut qui va permettre de signer le jeton
		public static final String SECRET = "dfeg6dgtd45b5sfdsed8ghjerrpfjds6vjfrusihlmdfhegirysglhhf7";
		
		//attribut qui permet de donner la durée de vie du jeton
		public static final int EXPIRE_IN = 8 * 60 *60 * 1000;
}
