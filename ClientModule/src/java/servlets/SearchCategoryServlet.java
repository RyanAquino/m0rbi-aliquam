package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mai Radie
 */
@WebServlet(name = "SearchCategoryServlet", urlPatterns = {"/SearchCategoryServlet"})
public class SearchCategoryServlet extends HttpServlet {

      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
         HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("user") == null) {
            String url = response.encodeRedirectURL("NoSession.jsp");
            response.sendRedirect(url);
        } else {
            
            
            String academics = request.getParameter("academics");
            
            
            
            
        }
        
    }

}
