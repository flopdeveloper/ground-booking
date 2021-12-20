/**
 * 
 */
package com.boatload.cric.helper;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boatload.cric.entity.CricketGround;
import com.boatload.cric.exceptions.CricketGroundValidationException;
import com.boatload.cric.repository.GroundRepository;
import com.boatload.cric.request.CricketGroundRequest;
import com.boatload.cric.response.CricketGroundResponseMapper;
import com.boatload.cric.validation.CricketGroundValidations;

/**
 * @author WIN10USER
 *
 */
@Service
public class CricketGroundHelperMapper {

	@Autowired
	GroundRepository groundRepository;
	
	public void validateGroundForAdd(CricketGroundRequest request) {
		CricketGroundValidations validations = new CricketGroundValidations(request);
		validations.validateGroundName(true);
		validations.isValidSession(true);
		if(!request.getName().isEmpty()) {
			validations.validateDuplicateGroundName(true,groundRepository.findByName(request.getName()));
		}
		if(!validations.geteErrorDetails().isEmpty()) {
			throw new CricketGroundValidationException(validations);
		}
	}
	
	public void validateGroundForUpdate(CricketGroundRequest request) {
		CricketGroundValidations validations = new CricketGroundValidations(request);
		validations.validateGroundName(true);
		
		if(!validations.geteErrorDetails().isEmpty()) {
			throw new CricketGroundValidationException(validations);
		}
	}
	
	public void validateGroundForDelete(CricketGroundRequest request) {
		CricketGroundValidations validations = new CricketGroundValidations(request);
		validations.validateGroundName(true);
		
		if(!validations.geteErrorDetails().isEmpty()) {
			throw new CricketGroundValidationException(validations);
		}
	}
	
	public void validateGroundForRead(CricketGroundRequest request) {
		CricketGroundValidations validations = new CricketGroundValidations(request);
		validations.validateGroundName(true);
		
		if(!validations.geteErrorDetails().isEmpty()) {
			throw new CricketGroundValidationException(validations);
		}
	}
	
	public CricketGroundResponseMapper generateResponseByGroundList(List<CricketGround> requestList) {
		CricketGroundResponseMapper response = new CricketGroundResponseMapper(requestList);
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}
	
	public CricketGroundResponseMapper generateResponseByGroundList(Optional<CricketGround> requestList) {
		CricketGroundResponseMapper response = new CricketGroundResponseMapper(requestList);
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}
	
	public CricketGroundResponseMapper generateResponse() {
		CricketGroundResponseMapper response = new CricketGroundResponseMapper();
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}
}
