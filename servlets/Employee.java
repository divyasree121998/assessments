package com.mysrv.emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			PrintWriter out=resp.getWriter();
			String data=req.getParameter("Ename");
			String data1=req.getParameter("EmpId");
			String data2=req.getParameter("pass");
			String data3=req.getParameter("cpass");
			String data4=req.getParameter("g1");
			String data5=req.getParameter("Languages");
			String data6=req.getParameter("dob");
			String data7=req.getParameter("securityquestion");
			String data8=req.getParameter("securityAnswer");
			
			resp.setContentType("text/html");
		    
			out.print("<h1> <font color='blue'>"+ data +" </font> </h1>");
			out.print("<h1> <font color='green'>"+ data1 +" </font> </h1>");
			out.print("<h1> <font color='red'>"+ data2 +" </font> </h1>");
			out.print("<h1> <font color='yellow'>"+ data3 +" </font> </h1>");
			out.print("<h1> <font color='black'>"+ data4 +" </font> </h1>");
			out.print("<h1> <font color='orange'>"+ data5 +" </font> </h1>");
			out.print("<h1> <font color='aqua'>"+ data6 +" </font> </h1>");
			out.print("<h1> <font color='coral'>"+ data7 +" </font> </h1>");
			out.print("<h1> <font color='pink'>"+ data8 +" </font> </h1>");
			
			String arr[]= req.getParameterValues("Languages");
			   
		    for(String a:arr)
		    {
		   
		    out.print(a+"<br>");
		    }

		}
	}

