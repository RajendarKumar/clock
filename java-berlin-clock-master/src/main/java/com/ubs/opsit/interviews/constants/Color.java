/**
 * 
 */
package com.ubs.opsit.interviews.constants;

/**
 * @author Rajendar Kumar
 *
 */
public enum Color {

	YELLO("Y"), 
	RED("R");
	
	private String value;
	
	Color(String value){
		this.value=value;
	}
	
	public String getValue() {
		return this.value;
	}
}
