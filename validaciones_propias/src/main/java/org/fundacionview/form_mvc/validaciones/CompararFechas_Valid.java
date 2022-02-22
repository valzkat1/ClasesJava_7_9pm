package org.fundacionview.form_mvc.validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.*;
import org.fundacionview.form_mvc.modelos.Usuario;

public class CompararFechas_Valid implements ConstraintValidator<CompararFechas, Usuario>{

	@Override
	public boolean isValid(Usuario value, ConstraintValidatorContext context) {
		
		if(value.getEdad()!=0 && value.getFechaN()!=null ) {
			//Date actual=new Date();
			int dife= (new Date().getYear())-  value.getFechaN().getYear();
			if(dife==value.getEdad()) {
				return true;
			}else {
				agregarEtiquetaError(context);
				return false;
				
			}
			
		}else {
			agregarEtiquetaError(context);
		// TODO Auto-generated method stub
		return false;
		}
	}
	
	
	public void agregarEtiquetaError(ConstraintValidatorContext context) {
		
		context.buildConstraintViolationWithTemplate("La fecha nacimiento debe ser coherente con la edad").addNode("fechaN").addConstraintViolation();
	}
}
