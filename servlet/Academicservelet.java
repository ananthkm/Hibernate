package com.resume.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.resume.service.Academicserve;

@WebServlet("aca/")
public class Academicservelet extends HttpServlet{
	


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	String course=request.getParameter("course");
	String institution=request.getParameter("institution");
	String graduate_year=request.getParameter("graduate_year");
	String percentage=request.getParameter("percentage");
try 
{
	Academicserve.profilestore(course,institution,graduate_year,percentage);
}
catch(ParseException e)
{
	e.printStackTrace();
}
}

public Academicservelet() {
	super();
	// TODO Auto-generated constructor stub
} 
}