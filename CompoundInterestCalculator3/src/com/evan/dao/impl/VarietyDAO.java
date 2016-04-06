package com.evan.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.evan.dao.IVarietyDAO;
import com.evan.model.Variety;

public class VarietyDAO implements IVarietyDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Variety getVariety(int id1) {
		System.out.println("¿¥µΩ¡ÀVarietyDAO");
	    Session session=sessionFactory.openSession();
		 Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Variety where id ="+id1);
		System.out.println(query);
//		query.setFirstResult(1);
//		query.setMaxResults(2);
		List<Variety> varieties=query.list();
//		 Record record = new Record();
//		 record.setType_id(2);
//		 session.save(record);
	    ts.commit();		    
		session.close();
		return varieties.get(0);
	}



}
