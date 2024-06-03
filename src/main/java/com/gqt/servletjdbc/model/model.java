package com.gqt.servletjdbc.model;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gqt.servletjdbc.beans.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class model {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	public model() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/employeeservletjdbc";
			String user="root";
			String pwd="kavi";
			
			con=DriverManager.getConnection(url,user,pwd);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public boolean InsertData(Employee e) {
		try {
			String sql="insert into emptablejdbc values (?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, e.getEmployee_id());
			pstmt.setString(2, e.getEmployee_name());
			pstmt.setString(3,e.getEmployee_company());
			pstmt.setInt(4, e.getEmployee_salary());
			
			int x = pstmt.executeUpdate();
			if(x >= 0) {
				return true;
				
			}
			else {
				return false;
			}
			
		}
		catch(Exception excp){
			excp.printStackTrace();
		}
		return false;
	}
	public boolean UpdateData(Employee e ) {
		try {
			String sql="Update emptablejdbc set employee_name=? where employee_id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(2,e.getEmployee_id() );
			pstmt.setString(1, e.getEmployee_name());
			int x =pstmt.executeUpdate();
			if(x>=0) {
				return true;
			}
			else {
				return false;
			}
			
			
			
		}
		catch(Exception excp) {
			excp.printStackTrace();
		}
		return false;
	}
	public boolean DeleteData(Employee e ) {
		try {
			String sql="delete from emptablejdbc where employee_id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,e.getEmployee_id() );
			
			int x =pstmt.executeUpdate();
			if(x>=0) {
				return true;
			}
			else {
				return false;
			}
			
			
			
		}
		catch(Exception excp) {
			excp.printStackTrace();
		}
		return false;
	}
	public boolean SelectSpecificData(Employee e ) {
		try {
			String sql="select * from emptablejdbc where employee_id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,e.getEmployee_id());
			
			res =pstmt.executeQuery();
			while(res.next()==true) {
				System.out.println("ID : "+res.getInt(1));
				
			}
			
		}
		catch(Exception excp) {
			excp.printStackTrace();
		}
		return false;
	}
}
	
	




