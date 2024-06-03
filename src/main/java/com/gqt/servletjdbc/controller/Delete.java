package com.gqt.servletjdbc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gqt.servletjdbc.beans.Employee;
import com.gqt.servletjdbc.model.model;


public class Delete extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int employee_id=Integer.parseInt(request.getParameter("employee_id"));
			
		
			Employee e = new Employee();
			e.setEmployee_id(employee_id);
			model m = new model();
			boolean b =m.DeleteData(e);
			if(b==true)
			{
				response.sendRedirect("/ServletJDBCcrud1/DeleteSuccess.html");
			}
			else {
				response.sendRedirect("/ServletJDBCcrud1/DeleteFail.html");
			}
			
			
		
	
	}

}
