/**
 * 
 */
package com.boatload.cric.entity;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @author WIN10USER
 *
 */
@Entity
@Table(name="BOOKING")
@DynamicInsert
@DynamicUpdate
public class CricketGroundBooking implements Serializable{
		  private static final long serialVersionUID = -7496362624106858939L;

		  @Id
		  @GeneratedValue(strategy = GenerationType.SEQUENCE)
		  @Column(name="ID")
		  private int id;
		  
		  private int groundid;

		  private String slotfrom;
		  
		  private String slotto;

		  private String userid;
		  
		  private String updatetime;

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
		 * @return the updatetime
		 */
		public String getUpdatetime() {
			return updatetime;
		}

		/**
		 * @param updatetime the updatetime to set
		 */
		public void setUpdatetime(String updatetime) {
			this.updatetime = updatetime;
		}
}
