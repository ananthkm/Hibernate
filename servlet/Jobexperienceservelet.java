package com.resume.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.resume.service.JobexperienceService;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
@WebServlet("jb/")
public class Jobexperienceservelet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public Jobexperienceservelet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		String exp= request.getParameter("exp");
		String job=request.getParameter("job");
		String nameofJob=request.getParameter("nameofjob");
		try
		{
		JobexperienceService.Job(exp,job,nameofJob);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}
}  