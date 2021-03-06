package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
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

import com.mysql.jdbc.PreparedStatement;

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
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession session = request.getSession(true);
        PrintWriter out = response.getWriter();
        String clientId = (String) session.getAttribute("userName");
        String numOfDays = request.getParameter("num");
        String sProv = request.getParameter("spId");
        String schedId = request.getParameter("schedId");
        long time = System.currentTimeMillis();
        java.sql.Time timeIn = new java.sql.Time(new java.util.Date().getTime());
        Calendar calendar = Calendar.getInstance();
        java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
        int spNum = Integer.parseInt(sProv);
        int clientNum = Integer.parseInt(clientId);
        int numDay = Integer.parseInt(numOfDays);
        int schedNum = Integer.parseInt(schedId);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connUrl = "jdbc:mysql://localhost/tutorial?user=root&password=";
            Connection conn = DriverManager.getConnection(connUrl);

            String query = " INSERT INTO request (sp_id,client_id,date,time,noofdays,sched_id ) VALUES (?, ?, ?, ?, ?,?)";

            PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
            preparedStmt.setInt(1, spNum);
            preparedStmt.setInt(2, clientNum);
            preparedStmt.setDate(3, startDate);
            preparedStmt.setTime(4, timeIn);
            preparedStmt.setInt(5, numDay);
            preparedStmt.setInt(6, schedNum);

            preparedStmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("success.jsp");

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
