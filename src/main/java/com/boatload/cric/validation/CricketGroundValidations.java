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
import com.boatload.cric.request.CricketGroundRequest;
import com.boatload.cric.response.CricketGroundResponse;
import com.boatload.cric.response.ErrorDetails;

/**
 * @author WIN10USER
 *
 */
public class CricketGroundValidations {

	private List<ErrorDetails> errors;

	private CricketGroundRequest ground;

	private Pattern pattern;

	public CricketGroundValidations() {
		errors = new ArrayList<ErrorDetails>();
	}

	public CricketGroundValidations(CricketGroundRequest cricketParam) {
		ground = cricketParam;
		errors = new ArrayList<ErrorDetails>();
	}

	public CricketGroundValidations(String code, String message) {
		errors = new ArrayList<ErrorDetails>();
		this.addErrorDetails(code, message);
	}

	public CricketGroundRequest getCricketGroundObject() {
		return ground;
	}

	public CricketGroundResponse getCricketGroundResponse() {
		CricketGroundResponse response = null;
		if (!"".equals(ground.toString())) {
			response = new CricketGroundResponse();
			response.setAddr1(ground.getAddr1());
			response.setAddr2(ground.getAddr2());
			response.setCity(null);
			response.setCounty(null);
			response.setState(null);
			response.setCounty(null);
			response.setName(null);
			response.setSessionFrom(null);
			response.setTitle(null);
			response.setUpdateBy(null);
			response.setUpdateTime(null);
			response.setSessionTo(null);
		}
		return response;
	}

	public List<ErrorDetails> geteErrorDetails() {
		return errors;
	}

	public void addErrorDetails(String code, String message) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setCode(code);
		errorDetails.setMessage(message);
		errors.add(errorDetails);
	}

	public void validateGroundName(boolean mandatory) {
		if (mandatory & ground.getName().isEmpty()) {
			addErrorDetails("1001", "Ground name is required");
		}

		if (!ground.getName().isEmpty()) {
			pattern = Pattern.compile("^[a-zA-Z0-9 ]{1,20}");
			if (mandatory && !pattern.matcher(ground.getName()).matches()) {
				addErrorDetails("1002", "Invalid Ground Name,only alphanumeric and 20 char allowed");
			}
		}
	}

	public void validateDuplicateGroundName(boolean mandatory, Optional<CricketGround> lisCricketGround) {
		if (mandatory && !lisCricketGround.isEmpty()) {
			addErrorDetails("1003", "Ground name already exist");
		}
	}

	public void isValidSession(boolean mandatory) {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
		sdf.setLenient(false);
		try {
			Date d1 = sdf.parse(ground.getSessionFrom());
			Date d2 = sdf.parse(ground.getSessionTo());
		} catch (Exception e) {
			addErrorDetails("1004", "Invalid Session time format ,should be HH:MM (AM/PM)");
		}
	}
}
