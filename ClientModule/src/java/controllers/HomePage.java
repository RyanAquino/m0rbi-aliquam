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

import classes.Category;
import classes.Generate;
import classes.ServiceProvider;
/**
 * Servlet implementation class HomePage
 */
@WebServlet({ "/HomePage"})
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
                
	    //create a session for user log in
		int user = 1;
		HttpSession session=request.getSession();  
	      session.setAttribute("userName",user);
	        
		ArrayList<Category> catList = new ArrayList<Category>();
		ArrayList<ServiceProvider> spList = new ArrayList<ServiceProvider>();
		ServiceProvider s;
		Category c;

		//Step 2: connect to the database
		 try {
	            Class.forName("com.mysql.jdbc.Driver");
	            
	            //connection to database
	            String connUrl = "jdbc:mysql://localhost/tutorial?user=root&password=";
	            Connection conn = DriverManager.getConnection(connUrl);
	            int userId = (Integer) session.getAttribute("userName");
	            
	            //1st query to retrieve  client information
	            String sql = "SELECT * FROM client where client_id = " + userId + "";
	            Statement st = conn.createStatement();
	            ResultSet rs = st.executeQuery(sql);
	            String name = null;
	            String lastname = null;
	            if(rs.next()){
	            	name = rs.getString("firstname");
	            	lastname = rs.getString("lastname");
	            }
	            
	            request.setAttribute("name", name);
	            request.setAttribute("lastname", lastname);
	            

	            //2nd query for category 
	            String sql2 = "SELECT * FROM category";
	            st = conn.createStatement();
	            rs = st.executeQuery(sql2);
	            while(rs.next()){
	            	c = new Category();
	            	c.setCategory(rs.getString(1));
	            	c.setDescription(rs.getString(2));
	            	c.setNumService();
	            	c.setServList();
	            	catList.add(c);
	            }

	            request.setAttribute("categList", catList);
	            
	            //3rd query for service provider 
	            String sql3 = "SELECT * FROM sp";
	            st = conn.createStatement();
	            rs = st.executeQuery(sql3);
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
	            	s.setServList();
	            	spList.add(s);
	            }
	            request.setAttribute("spServ",spList);
	            
	           
	            
	            RequestDispatcher dispatchers = request.getRequestDispatcher("home.jsp");
	            dispatchers.forward(request,response);
	        } catch (Exception e){
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

}
