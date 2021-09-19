package com.boatload.cric.response;

import java.util.Optional;

import com.boatload.cric.entity.CricketGround;

public class CricketGroundResponseMapper {
	
	private CricketGroundRecord data;
	
	private String code;
	
	private String message;
	
	public CricketGroundResponseMapper() {
		this.data = new CricketGroundRecord();
	}

	public CricketGroundResponseMapper(Iterable<CricketGround> cricketGroundList) {
		
		this.data = new CricketGroundRecord();
		
		if(cricketGroundList!=null) {
			for(CricketGround dataResponse:cricketGroundList) {
				CricketGroundResponse response = new CricketGroundResponse();
				response.setId(dataResponse.getId());
				response.setName(dataResponse.getName());
				response.setTitle(dataResponse.getTitle());
				response.setAddr1(dataResponse.getAddr1());
				response.setCity(dataResponse.getCity());
				response.setState(dataResponse.getState());
				response.setCounty(dataResponse.getCounty());
				response.setCountry(dataResponse.getCountry());
				response.setSessionFrom(dataResponse.getSessionfrom());
				response.setSessionTo(dataResponse.getSessionto());
				response.setUpdateBy(dataResponse.getUpdatedby());
				response.setUpdateTime(dataResponse.getUpdatetime());
				data.add(response);
			}
		}
	}

	public CricketGroundResponseMapper(Optional<CricketGround> listCricketGround) {
this.data = new CricketGroundRecord();
		
		if(listCricketGround!=null) {
				CricketGroundResponse response = new CricketGroundResponse();
				response.setId(listCricketGround.get().getId());
				response.setName(listCricketGround.get().getName());
				response.setTitle(listCricketGround.get().getTitle());
				response.setAddr1(listCricketGround.get().getAddr1());
				response.setCity(listCricketGround.get().getCity());
				response.setState(listCricketGround.get().getState());
				response.setCounty(listCricketGround.get().getCounty());
				response.setCountry(listCricketGround.get().getCountry());
				response.setSessionFrom(listCricketGround.get().getSessionfrom());
				response.setSessionTo(listCricketGround.get().getSessionto());
				response.setUpdateBy(listCricketGround.get().getUpdatedby());
				response.setUpdateTime(listCricketGround.get().getUpdatetime());
				data.add(response);
		}
	}

	/**
	 * @return the data
	 */
	public CricketGroundRecord getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(CricketGroundRecord data) {
		this.data = data;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
