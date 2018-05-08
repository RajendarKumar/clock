/**
 * 
 */
package com.ubs.opsit.interviews.constants;

/**
 * @author Rajendar Kumar
 *
 */
public enum LampStatus {

	ON("O"),
	OFF("F");
	
	String value;
	
	LampStatus(String value){
		this.value = value;
	}
}
