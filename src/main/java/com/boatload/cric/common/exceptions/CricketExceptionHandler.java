/**
 * 
 */
package com.boatload.cric.common.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.boatload.cric.exceptions.CricketGroundValidationException;

/**
 * @author WIN10USER
 *
 */
@ControllerAdvice
public class CricketExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(CricketExceptionHandler.class);

	public final ResponseEntity<Object> handleCricketGroundValidationException(HttpServletRequest httpRequest,CricketGroundValidationException exception){
		return null;
		
	}
}
