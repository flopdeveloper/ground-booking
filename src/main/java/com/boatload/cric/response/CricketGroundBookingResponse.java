/**
 * 
 */
package com.boatload.cric.response;

/**
 * @author WIN10USER
 *
 */
public class CricketGroundBookingResponse {

	  private String id = "";
	  
	  private String slotFrom ="";
	  
	  private String slotTo ="";

	  private String userId ="";

	  private String updateTime ="";

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the slotFrom
	 */
	public String getSlotFrom() {
		return slotFrom;
	}

	/**
	 * @param slotFrom the slotFrom to set
	 */
	public void setSlotFrom(String slotFrom) {
		this.slotFrom = slotFrom;
	}

	/**
	 * @return the slotTo
	 */
	public String getSlotTo() {
		return slotTo;
	}

	/**
	 * @param slotTo the slotTo to set
	 */
	public void setSlotTo(String slotTo) {
		this.slotTo = slotTo;
	}

	/**
	 * @return the userIdd
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userIdd the userIdd to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
