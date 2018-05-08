/**
 * 
 */
package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.constants.Constant;
import com.ubs.opsit.interviews.constants.LampStatus;
import com.ubs.opsit.interviews.model.BerlinClock;
import com.ubs.opsit.interviews.model.Lamp;
import com.ubs.opsit.interviews.model.Time;

/**
 * @author Rajendar Kumar
 *
 */
public class BerlinClockCreator implements IClockCreater<BerlinClock, Time> {

	/**
	 * <p>Method will accept {@link Time} object and creates the {@link BerlinClock}.<p>
	 * 
	 * @param time
	 * 
	 * @return berlinClock 
	 */
	@Override
	public BerlinClock create(Time time) {
		BerlinClock berlinClock = new BerlinClock();
		//Get the number of five hours lamps 
		int hrsOnLamps = time.getHr() / Constant.FIVE;
		
		//Get the number of one hour lamps
		int hrOnLamps = (time.getHr() % Constant.FIVE);

		//Get the number of five minutes lamps
		int minsOnLamps = time.getMin() / Constant.FIVE;
		
		//Get the number of one minute lamps
		int minOnLamps = (time.getMin() % Constant.FIVE);

		onHrsLampRow(berlinClock, hrsOnLamps);
		onHrLampRow(berlinClock, hrOnLamps);
		
		onMinsLampRow(berlinClock, minsOnLamps);
		onMinLampRow(berlinClock, minOnLamps);
		
		onSsLamp(berlinClock, time.getSs());
		
		return berlinClock;
	}

	/**
	 * <p>Accepts the {@link BerlinClock} and number of hours lamp those need to be switched on.<p>
	 * <p>Method set the lamp status on for given number of lamps.<p> 
	 * 
	 * @param berlinClock
	 * @param hrsOnLamps
	 */
	private void onHrsLampRow(BerlinClock berlinClock, int hrsOnLamps) {
		Lamp lamps[] = berlinClock.getHrsRow();
		for (int i = 0; i < hrsOnLamps; i++) {
			lamps[i].setStatus(LampStatus.ON);
		}
	}

	/**
	 * <p>Accepts the {@link BerlinClock} and number of hour lamp those need to be switched on.<p>
	 * <p>Method set the lamp status on for given number of lamps.<p> 
	 * @param berlinClock
	 * @param hrOnLamps
	 */
	private void onHrLampRow(BerlinClock berlinClock, int hrOnLamps) {
		Lamp lamps[] = berlinClock.getHrRow();
		for (int i = 0; i < hrOnLamps; i++) {
			lamps[i].setStatus(LampStatus.ON);
		}
	}

	/**
	 * <p>Accepts the {@link BerlinClock} and number of minutes lamp those need to be switched on.<p>
	 * <p>Method set the lamp status on for given number of lamps.<p> 
	 * @param berlinClock
	 * @param minsOnLamps
	 */
	private void onMinsLampRow(BerlinClock berlinClock, int minsOnLamps) {
		Lamp lamps[] = berlinClock.getMinsRow();
		for (int i = 0; i < minsOnLamps; i++) {
			lamps[i].setStatus(LampStatus.ON);
		}
	}

	/**
	 * <p>Accepts the {@link BerlinClock} and number of minute lamp those need to be switched on.<p>
	 * <p>Method set the lamp status on for given number of lamps.<p> 
	 * @param berlinClock
	 * @param minOnLamps
	 */
	private void onMinLampRow(BerlinClock berlinClock, int minOnLamps) {
		Lamp lamps[] = berlinClock.getMinRow();
		for (int i = 0; i < minOnLamps; i++) {
			lamps[i].setStatus(LampStatus.ON);
		}
	}
	/**
	 * <p>Accepts the {@link BerlinClock} and number of seconds.<p>
	 * <p>Method set the lamp status on for even number of seconds.<p> 
	 * @param berlinClock
	 * @param ss
	 */
	private void onSsLamp(BerlinClock berlinClock, int ss) {
		if(ss % 2 == 0) {
			berlinClock.getLampSs().setStatus(LampStatus.ON);
		}
	}

}
