package com.example.SpringTesting;

import com.example.SpringTesting.demo.DemoUtils;
import static  org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DemoUtilsTest {

	@Test
	public void testEquals () {

		DemoUtils demoUtils = new DemoUtils();

		assertEquals(6,demoUtils.add(2,4), "2+4 must be 6");
		assertNotEquals(8,demoUtils.add(1,9), "2+4 must be 6");
	}

	@Test
	public void nullAndNotNullTest () {
		DemoUtils demoUtils = new DemoUtils();
		String str1 = null;
		String str2 = "helloworld";
		assertNull(demoUtils.checkNull(str1),"Object should be null");
		assertNotNull(demoUtils.checkNull(str2),"Object should not be null");
	}


}
