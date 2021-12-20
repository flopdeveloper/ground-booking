/**
 * 
 */
package com.boatload.cric.common.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.boatload.cric.exceptions.CricketGroundBookingValidationException;
import com.boatload.cric.exceptions.CricketGroundValidationException;
import com.boatload.cric.response.CricketGroundBookingResponseMapper;
import com.boatload.cric.response.CricketGroundResponseMapper;

/**
 * @author WIN10USER
 *
 */
@ControllerAdvice(annotations = Controller.class)
public class CricketExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(CricketGroundValidationException.class)
	public final ResponseEntity<Object> handleCricketGroundValidationException(HttpServletRequest httpRequest,CricketGroundValidationException exception){
		CricketGroundResponseMapper response=new CricketGroundResponseMapper();
		response.setCode("400");
		response.setMessage(exception.getLocalizedMessage());
		response.setErrors(exception.getValidationsObject().geteErrorDetails());
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CricketGroundBookingValidationException.class)
	public final ResponseEntity<Object> handleBookingValidationException(HttpServletRequest httpRequest,CricketGroundBookingValidationException exception){
		CricketGroundBookingResponseMapper response=new CricketGroundBookingResponseMapper();
		response.setCode("400");
		response.setMessage(exception.getLocalizedMessage());
		response.setErrors(exception.getValidationsObject().geteErrorDetails());
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
	}
}

