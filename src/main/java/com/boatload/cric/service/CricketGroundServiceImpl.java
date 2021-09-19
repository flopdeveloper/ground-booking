package com.boatload.cric.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boatload.cric.entity.CricketGround;
import com.boatload.cric.helper.CricketGroundHelperMapper;
import com.boatload.cric.repository.GroundRepository;
import com.boatload.cric.response.CricketGroundResponseMapper;

@Service
public class CricketGroundServiceImpl implements CricketGroundService{

	@Autowired
	private GroundRepository groundRepository;
	
	@Autowired
	private CricketGroundHelperMapper cricketGroundHelperMapper;
	
	@Override
	public CricketGroundResponseMapper getGroundById(int groundId) {
		Optional<CricketGround> listCricketGround = null;
		if(groundId!=0) {
			listCricketGround = groundRepository.findById(groundId);
		}
		CricketGroundResponseMapper response = cricketGroundHelperMapper.generateResponseByGroundList(listCricketGround);
		return response;
	}
	
	@Override
	public CricketGroundResponseMapper getGroundDetails() {
		List<CricketGround> listCricketGround = null;
		listCricketGround = (List<CricketGround>) groundRepository.findAll();
		CricketGroundResponseMapper response = cricketGroundHelperMapper.generateResponseByGroundList(listCricketGround);
		return response;
	}

	@Override
	public CricketGroundResponseMapper createGround(CricketGround cricketGroundRequest) {
		groundRepository.save(cricketGroundRequest);
		CricketGroundResponseMapper response = cricketGroundHelperMapper.generateResponse();
		return response;
	}

	@Override
	public CricketGroundResponseMapper updateGround(CricketGround cricketGroundRequest) {
		groundRepository.save(cricketGroundRequest);
		CricketGroundResponseMapper response = cricketGroundHelperMapper.generateResponse();
		return response;
	}

	@Override
	public CricketGroundResponseMapper deleteGround(int groundId) {
		groundRepository.deleteById(groundId);
		CricketGroundResponseMapper response = cricketGroundHelperMapper.generateResponse();
		return response;
	}

}
