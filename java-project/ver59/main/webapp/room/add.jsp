<%@page import="java100.app.domain.Room"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.RoomDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>강의실관리</title>
<link rel='stylesheet'
	href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
	<div class='container'>
		<jsp:include page="/header.jsp" />
		<h1>강의실 등록 결과</h1>
				<p>저장하였습니다.</p>
		<p>
			<a href='list' class='btn btn-primary btn-sm'>목록</a>
		</p>
		<jsp:include page="/footer.jsp" />
	</div>
	<%@ include file="../jslib.txt"%>
</body>
</html>
