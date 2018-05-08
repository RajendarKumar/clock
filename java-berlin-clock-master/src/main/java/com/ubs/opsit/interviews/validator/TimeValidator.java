/**
 * 
 */
package com.ubs.opsit.interviews.validator;

import com.ubs.opsit.interviews.exception.InvalidTimeException;
import com.ubs.opsit.interviews.model.Time;

/**
 * @author Rajendar Kumar
 *
 */
public class TimeValidator implements IValidtor<Time> {

	@Override
	public void validate(Time time) {

		validateHour(time);

		validateMinute(time);

		validateSecond(time);

		if (time.getHr() >= 24 && (time.getMin() > 0 || time.getSs() > 0)) {
			throw new InvalidTimeException("Invalid time, " + Integer.toString(time.getSs()) + ":" + Integer.toString(time.getMin()) + ":" + Integer.toString(time.getSs()));
		}
	}

	/**
	 * @param time
	 */
	private void validateSecond(Time time) {
		if (time.getSs() < 0 || time.getSs() > 59) {
			throw new InvalidTimeException("Invalid second : " + Integer.toString(time.getSs()));
		}
	}

	/**
	 * @param time
	 */
	private void validateMinute(Time time) {
		if (time.getMin() < 0 || time.getMin() > 59) {
			throw new InvalidTimeException("Invalid minute : " + Integer.toString(time.getMin()));
		}
	}

	/**
	 * @param time
	 */
	private void validateHour(Time time) {
		if (time.getHr() < 0 || time.getHr() > 24) {
			throw new InvalidTimeException("Invalid hour : " + Integer.toString(time.getHr()));
		}
	}

}
