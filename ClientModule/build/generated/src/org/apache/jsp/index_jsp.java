package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user == null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("    <c:redirect url=\"NoSession.jsp\"/>\r\n");
      out.write("</c:if>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"../plugins/images/favicon.png\">\r\n");
      out.write("    <title>Tutorial A+</title>\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Menu CSS -->\r\n");
      out.write("    <link href=\"../plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- toast CSS -->\r\n");
      out.write("    <link href=\"../plugins/bower_components/toast-master/css/jquery.toast.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- morris CSS -->\r\n");
      out.write("    <link href=\"../plugins/bower_components/morrisjs/morris.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- chartist CSS -->\r\n");
      out.write("    <link href=\"../plugins/bower_components/chartist-js/dist/chartist.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- animation CSS -->\r\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- color CSS -->\r\n");
      out.write("    <link href=\"css/colors/default.css\" id=\"theme\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"fix-header\">\r\n");
      out.write("    <!-- ============================================================== -->\r\n");
      out.write("    <!-- Preloader -->\r\n");
      out.write("    <!-- ============================================================== -->\r\n");
      out.write("<!--    <div class=\"preloader\">\r\n");
      out.write("        <svg class=\"circular\" viewBox=\"25 25 50 50\">\r\n");
      out.write("            <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"2\" stroke-miterlimit=\"10\" />\r\n");
      out.write("        </svg>\r\n");
      out.write("    </div>-->\r\n");
      out.write("    <!-- ============================================================== -->\r\n");
      out.write("    <!-- Wrapper -->\r\n");
      out.write("    <!-- ============================================================== -->\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- Topbar header - style you can find in pages.scss -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top m-b-0\">\r\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/fragments/header.html", out, false);
      out.write("\r\n");
      out.write("            <!-- /.navbar-header -->\r\n");
      out.write("            <!-- /.navbar-top-links -->\r\n");
      out.write("            <!-- /.navbar-static-side -->\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- End Top Navigation -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- Left Sidebar - style you can find in sidebar.scss  -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("            <div class=\"sidebar-nav slimscrollsidebar\">\r\n");
      out.write("                <div class=\"sidebar-head\">\r\n");
      out.write("                    <h3><span class=\"fa-fw open-close\"><i class=\"ti-close ti-menu\"></i></span> <span class=\"hide-menu\">Navigation</span></h3>\r\n");
      out.write("                </div>\r\n");
      out.write("              ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/fragments/nav.html", out, false);
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- End Left Sidebar -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- Page Content -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <div id=\"page-wrapper\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row bg-title\">\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-4 col-sm-4 col-xs-12\">\r\n");
      out.write("                        <h4 class=\"page-title\">Dashboard</h4> </div>\r\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li><a href=\"#\">Dashboard</a></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.col-lg-12 -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("                <!-- Different data widgets -->\r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("                <!-- .row -->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6 col-xs-12\">\r\n");
      out.write("                        <div class=\"white-box analytics-info\">\r\n");
      out.write("                            <h3 class=\"box-title\"><a href=\"SearchCategoryServlet?name=academics\">Academics</a></h3>\r\n");
      out.write("                            <ul class=\"list-inline two-part\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"\" class=\"waves-effect\"><i class=\"fa fa-graduation-cap fa-fw\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"text-right\"><i class=\"ti-arrow-up text-success\"></i> <span class=\"counter text-success\">60</span></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-sm-4 col-xs-4\">\r\n");
      out.write("                        <div class=\"white-box analytics-info\">\r\n");
      out.write("                            <h3 class=\"box-title\"><a href=\"SearchCategoryServlet?name=music\">Music</a> </h3>\r\n");
      out.write("                            <ul class=\"list-inline two-part\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div id=\"\"><a href=\"\" class=\"waves-effect\"><i class=\"fa fa-music fa-fw\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"text-right\"><i class=\"ti-arrow-up text-purple\"></i> <span class=\"counter text-purple\">9</span></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-sm-6 col-xs-12\">\r\n");
      out.write("                        <div class=\"white-box analytics-info\">\r\n");
      out.write("                            <h3 class=\"box-title\"><a href=\"SearchCategoryServlet?name=perf_arts\">Performing Arts</a></h3>\r\n");
      out.write("                            <ul class=\"list-inline two-part\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div id=\"\"><a href=\"\" class=\"waves-effect\"><i class=\"fa fa-magic fa-fw\" aria-hidden=\"true\"></i></a></div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"text-right\"><i class=\"ti-arrow-up text-info\"></i> <span class=\"counter text-info\">11</span></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-4 col-sm-6 col-xs-12\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12 col-lg-12 col-sm-12\">\r\n");
      out.write("                        <div class=\"white-box\">\r\n");
      out.write("                            <div class=\"col-md-3 col-sm-4 col-xs-6 pull-right\">\r\n");
      out.write("                                <select class=\"form-control pull-right row b-none\">\r\n");
      out.write("                                    <option>March 2017</option>\r\n");
      out.write("                                    <option>April 2017</option>\r\n");
      out.write("                                    <option>May 2017</option>\r\n");
      out.write("                                    <option>June 2017</option>\r\n");
      out.write("                                    <option>July 2017</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h3 class=\"box-title\">Calendar</h3>\r\n");
      out.write("                            <div class=\"table-responsive\">\r\n");
      out.write("                                <table class=\"table\">\r\n");
      out.write("                                    <!--add the calendar here-->\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("                <!-- chat-listing & recent comments -->\r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("                \r\n");
      out.write("                    <!-- /.col -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.container-fluid -->\r\n");
      out.write("            <footer class=\"footer text-center\"> 2017 &copy; Ample Admin brought to you by wrappixel.com </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- End Page Content -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ============================================================== -->\r\n");
      out.write("    <!-- End Wrapper -->\r\n");
      out.write("    <!-- ============================================================== -->\r\n");
      out.write("    <!-- ============================================================== -->\r\n");
      out.write("    <!-- All Jquery -->\r\n");
      out.write("    <!-- ============================================================== -->\r\n");
      out.write("    <script src=\"../plugins/bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Menu Plugin JavaScript -->\r\n");
      out.write("    <script src=\"../plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js\"></script>\r\n");
      out.write("    <!--slimscroll JavaScript -->\r\n");
      out.write("    <script src=\"js/jquery.slimscroll.js\"></script>\r\n");
      out.write("    <!--Wave Effects -->\r\n");
      out.write("    <script src=\"js/waves.js\"></script>\r\n");
      out.write("    <!--Counter js -->\r\n");
      out.write("    <script src=\"../plugins/bower_components/waypoints/lib/jquery.waypoints.js\"></script>\r\n");
      out.write("    <script src=\"../plugins/bower_components/counterup/jquery.counterup.min.js\"></script>\r\n");
      out.write("    <!-- chartist chart -->\r\n");
      out.write("    <script src=\"../plugins/bower_components/chartist-js/dist/chartist.min.js\"></script>\r\n");
      out.write("    <script src=\"../plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.min.js\"></script>\r\n");
      out.write("    <!-- Sparkline chart JavaScript -->\r\n");
      out.write("    <script src=\"../plugins/bower_components/jquery-sparkline/jquery.sparkline.min.js\"></script>\r\n");
      out.write("    <!-- Custom Theme JavaScript -->\r\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\r\n");
      out.write("    <script src=\"js/dashboard1.js\"></script>\r\n");
      out.write("    <script src=\"../plugins/bower_components/toast-master/js/jquery.toast.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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