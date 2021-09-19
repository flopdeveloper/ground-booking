/**
 * 
 */
package com.boatload.cric.response;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WIN10USER
 *
 */
public class CricketGroundBookingRecord {

		List<CricketGroundBookingResponse> cricketGroundRecords;

		public CricketGroundBookingRecord() {
			this.cricketGroundRecords = new ArrayList<CricketGroundBookingResponse>();
		}

		/**
		 * @return the cricketGroundRecords
		 */
		public List<CricketGroundBookingResponse> getCricketGroundBookingRecords() {
			return cricketGroundRecords;
		}

		/**
		 * @param cricketGroundRecords the cricketGroundRecords to set
		 */
		public void setCricketGroundBookingRecords(List<CricketGroundBookingResponse> cricketGroundRecords) {
			this.cricketGroundRecords = cricketGroundRecords;
		}
		
		public void add(CricketGroundBookingResponse ground) {
			this.cricketGroundRecords.add(ground);
		}
			
}

