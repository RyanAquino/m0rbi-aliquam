package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mai Radie
 */
@WebServlet(urlPatterns = {"/MessageServlet"})
public class MessageServlet extends HttpServlet {

    
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("sp_name");
       
         try {
            Class.forName("com.mysql.jdbc.Driver");
            
            String connUrl = "jdbc:mysql://localhost:3306/tutorial?user=root&password=";
            Connection conn = DriverManager.getConnection(connUrl);
            
            String sql = "SELECT * FROM message WHERE firstname = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            
            ResultSet rs = ps.executeQuery();
            if (rs.first()) {
                byte[] imageData = rs.getBytes("data");
//                
//                response.setStatus(HttpServletResponse.SC_OK);
//                response.setContentType("image/jpg");
//                response.setContentLength(imageData.length);
//                
//                ServletOutputStream os = response.getOutputStream();
//                os.write(imageData);
//                os.flush();
//                os.close();
            } else {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            }
            
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
//            Logger.getLogger(ImageServlet.class.getName()).log(Level.SEVERE, null, e);
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }

        try (PrintWriter out = response.getWriter()) {
            response.setStatus(HttpServletResponse.SC_OK);
            response.setContentType("text/html");

            out.printf(
                    "<!DOCTYPE html>\n<html>\n<head>\n"
                    + "    <title>Servlet Demo: Handling Request Parameters (GET)</title>\n"
                    + "    <style>\n        h1 { color: %s; }\n    </style>\n"
                    + "</head>\n<body>\n"
                    + "    <h1>Hello, %s!</h1>\n"
                    + "</body>\n</html>\n",
                    color, name);
        }
    }
    
}