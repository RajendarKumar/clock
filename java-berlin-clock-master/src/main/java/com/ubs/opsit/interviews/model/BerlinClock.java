/**
 * 
 */
package com.ubs.opsit.interviews.model;

import java.util.Arrays;

import com.ubs.opsit.interviews.constants.Color;
import com.ubs.opsit.interviews.constants.LampStatus;

/**
 * @author Rajendar Kumar
 *
 */
public class BerlinClock {

	private final static int hrsLamp = 4;
	
	private final static int hrLamp = 4;
	
	private final static int minsLamp = 11;
	
	private final static int minLamp = 4;
	
	private Lamp lampSs;

	private Lamp hrsRow[];

	private Lamp hrRow[];

	private Lamp minsRow[];

	private Lamp minRow[];
	
	public BerlinClock() {
		this(hrsLamp, hrLamp, minsLamp, minLamp);
	}

	public BerlinClock(int hrsLamp, int hrLamp, int minsLamp, int minLamp) {

		hrsRow = new Lamp[hrsLamp];

		hrRow = new Lamp[hrLamp];

		minsRow = new Lamp[minsLamp];

		minRow = new Lamp[minLamp];

		for (int i = 0; i < hrsLamp; i++) {
			hrsRow[i] = new Lamp(Color.RED, LampStatus.OFF);
		}

		for (int i = 0; i < hrLamp; i++) {
			hrRow[i] = new Lamp(Color.RED, LampStatus.OFF);
		}

		for (int i = 0; i < minsLamp; i++) {
			minsRow[i] = new Lamp(Color.YELLO, LampStatus.OFF);
		}
		minsRow[2] = new Lamp(Color.RED, LampStatus.OFF);
		minsRow[5] = new Lamp(Color.RED, LampStatus.OFF);
		minsRow[8] = new Lamp(Color.RED, LampStatus.OFF);
		for (int i = 0; i < minLamp; i++) {
			minRow[i] = new Lamp(Color.YELLO, LampStatus.OFF);
		}
		
		lampSs = new Lamp(Color.YELLO, LampStatus.OFF);
	}

	/**
	 * @return the lampSs
	 */
	public Lamp getLampSs() {
		return lampSs;
	}

	/**
	 * @return the hrsRow
	 */
	public Lamp[] getHrsRow() {
		return hrsRow;
	}

	/**
	 * @return the hrRow
	 */
	public Lamp[] getHrRow() {
		return hrRow;
	}

	/**
	 * @return the minsRow
	 */
	public Lamp[] getMinsRow() {
		return minsRow;
	}

	/**
	 * @return the minRow
	 */
	public Lamp[] getMinRow() {
		return minRow;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return lampSs + "\r\n"
				+ arrayToString(Arrays.toString(hrsRow)) + "\r\n"
				+ arrayToString(Arrays.toString(hrRow)) + "\r\n"
				+ arrayToString(Arrays.toString(minsRow)) + "\r\n"
				+ arrayToString(Arrays.toString(minRow)) ;
	}
	
	private String arrayToString(String value) {
		return value.replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
	}
	
}
