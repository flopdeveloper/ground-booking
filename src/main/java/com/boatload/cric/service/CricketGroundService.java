/**
 * 
 */
package com.boatload.cric.service;

import com.boatload.cric.entity.CricketGround;
import com.boatload.cric.response.CricketGroundResponseMapper;

/**
 * @author WIN10USER
 *
 */
public interface CricketGroundService {
	  CricketGroundResponseMapper getGroundDetails();
	  CricketGroundResponseMapper createGround(CricketGround cricketGroundRequest);
	  CricketGroundResponseMapper updateGround(CricketGround cricketGroundRequest);
	  CricketGroundResponseMapper deleteGround(int groundId);
	CricketGroundResponseMapper getGroundById(int groundId);

}
