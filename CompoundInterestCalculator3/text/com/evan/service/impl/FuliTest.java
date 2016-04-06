package com.evan.service.impl;
import org.junit.Test;
public class FuliTest {

	@Test
	public void testCalculate() {
	//	System.out.println("²âÊÔ");
		CalculateService cs = new CalculateService();
		String test = cs.calculate(10000, 0.03, 10);
		System.out.println("¸´Àû²âÊÔ½á¹û"+test);
	}

}
