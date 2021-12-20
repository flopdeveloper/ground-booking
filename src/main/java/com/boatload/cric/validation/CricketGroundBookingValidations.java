/**
 * 
 */
package com.boatload.cric.validation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

import com.boatload.cric.entity.CricketGround;
import com.boatload.cric.request.CricketGroundBookingRequest;
import com.boatload.cric.response.CricketGroundBookingResponse;
import com.boatload.cric.response.ErrorDetails;

/**
 * @author WIN10USER
 *
 */
public class CricketGroundBookingValidations {

	private List<ErrorDetails> errors;
	
	private CricketGroundBookingRequest groundBooking;
	
	private Pattern pattern;
	
	public CricketGroundBookingValidations() {
		errors = new ArrayList<ErrorDetails>();
	}

	public CricketGroundBookingValidations(CricketGroundBookingRequest cricketParam) {
		groundBooking = cricketParam;
		errors = new ArrayList<ErrorDetails>();
	}
	
	public CricketGroundBookingValidations(String code,String message) {
		errors = new ArrayList<ErrorDetails>();
		this.addErrorDetails(code,message);
	}
	
	public CricketGroundBookingRequest getCricketGroundBookingObject() {
		return groundBooking;
	}
	
	public CricketGroundBookingResponse getCricketGroundBookingResponse() {
		CricketGroundBookingResponse response = null;
		if(!"".equals(groundBooking.toString())) {
			response = new CricketGroundBookingResponse();
			response.setId(groundBooking.getId());
			response.setSlotFrom(groundBooking.getSlotFrom());
			response.setSlotTo(groundBooking.getSlotTo());
			response.setUserId(groundBooking.getUserId());
			response.setUpdateTime(groundBooking.getUpdateTime());
		}
		return response;
	}
	
	public List<ErrorDetails> geteErrorDetails(){
		return errors;
	}
	
	public void addErrorDetails(String code,String message) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setCode(code);
		errorDetails.setMessage(message);
		errors.add(errorDetails);
	}
	
	public void validateGroundBookingId(boolean mandatory) {
		if(mandatory && "".equals(groundBooking.getId())) {
			addErrorDetails("1005", "Ground Booking Id is required");
		}
	}
	
	public void validateBookingIdNotExist(boolean mandatory, Optional<CricketGround> lisCricketGround) {
		if(mandatory && lisCricketGround.isEmpty()) {
			addErrorDetails("1006", "Ground Booking Id not exist");
		}
	}
	
	public void isValidSession(boolean mandatory) {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
		sdf.setLenient(false);
		try {
			Date d1 = sdf.parse(groundBooking.getSlotFrom());
			Date d2 = sdf.parse(groundBooking.getSlotTo());
		} catch (Exception e) {
			addErrorDetails("1007", "Invalid Session time format ,should be HH:MM (AM/PM)");
		}
	}
}
