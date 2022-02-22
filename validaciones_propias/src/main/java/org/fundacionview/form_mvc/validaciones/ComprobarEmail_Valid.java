package org.fundacionview.form_mvc.validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.fundacionview.form_mvc.modelos.Usuario;

public class ComprobarEmail_Valid implements ConstraintValidator<ComprobarEmail, Usuario>{

	@Override
	public boolean isValid(Usuario value, ConstraintValidatorContext context) {
		
		if(value.getEmail()!=null && value.getComprobaremail()!=null) {
			
			if(value.getEmail().equals(value.getComprobaremail())) {
				return true;
			}else {
				agregarEtiquetaError(context);
				return false;
			}
			
			
		}else {
		
			agregarEtiquetaError(context);
			return false;
		}
	}
	
	
	public void agregarEtiquetaError(ConstraintValidatorContext context) {
	
		context.buildConstraintViolationWithTemplate("Las direcciones de correo deben coincidir").addNode("comprobaremail").addConstraintViolation();
	}

}
