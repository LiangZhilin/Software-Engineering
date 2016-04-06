package com.evan.dao;

import java.util.List;

public interface IRecordDAO {
	public List test();
	void addRecord(double deposit, double interest_rate, int investent_year, int investent_type);
	public void delRecord(int record_id);
}
