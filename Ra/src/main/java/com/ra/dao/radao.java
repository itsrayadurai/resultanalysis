package com.ra.dao;

import java.util.List;
import java.util.Map;

import com.ra.entity.markEntity;
import com.ra.entity.sem1entity;
import com.ra.entity.sem2entity;
import com.ra.entity.sem3entity;
import com.ra.entity.sem4entity;
import com.ra.entity.sem5entity;
import com.ra.entity.staffEntity;
import com.ra.entity.studentEntity;


public interface radao {
	 public String savecreatestudent(studentEntity createstudentEntity);
	 public studentEntity getcreatestudent(int rollno);
	 public String savestaff(staffEntity  staffentity);
	 public staffEntity getstaffentity(int id);
	 public String savecreatemark(markEntity markEntity);
	 public markEntity getcreatemark(int rollno);
	 public String  savesem1(sem1entity sem1entity);
	 public sem1entity getsavesem1(int rollno);
	 public String  savesem2(sem2entity sem2entity);
	 public sem2entity getsavesem2(int rollno);
	 public String  savesem3(sem3entity sem3entity);
	 public sem3entity getsavesem3(int rollno);
	 public String  savesem4(sem4entity sem4entity);
	 public sem4entity getsavesem4(int rollno);
	 public String  savesem5(sem5entity sem1entity);
	 public sem5entity getsavesem5(int rollno);
	 List<List<Map<Object, Object>>> getCanvasjsChartData();

}
