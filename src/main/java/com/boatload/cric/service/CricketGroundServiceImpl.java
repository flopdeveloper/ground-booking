package com.boatload.cric.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boatload.cric.entity.CricketGround;
import com.boatload.cric.helper.CricketGroundHelperMapper;
import com.boatload.cric.repository.GroundRepository;
import com.boatload.cric.request.CricketGroundRequest;
import com.boatload.cric.response.CricketGroundResponseMapper;

@Service
public class CricketGroundServiceImpl implements CricketGroundService{

	@Autowired
	private GroundRepository groundRepository;
	
	@Autowired
	private CricketGroundHelperMapper cricketGroundHelperMapper;
	
	@Override
	public CricketGroundResponseMapper getGroundByIdAndName(int groundId,String groundName) {
		Optional<CricketGround> listCricketGround = null;
		if(groundId!=0) {
			listCricketGround = groundRepository.findById(groundId);
		}
		
		if(!groundName.isEmpty()) {
			listCricketGround = groundRepository.findByName(groundName);
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
	public CricketGroundResponseMapper addGround(CricketGroundRequest cricketGroundRequest) {
		
		cricketGroundHelperMapper.validateGroundForAdd(cricketGroundRequest);
		CricketGround request =new CricketGround();
		request.setName(cricketGroundRequest.getName());
		request.setTitle(cricketGroundRequest.getTitle());
		request.setAddr1(cricketGroundRequest.getAddr1());
		request.setCity(cricketGroundRequest.getCity());
		request.setState(cricketGroundRequest.getState());
		request.setCounty(cricketGroundRequest.getCounty());
		request.setCountry(cricketGroundRequest.getCountry());
		request.setSessionfrom(cricketGroundRequest.getSessionFrom());
		request.setSessionto(cricketGroundRequest.getSessionTo());
		request.setUpdatedby(cricketGroundRequest.getUpdatedBy());
		request.setUpdatetime(cricketGroundRequest.getUpdateTime());
		groundRepository.save(request);
		CricketGroundResponseMapper response = cricketGroundHelperMapper.generateResponse();
		return response;
	}

	@Override
	public CricketGroundResponseMapper updateGround(CricketGroundRequest cricketGroundRequest) {
		
		cricketGroundHelperMapper.validateGroundForUpdate(cricketGroundRequest);
		CricketGround request =new CricketGround();
		request.setName(cricketGroundRequest.getName());
		request.setTitle(cricketGroundRequest.getTitle());
		request.setAddr1(cricketGroundRequest.getAddr1());
		request.setCity(cricketGroundRequest.getCity());
		request.setState(cricketGroundRequest.getState());
		request.setCounty(cricketGroundRequest.getCounty());
		request.setCountry(cricketGroundRequest.getCountry());
		request.setSessionfrom(cricketGroundRequest.getSessionFrom());
		request.setSessionto(cricketGroundRequest.getSessionTo());
		request.setUpdatedby(cricketGroundRequest.getUpdatedBy());
		request.setUpdatetime(cricketGroundRequest.getUpdateTime());
		groundRepository.save(request);
		CricketGroundResponseMapper response = cricketGroundHelperMapper.generateResponse();
		return response;
	}

	@Override
	public CricketGroundResponseMapper deleteGround(int groundId) {
		//cricketGroundHelperMapper.validateGroundForDelete();
		groundRepository.deleteById(groundId);
		CricketGroundResponseMapper response = cricketGroundHelperMapper.generateResponse();
		return response;
	}

}
