/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat (TomEE)/7.0.55 (1.7.1)
 * Generated at: 2016-04-26 01:53:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import car.tp4.*;

public final class form_005fajout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<h1>Formulaire d'ajout de livre</h1>\r\n");

	BookLibItf bookLib = (BookLibItf) session.getAttribute("library");
	if (bookLib == null) {  


      out.write("\r\n");
      out.write("\r\n");
      out.write("\tLe contenu n'est pas initialis&eacute;, veuillez l'initialiser : <a href='/init'>Cliquez ici</a><br/>\r\n");
      out.write("\t\r\n");

	}else {

String author = "";
String title = "";
String year = "";
if ( request.getParameter("author") != null ) {
out.print("Le livre suivant a &eacute;t&eacute; ajout&eacute;:<br/>");
author = request.getParameter("author");
title = request.getParameter("title");
year = request.getParameter("year");
    out.print("Auteur : "+author+"<br/>");
    out.print("Titre : "+title+"<br/>");
    out.print("Ann&eacute;e : "+year+"<br/><br/>");
    out.print("Vous pouvez ajouter un autre livre en compl&eacute;tant a nouveau le formulaire.<br/><p/>");
}


      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/ajoutLivre\">\r\n");
      out.write("Auteur : <input type=\"text\" name=\"author\" required value=\"");
      out.print(author);
      out.write("\"><br/>\r\n");
      out.write("Titre : <input type=\"text\" name=\"title\" required value=\"");
      out.print(title);
      out.write("\"><br/>\r\n");
      out.write("Ann&eacute;e : <input type=\"number\" name=\"year\" required value=\"");
      out.print(year);
      out.write("\"><br/>\r\n");
      out.write("<input type=\"submit\">\r\n");
      out.write("</form>\r\n");

}

      out.write("\r\n");
      out.write("<a href='/autors.jsp'>Les auteurs présents</a><br/>\r\n");
      out.write("<a href='/bibliotheque.jsp'>La bibliotheque</a><br/>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
