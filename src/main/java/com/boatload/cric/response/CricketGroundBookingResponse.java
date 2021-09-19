/**
 * 
 */
package com.boatload.cric.response;

/**
 * @author WIN10USER
 *
 */
public class CricketGroundBookingResponse {

	  private int id = 0;
	  
	  private int	groundid = 0;

	  private String slotfrom ="";
	  
	  private String slotto ="";

	  private String userid ="";

	  private String updateTime ="";

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the groundid
	 */
	public int getGroundid() {
		return groundid;
	}

	/**
	 * @param groundid the groundid to set
	 */
	public void setGroundid(int groundid) {
		this.groundid = groundid;
	}

	/**
	 * @return the slotfrom
	 */
	public String getSlotfrom() {
		return slotfrom;
	}

	/**
	 * @param slotfrom the slotfrom to set
	 */
	public void setSlotfrom(String slotfrom) {
		this.slotfrom = slotfrom;
	}

	/**
	 * @return the slotto
	 */
	public String getSlotto() {
		return slotto;
	}

	/**
	 * @param slotto the slotto to set
	 */
	public void setSlotto(String slotto) {
		this.slotto = slotto;
	}

	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
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
