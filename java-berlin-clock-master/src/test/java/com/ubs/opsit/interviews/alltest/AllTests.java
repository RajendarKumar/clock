package com.ubs.opsit.interviews.alltest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ubs.opsit.interviews.TimeParserTest;
import com.ubs.opsit.interviews.validator.TimeValidatorTest;

@RunWith(Suite.class)
@SuiteClasses({ TimeValidatorTest.class,  TimeParserTest.class})
public class AllTests {

}
