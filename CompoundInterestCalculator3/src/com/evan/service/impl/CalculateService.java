package com.evan.service.impl;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.evan.dao.IRecordDAO;
import com.evan.dao.IVarietyDAO;
import com.evan.model.Record;
import com.evan.model.Variety;
import com.evan.service.ICalculateService;

public class CalculateService implements ICalculateService{
	private IRecordDAO recordDAO;
	private IVarietyDAO varietyDAO;

	public IVarietyDAO getVarietyDAO() {
		return varietyDAO;
	}

	public void setVarietyDAO(IVarietyDAO varietyDAO) {
		this.varietyDAO = varietyDAO;
	}

	public IRecordDAO getRecordDAO() {
		return recordDAO;
	}

	public void setRecordDAO(IRecordDAO recordDAO) {
		this.recordDAO = recordDAO;
	}

	@Override
	public String calculate(double deposit,double interest_rate,double nper) {
		if(calculateInput(deposit,interest_rate,nper)){
		double result=deposit*Math.pow((1+interest_rate), nper);
		DecimalFormat df = new DecimalFormat("0.00");//精确到小数点后两位(第三位小数四舍五入)
		return df.format(result);
		}
		return null;
	}

	public boolean calculateInput(double deposit, double interest_rate,
			double nper) {
		  if(deposit<0||interest_rate>1||interest_rate<0||nper<0) return false;	
				return true;				
	}

	@Override
	public double calculateBenjin(double result, double interest_rate, double nper) {
		double deposit = result/Math.pow((1+interest_rate),nper);
		return deposit;
	}
	
	public boolean calculBenjinInput(double result, double interest_rate, double nper) {
		  if(result<0||interest_rate>1||interest_rate<0||nper<0) return false;	
				return true;				
	}

	@Override
	public double calculateShichang(double result, double interest_rate,
			double deposit) {
		double nper = (Math.log((double)(result/deposit))/Math.log((double)(1+interest_rate)));
		//int nper = (int) ((int) Math.log((double)(result/deposit))/Math.log((double)(1+interest_rate)));
		return nper;
	}
	
	public boolean calculShichangInput(double result, double interest_rate,
			double deposit) {
		  if(result<0||interest_rate>1||interest_rate<0||deposit<0) return false;	
		  if(result<deposit) return false;
				return true;				
	}

	@Override
	public double calculateInterest_rate(double result, double nper,
			double deposit) {
		double lilv = Math.pow(result/deposit, 1.0/nper)-1;
		return lilv;
	}
	
	public boolean calculRateInput(double result, double nper,
			double deposit) {
		  if(result<0||nper<0||deposit<0) return false;	
		  if(result<deposit) return false;
				return true;				
	}

	@Override
	public List test() {
		
		return recordDAO.test();
		
	}
	
	public Variety getVariety(int id1){
		List<Record> records = recordDAO.test();
//		for(int i = 0;i<records.size();i++){
//			int id1 =records.get(i).getType_id();
//			System.out.println("投资类型为："+records.get(i).getType_id());
			Variety variety = varietyDAO.getVariety(id1);
//			if(variety!=null){varieties.add(variety);}
//		}
		return variety;
	}


	@Override
	public void addRecord(double deposit, double interest_rate, int investent_year,int investent_type) {
		recordDAO.addRecord(deposit, interest_rate,investent_year,investent_type);
		System.out.println("service中"+interest_rate);
	}

	@Override
	public void delRecord(int record_id) {
		recordDAO.delRecord(record_id);
		
	}

}
