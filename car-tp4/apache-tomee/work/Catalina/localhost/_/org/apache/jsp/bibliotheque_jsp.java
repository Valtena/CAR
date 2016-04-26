/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat (TomEE)/7.0.55 (1.7.1)
 * Generated at: 2016-04-26 01:53:36 UTC
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

public final class bibliotheque_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<h1>Biblioth&egrave;que</h1>\r\n");
      out.write("\r\n");

	List<String> errors = (List<String>) request.getAttribute("error");
	if (errors != null) {
		for (String error : errors) {
			out.print(error + "<br/>");
		}
	}

      out.write("\r\n");
      out.write("\r\n");

	BookLibItf bookLib = (BookLibItf) session.getAttribute("library");
	Panier panier = (Panier)session.getAttribute("panier");
	if (bookLib == null) {  


      out.write("\r\n");
      out.write("\r\n");
      out.write("\tLe contenu n'est pas initialis&eacute;, veuillez l'initialiser : <a href='/init'>Cliquez ici</a><br/>\r\n");
      out.write("\t\r\n");

	}
	else {

      out.write("\r\n");
      out.write("\t<p id=\"nbLivrePanier\"> Vous avez actuellement ");
      out.print(panier.getNbArticles());
      out.write(" livres dans votre <a href='/panier.jsp'>panier</a></p>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Auteur</td>\r\n");
      out.write("\t\t\t<td>Titre</td>\r\n");
      out.write("\t\t\t<td>Ann&eacute;e</td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t</tr>\r\n");
		for (BookDAO book : bookLib.getBooks()) {
			out.print("<tr>");
			out.print("<td>"+book.getAuthor()+"</td>");
			out.print("<td>"+book.getTitle()+"</td>");
			out.print("<td>"+book.getYear()+"</td>");
			out.print("<td><a href='/addPanier?id="+book.id +"'>+</a></td>");
			out.print("</tr>");
		}

      out.write("\r\n");
      out.write("</table>\r\n");

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<a href='/form_ajout.jsp'>Form</a><br/>\r\n");
      out.write("\r\n");
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
