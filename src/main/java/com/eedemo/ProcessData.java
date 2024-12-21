package com.eedemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class ProcessData
 */
@WebServlet("/ProcessData")
public class ProcessData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/DisplayData.jsp";
		
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String phone = request.getParameter("phone");
		
		updateDB(fName, lName, phone);
		
		Customer cust = new Customer(fName, lName, phone);
		request.setAttribute("cust", cust);
				
		getServletContext()
			.getRequestDispatcher(url)
			.forward(request, response);

	}

	protected void updateDB(String firstName, String lastName, String phone) {
		Connection con;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/test";
	        String user = "dbadmin";
	        String pw = "admin";
	        
	        con = DriverManager.getConnection(url, user, pw);
	        
	        Statement s = con.createStatement();
	        
	        String query = "INSERT INTO CUSTOMER " + 
	        "(first_name, last_name, phone, cust_id) " + 
	        "VALUES ('" + firstName + "', '" + lastName + "', '" +
	        phone + "', NULL)";
	        
	        s.executeUpdate(query);
	        
	        con.close();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
