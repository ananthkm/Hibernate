package com.resume.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.resume.service.Projectserve;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
@WebServlet("ws/")
public class Projectservelet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Projectservelet() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		String title= request.getParameter("title");
		String status=request.getParameter("status");
		String description=request.getParameter("description");
		try
		{
		Projectserve.pro(title,status,description);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}
}  
