/**
 * 
 */
package com.boatload.cric.helper;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.boatload.cric.entity.CricketGroundBooking;
import com.boatload.cric.response.CricketGroundBookingResponseMapper;

/**
 * @author WIN10USER
 *
 */
@Service
public class CricketGroundBookingHelperMapper {

	public CricketGroundBookingResponseMapper generateResponseByGroundList(List<CricketGroundBooking> responseList) {
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

	public CricketGroundBookingResponseMapper generateResponseByGroundList(Optional<CricketGroundBooking> listCricketGroundBooking) {
		CricketGroundBookingResponseMapper response = new CricketGroundBookingResponseMapper(listCricketGroundBooking);
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}
}
