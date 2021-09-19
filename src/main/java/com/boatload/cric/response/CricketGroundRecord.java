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
public class CricketGroundRecord {

		List<CricketGroundResponse> cricketGroundRecords;

		public CricketGroundRecord() {
			this.cricketGroundRecords = new ArrayList<CricketGroundResponse>();
		}

		/**
		 * @return the cricketGroundRecords
		 */
		public List<CricketGroundResponse> getCricketGroundRecords() {
			return cricketGroundRecords;
		}

		/**
		 * @param cricketGroundRecords the cricketGroundRecords to set
		 */
		public void setCricketGroundRecords(List<CricketGroundResponse> cricketGroundRecords) {
			this.cricketGroundRecords = cricketGroundRecords;
		}
		
		public void add(CricketGroundResponse ground) {
			this.cricketGroundRecords.add(ground);
		}
			
}

