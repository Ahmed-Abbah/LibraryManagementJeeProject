/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-12 23:54:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Abbah.Ahmed.*;
import java.util.List;

public final class DocumentDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("Abbah.Ahmed");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Client</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets2/css/style.css\">\r\n");
      out.write("    \r\n");
      out.write("	<!-- Include SweetAlert CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.0.17/dist/sweetalert2.min.css\">\r\n");
      out.write("<!-- Include SweetAlert JS -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.0.17/dist/sweetalert2.min.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- =============== Navigation ================ -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"navigation\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <!-- <span class=\"icon\">\r\n");
      out.write("                            <ion-icon name=\"logo-apple\"></ion-icon>\r\n");
      out.write("                        </span> -->\r\n");
      out.write("                        <span class=\"title\">BiblioTech</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <form method=\"POST\">\r\n");
      out.write("		  <a href	=\"showDocuments\">\r\n");
      out.write("        <span class=\"icon\">\r\n");
      out.write("            <ion-icon name=\"log-out-outline\"></ion-icon>\r\n");
      out.write("        </span>\r\n");
      out.write("        <span class=\"title\">Documents</span>\r\n");
      out.write("    </a>\r\n");
      out.write("		</form>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <span class=\"icon\">\r\n");
      out.write("                            <ion-icon name=\"settings-outline\"></ion-icon>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span class=\"title\">Profile</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <span class=\"icon\">\r\n");
      out.write("                            <ion-icon name=\"lock-closed-outline\"></ion-icon>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span class=\"title\">Password</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li>\r\n");
      out.write("		<form method=\"POST\">\r\n");
      out.write("		  <a href	=\"logout\">\r\n");
      out.write("        <span class=\"icon\">\r\n");
      out.write("            <ion-icon name=\"log-out-outline\"></ion-icon>\r\n");
      out.write("        </span>\r\n");
      out.write("        <span class=\"title\">Sign Out</span>\r\n");
      out.write("    </a>\r\n");
      out.write("		</form>\r\n");
      out.write("              \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- ========================= Main ==================== -->\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <div class=\"topbar\">\r\n");
      out.write("                <div class=\"toggle\">\r\n");
      out.write("                    <ion-icon name=\"menu-outline\"></ion-icon>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"search\">\r\n");
      out.write("                    <label>\r\n");
      out.write("                    <form action=\"../interpreter\" id=\"interpreter-form\">\r\n");
      out.write("                    	<input type=\"text\" name=\"input\" id=\"input\" class=\"form-control mr-2 align-self-center\" placeholder=\"Search here\">\r\n");
      out.write("                    	\r\n");
      out.write("                        <ion-icon name=\"search-outline\"></ion-icon>\r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("                    \r\n");
      out.write("					\r\n");
      out.write("\r\n");
      out.write("                    <!-- Include jQuery and Bootstrap JS -->\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		// Submit form data using AJAX\r\n");
      out.write("		$('#interpreter-form').submit(function(event) {\r\n");
      out.write("			event.preventDefault(); // Prevent page refresh on form submission\r\n");
      out.write("			var form = $(this);\r\n");
      out.write("			var url = form.attr('action');\r\n");
      out.write("			const now = new Date();\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				type: 'GET',\r\n");
      out.write("				url: url,\r\n");
      out.write("				data: form.serialize(), // Serialize form data for submission\r\n");
      out.write("				success: function(result) {\r\n");
      out.write("					 var result2 = result.split(\"\\n\");\r\n");
      out.write("					    if (result2[0] !== \"show clients\") {\r\n");
      out.write("					        Swal.fire({\r\n");
      out.write("					            title: result2[0],\r\n");
      out.write("					            text: result2[1],\r\n");
      out.write("					            icon: result2[2],\r\n");
      out.write("					            confirmButtonText: 'OK'\r\n");
      out.write("					        });\r\n");
      out.write("					    } else if (result2[0] == \"show clients\") {\r\n");
      out.write("					        Swal.fire({\r\n");
      out.write("					        	title: result2[0],\r\n");
      out.write("					            text: result2.length + \" Clients found\",\r\n");
      out.write("					            icon: success,\r\n");
      out.write("					            confirmButtonText: 'OK'\r\n");
      out.write("					        });\r\n");
      out.write("					    }\r\n");
      out.write("					\r\n");
      out.write("					now.setHours(now.getHours() + 1);\r\n");
      out.write("				    $('#result').append('<p>'+now.toLocaleTimeString()+':' + result2[2] + '</p>'); // Append result to #result div\r\n");
      out.write("\r\n");
      out.write("				    var resultDiv = document.getElementById(\"result\");\r\n");
      out.write("				    resultDiv.scrollTop = resultDiv.scrollHeight; // Scroll to bottom of #result div\r\n");
      out.write("				},\r\n");
      out.write("				error: function() {\r\n");
      out.write("					alert('Error submitting form!'); \r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$(document).ready(function() {\r\n");
      out.write("			  $('#show-log').click(function() {\r\n");
      out.write("			    $('#result').slideToggle();\r\n");
      out.write("			  });\r\n");
      out.write("			});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</script>\r\n");
      out.write("      <style>\r\n");
      out.write("      #result {\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  bottom: 0;\r\n");
      out.write("  right: 0;\r\n");
      out.write("  z-index: 9999;\r\n");
      out.write("  display: none;\r\n");
      out.write("  width: 300px;\r\n");
      out.write("  height: 200px;\r\n");
      out.write("  overflow: scroll;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  font-family: monospace;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  border-radius:5px;\r\n");
      out.write("}\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      </style>                  \r\n");
      out.write("                    </label>\r\n");
      out.write("                    <button id=\"show-log\">Show Log</button>\r\n");
      out.write("\r\n");
      out.write("					<div id=\"result\" class=\"mt-3\" style=\"display:none;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"user\">\r\n");
      out.write("                    <img src=\"assets/imgs/customer01.jpg\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
 System.out.println("Documents in JSP: " + request.getAttribute("documents")); 
      out.write('\r');
      out.write('\n');
      out.write(' ');
ClientInterface connectedClient = (ClientInterface)request.getSession().getAttribute("user"); System.out.println("Connected Client :"+client.getId()); 
      out.write("\r\n");
      out.write("<div class=\"details\">\r\n");
      out.write("  <div class=\"recentOrders\">\r\n");
      out.write("    <div class=\"cardHeader\">\r\n");
      out.write("      <h2>Documents Details</h2>\r\n");
      out.write("    </div><div style=\"margin-right:90px;\">\r\n");
      out.write("\r\n");
      out.write("    ");
 Document document = (Document) request.getAttribute("documentspecific");
    //Client client = (Client) request.getAttribute("user");
    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <p><b>Titre :</b> ");
      out.print( document.getTitre() );
      out.write("</p><br><br>\r\n");
      out.write("    <p><b>Auteur :</b> ");
      out.print( document.getAuteur() );
      out.write("</p><br><br>\r\n");
      out.write("    <p><b>Catégorie :</b> ");
      out.print( document.getCategorie() );
      out.write("</p><br><br>\r\n");
      out.write("    <p><b>Synopsis :</b> ");
      out.print( document.getSynopsis() );
      out.write("</p><br><br>\r\n");
      out.write("\r\n");
      out.write("    <form method=\"get\" action=\"/showDocumentdetails\">\r\n");
      out.write("        <input type=\"hidden\" value=\"");
      out.print( document.getIdDocument() );
      out.write("\" name=\"IdDocument\">\r\n");
      out.write("        <p>Date de Début : <input type=\"date\" name=\"dateDebut\"></p><br>\r\n");
      out.write("        <p>Date de Fin : <input type=\"date\" name=\"dateFin\"></p><br><br>\r\n");
      out.write("        <p><center><button type=\"submit\" style=\"background-color: #4CAF50; color: white; padding: 10px 20px; border: none; border-radius: 4px;\">Réserver</button></center></p>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("    <!-- =========== Scripts =========  -->\r\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- ====== ionicons ======= -->\r\n");
      out.write("    <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\r\n");
      out.write("    <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
