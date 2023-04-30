package com.ra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table(name="mark")
	public class markEntity {

		@Id
		private String rollno;
		@Column(name="Sem") 
		private int sem;
		@Column(name = "Subject1")
		private String subject1;
		@Column(name = "Subject2")
		private String subject2;
		@Column(name = "Subject3")
		private String subject3;
		@Column(name = "Subject4")
		private String subject4;
		@Column(name = "Subject5")
		private String subject5;
		public String getRollno() {
			return rollno;
		}
		public void setRollno(String rollno) {
			this.rollno = rollno;
		}
		public int getSem() {
			return sem;
		}
		public void setSem(int sem) {
			this.sem = sem;
		}
		public String getSubject1() {
			return subject1;
		}
		public void setSubject1(String subject1) {
			this.subject1 = subject1;
		}
		public String getSubject2() {
			return subject2;
		}
		public void setSubject2(String subject2) {
			this.subject2 = subject2;
		}
		public String getSubject3() {
			return subject3;
		}
		public void setSubject3(String subject3) {
			this.subject3 = subject3;
		}
		public String getSubject4() {
			return subject4;
		}
		public void setSubject4(String subject4) {
			this.subject4 = subject4;
		}
		public String getSubject5() {
			return subject5;
		}
		public void setSubject5(String subject5) {
			this.subject5 = subject5;
		}
		@Override
		public String toString()
		{
			return "markEntity{rollno="+rollno +  ", sem=" + sem + 
					   ", subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + 
					   ", subject4=" + subject4 + ", subject5=" + subject5 +"]";
		}
		
		
	}


