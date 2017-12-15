package com.resume.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.resume.service.Projectserve;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
@WebServlet("cs/")
public class Computerservelet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Computerservelet() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		String skills= request.getParameter("skills");
		String tagid=request.getParameter("tagid");
		String value=request.getParameter("value");
		try
		{
		Projectserve.pro(skills,tagid,value);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}
}
