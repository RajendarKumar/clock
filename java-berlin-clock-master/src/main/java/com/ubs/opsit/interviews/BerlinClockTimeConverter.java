/**
 * 
 */
package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.model.BerlinClock;
import com.ubs.opsit.interviews.model.Time;
import com.ubs.opsit.interviews.validator.IValidtor;
import com.ubs.opsit.interviews.validator.TimeValidator;

/**
 * @author Rajendar Kumar
 *
 */
public class BerlinClockTimeConverter implements TimeConverter {

	private IParser<Time, String> timeParser;
	private IValidtor<Time> validtor;
	private IClockCreater<BerlinClock, Time> clockCreater;
	public BerlinClockTimeConverter() {
		timeParser = new TimeParser();
		validtor = new TimeValidator();
		clockCreater = new BerlinClockCreator();
	}
	
	/**
	 * <p>Method accepts the time in {@link String} form and convert it into Berlin clock form.<p>
	 * @param atime
	 * @return berlinclock 
	 */
	@Override
	public String convertTime(String aTime) {
		
		//Parse the string time in Time object
		Time time = timeParser.parser(aTime);
		//Validate the time 
		validtor.validate(time);
		//Creates BelinClock object
		BerlinClock clock = clockCreater.create(time);
		
		return clock.toString();
	}

}
