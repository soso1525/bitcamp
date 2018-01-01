<%@page import="java100.app.dao.ScoreDao"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
		<jsp:include page="/header.jsp" />
		<h1>성적 변경</h1>
		<c:if test="${count > 0}">
			<p>변경하였습니다.</p>
		</c:if>
		<c:if test="${count == 0}">
			<p>'${param.no}'의 성적 정보가 없습니다.</p>
		</c:if>
		<p>
			<a href='list' class='btn btn-primary btn-sm'>목록</a>
		</p>
		<jsp:include page="/footer.jsp" />
	</div>
	<%@ include file="../jslib.txt"%>
</body>
</html>