/**
 * 
 */
package com.ubs.opsit.interviews.model;

import com.ubs.opsit.interviews.constants.Color;
import com.ubs.opsit.interviews.constants.LampStatus;

/**
 * @author Rajendar Kumar
 *
 */
public class Lamp {

	private Color color;
	private LampStatus status;
	/**
	 * 
	 */
	public Lamp(Color color, LampStatus status) {
		this.color = color;
		this.status = status;
	}
	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * @return the status
	 */
	public LampStatus getStatus() {
		return status;
	}
	
	       
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return LampStatus.ON == this.getStatus() ? this.getColor().getValue() : "O";
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(LampStatus status) {
		this.status = status;
	}
	
	
	
}
