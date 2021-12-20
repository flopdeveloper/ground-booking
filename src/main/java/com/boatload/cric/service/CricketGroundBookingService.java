/**
 * 
 */
package com.boatload.cric.service;

import com.boatload.cric.request.CricketGroundBookingRequest;
import com.boatload.cric.response.CricketGroundBookingResponseMapper;

/**
 * @author WIN10USER
 *
 */
public interface CricketGroundBookingService {
	  CricketGroundBookingResponseMapper getGroundBookingDetails();
	  CricketGroundBookingResponseMapper createGroundBooking(CricketGroundBookingRequest cricketGroundBookingRequest);
	  CricketGroundBookingResponseMapper updateGroundBooking(CricketGroundBookingRequest cricketGroundBookingRequest);
	  CricketGroundBookingResponseMapper deleteGroundBooking(int groundId);
	  CricketGroundBookingResponseMapper getGroundBookingById(int groundId);

}
