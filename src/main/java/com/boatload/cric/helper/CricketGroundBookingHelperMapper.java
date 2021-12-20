/**
 * 
 */
package com.boatload.cric.helper;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boatload.cric.entity.CricketGroundBooking;
import com.boatload.cric.exceptions.CricketGroundBookingValidationException;
import com.boatload.cric.repository.GroundRepository;
import com.boatload.cric.request.CricketGroundBookingRequest;
import com.boatload.cric.response.CricketGroundBookingResponseMapper;
import com.boatload.cric.validation.CricketGroundBookingValidations;

/**
 * @author WIN10USER
 *
 */
@Service
public class CricketGroundBookingHelperMapper {

	@Autowired
	GroundRepository groundRepository;
	
	public void validateBookingForAdd(CricketGroundBookingRequest request) {
		CricketGroundBookingValidations validations = new CricketGroundBookingValidations(request);
		validations.validateGroundBookingId(true);
		validations.isValidSession(true);
		if(!request.getGroundId().isEmpty()) {
			validations.validateBookingIdNotExist(true,groundRepository.findById(Integer.parseInt(request.getGroundId())));
		}
		if(!validations.geteErrorDetails().isEmpty()) {
			throw new CricketGroundBookingValidationException(validations);
		}
	}
	
	public void validateBookingForUpdate(CricketGroundBookingRequest request) {
		CricketGroundBookingValidations validations = new CricketGroundBookingValidations(request);
		validations.validateGroundBookingId(true);
		if(!request.getGroundId().isEmpty()) {
			validations.validateBookingIdNotExist(true,groundRepository.findById(Integer.parseInt(request.getGroundId())));
		}
		if(!validations.geteErrorDetails().isEmpty()) {
			throw new CricketGroundBookingValidationException(validations);
		}
	}
	
	public void validateBookingForDelete(CricketGroundBookingRequest request) {
		CricketGroundBookingValidations validations = new CricketGroundBookingValidations(request);
		validations.validateGroundBookingId(true);
		
		if(!validations.geteErrorDetails().isEmpty()) {
			throw new CricketGroundBookingValidationException(validations);
		}
	}
	
	public void validateBookingForRead(CricketGroundBookingRequest request) {
		CricketGroundBookingValidations validations = new CricketGroundBookingValidations(request);
		validations.validateGroundBookingId(true);
		
		if(!validations.geteErrorDetails().isEmpty()) {
			throw new CricketGroundBookingValidationException(validations);
		}
	}
	
	public CricketGroundBookingResponseMapper generateResponseByGroundBookingList(List<CricketGroundBooking> responseList) {
		CricketGroundBookingResponseMapper response = new CricketGroundBookingResponseMapper(responseList);
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}
	
	public CricketGroundBookingResponseMapper generateResponse() {
		CricketGroundBookingResponseMapper response = new CricketGroundBookingResponseMapper();
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}

	public CricketGroundBookingResponseMapper generateResponseByGroundBookingList(Optional<CricketGroundBooking> listCricketGroundBooking) {
		CricketGroundBookingResponseMapper response = new CricketGroundBookingResponseMapper(listCricketGroundBooking);
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}
}
