/**
 * 
 */
package com.ubs.opsit.interviews.model;

/**
 * @author Rajendar Kumar
 *
 */
public class Time {

	private Integer hr;
	private Integer min;
	private Integer ss;
	/**
	 * @param hr
	 * @param min
	 * @param ss
	 */
	public Time(Integer hr, Integer min, Integer ss) {
		super();
		this.hr = hr;
		this.min = min;
		this.ss = ss;
	}
	/**
	 * @return the hr
	 */
	public Integer getHr() {
		return hr;
	}
	/**
	 * @return the min
	 */
	public Integer getMin() {
		return min;
	}
	/**
	 * @return the ss
	 */
	public Integer getSs() {
		return ss;
	}
	
}
