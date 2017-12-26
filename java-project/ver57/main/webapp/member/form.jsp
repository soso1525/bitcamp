<%@ page language="java" contentType="text/html; charset=UTF-8"
	trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>

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
		<h1>회원 등록</h1>
		<form action='add.jsp' method='post'>
			<div class='form-group row'>
				<label for='name' class='col-sm-2 col-form-label'>이름</label>
				<div class='col-sm-10'>
					<input id='name' type='text' class='form-control' name='name'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='email' class='col-sm-2 col-form-label'>이메일</label>
				<div class='col-sm-10'>
					<input id='email' type='email' class='form-control' name='email'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='password' class='col-sm-2 col-form-label'>비밀번호</label>
				<div class='col-sm-10'>
					<input id='password' type='password' class='form-control'
						name='password'>
				</div>
			</div>
			<div class='form-group row'>
				<div class='col-sm-10'>
					<button class='btn btn-primary btn-sm'>추가</button>
				</div>
			</div>
		</form>
    
    <jsp:include page="/footer.jsp" />
	</div>
	<%@ include file="../jslib.txt" %>
</body>
</html>
