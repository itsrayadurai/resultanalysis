package com.ra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "stafftable")
public class staffEntity {

		@Id
		 private int id;
		 @Column(name = "Name")
		 private String name;
		 @Column(name = "Dept")
		 private String dept;
		 @Column(name = "Phone")
		 private long  phone;
		 @Column(name = "Email")
		 private String email;
		 @Column(name = "Pass")
		 private String pass;
		 @Column(name = "Address")
		 private String address;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
	    public long getPhone() {
		    return phone;
	    } 
	    public void setPhone(long phone) {
			this.phone = phone;
		} 
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPass() {
			return pass;
		}
		public void setPass( String password) {
			this.pass = password;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		 
		@Override
		public String toString() {
			return "staffEntity [id=" + id +  ", name=" + name + 
				   ", dept=" + dept + ", phone=" + phone + ", email=" + email + 
				   ", password=" + pass + ", address=" + address +"]";
		}
	}



