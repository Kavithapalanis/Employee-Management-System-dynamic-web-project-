package com.gqt.servletjdbc.controller;
// to add or insert a new data of and employee table to an existing table
// if till 6 it is there we sd give input frm 7 
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gqt.servletjdbc.beans.Employee;
import com.gqt.servletjdbc.model.model;


public class insert extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int employee_id=Integer.parseInt(request.getParameter("employee_id"));
		String employee_name=request.getParameter("employee_name");
		String employee_company=request.getParameter("employee_company");
		int employee_salary=Integer.parseInt(request.getParameter("employee_salary"));
		Employee e = new Employee();
		e.setEmployee_id(employee_id);
		e.setEmployee_name(employee_name);
		e.setEmployee_company(employee_company);
		e.setEmployee_salary(employee_salary);
		
		model m = new model();
		boolean b = m.InsertData(e);
		if(b==true) {
			response.sendRedirect("/ServletJDBCcrud1/InsertSuccess.html");
		}
		else {
			response.sendRedirect("/ServletJDBCcrud1/InsertFail.html");
		}
	}
}


