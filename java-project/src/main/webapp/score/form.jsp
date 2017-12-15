<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

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
		<h1>성적 등록</h1>
		<form action='add.jsp' method='post'>
			<div class='form-group row'>
				<label for='name' class='col-sm-2 col-form-label'>이름</label>
				<div class='col-sm-10'>
					<input id='name' type='text' class='form-control' name='name'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='kor' class='col-sm-2 col-form-label'>국어</label>
				<div class='col-sm-10'>
					<input id='kor' type='number' class='form-control' name='kor'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='eng' class='col-sm-2 col-form-label'>영어</label>
				<div class='col-sm-10'>
					<input id='eng' type='number' class='form-control' name='eng'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='math' class='col-sm-2 col-form-label'>수학</label>
				<div class='col-sm-10'>
					<input id='math' type='number' class='form-control' name='math'>
				</div>
			</div>
			<div class='form-group row'>
				<div class='col-sm-10'>
					<button class='btn btn-primary btn-sm'>추가</button>
				</div>
			</div>
		</form>
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
