package com.evan.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.evan.dao.IRecordDAO;
import com.evan.model.Record;

public class RecordDAO implements IRecordDAO{
	 private SessionFactory sessionFactory;

		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		public List test() {
			System.out.println("来到了DAO1234");
		    Session session=sessionFactory.openSession();
			 Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Record");
			System.out.println(query);
//			query.setFirstResult(1);
//			query.setMaxResults(2);
			List records=query.list();
		    ts.commit();		    
			session.close();
			return records;
		}
	

		@Override
		public void addRecord(double deposit, double interest_rate, int investent_year,int investent_type) {
			System.out.println("来到了DAO的addRecord方法");
			System.out.println("DAO中"+interest_rate);
		    Session session=sessionFactory.openSession();
			Transaction ts=session.beginTransaction();
			System.out.println("年份"+investent_year);
			Record record = new Record();
			record.setInvestent_deposit(deposit);
			record.setInvestent_year(investent_year);
			record.setInvestent_rate(interest_rate);
			record.setType_id(investent_type);
			session.save(record);
		    ts.commit();		    
			session.close();
			
		}

		@Override
		public void delRecord(int record_id) {
			System.out.println("来到了DAO的delRecord方法");
		    Session session=sessionFactory.openSession();
			Transaction ts=session.beginTransaction();
			Record record=(Record) session.get(Record.class,record_id);
			session.delete(record);
		    ts.commit();		    
			session.close();
		}
		
		
}

