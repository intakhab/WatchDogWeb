/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.13
 * Generated at: 2019-02-21 07:42:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class status_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.1.3.RELEASE.jar", Long.valueOf(1544799880000L));
    _jspx_dependants.put("jar:jar:file:/C:/Users/intakhabalam.s/Desktop/ftp/Watch-Dog-Web/WatchDog.war!/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1530722700000L));
    _jspx_dependants.put("jar:jar:file:/C:/Users/intakhabalam.s/Desktop/ftp/Watch-Dog-Web/WatchDog.war!/WEB-INF/lib/spring-webmvc-5.1.3.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1543290104000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Watch Dog : Server Status</title>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"container\" id=\"statusId\">\n");
      out.write("\t\t<div class=\"row\" style=\"padding-left: 150px;\">\n");
      out.write("\t\t\t<nav aria-label=\"breadcrumb\" style=\"width: 85%\">\n");
      out.write("\t\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t    <li><i class=\"fa fa-book fa-fw\" aria-hidden=\"true\"></i> <a href=\"#\">Status</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"breadcrumb-item active\" aria-current=\"page\"> Information</li>\n");
      out.write("\t\t\t\t</ol>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t<div class=\"col-sm-10\">\n");
      out.write("\t\t\t\t<table class=\"table-striped table\" style=\"width: 80%\">\n");
      out.write("\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>WatchDog</td>\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"javascript:void(0)\" onclick=\"closeWatchDog('C')\"><button class=\"btn btn-danger\"><i class=\"fa fa-stop-circle-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\tStop Me</button> </a></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[0].serverStatus}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t<td><span class=\"btn btn-success\"><i class=\"fa fa-check\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[1].serverStatus}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>Restore Config backup</td>\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"javascript:void(0)\" onclick=\"restoreWatchDog()\"><span class=\"btn btn-info\"><i class=\"fa fa-window-restore\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\tRestore&nbsp;</span></a></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>WatchDog</td>\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"javascript:void(0)\" onclick=\"closeWatchDog('R')\"><span class=\"btn btn-warning\"><i class=\"fa fa-server\" aria-hidden=\"true\"></i>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\tRestart&nbsp;</span></a></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>Process ID</td>\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"javascript:void(0)\" onclick=\"processId('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[1].pid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("')\" ><span class=\"btn btn-primary\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-info\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t&nbsp;");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[1].pid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&nbsp;</span></a></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[0].hostAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[1].hostAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[0].hostName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[1].hostName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[0].cononicalHostName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[1].cononicalHostName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[0].userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[1].userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[0].versionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t<td><A href=\"javascript:alert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[1].versionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("')\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[1].versionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</A></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[0].startedTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusList[1].startedTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("     $(\"#tab1\").addClass(\"active\");\n");
      out.write("});\n");
      out.write("\n");
      out.write("function closeWatchDog(val) {\n");
      out.write("\t    var url;\n");
      out.write("\t    var msg;\n");
      out.write("\t    if(val=='C'){\n");
      out.write("\t    \turl=\"shutdownContext\";\n");
      out.write("\t    \tmsg=\"Close\";\n");
      out.write("\t    }else{\n");
      out.write("\t    \turl=\"restartContext\";\n");
      out.write("\t    \tmsg=\"Restart\";\n");
      out.write("\n");
      out.write("\t    }\n");
      out.write("\t\tvar message = \"<i class='fa fa-info-circle' aria-hidden='true' style='font-size:35px;color:red'></i>&nbsp;&nbsp;Are you sure want to \"+msg+\" WatchDog?\";\n");
      out.write("\t\t$('<div></div>').appendTo('body').html(\n");
      out.write("\t\t\t\t'<div><h6>' + message + '</h6></div>').dialog({\n");
      out.write("\t\t\tmodal : true,\n");
      out.write("\t\t\ttitle : 'Confirmation',\n");
      out.write("\t\t\tzIndex : 10000,\n");
      out.write("\t\t\tautoOpen : true,\n");
      out.write("\t\t\twidth : 'auto',\n");
      out.write("\t\t\tresizable : false,\n");
      out.write("\t\t\tbuttons : {\n");
      out.write("\t\t\t\tYes : function() {\n");
      out.write("\t\t\t\t\t$(this).dialog(\"close\");\n");
      out.write("\t\t\t\t\tif(val=='C'){\n");
      out.write("\t\t\t\t\t   window.location.href = url;\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\trestart();\n");
      out.write("\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tNo : function() {\n");
      out.write("\t\t\t\t\t$(this).dialog(\"close\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tclose : function(event, ui) {\n");
      out.write("\t\t\t\t$(this).remove();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("//width: 600,  height: 500,  modal: true,\n");
      out.write("function restoreWatchDog() {\n");
      out.write("\tvar message = \"<i class='fa fa-info-circle' aria-hidden='true' style='font-size:35px;color:red'></i>&nbsp;&nbsp;Are you sure want to Restore Database?\";\n");
      out.write("\t$('<div></div>').appendTo('body').html(\n");
      out.write("\t\t\t'<div><h6>' + message + '</h6></div>').dialog({\n");
      out.write("\t\tmodal : true,\n");
      out.write("\t\ttitle : 'Confirmation',\n");
      out.write("\t\tzIndex : 10000,\n");
      out.write("\t\tautoOpen : true,\n");
      out.write("\t\twidth : 'auto',\n");
      out.write("\t\tresizable : false,\n");
      out.write("\t\tbuttons : {\n");
      out.write("\t\t\tYes : function() {\n");
      out.write("\t\t\t\t$(this).dialog(\"close\");\n");
      out.write("\t\t\t\twindow.location.href = \"restoreconfig\";\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tNo : function() {\n");
      out.write("\t\t\t\t$(this).dialog(\"close\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\tclose : function(event, ui) {\n");
      out.write("\t\t\t$(this).remove();\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\t\n");
      out.write("function processId(val) {\n");
      out.write("\tvar message = \"<div><i class='fa fa-info-circle' aria-hidden='true' style='font-size:35px;color:red'></i>&nbsp;&nbsp;Are you sure want to Kill Watch Dog Process? <br/>\"\n");
      out.write("\t\t           +\"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;You can take [ \"+val+\" ] PID and manually kill with CMD</div>\";\n");
      out.write("\t$('<div></div>').appendTo('body').html(\n");
      out.write("\t\t\t'<div><h6>' + message + '</h6></div>').dialog({\n");
      out.write("\t\tmodal : true,\n");
      out.write("\t\ttitle : 'Confirmation',\n");
      out.write("\t\tzIndex : 10000,\n");
      out.write("\t\tautoOpen : true,\n");
      out.write("\t\twidth : 'auto',\n");
      out.write("\t\tresizable : false,\n");
      out.write("\t\tbuttons : {\n");
      out.write("\t\t\tOk : function() {\n");
      out.write("\t\t\t\t$(this).dialog(\"close\");\n");
      out.write("\t\t\t\t//window.location.href = \"restoreconfig\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\tclose : function(event, ui) {\n");
      out.write("\t\t\t$(this).remove();\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</html>\n");
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
