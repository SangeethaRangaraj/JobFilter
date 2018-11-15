package com.kloudone.jobsearch.jpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.kloudone.jobsearch.bean.Jobs;

@Repository
public class JobRepository implements IjobRepository{
	SessionFactory factory= (SessionFactory) new Configuration().configure().buildSessionFactory();
	
			
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Jobs> findJobsbySkill(String skillSelected) {
		// TODO Auto-generated method stub
		List<Jobs> results = null;
		Session session=factory.openSession();
		session.beginTransaction();
		try {
		Query query=session.createQuery("FROM Jobs where skill = :skills");
		query.setParameter("skills",skillSelected);
		results = query.list();
		}catch(Exception e) {
			e.getStackTrace();
		}finally {
			session.close();
		}
		return results;
	}

	public void addJobintoDb(Jobs job) {
		
		Session session=factory.openSession();
		session.beginTransaction();
		try {
		session.save(job);		
		session.getTransaction().commit();
		}catch(Exception e) {
			
			e.getStackTrace();
			
		}finally{
			session.close();
	}
}
	

}
