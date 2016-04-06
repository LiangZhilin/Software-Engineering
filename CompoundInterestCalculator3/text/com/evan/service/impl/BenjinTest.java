package com.evan.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.evan.action.CalculateAction;

public class BenjinTest {

	@Test
	public void testCalculate() {
	//	System.out.println("测试");
		CalculateService cs = new CalculateService();
		double test = cs.calculateBenjin(2000000,0.03,10);
		System.out.println("本金计算测试结果"+test);
	}

}
