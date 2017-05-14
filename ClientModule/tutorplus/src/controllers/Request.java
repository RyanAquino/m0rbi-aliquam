package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classes.ServiceProvider;

/**
 * Servlet implementation class Request
 */
@WebServlet("/Request")
public class Request extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Request() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String tut = request.getParameter("req");
		HttpSession session=request.getSession();  
	    String username = (String)session.getAttribute("username");
	    java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
	    try {
            Class.forName("com.mysql.jdbc.Driver");
            String connUrl = "jdbc:mysql://localhost/tutorial?user=root&password=12krishnan!";
            Connection conn = DriverManager.getConnection(connUrl);
            Statement st = conn.createStatement();
           
            //1st query to retrieve  client information
            String sql = "INSERT INTO request (request_id, sp_id, client_id, status, date, time, sched_id) VALUES (4, 1, 1, pending, 2017-05-07, 16:00:00, 1)";
            
            st.executeUpdate(sql);
            
	}catch (Exception e){
    	e.printStackTrace();
    }
	    
	    out.print("<h1>Success</h1>");
	    out.print("<h2><a href='http://localhost:8080/tutorplus/HomePage'Return</h2>");
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
