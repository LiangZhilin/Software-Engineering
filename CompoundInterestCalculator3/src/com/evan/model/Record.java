package com.evan.model;

public class Record {
	public Record(){
		
	}
    private int id;
    private int type_id;
    private int investent_year;
    private double investent_rate;
    private double investent_deposit;
    private double nowValue;
	public double getNowValue() {
		return nowValue;
	}
	public void setNowValue(double nowValue) {
		this.nowValue = nowValue;
	}
	public double getInvestent_deposit() {
		return investent_deposit;
	}
	public void setInvestent_deposit(double investent_deposit) {
		this.investent_deposit = investent_deposit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public int getInvestent_year() {
		return investent_year;
	}
	public void setInvestent_year(int investent_year) {
		this.investent_year = investent_year;
	}
	public double getInvestent_rate() {
		return investent_rate;
	}
	public void setInvestent_rate(double investent_rate) {
		this.investent_rate = investent_rate;
	}
	
}
