package org.fundacionview.proyectofinal;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class Configuracion {

	@Bean
	public MessageSource misMensajes() {
		
		ResourceBundleMessageSource recursos=new ResourceBundleMessageSource();
		recursos.setBasename("messages");
		
		return recursos;
		
	}
	
	
}
