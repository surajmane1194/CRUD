package com.srj.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srj.mvc.model.EmployeeService;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService employeeService;
     /**
     * Default constructor. 
     */
    public EmployeeServlet() {
       this.employeeService = new EmployeeService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			System.out.println("TRY");
			processRequest(request, response);
		} catch (Exception e) {
			System.out.println("CATCH");
			// TODO Auto-generated catch block
			 e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception, IOException {
		request.setAttribute("employees", this.employeeService.getEmployee());
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/views/employees.jsp");
		dispatcher.forward(request, response);
	}
}
