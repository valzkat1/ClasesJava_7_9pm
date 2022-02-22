package org.fundacionview.form_mvc.validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IndicativoCol_valid implements ConstraintValidator<IndicativoCol, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(value!=null) {
		if(value.startsWith("57")) {
			return true;
		}else
		return false;
		}else return false;
	}

}
