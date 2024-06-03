package com.gqt.servletjdbc.controller;
// to replace a ID and Name of an existing employe with new name name and id
// here input sd be given as to the existing data in employee table
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gqt.servletjdbc.beans.Employee;
import com.gqt.servletjdbc.model.model;


public class Update extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int employee_id=Integer.parseInt(request.getParameter("employee_id"));
		String employee_name=request.getParameter("employee_name");
		
		Employee e = new Employee();
		e.setEmployee_id(employee_id);
		e.setEmployee_name(employee_name);
		
		
		model m = new model();
		boolean b =m.UpdateData(e);
		if(b==true) {
			response.sendRedirect("/ServletJDBCcrud1/UpdateSuccess.html");
		}
		else {
			response.sendRedirect("/ServletJDBCcrud1/UpdateFail.html");
		}
		}

}