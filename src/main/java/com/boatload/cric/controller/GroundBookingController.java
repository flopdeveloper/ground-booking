/**
 * 
 */
package com.boatload.cric.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boatload.cric.entity.CricketGroundBooking;
import com.boatload.cric.request.CricketGroundBookingRequest;
import com.boatload.cric.response.CricketGroundBookingResponseMapper;
import com.boatload.cric.service.CricketGroundBookingServiceImpl;

/**
 * @author WIN10USER
 *
 */
@RestController
@RequestMapping("/cric")
public class GroundBookingController {

	@Autowired
	private CricketGroundBookingServiceImpl cricketGroundBookingService;
	
	@RequestMapping(value="/ground/booking/{id}",method=RequestMethod.GET)
	public CricketGroundBookingResponseMapper getGroundBookingById(@PathVariable int id){
		return cricketGroundBookingService.getGroundBookingById(id);
	}
	
	@RequestMapping(value="/ground/booking",method=RequestMethod.GET)
	public CricketGroundBookingResponseMapper getGroundBookingDetails(){
		return cricketGroundBookingService.getGroundBookingDetails();
	}
	 
	@RequestMapping(value="/ground/booking",method=RequestMethod.POST)
	public CricketGroundBookingResponseMapper createGroundBooking(@RequestBody CricketGroundBookingRequest request){
		return cricketGroundBookingService.createGroundBooking(request);
	}
	
	@RequestMapping(value="/ground/booking",method=RequestMethod.PUT)
	public CricketGroundBookingResponseMapper updateGroundBookingDetails(@RequestBody CricketGroundBookingRequest request){
		return cricketGroundBookingService.updateGroundBooking(request);
	}
	 
	@RequestMapping(value="/ground/booking",method=RequestMethod.DELETE)
	public CricketGroundBookingResponseMapper deleteGroundBooking(@RequestParam(value="id",defaultValue="0") String groundId){
		return cricketGroundBookingService.deleteGroundBooking(Integer.parseInt(groundId));
	}
}
