package com.ra.daoimp;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ra.dao.radao;
import com.ra.entity.markEntity;
import com.ra.entity.sem1entity;
import com.ra.entity.sem2entity;
import com.ra.entity.sem3entity;
import com.ra.entity.sem4entity;
import com.ra.entity.sem5entity;
import com.ra.entity.staffEntity;
import com.ra.entity.studentEntity;
import com.ra.util.HibernateUtility;



public class radaoimp implements radao {
	
	public String savecreatestudent(studentEntity createstudentEntity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(createstudentEntity);
		t.commit();
		return "success";
	}
	public studentEntity getcreatestudent(int rollno) {
		Session session = com.ra.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		studentEntity se = session.get(studentEntity.class, rollno);
		t.commit();
		return se;
	}
	public String savestaff(staffEntity  staffentity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(staffentity);
		t.commit();
		return "success";
	}
	public staffEntity getstaffentity(int id) {
		Session session = com.ra.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		staffEntity se = session.get(staffEntity.class,id);
		t.commit();
		return se;
	}
	public String savecreatemark(markEntity markEntity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(markEntity);
		t.commit();
		return "success";
	}
	public markEntity getcreatemark(int rollno) {
		Session session = com.ra.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		markEntity se = session.get(markEntity.class, rollno);
		t.commit();
		return se;
	}
	public String savesem1(sem1entity sem1entity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(sem1entity);
		t.commit();
		return "success";
		
	}
	public sem1entity getsavesem1(int rollno) {
		Session session = com.ra.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		sem1entity se = session.get(sem1entity.class, rollno);
		t.commit();
		return se;
	}
	public String savesem2(sem2entity sem2entity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(sem2entity);
		t.commit();
		return "success"; 
	}
	public sem2entity getsavesem2(int rollno) {
		Session session = com.ra.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		sem2entity sa = session.get(sem2entity.class, rollno);
		t.commit();
		return sa;
	}
	public String savesem3(sem3entity sem3entity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(sem3entity);
		t.commit();
		return "success";
	}
	public sem3entity getsavesem3(int rollno) {
		Session session = com.ra.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		sem3entity se = session.get(sem3entity.class, rollno);
		t.commit();
		return se;
	}
	public String savesem4(sem4entity sem4entity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(sem4entity);
		t.commit();
		return "success";
	}
	public sem4entity getsavesem4(int rollno) {
		Session session = com.ra.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		sem4entity se = session.get(sem4entity.class, rollno);
		t.commit();
		return se;
	}
	public String savesem5(sem5entity sem5entity) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(sem5entity);
		t.commit();
		return "success";
	}
	public sem5entity getsavesem5(int rollno) {
		Session session = com.ra.util.HibernateUtility.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		sem5entity se = session.get(sem5entity.class, rollno);
		t.commit();
		return se;
	}
	public List<List<Map<Object, Object>>> getCanvasjsChartData() {
		// TODO Auto-generated method stub
		return null;
	}

}
