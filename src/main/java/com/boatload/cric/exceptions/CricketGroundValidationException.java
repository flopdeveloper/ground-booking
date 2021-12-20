package com.boatload.cric.exceptions;

import com.boatload.cric.common.exceptions.CricketRuntimeException;
import com.boatload.cric.validation.CricketGroundValidations;

public class CricketGroundValidationException extends CricketRuntimeException{

	private static final long serialVersionUID = 1L;
	
	private final transient CricketGroundValidations validations;
	
	public CricketGroundValidationException(CricketGroundValidations validations) {
		super("Validation error","");
		this.validations = validations;
	}
	
	public CricketGroundValidations getValidationsObject() {
		return validations;
	}
}
