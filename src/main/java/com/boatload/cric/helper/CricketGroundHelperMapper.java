/**
 * 
 */
package com.boatload.cric.helper;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.boatload.cric.entity.CricketGround;
import com.boatload.cric.response.CricketGroundResponseMapper;

/**
 * @author WIN10USER
 *
 */
@Service
public class CricketGroundHelperMapper {

	public CricketGroundResponseMapper generateResponseByGroundList(List<CricketGround> responseList) {
		CricketGroundResponseMapper response = new CricketGroundResponseMapper(responseList);
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

	public CricketGroundResponseMapper generateResponseByGroundList(Optional<CricketGround> listCricketGround) {
		CricketGroundResponseMapper response = new CricketGroundResponseMapper(listCricketGround);
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}
}
