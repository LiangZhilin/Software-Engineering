package com.evan.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.evan.action.CalculateAction;

public class RateTest {

	@Test
	public void testCalculate() {
	//	System.out.println("测试");
		CalculateService cs = new CalculateService();
		double test = cs.calculateInterest_rate(2000000, 20,1000000);
		System.out.println("利率计算测试结果"+test);
	}

}
