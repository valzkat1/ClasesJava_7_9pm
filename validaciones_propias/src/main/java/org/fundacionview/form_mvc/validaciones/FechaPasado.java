package org.fundacionview.form_mvc.validaciones;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = FechaPasado_Valid.class)
public @interface FechaPasado {

	
	public String message() default "Solo son permitidas fechas anteriores a la actual";
	
	public Class<?>[] groups() default {};
	 
	public Class<? extends Payload>[] payload() default {};
	
}
