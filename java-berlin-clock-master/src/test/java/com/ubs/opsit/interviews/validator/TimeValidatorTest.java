/**
 * 
 */
package com.ubs.opsit.interviews.validator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.exception.InvalidTimeException;
import com.ubs.opsit.interviews.model.Time;

/**
 * @author Rajendar Kumar
 *
 */
public class TimeValidatorTest {
	
	private IValidtor<Time> validate;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		validate = new TimeValidator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		validate = null;
	}

	/**
	 * Test method for {@link com.ubs.opsit.interviews.validator.TimeValidator#validate(com.ubs.opsit.interviews.model.Time)}.
	 */
	@Test(expected=InvalidTimeException.class)
	public void testInValidHr() {
		Time t = new Time(25, 0, 0);
		validate.validate(t);
	}
	
	/**
	 * Test method for {@link com.ubs.opsit.interviews.validator.TimeValidator#validate(com.ubs.opsit.interviews.model.Time)}.
	 */
	@Test(expected=InvalidTimeException.class)
	public void testInValidMin() {
		Time t = new Time(24, 90, 0);
		validate.validate(t);
	}
	
	/**
	 * Test method for {@link com.ubs.opsit.interviews.validator.TimeValidator#validate(com.ubs.opsit.interviews.model.Time)}.
	 */
	@Test(expected=InvalidTimeException.class)
	public void testInValidSs() {
		Time t = new Time(23, 30, -1);
		validate.validate(t);
	}
	
	/**
	 * Test method for {@link com.ubs.opsit.interviews.validator.TimeValidator#validate(com.ubs.opsit.interviews.model.Time)}.
	 */
	@Test(expected=InvalidTimeException.class)
	public void testInValidTime() {
		Time t = new Time(24, 30, 0);
		validate.validate(t);
	}
	
	/**
	 * Test method for {@link com.ubs.opsit.interviews.validator.TimeValidator#validate(com.ubs.opsit.interviews.model.Time)}.
	 */
	@Test
	public void testValidTime() {
		Time t = new Time(23, 30, 0);
		validate.validate(t);
	}

}
