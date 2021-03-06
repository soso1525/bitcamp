<%@page import="java100.app.domain.Member"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>

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

    <jsp:include page="/header.jsp" />
		<h1>회원 등록 결과</h1>

		<%
		    try {
		        Member member = new Member();
		        member.setName(request.getParameter("name"));
		        member.setEmail(request.getParameter("email"));
		        member.setPassword(request.getParameter("password"));

		        memberDao.insert(member);
		%>

		<p>저장하였습니다.</p>

		<%
		    } catch (Exception e) {
		        e.printStackTrace();
		%>
		
		<%=e.getMessage()%>
		
		<%
		    }
		%>

		<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>

    <jsp:include page="/footer.jsp" />
	</div>
	<%@ include file="../jslib.txt" %>
</body>
</html>
