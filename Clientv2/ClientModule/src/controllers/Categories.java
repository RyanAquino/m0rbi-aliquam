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

/**
 * Servlet implementation class Categories
 */
@WebServlet("/Categories")
public class Categories extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Categories() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String key = request.getParameter("cat");
		ArrayList<String> servList = new ArrayList<String>();
		
		 try {

	            Class.forName("com.mysql.jdbc.Driver");
	            
	            String connUrl = "jdbc:mysql://localhost/tutorial?user=root&password=";
	            Connection conn = DriverManager.getConnection(connUrl);

	            String sql = "SELECT * FROM service WHERE category=' Music' ";
	            Statement st = conn.createStatement();
	            ResultSet rs = st.executeQuery(sql);
	            while(rs.next()){
	            	servList.add(rs.getString(0));
	            }
	            
	            request.setAttribute("servList", servList);
	            RequestDispatcher dispatchers = request.getRequestDispatcher("home.jsp");
	            dispatchers.forward(request,response);
	        } catch (Exception e){
	        	out.print("error");
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
