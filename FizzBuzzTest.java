package com.accolite.mini_au;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {

	FizzBuzz fb;
	static Logger logger;
	@Before
	public void setUp() throws Exception
	{
		fb=new FizzBuzz();
		logger = Logger.getLogger(FizzBuzz.class);
		BasicConfigurator.configure();
	}
	@Test
	public void testProduceOutput() {
		
		logger.info("testing method produce output");
		String out=fb.produceOutput(3);
		assertEquals("Fizz",out);
	}
	@Test
	public void testTakeInputAndProduceOutput()
	{
		logger.info("testing method takeInputAndProduceOutput");
		String out=fb.takeInputAndProduceOutput(4);
		assertNull(out);
	}
	@AfterClass
	public static void afterClass()
	{
		logger.info("After Class");
	}

}
