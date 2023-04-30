package com.ra.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ra.dao.*;
import com.ra.daoimp.*;
import com.ra.entity.*;
@Controller
public class racontroller {

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		System.out.println("User login attempted");
		try {
			if(request.getParameter("user").equals("admin"))
				{
				if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("admin")) 
				{
	            mv.setViewName("adminpage");
				}
				else
				{
				mv.addObject("message", "Some problem occured during login, Please try after some time.");
				mv.setViewName("dbdemo");
				}
				}
			else if(request.getParameter("user").equals("student"))
			{
			radao ebd=new radaoimp();
	        int rollno=Integer.parseInt(request.getParameter("username"));
	        studentEntity status = ebd.getcreatestudent(rollno);
			if (request.getParameter("password").equals(status.getPassword()))
			{
	        mv.setViewName("studentpage");
			}
			else 
			{
			mv.addObject("message", "Some problem occured during login, Please try after some time.");
			mv.setViewName("dbdemo");
			}
			}
			else if(request.getParameter("user").equals("staff"))
			{
			radao ebd=new radaoimp();
	        int id=Integer.parseInt(request.getParameter("username"));
	        staffEntity status = ebd.getstaffentity(id);
			if (request.getParameter("password").equals(status.getPass()))
			{
	        mv.setViewName("staffpage");
			}
			else
			{
			mv.addObject("message", "Some problem occured during login, Please try after some time.");
			mv.setViewName("dbdemo");
			}
			}
			
			}
		    
				catch (Exception ex) {
				mv.addObject("message", "Some problem occured during login, Please try after some time.");
				
			}
			return mv;
	}
	@RequestMapping("/createstudent")
	public ModelAndView createstudent(HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("createstudent");
	return mv;	
	}
	@RequestMapping("/createstaff")
	public ModelAndView createstaff(HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("createstaff");
	return mv;	
	}
	@RequestMapping("/savestudent")
	public ModelAndView savecreatestudent(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		radao call=new radaoimp();
		studentEntity se= new studentEntity();
		int rollno= Integer.parseInt(request.getParameter("rollno"));
		se.setRollno(rollno);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		se.setName(fname+""+lname);
		se.setDept(request.getParameter("dept"));
		long phone= Long.parseLong(request.getParameter("phone"));
		se.setPhone(phone);
		se.setEmail(request.getParameter("email"));
	    se.setPassword(request.getParameter("password"));
	    String dno=request.getParameter("dno");
	    String street=request.getParameter("street");
	    String city=request.getParameter("city");
	    String pincode=request.getParameter("pincode");
	    se.setAddress(dno+" "+street+" "+city+" "+pincode);
	    String status = call.savecreatestudent(se);
	    mv.addObject("status", status);
	    mv.setViewName("adminpage");
		return mv;
		
	}
	@RequestMapping("/updatemark")
	public ModelAndView updatemark(HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("viewmark");
	return mv;	
	}
	@RequestMapping("/viewresult")
	public ModelAndView viewmark(HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("studentpage");
	return mv;	
	}
	@RequestMapping("/semester1")
	public ModelAndView semester1(HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("semone");
	return mv;	
	}
	@RequestMapping("/semester2")
	public ModelAndView semester2(HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("semtwo");
	return mv;	
	}
	@RequestMapping("/semester3")
	public ModelAndView semester3(HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("semthree");
	return mv;	
	}
	@RequestMapping("/semester4")
	public ModelAndView semester4(HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("semfour");
	return mv;	
	}
	@RequestMapping("/semester5")
	public ModelAndView semester5(HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("semfive");
	return mv;	
	}


	@RequestMapping("/savestaff")
	public ModelAndView savestaff(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
        radao ebd=new radaoimp();
        staffEntity se=new staffEntity();
		int id=Integer.parseInt(request.getParameter("id"));
		se.setId(id);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		se.setName(fname +" "+lname);
		se.setDept(request.getParameter("dept"));
	    long phone=Long.parseLong(request.getParameter("phone"));
	    se.setPhone(phone);
	    se.setEmail(request.getParameter("email"));
	    se.setPass(request.getParameter("pass"));
	    String dno=request.getParameter("dno");
	    String street=request.getParameter("street");
	    String city=request.getParameter("city");
	    String pincode=request.getParameter("pincode");
	    se.setAddress(dno+" "+street+" "+city+" "+pincode);
	    String status = ebd.savestaff(se);
		mv.addObject("status", status);
		mv.setViewName("adminpage");
		return mv;	
	}
	
		@RequestMapping("/savemark")
		public ModelAndView savemark(HttpServletRequest request, HttpServletResponse response) {
			ModelAndView mv = new ModelAndView();
			radao ebd=new radaoimp();
			markEntity se=new markEntity();
			se.setRollno(request.getParameter("rollno"));
			int sem=Integer.parseInt(request.getParameter("sem"));
			se.setSem(sem);
		    se.setSubject1(request.getParameter("subject1"));
		    se.setSubject2(request.getParameter("subject2"));
		    se.setSubject3(request.getParameter("subject3"));
		    se.setSubject4(request.getParameter("subject4"));
		    se.setSubject5(request.getParameter("subject5"));
		    String status = ebd.savecreatemark(se);
			mv.addObject("status", status);
			mv.setViewName("savemark");
			return mv;	
		}
		@RequestMapping("/semoneinput")
		    public ModelAndView semoneinput(HttpServletRequest request, HttpServletResponse response) {
			ModelAndView mv = new ModelAndView();
			radao ebd=new radaoimp();
	        sem1entity se=new sem1entity();
	        int rollno= Integer.parseInt(request.getParameter("rollno"));
			se.setRollno(rollno);
		    se.setSub1(request.getParameter("sub1"));
		    se.setSub2(request.getParameter("sub2"));
		    se.setSub3(request.getParameter("sub3"));
		    se.setSub4(request.getParameter("sub4"));
		    se.setSub5(request.getParameter("sub5"));
		    String status = ebd.savesem1(se);
			mv.addObject("status", status);
			mv.setViewName("staffpage");
			return mv;   
		}
		@RequestMapping("/semtwoinput")
	    public ModelAndView semtwoinput(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		radao ebd=new radaoimp();
		sem2entity se=new sem2entity();
		int rollno= Integer.parseInt(request.getParameter("rollno"));
		se.setRollno(rollno);
		se.setSub1(request.getParameter("sub1"));
	    se.setSub2(request.getParameter("sub2"));
	    se.setSub3(request.getParameter("sub3"));
	    se.setSub4(request.getParameter("sub4"));
	    se.setSub5(request.getParameter("sub5"));
	    String status = ebd.savesem2(se);
		mv.addObject("status", status);
		mv.setViewName("staffpage");
		return mv;   
	}
		@RequestMapping("/semthreeinput")
	    public ModelAndView semthreeinput(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		radao ebd=new radaoimp();
	    sem3entity se=new sem3entity();
	    int rollno= Integer.parseInt(request.getParameter("rollno"));
		se.setRollno(rollno);
		se.setSub1(request.getParameter("sub1"));
	    se.setSub2(request.getParameter("sub2"));
	    se.setSub3(request.getParameter("sub3"));
	    se.setSub4(request.getParameter("sub4"));
	    se.setSub5(request.getParameter("sub5"));
	    String status = ebd.savesem3(se);
		mv.addObject("status", status);
		mv.setViewName("staffpage");
		return mv;   
	}
		@RequestMapping("/semfourinput")
	    public ModelAndView semfourinput(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		radao ebd=new radaoimp();
		sem4entity se=new sem4entity();
		int rollno= Integer.parseInt(request.getParameter("rollno"));
		se.setRollno(rollno);
		se.setSub1(request.getParameter("sub1"));
	    se.setSub2(request.getParameter("sub2"));
	    se.setSub3(request.getParameter("sub3"));
	    se.setSub4(request.getParameter("sub4"));
	    se.setSub5(request.getParameter("sub5"));
	    String status = ebd.savesem4(se);
		mv.addObject("status", status);
		mv.setViewName("staffpage");
		return mv;   
	}
		@RequestMapping("/semfiveinput")
	    public ModelAndView semfiveinput(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		radao ebd=new radaoimp();
		sem5entity se=new sem5entity();
		int rollno= Integer.parseInt(request.getParameter("rollno"));
		se.setRollno(rollno);
		se.setSub1(request.getParameter("sub1"));
	    se.setSub2(request.getParameter("sub2"));
	    se.setSub3(request.getParameter("sub3"));
	    se.setSub4(request.getParameter("sub4"));
	    se.setSub5(request.getParameter("sub5"));
	    String status = ebd.savesem5(se);
		mv.addObject("status", status);
		mv.setViewName("staffpage");
		return mv;   
	}

		@RequestMapping("/seemark")
		public ModelAndView seemark(HttpServletRequest request, HttpServletResponse response) {
			ModelAndView mv = new ModelAndView();
			radao ebd=new radaoimp();
			int id=Integer.parseInt(request.getParameter("rollno"));
	        String sem=request.getParameter("sem");
	        if(sem.equals("semester1"))
	        {
	        sem1entity status = ebd.getsavesem1(id);
	        mv.addObject("rollno",status.getRollno());
	        mv.addObject("sem","semester:1");
	        mv.addObject("sub1",status.getSub1());
	        mv.addObject("sub2",status.getSub2());
	        mv.addObject("sub3",status.getSub3());
	        mv.addObject("sub4",status.getSub4());
	        mv.addObject("sub5",status.getSub5());
			mv.setViewName("seemark");
	        }
	        else if(sem.equals("semester2"))
	        {
	        sem2entity status = ebd.getsavesem2(id);
	        mv.addObject("rollno",status.getRollno());
	        mv.addObject("sem","semester:2");
	        mv.addObject("sub1",status.getSub1());
	        mv.addObject("sub2",status.getSub2());
	        mv.addObject("sub3",status.getSub3());
	        mv.addObject("sub4",status.getSub4());
	        mv.addObject("sub5",status.getSub5());
			mv.setViewName("seemark");
	        }
	        else if(sem.equals("semester3"))
	        {
	        sem3entity status = ebd.getsavesem3(id);
	        mv.addObject("rollno",status.getRollno());
	        mv.addObject("sem","semester:3");
	        mv.addObject("sub1",status.getSub1());
	        mv.addObject("sub2",status.getSub2());
	        mv.addObject("sub3",status.getSub3());
	        mv.addObject("sub4",status.getSub4());
	        mv.addObject("sub5",status.getSub5());
			mv.setViewName("seemark");
	        }
	        else if(sem.equals("semester4"))
	        {
	        sem4entity status = ebd.getsavesem4(id);
	        mv.addObject("rollno",status.getRollno());
	        mv.addObject("sem","semester:4");
	        mv.addObject("sub1",status.getSub1());
	        mv.addObject("sub2",status.getSub2());
	        mv.addObject("sub3",status.getSub3());
	        mv.addObject("sub4",status.getSub4());
	        mv.addObject("sub5",status.getSub5());
			mv.setViewName("seemark");
	        }
	        else if(sem.equals("semester5"))
	        {
	        sem5entity status = ebd.getsavesem5(id);
	        mv.addObject("rollno",status.getRollno());
	        mv.addObject("sem","semester:5");
	        mv.addObject("sub1",status.getSub1());
	        mv.addObject("sub2",status.getSub2());
	        mv.addObject("sub3",status.getSub3());
	        mv.addObject("sub4",status.getSub4());
	        mv.addObject("sub5",status.getSub5());
			mv.setViewName("seemark");
	        }
	        return mv;
		}
		
		}