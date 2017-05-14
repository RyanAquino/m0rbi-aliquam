package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");


                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial", "root", "");
                Object firstname = session.getAttribute("firstname");
                String sql = "SELECT * FROM client where firstname = " + firstname + "";
	        Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String name = null;
	        String lastname = null;
                String email = null;
	        String password = null;
                    if(rs.next()){
	            	name = rs.getString("firstname");
	            	lastname = rs.getString("lastname");
                        email = rs.getString("email");
                        password = rs.getString("password");
	            }
                    

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"plugins/images/favicon.png\">\n");
      out.write("    <title>Tutor A+</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Menu CSS -->\n");
      out.write("    <link href=\"plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- animation CSS -->\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- color CSS -->\n");
      out.write("    <link href=\"css/colors/default.css\" id=\"theme\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fix-header\">\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Preloader -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Wrapper -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Topbar header - style you can find in pages.scss -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top m-b-0\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <div class=\"top-left-part\">\n");
      out.write("                    <!-- Logo -->\n");
      out.write("                    <a class=\"logo\" href=\"index.jsp\">\n");
      out.write("                        <!-- Logo icon image, you can use font-icon also --><b>\n");
      out.write("                        <!--This is dark logo icon--><img src=\"plugins/images/admin-logo.png\" alt=\"home\" class=\"dark-logo\" /><!--This is light logo icon--><img src=\"plugins/images/admin-logo-dark.png\" alt=\"home\" class=\"light-logo\" />\n");
      out.write("                     </b>\n");
      out.write("                        <!-- Logo text image you can use text also --><span class=\"hidden-xs\">\n");
      out.write("                        <!--This is dark logo text--><img src=\"plugins/images/admin-text.png\" alt=\"home\" class=\"dark-logo\" /><!--This is light logo text--><img src=\"plugins/images/admin-text-dark.png\" alt=\"home\" class=\"light-logo\" />\n");
      out.write("                     </span> </a>\n");
      out.write("                </div>\n");
      out.write("                <!-- /Logo -->\n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right pull-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <form role=\"search\" class=\"app-search hidden-sm hidden-xs m-r-10\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Search...\" class=\"form-control\"> <a href=\"\"><i class=\"fa fa-search\"></i></a> </form>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"profile-pic\" href=\"#\"> <img src=\"plugins/images/users/varun.jpg\" alt=\"user-img\" width=\"36\" class=\"img-circle\"><b class=\"hidden-xs\">Client</b></a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-header -->\n");
      out.write("            <!-- /.navbar-top-links -->\n");
      out.write("            <!-- /.navbar-static-side -->\n");
      out.write("        </nav>\n");
      out.write("        <!-- End Top Navigation -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Left Sidebar - style you can find in sidebar.scss  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-nav slimscrollsidebar\">\n");
      out.write("                <div class=\"sidebar-head\">\n");
      out.write("                    <h3><span class=\"fa-fw open-close\"><i class=\"ti-close ti-menu\"></i></span> <span class=\"hide-menu\">Navigation</span></h3>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                    <li style=\"padding: 70px 0 0;\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"waves-effect\"><i class=\"fa fa-clock-o fa-fw\" aria-hidden=\"true\"></i>Dashboard</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Messages.jsp\" class=\"waves-effect\"><i class=\"fa fa-envelope fa-fw\" aria-hidden=\"true\"></i>Messages</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Profile.jsp\" class=\"waves-effect\"><i class=\"fa fa-user fa-fw\" aria-hidden=\"true\"></i>Profile</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Notification.jsp\" class=\"waves-effect\"><i class=\"fa fa-bell fa-fw\" aria-hidden=\"true\"></i>Notifications</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Transactions.jsp\" class=\"waves-effect\"><i class=\"fa fa-money fa-fw\" aria-hidden=\"true\"></i>Transactions</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- End Left Sidebar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row bg-title\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                        <h4 class=\"page-title\">Profile page</h4> </div>\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\">Dashboard</a></li>\n");
      out.write("                            <li class=\"active\">Profile Page</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("                <!-- .row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 col-xs-12\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <div class=\"user-bg\"> <img width=\"100%\" alt=\"user\" src=\"plugins/images/large/img1.jpg\">\n");
      out.write("                                <div class=\"overlay-box\">\n");
      out.write("                                    <div class=\"user-content\">\n");
      out.write("                                        <a href=\"javascript:void(0)\"><img src=\"plugins/images/users/genu.jpg\" class=\"thumb-lg img-circle\" alt=\"img\"></a>\n");
      out.write("                                        <h4 class=\"text-white\">User Name</h4>\n");
      out.write("                                        <h5 class=\"text-white\">info@myadmin.com</h5> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                        <h2 class=\"box-title\">Schedule</h2>\n");
      out.write("                            <table class=\"table\">\n");
      out.write("                                    <form action=\"checkbox\">\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Monday</td>\n");
      out.write("                                            <td>10:00-11:00</td>\n");
      out.write("                                        </tr>                                        <tr>\n");
      out.write("                                            <td>Tuesday</td>\n");
      out.write("                                            <td>Not Available</td>\n");
      out.write("                                        </tr>                                        <tr>\n");
      out.write("                                            <td>Wednesday</td>\n");
      out.write("                                            <td>Not Available</td>\n");
      out.write("                                        </tr>                                        <tr>\n");
      out.write("                                            <td>Thursday</td>\n");
      out.write("                                            <td>10:00-11:00</td>\n");
      out.write("                                        </tr>                                        <tr>\n");
      out.write("                                            <td>Friday</td>\n");
      out.write("                                            <td>7:30-9:00</td>\n");
      out.write("                                        </tr>                                        <tr>\n");
      out.write("                                            <td>Saturday</td>\n");
      out.write("                                            <td>1:00-2:00</td>\n");
      out.write("                                        </tr>                                        <tr>\n");
      out.write("                                            <td>Sundayday</td>\n");
      out.write("                                            <td>Not Available</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                    </tbody>\n");
      out.write("                                    </form>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-8 col-xs-12\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <form class=\"form-horizontal form-material\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Full Name</label>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"");
      out.print(name);
      out.write("\" class=\"form-control form-control-line\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"example-email\" class=\"col-md-12\">Email</label>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"email\" placeholder=\"");
      out.print(email);
      out.write("\" class=\"form-control form-control-line\" name=\"example-email\" id=\"example-email\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Password</label>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"password\" value=\"password\" class=\"form-control form-control-line\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Phone No</label>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"123 456 7890\" class=\"form-control form-control-line\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Message</label>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <textarea rows=\"5\" class=\"form-control form-control-line\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-sm-12\">Select Country</label>\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <select class=\"form-control form-control-line\">\n");
      out.write("                                            <option>London</option>\n");
      out.write("                                            <option>India</option>\n");
      out.write("                                            <option>Usa</option>\n");
      out.write("                                            <option>Canada</option>\n");
      out.write("                                            <option>Thailand</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <button class=\"btn btn-success\"><i class=\"fa fa-edit fa-fw\"></i><a href=\"edit-prof.html\">Edit Profile</a></button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("            <footer class=\"footer text-center\"> 2017 &copy; Ample Admin brought to you by wrappixel.com </footer>\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-wrapper -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"plugins/bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Menu Plugin JavaScript -->\n");
      out.write("    <script src=\"plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js\"></script>\n");
      out.write("    <!--slimscroll JavaScript -->\n");
      out.write("    <script src=\"js/jquery.slimscroll.js\"></script>\n");
      out.write("    <!--Wave Effects -->\n");
      out.write("    <script src=\"js/waves.js\"></script>\n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\n");
      out.write("</body>  \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
