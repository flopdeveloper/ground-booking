/**
 * 
 */
package com.boatload.cric.service;

import com.boatload.cric.request.CricketGroundRequest;
import com.boatload.cric.response.CricketGroundResponseMapper;

/**
 * @author WIN10USER
 *
 */
public interface CricketGroundService {
	  CricketGroundResponseMapper getGroundDetails();
	  CricketGroundResponseMapper addGround(CricketGroundRequest cricketGroundRequest);
	  CricketGroundResponseMapper updateGround(CricketGroundRequest cricketGroundRequest);
	  CricketGroundResponseMapper deleteGround(int groundId);
	  CricketGroundResponseMapper getGroundByIdAndName(int groundId,String groundName);

}
