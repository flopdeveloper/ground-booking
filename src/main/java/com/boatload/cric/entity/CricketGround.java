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
@Table(name="GROUND")
@DynamicInsert
@DynamicUpdate
public class CricketGround implements Serializable{
		  private static final long serialVersionUID = -7496362624106858939L;

		  @Id
		  @GeneratedValue(strategy = GenerationType.SEQUENCE)
		  @Column(name="ID")
		  private int id;

		  private String name;

		  private String title;
		  
		  private String addr1;

		  private String addr2;
		  
		  private String city;

		  private String county;
		  
		  private String state;

		  private String country;
		  
		  private String sessionfrom;
		  
		  private String sessionto;
		  
		  private String updatedby;
		  
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
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the title
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * @param title the title to set
		 */
		public void setTitle(String title) {
			this.title = title;
		}

		/**
		 * @return the addr1
		 */
		public String getAddr1() {
			return addr1;
		}

		/**
		 * @param addr1 the addr1 to set
		 */
		public void setAddr1(String addr1) {
			this.addr1 = addr1;
		}

		/**
		 * @return the addr2
		 */
		public String getAddr2() {
			return addr2;
		}

		/**
		 * @param addr2 the addr2 to set
		 */
		public void setAddr2(String addr2) {
			this.addr2 = addr2;
		}

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		/**
		 * @return the county
		 */
		public String getCounty() {
			return county;
		}

		/**
		 * @param county the county to set
		 */
		public void setCounty(String county) {
			this.county = county;
		}

		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}

		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}

		/**
		 * @return the country
		 */
		public String getCountry() {
			return country;
		}

		/**
		 * @param country the country to set
		 */
		public void setCountry(String country) {
			this.country = country;
		}

		/**
		 * @return the sessionfrom
		 */
		public String getSessionfrom() {
			return sessionfrom;
		}

		/**
		 * @param sessionfrom the sessionfrom to set
		 */
		public void setSessionfrom(String sessionfrom) {
			this.sessionfrom = sessionfrom;
		}

		/**
		 * @return the sessionto
		 */
		public String getSessionto() {
			return sessionto;
		}

		/**
		 * @param sessionto the sessionto to set
		 */
		public void setSessionto(String sessionto) {
			this.sessionto = sessionto;
		}

		/**
		 * @return the updatedby
		 */
		public String getUpdatedby() {
			return updatedby;
		}

		/**
		 * @param updatedby the updatedby to set
		 */
		public void setUpdatedby(String updatedby) {
			this.updatedby = updatedby;
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

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
}
