package com.boatload.cric.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boatload.cric.entity.CricketGroundBooking;
import com.boatload.cric.helper.CricketGroundBookingHelperMapper;
import com.boatload.cric.repository.GroundBookingRepository;
import com.boatload.cric.response.CricketGroundBookingResponseMapper;

@Service
public class CricketGroundBookingServiceImpl implements CricketGroundBookingService{

	@Autowired
	private GroundBookingRepository groundBookingRepository;
	
	@Autowired
	private CricketGroundBookingHelperMapper cricketGroundHelperMapper;
	
	@Override
	public CricketGroundBookingResponseMapper getGroundBookingById(int groundId) {
		Optional<CricketGroundBooking> listCricketGround = null;
		if(groundId!=0) {
			listCricketGround = groundBookingRepository.findById(groundId);
		}
		CricketGroundBookingResponseMapper response = cricketGroundHelperMapper.generateResponseByGroundList(listCricketGround);
		return response;
	}
	
	@Override
	public CricketGroundBookingResponseMapper getGroundBookingDetails() {
		List<CricketGroundBooking> listCricketGround = null;
		listCricketGround = (List<CricketGroundBooking>) groundBookingRepository.findAll();
		CricketGroundBookingResponseMapper response = cricketGroundHelperMapper.generateResponseByGroundList(listCricketGround);
		return response;
	}

	@Override
	public CricketGroundBookingResponseMapper createGroundBooking(CricketGroundBooking cricketGroundBookingRequest) {
		groundBookingRepository.save(cricketGroundBookingRequest);
		CricketGroundBookingResponseMapper response = cricketGroundHelperMapper.generateResponse();
		return response;
	}

	@Override
	public CricketGroundBookingResponseMapper updateGroundBooking(CricketGroundBooking cricketGroundBookingRequest) {
		groundBookingRepository.save(cricketGroundBookingRequest);
		CricketGroundBookingResponseMapper response = cricketGroundHelperMapper.generateResponse();
		return response;
	}

	@Override
	public CricketGroundBookingResponseMapper deleteGroundBooking(int groundId) {
		groundBookingRepository.deleteById(groundId);
		CricketGroundBookingResponseMapper response = cricketGroundHelperMapper.generateResponse();
		return response;
	}

}
