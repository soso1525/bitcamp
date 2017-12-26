<%@page import="java100.app.domain.Board"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
    BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
    PrintWriter out2 = new PrintWriter(out);
%>

<!DOCTYPE html>
<html>
<head>
<title>게시물 관리</title>
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

		<h1>게시물 목록</h1>
		<p>
			<a href='form.jsp' class='btn btn-primary btn-sm'>추가</a>
		</p>
		<table class='table table-hover'>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>등록일</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>

				<%
				    try {
				        List<Board> list = boardDao.selectList();
				        for (Board board : list) {
				%>

				<tr>
					<td><%=board.getNo()%></td>
					<td><a href='view.jsp?no=<%=board.getNo()%>'><%=board.getTitle()%></a></td>
					<td><%=board.getRegDate()%></td>
					<td><%=board.getViewCount()%></td>
				</tr>

				<%
				    }

				    } catch (Exception e) {
				        e.printStackTrace();
				%>
				
				<%=e.getMessage()%>
				
				<%
				    }
				%>

			</tbody>
		</table>

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
