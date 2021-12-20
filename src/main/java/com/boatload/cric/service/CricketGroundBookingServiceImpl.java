package com.boatload.cric.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boatload.cric.entity.CricketGroundBooking;
import com.boatload.cric.helper.CricketGroundBookingHelperMapper;
import com.boatload.cric.repository.GroundBookingRepository;
import com.boatload.cric.request.CricketGroundBookingRequest;
import com.boatload.cric.response.CricketGroundBookingResponseMapper;

@Service
public class CricketGroundBookingServiceImpl implements CricketGroundBookingService{

	@Autowired
	private GroundBookingRepository groundBookingRepository;
	
	@Autowired
	private CricketGroundBookingHelperMapper cricketGroundBookingHelperMapper;
	
	@Override
	public CricketGroundBookingResponseMapper getGroundBookingById(int groundId) {
		Optional<CricketGroundBooking> listCricketGround = null;
		if(groundId!=0) {
			listCricketGround = groundBookingRepository.findById(groundId);
		}
		CricketGroundBookingResponseMapper response = cricketGroundBookingHelperMapper.generateResponseByGroundBookingList(listCricketGround);
		return response;
	}
	
	@Override
	public CricketGroundBookingResponseMapper getGroundBookingDetails() {
		List<CricketGroundBooking> listCricketGround = null;
		listCricketGround = (List<CricketGroundBooking>) groundBookingRepository.findAll();
		CricketGroundBookingResponseMapper response = cricketGroundBookingHelperMapper.generateResponseByGroundBookingList(listCricketGround);
		return response;
	}

	@Override
	public CricketGroundBookingResponseMapper createGroundBooking(CricketGroundBookingRequest cricketGroundBookingRequest) {
		cricketGroundBookingHelperMapper.validateBookingForUpdate(cricketGroundBookingRequest);
		CricketGroundBooking cricketGroundBooking = new CricketGroundBooking();
		cricketGroundBooking.setGroundid(Integer.parseInt(cricketGroundBookingRequest.getGroundId()));
		cricketGroundBooking.setSlotfrom(cricketGroundBookingRequest.getSlotFrom());
		cricketGroundBooking.setSlotto(cricketGroundBookingRequest.getSlotTo());
		cricketGroundBooking.setUserid(cricketGroundBookingRequest.getUserId());
		cricketGroundBooking.setUpdatetime(cricketGroundBookingRequest.getUpdateTime());
		groundBookingRepository.save(cricketGroundBooking);
		CricketGroundBookingResponseMapper response = cricketGroundBookingHelperMapper.generateResponse();
		return response;
	}

	@Override
	public CricketGroundBookingResponseMapper updateGroundBooking(CricketGroundBookingRequest cricketGroundBookingRequest) {
		CricketGroundBooking cricketGroundBooking = new CricketGroundBooking();
		cricketGroundBooking.setGroundid(Integer.parseInt(cricketGroundBookingRequest.getGroundId()));
		cricketGroundBooking.setSlotfrom(cricketGroundBookingRequest.getSlotFrom());
		cricketGroundBooking.setSlotto(cricketGroundBookingRequest.getSlotTo());
		cricketGroundBooking.setUserid(cricketGroundBookingRequest.getUserId());
		cricketGroundBooking.setUpdatetime(cricketGroundBookingRequest.getUpdateTime());
		groundBookingRepository.save(cricketGroundBooking);
		CricketGroundBookingResponseMapper response = cricketGroundBookingHelperMapper.generateResponse();
		return response;
	}

	@Override
	public CricketGroundBookingResponseMapper deleteGroundBooking(int groundId) {
		groundBookingRepository.deleteById(groundId);
		CricketGroundBookingResponseMapper response = cricketGroundBookingHelperMapper.generateResponse();
		return response;
	}

}
