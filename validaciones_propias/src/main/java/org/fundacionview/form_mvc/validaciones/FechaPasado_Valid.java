package org.fundacionview.form_mvc.validaciones;

import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FechaPasado_Valid implements ConstraintValidator<FechaPasado, Date>{

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		
		if(value!=null) {
			
			if(value.before(new Date())) {
				return true;
			}else {
				return false;
			}
			
			
			
		}else
		// TODO Auto-generated method stub
		return false;
	}

}
