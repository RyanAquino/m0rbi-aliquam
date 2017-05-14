package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import classes.Category;
import java.util.ArrayList;
import classes.ServiceProvider;
import classes.Generate;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"plugins/images/favicon.png\">\r\n");
      out.write("    <title>Tutorial A+</title>\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Menu CSS -->\r\n");
      out.write("    <link href=\"plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- toast CSS -->\r\n");
      out.write("    <link href=\"plugins/bower_components/toast-master/css/jquery.toast.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- morris CSS -->\r\n");
      out.write("    <link href=\"plugins/bower_components/morrisjs/morris.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- chartist CSS -->\r\n");
      out.write("    <link href=\"plugins/bower_components/chartist-js/dist/chartist.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.css\" rel=\"stylesheet\">\r\n");
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
      out.write("    <div class=\"preloader\">\r\n");
      out.write("        <svg class=\"circular\" viewBox=\"25 25 50 50\">\r\n");
      out.write("            <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"2\" stroke-miterlimit=\"10\" />\r\n");
      out.write("        </svg>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ============================================================== -->\r\n");
      out.write("    <!-- Wrapper -->\r\n");
      out.write("    <!-- ============================================================== -->\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- Topbar header - style you can find in pages.scss -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top m-b-0\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <div class=\"top-left-part\">\r\n");
      out.write("                    <!-- Logo -->\r\n");
      out.write("                    <a class=\"logo\" href=\"index.html\">\r\n");
      out.write("                        <!-- Logo icon image, you can use font-icon also --><b>\r\n");
      out.write("                        <!--This is dark logo icon--><img src=\"plugins/images/admin-logo.png\" alt=\"home\" class=\"dark-logo\" /><!--This is light logo icon--><img src=\"plugins/images/admin-logo-dark.png\" alt=\"home\" class=\"light-logo\" />\r\n");
      out.write("                     </b>\r\n");
      out.write("                        <!-- Logo text image you can use text also --><span class=\"hidden-xs\">\r\n");
      out.write("                        <!--This is dark logo text--><img src=\"plugins/images/admin-text.png\" alt=\"home\" class=\"dark-logo\" /><!--This is light logo text--><img src=\"plugins/images/admin-text-dark.png\" alt=\"home\" class=\"light-logo\" />\r\n");
      out.write("                     </span> </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /Logo -->\r\n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right pull-right\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <form role=\"search\" class=\"app-search hidden-sm hidden-xs m-r-10\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"Search...\" class=\"form-control\"> <a href=\"\"><i class=\"fa fa-search\"></i></a> </form>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"profile-pic\" href=\"#\"> <img src=\"plugins/images/users/varun.jpg\" alt=\"user-img\" width=\"36\" class=\"img-circle\"><b class=\"hidden-xs\">");
      out.print((String)request.getAttribute("name") );
      out.write(' ');
      out.print((String)request.getAttribute("lastname") );
      out.write("</b></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
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
      out.write("                <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("                    <li style=\"padding: 70px 0 0;\">\r\n");
      out.write("                        <a href=\"index.jsp\" class=\"waves-effect\"><i class=\"fa fa-clock-o fa-fw\" aria-hidden=\"true\"></i>Dashboard</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"Messages.jsp\" class=\"waves-effect\"><i class=\"fa fa-envelope fa-fw\" aria-hidden=\"true\"></i>Messages</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"Profile.jsp\" class=\"waves-effect\"><i class=\"fa fa-user fa-fw\" aria-hidden=\"true\"></i>Profile</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"NotificationServlet\" class=\"waves-effect\"><i class=\"fa fa-bell fa-fw\" aria-hidden=\"true\"></i>Notifications</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"Transactions.jsp\" class=\"waves-effect\"><i class=\"fa fa-money fa-fw\" aria-hidden=\"true\"></i>Transactions</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"Home.jsp\" class=\"waves-effect\"><i class=\"fa fa-sign-out fa-fw\" aria-hidden=\"true\"></i>Logout</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- End Left Sidebar -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- Page Content -->\r\n");
      out.write("        <!-- ============================================================== -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
ArrayList<Category> categList = (ArrayList<Category>) request.getAttribute("categList"); 
      out.write('\r');
      out.write('\n');
ArrayList<ServiceProvider> spList = (ArrayList<ServiceProvider>) request.getAttribute("spList"); 
      out.write('\r');
      out.write('\n');
ArrayList<String> nameList = new ArrayList<String>();
    String name = null;
    for (int i = 0; i < categList.size(); i++) {
        name = categList.get(i).getCategory();
        nameList.add(name);
    }
    request.setAttribute("nameList", nameList);
    request.setAttribute("parame", request.getParameter("cat"));
    request.setAttribute("parameTwo", request.getParameter("serv"));


      out.write(" \r\n");
 ArrayList<String> servList = new ArrayList<String>();


      out.write("\r\n");
      out.write("\r\n");
      out.write("%>\r\n");
      out.write("\r\n");
      out.write("<div id=\"page-wrapper\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row bg-title\">\r\n");
      out.write("            <div class=\"col-lg-3 col-md-4 col-sm-4 col-xs-12\">\r\n");
      out.write("                <h4 class=\"page-title\">Dashboard</h4> </div>\r\n");
      out.write("            <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\r\n");
      out.write("                <ol class=\"breadcrumb\">\r\n");
      out.write("                    <li><a href=\"#\">Dashboard</a></li>\r\n");
      out.write("                </ol>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.col-lg-12 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- Different data widgets -->\r\n");
      out.write("        <!-- ============================================================== -->\r\n");
      out.write("        <!-- .row -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
                                     if (categList.size() > 0) {
                    for (int i = 0; i < categList.size(); i++) {
                        out.print(Generate.generateMainBoard(categList.get(i).getCategory(), categList.get(i).getNumService()));
                    }
                }
            
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--PLACE LOOP FOR GENERATING CODE CATEGORIES HERE -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12 col-lg-12 col-sm-12\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- place drowpdown loop code here -->\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("                <!-- /.col -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container-fluid -->\r\n");
      out.write("        ");
      out.write("    <footer class=\"footer text-center\"> 2017 &copy; Tutor A+ </footer>\r\n");
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
      out.write("    <script src=\"plugins/bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Menu Plugin JavaScript -->\r\n");
      out.write("    <script src=\"plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js\"></script>\r\n");
      out.write("    <!--slimscroll JavaScript -->\r\n");
      out.write("    <script src=\"js/jquery.slimscroll.js\"></script>\r\n");
      out.write("    <!--Wave Effects -->\r\n");
      out.write("    <script src=\"js/waves.js\"></script>\r\n");
      out.write("    <!--Counter js -->\r\n");
      out.write("    <script src=\"plugins/bower_components/waypoints/lib/jquery.waypoints.js\"></script>\r\n");
      out.write("    <script src=\"plugins/bower_components/counterup/jquery.counterup.min.js\"></script>\r\n");
      out.write("    <!-- chartist chart -->\r\n");
      out.write("    <script src=\"plugins/bower_components/chartist-js/dist/chartist.min.js\"></script>\r\n");
      out.write("    <script src=\"plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.min.js\"></script>\r\n");
      out.write("    <!-- Sparkline chart JavaScript -->\r\n");
      out.write("    <script src=\"plugins/bower_components/jquery-sparkline/jquery.sparkline.min.js\"></script>\r\n");
      out.write("    <!-- Custom Theme JavaScript -->\r\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\r\n");
      out.write("    <script src=\"js/dashboard1.js\"></script>\r\n");
      out.write("    <script src=\"plugins/bower_components/toast-master/js/jquery.toast.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("param");
    _jspx_th_c_set_0.setValue(new String("null"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <div class=\"white-box\">\r\n");
        out.write("                            <div class=\"col-md-3 col-sm-4 col-xs-6 pull-right\">\r\n");
        out.write("                                <select class=\"form-control pull-right row b-none\" id=\"mySelect\" >\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("                               \r\n");
        out.write("                                </select>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <h3 class=\"box-title\">");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</h3> \r\n");
        out.write("                                <button type=\"button\" class=\"btn btn-primary\" onclick='addParameter()'>Search</button> \r\n");
        out.write("                            </div>\r\n");
        out.write("\r\n");
        out.write("                            <div class=\"white-box\" >\r\n");
        out.write("                                <h3 class=\"box-title\">Instructors</h3> \r\n");
        out.write("                                <div class=\"table-responsive\">\r\n");
        out.write("                                    <div class=\"col--4 col-xs-12\">\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                        <!-- Start of user div -->\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                    <!-- End of user div -->\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <table class=\"table\">\r\n");
        out.write("\r\n");
        out.write("                        </table>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                    </div>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("category");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" \r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${parame == category.category }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_1.setVar("list");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.servList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                <option>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("</option>\r\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${parame}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_2.setVar("students");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${spServ}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        ");
          if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_forEach_3.setVar("services");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${students.subjList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${parameTwo == services }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <div class=\"white-box\">\r\n");
        out.write("                                                    <div class=\"user-bg\"> \r\n");
        out.write("                                                        <div class=\"overlay-box\">\r\n");
        out.write("                                                            <div class=\"user-content\">\r\n");
        out.write("                                                                <h2 class=\"text-white\">");
        if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("<br></h2>\r\n");
        out.write("                                                                <h6 class=\"text-white\">If your looking someone ...</h6>\r\n");
        out.write("                                                                <a href=\"/tutorplus/CheckProvider\"><button type=\"click\">View tutor</button></a>\r\n");
        out.write("                                                            </div>\r\n");
        out.write("                                                        </div>\r\n");
        out.write("                                                    </div> \r\n");
        out.write("                                                </div>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${students.firstName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }
}
