package org.fundacionview.form_mvc.validaciones;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ TYPE, METHOD }) 
@Constraint(validatedBy = ComprobarEmail_Valid.class)

public @interface ComprobarEmail {

	public String message() default "Las direcciones de correo deben coincidir";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
	
	
}
