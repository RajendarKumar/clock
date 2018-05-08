/**
 * 
 */
package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.constants.Constant;
import com.ubs.opsit.interviews.model.Time;

/**
 * @author Rajendar Kumar
 *
 */
public class TimeParser implements IParser<Time, String> {

	/**
	 * 
	 */
	public TimeParser() {
	}

	@Override
	public Time parser(String timeString) {
		//validate given time in define format
		timeString.matches(Constant.TIME_FORMAT);
		String clockTime[] = timeString.split(Constant.COLON);
		return new Time(Integer.parseInt(clockTime[0]), Integer.parseInt(clockTime[1]), Integer.parseInt(clockTime[2]));
	}

}
