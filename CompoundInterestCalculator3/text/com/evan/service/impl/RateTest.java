package com.evan.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.evan.action.CalculateAction;

public class RateTest {

	@Test
	public void testCalculate() {
	//	System.out.println("����");
		CalculateService cs = new CalculateService();
		double test = cs.calculateInterest_rate(2000000, 20,1000000);
		System.out.println("���ʼ�����Խ��"+test);
	}

}
