/**
 * 
 */
package com.boatload.cric.common.util;

import java.util.regex.Pattern;

/**
 * @author WIN10USER
 *
 */
public class CricketUtilityHelper {
	
	public static boolean isValidNumeric(String number) {
		Pattern pattern = Pattern.compile("^[0-9]");
		return pattern.matcher(number).matches();
	}
	

}
