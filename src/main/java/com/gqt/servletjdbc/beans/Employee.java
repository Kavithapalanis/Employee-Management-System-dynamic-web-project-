package com.gqt.servletjdbc.beans;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import com.gqt.servletjdbc.beans.Employee;


public class Employee{
	int employee_id;
	String employee_name;
	String employee_company;
	int employee_salary;
	
	
	public int getEmployee_id() {
		return employee_id;	
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_company() {
		return employee_company;
	}
	public void setEmployee_company(String employee_company) {
		this.employee_company = employee_company;
	}
	public int getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}
	
	
	}


