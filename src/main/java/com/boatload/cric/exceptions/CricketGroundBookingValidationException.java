package com.boatload.cric.exceptions;

import com.boatload.cric.common.exceptions.CricketRuntimeException;
import com.boatload.cric.validation.CricketGroundBookingValidations;

public class CricketGroundBookingValidationException extends CricketRuntimeException{

	private static final long serialVersionUID = 1L;
	
	private final transient CricketGroundBookingValidations validations;
	
	public CricketGroundBookingValidationException(CricketGroundBookingValidations validations) {
		super("Validation error","");
		this.validations = validations;
	}
	
	public CricketGroundBookingValidations getValidationsObject() {
		return validations;
	}
}
