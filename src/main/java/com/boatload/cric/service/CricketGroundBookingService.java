/**
 * 
 */
package com.boatload.cric.service;

import com.boatload.cric.entity.CricketGroundBooking;
import com.boatload.cric.response.CricketGroundBookingResponseMapper;

/**
 * @author WIN10USER
 *
 */
public interface CricketGroundBookingService {
	  CricketGroundBookingResponseMapper getGroundBookingDetails();
	  CricketGroundBookingResponseMapper createGroundBooking(CricketGroundBooking cricketGroundBookingRequest);
	  CricketGroundBookingResponseMapper updateGroundBooking(CricketGroundBooking cricketGroundBookingRequest);
	  CricketGroundBookingResponseMapper deleteGroundBooking(int groundId);
	  CricketGroundBookingResponseMapper getGroundBookingById(int groundId);

}
