package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/demo_reg.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style_reg.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/animate-custom_reg.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Student Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section>\t\t\t\t\n");
      out.write("            <div id=\"container_demo\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"wrapper\">\n");
      out.write("                  \n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"animate form\">\n");
      out.write("                        <form  action=\"StudentRegistration\" autocomplete=\"on\" method=\"post\"> \n");
      out.write("                            <h1> Student Registration </h1> \n");
      out.write("                            <p> \n");
      out.write("                                <label>Your full name</label>\n");
      out.write("                                <input  name=\"std_name\" type=\"text\" placeholder=\"eg. Md. Rafayet Alam\" />\n");
      out.write("                            </p>\n");
      out.write("                            <p> \n");
      out.write("                                <label>Your Username</label>\n");
      out.write("                                <input  name=\"std_username\" type=\"text\" placeholder=\"eg. Rafayet\" />\n");
      out.write("                            </p>\n");
      out.write("                            <p> \n");
      out.write("                                <label>Your password </label>\n");
      out.write("                                <input  name=\"std_password\"  type=\"password\" placeholder=\"eg. X8df!90EO\"/>\n");
      out.write("                            </p>\n");
      out.write("                            <p> \n");
      out.write("                                <label>Your Full Address</label>\n");
      out.write("                                <input  name=\"std_address\"  type=\"text\" placeholder=\"eg. Khulna\" />\n");
      out.write("                            </p>\n");
      out.write("                              <p> \n");
      out.write("                                <label>Your Email</label>\n");
      out.write("                                <input  name=\"std_email\"  type=\"email\" placeholder=\"eg. rafayet.monon@gmail.com\" />\n");
      out.write("                            </p>\n");
      out.write("                            <p> \n");
      out.write("                                <label>Your Contact Number</label>\n");
      out.write("                                <input name=\"std_phn\"  type=\"text\" placeholder=\"eg. 01712...\"/> \n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("\n");
      out.write("                                <label>Select Gender</label>\n");
      out.write("\n");
      out.write("                                <select  name=\"std_gender\" >\n");
      out.write("                                    <option>Male</option>\n");
      out.write("                                    <option>Female</option>\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                            \n");
      out.write("                            <p>\n");
      out.write("\n");
      out.write("                                <label>Select Blood Group</label>\n");
      out.write("\n");
      out.write("                                <select  name=\"std_blood\" >\n");
      out.write("                                    <option>A+</option>\n");
      out.write("                                    <option>A-</option>\n");
      out.write("                                    <option>AB+</option>\n");
      out.write("                                    <option>AB-</option>\n");
      out.write("                                    <option>B+</option>\n");
      out.write("                                    <option>B-</option>\n");
      out.write("                                    <option>O+</option>\n");
      out.write("                                    <option>O+</option>\n");
      out.write("                                </select>\n");
      out.write("                        \n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                   <label>Select Religion</label>\n");
      out.write("                              <select  name=\"std_religion\" >\n");
      out.write("                                    <option>Muslim</option>\n");
      out.write("                                    <option>Hindu</option>\n");
      out.write("                                    <option>Christian</option>\n");
      out.write("                                    <option>Bouddho</option>\n");
      out.write("                             \n");
      out.write("                                </select>\n");
      out.write("                            </p>\n");
      out.write("                           <p> \n");
      out.write("                                <label>Your Roll No.</label>\n");
      out.write("                                <input name=\"std_roll\"  type=\"text\" placeholder=\"eg. 1202028\"/> \n");
      out.write("                            </p>\n");
      out.write("                     <p> \n");
      out.write("                                <label>Your Registration no</label>\n");
      out.write("                                <input name=\"std_reg\"  type=\"text\" placeholder=\"eg. 03653\"/> \n");
      out.write("                            </p>\n");
      out.write("                           <p>\n");
      out.write("\n");
      out.write("                                <label>Select Class</label>\n");
      out.write("\n");
      out.write("                                <select  name=\"std_class\" >\n");
      out.write("                                    <option>1</option>\n");
      out.write("                                    <option>2</option>\n");
      out.write("                                    <option>3</option>\n");
      out.write("                                    <option>4</option>\n");
      out.write("                                    <option>5</option>\n");
      out.write("                                    <option>6</option>\n");
      out.write("                                    <option>7</option>\n");
      out.write("                                    <option>8</option>\n");
      out.write("                                    <option>9</option>\n");
      out.write("                                    <option>10</option>\n");
      out.write("                                </select>\n");
      out.write("                        \n");
      out.write("                            </p>\n");
      out.write("                            <p> <!-- Date input -->\n");
      out.write("        <label class=\"control-label\" for=\"date\">Birth Date</label>\n");
      out.write("        <input class=\"form-control\" id=\"date\" name=\"std_date\" placeholder=\"DD/MM/YYYY\" type=\"text\"/>\n");
      out.write("      </p>\n");
      out.write("                            \n");
      out.write("                      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <p class=\"signin button\"> \n");
      out.write("                                <input type=\"submit\" value=\"Sign up\"/> \n");
      out.write("                            </p>\n");
      out.write("                            <p class=\"change_link\">  \n");
      out.write("                                Already Registered ?\n");
      out.write("                                <a href=\"student_login.jsp\"> Go and log in </a>\n");
      out.write("                            </p>\n");
      out.write("                        </form>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>  \n");
      out.write("        </section>\n");
      out.write("    </body>\n");
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
