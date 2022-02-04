package org.fundacionview;

import org.fundacionview.modelos.Admin;
import org.fundacionview.modelos.Operario;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextoApplicacion {
	
	

	//Scope o ambito por defecto es Singleton
	/*@Bean
	//@Scope("prototype")
	Admin miAdmin() {
		return new Admin();
	}*/
	
	
	
	@Bean	
	Operario miOperario() {
		return new Operario();
	}
	

	

}
