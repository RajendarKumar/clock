/**
 * 
 */
package com.ubs.opsit.interviews;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.model.Time;

/**
 * @author Rajendar Kumar
 *
 */
public class TimeParserTest {

	private IParser<Time, String> parser; 
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		parser = new TimeParser();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.ubs.opsit.interviews.TimeParser#parser(java.lang.String)}.
	 */
	@Test(expected=NumberFormatException.class)
	public void testParserInvalidnumber() {
		parser.parser("");
	}

	/**
	 * Test method for {@link com.ubs.opsit.interviews.TimeParser#parser(java.lang.String)}.
	 */
	@Test(expected=NumberFormatException.class)
	public void testParserTimeAsChars() {
		parser.parser("a:b:c");
	}
	

	/**
	 * Test method for {@link com.ubs.opsit.interviews.TimeParser#parser(java.lang.String)}.
	 */
	@Test
	public void testParserValidTime() {
		Time t =parser.parser("23:00:01");
		Assert.assertTrue(t instanceof Time);
	}
	
	/**
	 * Test method for {@link com.ubs.opsit.interviews.TimeParser#parser(java.lang.String)}.
	 */
	@Test
	public void testParserHrs() {
		Time t =parser.parser("23:00:01");
		Assert.assertTrue(23 == t.getHr());
	}
	
	/**
	 * Test method for {@link com.ubs.opsit.interviews.TimeParser#parser(java.lang.String)}.
	 */
	@Test
	public void testParserMins() {
		Time t =parser.parser("23:00:01");
		Assert.assertTrue(0 == t.getMin());
	}
	
	/**
	 * Test method for {@link com.ubs.opsit.interviews.TimeParser#parser(java.lang.String)}.
	 */
	@Test
	public void testParserSs() {
		Time t =parser.parser("23:00:01");
		Assert.assertTrue(1 == t.getSs());
	}
}
