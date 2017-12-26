<%@page import="java100.app.domain.Member"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%
    MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
    PrintWriter out2 = new PrintWriter(out);
%>

<!DOCTYPE html>
<html>
<head>
<title>회원 관리</title>
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

		<h1>회원 목록</h1>
		<p>
			<a href='form.jsp' class='btn btn-primary btn-sm'>추가</a>
		</p>
		<table class='table table-hover'>
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>이메일</th>
					<th>등록일</th>
				</tr>
			</thead>
			<tbody>

				<%
				    try {

				        List<Member> list = memberDao.selectList();

				        for (Member member : list) {
				%>

				<tr>
					<td><%=member.getNo()%></td>
					<td><a href='view.jsp?no=<%=member.getNo()%>'><%=member.getName()%></a></td>
					<td><%=member.getEmail()%></td>
					<td><%=member.getCreatedDate()%></td>
				</tr>

				<%
				    }

				    } catch (Exception e) {
				        e.printStackTrace(); // for developer
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
