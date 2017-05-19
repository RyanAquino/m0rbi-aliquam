package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Message;
import java.util.HashMap;
import java.util.ArrayList;

public final class Messages_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/includes/header.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    if (session != null && session.getAttribute("userName") != null) {
   
    } else {

        response.sendRedirect("NoSession.jsp");
        
    }



      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"../plugins/images/icon.png\">\r\n");
      out.write("        <title>Mansanas Tutorials</title>\r\n");
      out.write("        <!-- Bootstrap Core CSS -->\r\n");
      out.write("        <link href=\"bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Menu CSS -->\r\n");
      out.write("        <link href=\"plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- toast CSS -->\r\n");
      out.write("        <link href=\"plugins/bower_components/toast-master/css/jquery.toast.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- morris CSS -->\r\n");
      out.write("        <link href=\"plugins/bower_components/morrisjs/morris.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- chartist CSS -->\r\n");
      out.write("        <link href=\"plugins/bower_components/chartist-js/dist/chartist.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- animation CSS -->\r\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Custom CSS -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- color CSS -->\r\n");
      out.write("        <link href=\"css/colors/default.css\" id=\"theme\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"fix-header\">\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- Preloader -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!--    <div class=\"preloader\">\r\n");
      out.write("                <svg class=\"circular\" viewBox=\"25 25 50 50\">\r\n");
      out.write("                    <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"2\" stroke-miterlimit=\"10\" />\r\n");
      out.write("                </svg>\r\n");
      out.write("            </div>-->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- Wrapper -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("            <!-- Topbar header - style you can find in pages.scss -->\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("            <nav class=\"navbar navbar-default navbar-static-top m-b-0\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <div class=\"top-left-part\">\r\n");
      out.write("                        <!-- Logo -->\r\n");
      out.write("                        <a class=\"logo\" href=\"index.html\">\r\n");
      out.write("                            <!-- Logo icon image, you can use font-icon also --><b>\r\n");
      out.write("                                <!--This is dark logo icon--><img src=\"plugins/images/icon.png\" alt=\"home\" class=\"dark-logo\" /><!--This is light logo icon-->\r\n");
      out.write("                            </b>\r\n");
      out.write("                            <!-- Logo text image you can use text also --><span class=\"hidden-xs\">\r\n");
      out.write("                                <!--This is dark logo text--><img src=\"plugins/images/icon.png\" alt=\"home\" class=\"dark-logo\" /><!--This is light logo text--><img src=\"plugins/images/logo-text.png\" alt=\"home\" class=\"light-logo\" />\r\n");
      out.write("                            </span> </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /Logo -->\r\n");
      out.write("                    <ul class=\"nav navbar-top-links navbar-right pull-right\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"profile-pic\" href=\"#\"> <img src=\"plugins/images/users/varun.jpg\" alt=\"user-img\" width=\"36\" class=\"img-circle\"><b class=\"hidden-xs\">");
      out.print((String) request.getAttribute("name"));
      out.write(' ');
      out.print((String) request.getAttribute("lastname"));
      out.write("</b></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.navbar-header -->\r\n");
      out.write("                <!-- /.navbar-top-links -->\r\n");
      out.write("                <!-- /.navbar-static-side -->\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!-- End Top Navigation -->\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("            <!-- Left Sidebar - style you can find in sidebar.scss  -->\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("            <div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("                <div class=\"sidebar-nav slimscrollsidebar\">\r\n");
      out.write("                    <div class=\"sidebar-head\">\r\n");
      out.write("                        <h3><span class=\"fa-fw open-close\"><i class=\"ti-close ti-menu\"></i></span> <span class=\"hide-menu\">Navigation</span></h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("                        <li style=\"padding: 70px 0 0;\">\r\n");
      out.write("                            <a href=\"HomePage\" class=\"waves-effect\"><i class=\"fa fa-clock-o fa-fw\" aria-hidden=\"true\"></i>Dashboard</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"Messages\" class=\"waves-effect\"><i class=\"fa fa-envelope fa-fw\" aria-hidden=\"true\"></i>Messages</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"Profile.jsp\" class=\"waves-effect\"><i class=\"fa fa-user fa-fw\" aria-hidden=\"true\"></i>Profile</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"NotificationServlet\" class=\"waves-effect\"><i class=\"fa fa-bell fa-fw\" aria-hidden=\"true\"></i>Notifications</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"Transactions\" class=\"waves-effect\"><i class=\"fa fa-money fa-fw\" aria-hidden=\"true\"></i>Transactions</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"logout.jsp\" class=\"waves-effect\"><i class=\"fa fa-sign-out fa-fw\" aria-hidden=\"true\"></i>Logout</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("            <!-- End Left Sidebar -->\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("            <!-- Page Content -->\r\n");
      out.write("            <!-- ============================================================== -->");
      out.write("\r\n");
      out.write("<!-- ============================================================== -->\r\n");
      out.write("<!-- Page Content -->\r\n");
      out.write("<!-- ============================================================== -->\r\n");
      out.write("<div id=\"page-wrapper\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row bg-title\">\r\n");
      out.write("            <div class=\"col-lg-3 col-md-4 col-sm-4 col-xs-12\">\r\n");
      out.write("                <h4 class=\"page-title\"></h4> </div>\r\n");
      out.write("            <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\r\n");
      out.write("                <ol class=\"breadcrumb\">\r\n");
      out.write("                    <li><a href=\"#\">Dashboard</a></li>\r\n");
      out.write("                    <li class=\"active\">Messages</li>\r\n");
      out.write("                </ol>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("        <!-- .row -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12 col-lg-12 col-sm-12\">\r\n");
      out.write("                    <div class=\"white-box\">\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-4 col-xs-6 pull-right\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <h3 class=\"box-title\">Messages</h3>\r\n");
      out.write("                        <div class=\"comment-center p-t-10\">\r\n");
      out.write("\r\n");
      out.write("                            ");
 ArrayList<Message> m = (ArrayList<Message>) request.getAttribute("msgs"); 
      out.write("\r\n");
      out.write("                            ");
 ArrayList<ArrayList<Message>> outer = (ArrayList<ArrayList<Message>>) request.getAttribute("outer"); 
      out.write("\r\n");
      out.write("                            ");
 ArrayList<Message> inner = (ArrayList<Message>) request.getAttribute("inner"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            ");
 for (int x = 0; x < outer.size(); x++) {
      out.write("\r\n");
      out.write("                                ");
 for (int y = 0; y < inner.size(); y++) {
      out.write("\r\n");
      out.write("                            <!-------------------------------------------------------------------------------------------->\r\n");
      out.write("                            <!-- link ni aj here -->\r\n");
      out.write("                            \r\n");
      out.write("                            <a href=\"ViewMessages?id=");
      out.print( outer.get(x).get(0).getSp_id() );
      out.write("\" ><div class=\"comment-body\">\r\n");
      out.write("                                    <div class=\"user-img\"> <img src=\"../plugins/images/users/pawandeep.jpg\" alt=\"user\" class=\"img-circle\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mail-contnet\">\r\n");
      out.write("                                        <h5>");
      out.print( outer.get(x).get(0).getFirstname());
      out.write(' ');
      out.print( outer.get(x).get(0).getLastname());
      out.write("</h5><span class=\"time\">\r\n");
      out.write("                                            ");
      out.print( outer.get(x).get(0).getDate() );
      out.write("\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        <br/><span class=\"mail-desc\">");
      out.print( outer.get(x).get(0).getMsg() );
      out.write("</span>  \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div></a>\r\n");
      out.write("\r\n");
      out.write("                            ");
 }
      out.write("\r\n");
      out.write("                            ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.container-fluid -->\r\n");
      out.write("    <footer class=\"footer text-center\"> 2017 &copy; Mansanas Tutorials brought to you by Group 3 </footer>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /#page-wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- /#wrapper -->\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"../plugins/bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("<script src=\"bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- Menu Plugin JavaScript -->\r\n");
      out.write("<script src=\"../plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js\"></script>\r\n");
      out.write("<!--slimscroll JavaScript -->\r\n");
      out.write("<script src=\"js/jquery.slimscroll.js\"></script>\r\n");
      out.write("<!--Wave Effects -->\r\n");
      out.write("<script src=\"js/waves.js\"></script>\r\n");
      out.write("<!-- Custom Theme JavaScript -->\r\n");
      out.write("<script src=\"js/custom.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
