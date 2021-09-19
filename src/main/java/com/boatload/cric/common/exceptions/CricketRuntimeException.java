/**
 * 
 */
package com.boatload.cric.common.exceptions;

/**
 * @author WIN10USER
 *
 */
public class CricketRuntimeException extends RuntimeException{
	
	private final String referenceId;
	
	private static final long serialVersionID = 1L;
	
	
	public CricketRuntimeException() {
		referenceId ="";
	}
	
	public CricketRuntimeException(String error,String referenceId) {
		super(error);
		this.referenceId = referenceId;
	}
	
	public String referenceId() {
		return referenceId;
	}
}
