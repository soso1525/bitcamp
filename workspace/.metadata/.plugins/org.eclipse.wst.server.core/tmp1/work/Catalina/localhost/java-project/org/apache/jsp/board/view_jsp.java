/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.24
 * Generated at: 2017-12-15 01:45:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java100.app.domain.Board;
import java.io.PrintWriter;
import java100.app.listener.ContextLoaderListener;
import java100.app.dao.BoardDao;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("java100.app.listener.ContextLoaderListener");
    _jspx_imports_classes.add("java100.app.domain.Board");
    _jspx_imports_classes.add("java100.app.dao.BoardDao");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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


    BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
    PrintWriter out2 = new PrintWriter(out);

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>게시물 관리</title>\r\n");
      out.write("<link rel='stylesheet'\r\n");
      out.write("\thref='../node_modules/bootstrap/dist/css/bootstrap.min.css'>\r\n");
      out.write("<link rel='stylesheet' href='../css/common.css'>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class='container'>\r\n");
      out.write("\r\n");
      out.write("\t\t");

		    out.flush();
		    RequestDispatcher rd = request.getRequestDispatcher("/header.jsp");
		    rd.include(request, response);
		
      out.write("<h1>게시물 상세 정보</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t");

		    try {
		        int no = Integer.parseInt(request.getParameter("no"));
		        Board board = boardDao.selectOne(no);

		        if (board != null) {
		
      out.write("<form action='update.jsp' method='post'>\r\n");
      out.write("\t\t\t<div class='form-group row'>\r\n");
      out.write("\t\t\t\t<label for='no' class='col-sm-2 col-form-label'>번호</label>\r\n");
      out.write("\t\t\t\t<div class='col-sm-10'>\r\n");
      out.write("\t\t\t\t\t<input readonly id='no' type='number' class='form-control'\r\n");
      out.write("\t\t\t\t\t\tname='no' value='");
      out.print(board.getNo());
      out.write("'>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class='form-group row'>\r\n");
      out.write("\t\t\t\t<label for='title' class='col-sm-2 col-form-label'>제목</label>\r\n");
      out.write("\t\t\t\t<div class='col-sm-10'>\r\n");
      out.write("\t\t\t\t\t<input id='title' type='text' class='form-control' name='title'\r\n");
      out.write("\t\t\t\t\t\tvalue='");
      out.print(board.getTitle());
      out.write("'>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class='form-group row'>\r\n");
      out.write("\t\t\t\t<label for='content' class='col-sm-2 col-form-label'>내용</label>\r\n");
      out.write("\t\t\t\t<div class='col-sm-10'>\r\n");
      out.write("\t\t\t\t\t<input id='content' type='text' class='form-control' name='content'\r\n");
      out.write("\t\t\t\t\t\tvalue='");
      out.print(board.getContent());
      out.write("'>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class='form-group row'>\r\n");
      out.write("\t\t\t\t<label for='regDate' class='col-sm-2 col-form-label'>등록일</label>\r\n");
      out.write("\t\t\t\t<div class='col-sm-10'>\r\n");
      out.write("\t\t\t\t\t<input readonly id='regDate' type='date' class='form-control'\r\n");
      out.write("\t\t\t\t\t\tname='regDate' value='");
      out.print(board.getRegDate());
      out.write("'>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class='form-group row'>\r\n");
      out.write("\t\t\t\t<label for='viewCount' class='col-sm-2 col-form-label'>조회수</label>\r\n");
      out.write("\t\t\t\t<div class='col-sm-10'>\r\n");
      out.write("\t\t\t\t\t<input readonly id='viewCount' type='number' class='form-control'\r\n");
      out.write("\t\t\t\t\t\tname='viewCount' value='");
      out.print(board.getViewCount());
      out.write("'>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class='form-group row'>\r\n");
      out.write("\t\t\t\t<div class='col-sm-10'>\r\n");
      out.write("\t\t\t\t\t<button class='btn btn-primary btn-sm'>변경</button>\r\n");
      out.write("\t\t\t\t\t<a href='delete.jsp?no=");
      out.print(board.getNo());
      out.write("'\r\n");
      out.write("\t\t\t\t\t\tclass='btn btn-primary btn-sm'>삭제</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t");

		    } else {
		
      out.write("<p>\r\n");
      out.write("\t\t\t'");
      out.print(board.getNo());
      out.write("'번의 게시물 정보가 없습니다.\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t");

		    }

		    } catch (Exception e) {
		        e.printStackTrace();
		
      out.print(e.getMessage());

		    }

		    out.flush();
		    rd = request.getRequestDispatcher("/footer.jsp");
		    rd.include(request, response);
		
      out.write("</div>\r\n");
      out.write("\t<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>\r\n");
      out.write("\t<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>\r\n");
      out.write("\t<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>\r\n");
      out.write("</body>\r\n");
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