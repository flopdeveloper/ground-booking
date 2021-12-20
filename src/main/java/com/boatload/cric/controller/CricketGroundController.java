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

import com.boatload.cric.common.util.CricketUtilityHelper;
import com.boatload.cric.request.CricketGroundRequest;
import com.boatload.cric.response.CricketGroundResponseMapper;
import com.boatload.cric.service.CricketGroundServiceImpl;

/**
 * @author WIN10USER
 *
 */
@RestController
@RequestMapping("/cric")
public class CricketGroundController {

	@Autowired
	private CricketGroundServiceImpl cricketGroundService;
	
	@RequestMapping(value="/ground/{id}",method=RequestMethod.GET)
	public CricketGroundResponseMapper getGroundById(@PathVariable String id){
		return CricketUtilityHelper.isValidNumeric(id)?cricketGroundService.getGroundByIdAndName(Integer.parseInt(id),""):
			cricketGroundService.getGroundByIdAndName(0,id);
	}

	@RequestMapping(value="/ground",method=RequestMethod.GET)
	public CricketGroundResponseMapper getGroundDetails(){
		return cricketGroundService.getGroundDetails();
	}
	 
	@RequestMapping(value="/ground",method=RequestMethod.POST)
	public CricketGroundResponseMapper addGround(@RequestBody CricketGroundRequest request){
		return cricketGroundService.addGround(request);
	}
	
	@RequestMapping(value="/ground",method=RequestMethod.PUT)
	public CricketGroundResponseMapper updateGroundDetails(@RequestBody CricketGroundRequest request){
		return cricketGroundService.updateGround(request);
	}
	 
	@RequestMapping(value="/ground",method=RequestMethod.DELETE)
	public CricketGroundResponseMapper deleteGround(@RequestParam(value="id",defaultValue="0") String groundId){
		return cricketGroundService.deleteGround(Integer.parseInt(groundId));
	}
}
