package com.evan.service;

import java.util.List;

import com.evan.model.Variety;

public interface ICalculateService {
    public String calculate(double deposit, double interest_rate, double nper);

	public double calculateBenjin(double result, double interest_rate, double nper);

	public double calculateShichang(double result, double interest_rate,double deposit);
	public double calculateInterest_rate(double result, double nper,double deposit);

	public List test();
	public Variety getVariety(int id1);

	public void addRecord(double deposit, double interest_rate, int investent_year, int investent_type);

	public void delRecord(int record_id);
}
