package com.evan.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.evan.action.CalculateAction;

public class ShichangTest {

	@Test
	public void testCalculate() {
	//	System.out.println("测试");
		CalculateService cs = new CalculateService();
		double test = cs.calculateShichang(2000000, 0.03, 1000000);
		System.out.println("投资时长计算测试结果"+test);
	}

}
