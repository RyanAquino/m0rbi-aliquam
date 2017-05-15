package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classes.ServiceProvider;
/**
 * Servlet implementation class CheckProvider
 */
@WebServlet("/CheckProvider")
public class CheckProvider extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckProvider() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String tutName = (String)request.getParameter("tut");
		HttpSession session=request.getSession();
		ArrayList<ServiceProvider> spList = new ArrayList<ServiceProvider>();
		ServiceProvider s;
		ServiceProvider spInf = new ServiceProvider();
		 try {
			 	int userId = (Integer) session.getAttribute("userName");
	            Class.forName("com.mysql.jdbc.Driver");
	            
	            //connection to database
	            String connUrl = "jdbc:mysql://localhost/tutorial?user=root&password=12krishnan!";
	            Connection conn = DriverManager.getConnection(connUrl);
	            
	            
	            //1st query to retrieve  client information
	            String sql = "SELECT * FROM sp where firstname  = '" + tutName + "'";
	            Statement st = conn.createStatement();
	            ResultSet rs = st.executeQuery(sql);
	            while(rs.next()){
	            	s = new ServiceProvider();
	            	s.setId(rs.getInt(1));
	            	s.setReqStatus(rs.getString(2));
	            	s.setLastName(rs.getString(3));
	            	s.setFirstName(rs.getString(4));
	            	s.setGender(rs.getString(5));
	            	s.setUsername(rs.getString(6));
	            	s.setEmail(rs.getString(8));
	            	s.setContact(rs.getString(9));
	            	s.setAddress(rs.getString(10));
	            	s.setContact(rs.getString("contact"));
	            	s.setServList();
	            	spInf = s;	
	            }
	            
	            
	            //1st query to retrieve  client information
	            String sql2 = "SELECT * FROM client where client_id = " + userId + "";
	            st = conn.createStatement();
	            rs = st.executeQuery(sql2);
	            String name = null;
	            String lastname = null;
	            if(rs.next()){
	            	name = rs.getString("firstname");
	            	lastname = rs.getString("lastname");
	            }
	            
	            request.setAttribute("name", name);
	            request.setAttribute("lastname", lastname);
	            
	         request.setAttribute("firstName",spInf.getFirstName());
	         request.setAttribute("lastName",spInf.getLastName());
	   		 request.setAttribute("myName",tutName);
			 request.setAttribute("serviceProvider",spInf);	
	        } catch (Exception e){
	        	e.printStackTrace();
	        }

		//REDIRECT TO VIEW TUTOR
        RequestDispatcher dispatchers = request.getRequestDispatcher("viewtutor.jsp");
        dispatchers.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
