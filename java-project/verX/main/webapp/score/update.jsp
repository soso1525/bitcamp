<%@page import="java100.app.domain.Score"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.dao.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
    ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
    PrintWriter out2 = new PrintWriter(out);
%>

<!DOCTYPE html>
<html>
<head>
<title>성적관리</title>
<link rel='stylesheet'
	href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
	<div class='container'>

		<%
		    out.flush();
		    RequestDispatcher rd = request.getRequestDispatcher("/header.jsp");
		    rd.include(request, response);
		%>

		<h1>성적 변경</h1>

		<%
		    try {
		        Score score = new Score();
		        score.setNo(Integer.parseInt(request.getParameter("no")));
		        score.setName(request.getParameter("name"));
		        score.setKor(Integer.parseInt(request.getParameter("kor")));
		        score.setEng(Integer.parseInt(request.getParameter("eng")));
		        score.setMath(Integer.parseInt(request.getParameter("math")));

		        if (scoreDao.update(score) > 0) {
		%>

		<p>변경하였습니다.</p>

		<%
		    } else {
		%>

		<p>'<%=score.getNo()%>'의 성적 정보가 없습니다.</p>

		<%
		    }

		    } catch (Exception e) {
		        e.printStackTrace();
		%>

		<%=e.getMessage()%>

		<%
		    }
		%>

		<p>
			<a href='list.jsp' class='btn btn-primary btn-sm'>목록</a>
		</p>

		<%
		    out.flush();
		    rd = request.getRequestDispatcher("/footer.jsp");
		    rd.include(request, response);
		%>

	</div>
	<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>
	<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>
	<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>
</body>
</html>
