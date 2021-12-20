package com.boatload.cric.response;

import java.util.List;
import java.util.Optional;

import com.boatload.cric.entity.CricketGroundBooking;

public class CricketGroundBookingResponseMapper {
	
	private CricketGroundBookingRecord data;
	
	private String code;
	
	private String message;
	
	private List<ErrorDetails> errors;
	
	public CricketGroundBookingResponseMapper() {
		this.data = new CricketGroundBookingRecord();
	}

	public CricketGroundBookingResponseMapper(Iterable<CricketGroundBooking> cricketGroundList) {
		
		this.data = new CricketGroundBookingRecord();
		
		if(cricketGroundList!=null) {
			for(CricketGroundBooking dataResponse:cricketGroundList) {
				CricketGroundBookingResponse response = new CricketGroundBookingResponse();
				response.setId(String.valueOf(dataResponse.getId()));
				response.setSlotFrom(dataResponse.getSlotfrom());
				response.setSlotTo(dataResponse.getSlotto());
				response.setUserId(dataResponse.getUserid());
				response.setUpdateTime(dataResponse.getUpdatetime());
				data.add(response);
			}
		}
	}

	public CricketGroundBookingResponseMapper(Optional<CricketGroundBooking> listCricketGround) {
		this.data = new CricketGroundBookingRecord();
		
		if(listCricketGround!=null) {
				CricketGroundBookingResponse response = new CricketGroundBookingResponse();
				response.setId(String.valueOf(listCricketGround.get().getId()));
				response.setSlotFrom(listCricketGround.get().getSlotfrom());
				response.setSlotTo(listCricketGround.get().getSlotto());
				response.setUserId(listCricketGround.get().getUserid());
				response.setUpdateTime(listCricketGround.get().getUpdatetime());
				data.add(response);
		}
	}

	/**
	 * @return the data
	 */
	public CricketGroundBookingRecord getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(CricketGroundBookingRecord data) {
		this.data = data;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * @return the errors
	 */
	public List<ErrorDetails> getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<ErrorDetails> errors) {
		this.errors = errors;
	}
}
