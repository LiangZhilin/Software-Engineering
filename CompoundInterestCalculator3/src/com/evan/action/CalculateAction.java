package com.evan.action;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.evan.dao.impl.RecordDAO;
import com.evan.model.Record;
import com.evan.model.Variety;
import com.evan.service.ICalculateService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CalculateAction extends ActionSupport{
	private ICalculateService calculateService;
	public ICalculateService getCalculateService() {
		return calculateService;
	}
	public void setCalculateService(ICalculateService calculateService) {
		this.calculateService = calculateService;
	}
	private double deposit;
	private double interest_rate;
	private double nper;
	private double result;
	private int optionsRadios;
	
	private double loan;
	private double monthRefund;
	private int thisYear = 1997;
	private int investent_year;
	private int investent_type;
	private int record_id;
	
	
	public int getRecord_id() {
		return record_id;
	}
	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}
	public int getInvestent_type() {
		return investent_type;
	}
	public void setInvestent_type(int investent_type) {
		this.investent_type = investent_type;
	}
	public int getInvestent_year() {
		return investent_year;
	}
	public void setInvestent_year(int investent_year) {
		this.investent_year = investent_year;
	}
	public int getThisYear() {
		return thisYear;
	}
	public void setThisYear(int thisYear) {
		this.thisYear = thisYear;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public int getOptionsRadios() {
		return optionsRadios;
	}
	public double getLoan() {
		return loan;
	}
	public void setLoan(double loan) {
		this.loan = loan;
	}
	public double getMonthRefund() {
		return monthRefund;
	}
	public void setMonthRefund(double monthRefund) {
		this.monthRefund = monthRefund;
	}
	public void setOptionsRadios(int optionsRadios) {
		this.optionsRadios = optionsRadios;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	
	public double getNper() {
		return nper;
	}
	public double getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}
	public void setNper(double nper) {
		this.nper = nper;
	}
	
	
	public String calculate(){//复利计算终额
		if(inputError()) return ERROR;
		//System.out.println("来到复利计算方法");
		Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		String result = calculateService.calculate(deposit,interest_rate,nper);
		request.put("result",result);
		request.put("interest_rate",interest_rate);
		request.put("deposit",deposit);
		request.put("nper",nper);
		return SUCCESS;
	}
	private boolean inputError() {
		if(deposit<0||interest_rate<0||interest_rate>0||nper<0||result<0||loan<0||monthRefund<0) return true;
		return false;
	}
	public String calculateBenjin(){
		if(inputError()) return ERROR;
		//System.out.println("来到这里");
		Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		double deposit = calculateService.calculateBenjin(result,interest_rate,nper);
		request.put("result",result);
		request.put("interest_rate",interest_rate);
		request.put("deposit",deposit);
		System.out.println(deposit);
		request.put("nper",nper);
		return SUCCESS;
	}
	public String calculateShichang(){
		if(inputError()) return ERROR;
		//System.out.println("来到3");
		Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		nper = calculateService.calculateShichang(result,interest_rate,deposit);
		request.put("result",result);
		request.put("interest_rate",interest_rate);
		request.put("deposit",deposit);
		System.out.println(deposit);
		request.put("nper",nper);
		return SUCCESS;
	}
	
   public String calculateRate(){
	   if(inputError()) return ERROR;
	  // System.out.println("来到此处啊啊啊啊啊啊");
	   System.out.println("result"+result);
	   System.out.println("deposit"+deposit);
	   System.out.println("nper"+nper);
	    Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
	    interest_rate = calculateService.calculateInterest_rate(result,nper,deposit);
	    System.out.println("interest_rate"+interest_rate);
		request.put("result",result);
		request.put("interest_rate",interest_rate);
		request.put("deposit",deposit);
		request.put("nper",nper);
		return SUCCESS;
	}
   public String calculateDingtou(){
	   if(inputError()) return ERROR;
	  // System.out.println("单选框"+optionsRadios);
	   if(optionsRadios==2) nper=nper/12;
	   System.out.println("rinterest_rate"+interest_rate);
	   System.out.println("deposit"+deposit);
	   System.out.println("nper"+nper);
	   Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
	   //double zhonge = nianjin*Math.pow(1+lilv, shichang-1)/lilv;
	   result = deposit*Math.pow(1+interest_rate, nper-1)/interest_rate;
	   System.out.println("result"+result);
	   request.put("result",result);
	   request.put("interest_rate",interest_rate);
	   request.put("deposit",deposit);
	   request.put("nper",nper);
	   return SUCCESS;
   }
   public String calculateDanli(){
	   if(inputError()) return ERROR;
	   Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
	   //double zhonge = nianjin*Math.pow(1+lilv, shichang-1)/lilv;
	   result = deposit*(1+interest_rate*nper);
	   System.out.println("result"+result);
	   request.put("result",result);
	   request.put("interest_rate",interest_rate);
	   request.put("deposit",deposit);
	   request.put("nper",nper);
	   return SUCCESS;
   }
   
   public String dengEBenxi(String[] args) {
		Scanner sc = new Scanner(System.in); 
       monthRefund = interest_rate*Math.pow((1+interest_rate), nper)/(Math.pow((1+interest_rate), nper)-1)*loan/12;
       System.out.println(monthRefund);
       return SUCCESS;
	}
   public String test(){
	   putData();
		return SUCCESS;
   }
private void putData() {
	Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		List<Record> records = calculateService.test();
		request.put("records",records);
		List<Variety> varieties = new ArrayList<>();
		List<Double> nowMoney = new ArrayList<>();
		for(int i = 0;i<records.size();i++){
			int type =records.get(i).getType_id();
			Variety variety = calculateService.getVariety(type);
			if(variety!=null){varieties.add(variety);}
			
			deposit = records.get(i).getInvestent_deposit();
			interest_rate = records.get(i).getInvestent_rate();
			nper = thisYear-records.get(i).getInvestent_year();
			float nowResult = 0;
			System.out.println("deposit:"+deposit+"interest_rate:"+interest_rate+"nper:"+nper);
			if(type==2&&nper>0){//计算每项复利计算现值
				nowResult = (float) Double.parseDouble(calculateService.calculate(deposit,interest_rate,nper));
			}
			if(type==1&&nper>0){ //计算每项单利投资现值
				nowResult = (float) (deposit*(1+interest_rate*nper));
				System.out.println(nowMoney);
			}
			records.get(i).setNowValue(nowResult);
		}
		request.put("varieties",varieties);
}
   public String addRecord(){
	   calculateService.addRecord(deposit, interest_rate, investent_year,investent_type);
	   System.out.println("Action中"+interest_rate);
	   putData();
	   return SUCCESS;
   }
   public String upData(){
	   System.out.println(investent_year);
	   System.out.println("来到upData方法");
	   System.out.println(record_id);
	   calculateService.delRecord(record_id);
	   putData();
	   return SUCCESS;
   }
}
