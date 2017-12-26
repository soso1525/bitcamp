<%@page import="java100.app.domain.Board"%>
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

		<h1>게시물 상세 정보</h1>

		<%
		    try {
		        int no = Integer.parseInt(request.getParameter("no"));
		        Board board = boardDao.selectOne(no);

		        if (board != null) {
		%>

		<form action='update.jsp' method='post'>
			<div class='form-group row'>
				<label for='no' class='col-sm-2 col-form-label'>번호</label>
				<div class='col-sm-10'>
					<input readonly id='no' type='number' class='form-control'
						name='no' value='<%=board.getNo()%>'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='title' class='col-sm-2 col-form-label'>제목</label>
				<div class='col-sm-10'>
					<input id='title' type='text' class='form-control' name='title'
						value='<%=board.getTitle()%>'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='content' class='col-sm-2 col-form-label'>내용</label>
				<div class='col-sm-10'>
					<input id='content' type='text' class='form-control' name='content'
						value='<%=board.getContent()%>'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='regDate' class='col-sm-2 col-form-label'>등록일</label>
				<div class='col-sm-10'>
					<input readonly id='regDate' type='date' class='form-control'
						name='regDate' value='<%=board.getRegDate()%>'>
				</div>
			</div>
			<div class='form-group row'>
				<label for='viewCount' class='col-sm-2 col-form-label'>조회수</label>
				<div class='col-sm-10'>
					<input readonly id='viewCount' type='number' class='form-control'
						name='viewCount' value='<%=board.getViewCount()%>'>
				</div>
			</div>
			<div class='form-group row'>
				<div class='col-sm-10'>
					<button class='btn btn-primary btn-sm'>변경</button>
					<a href='delete.jsp?no=<%=board.getNo()%>'
						class='btn btn-primary btn-sm'>삭제</a>
				</div>
			</div>
		</form>

		<%
		    } else {
		%>

		<p>
			'<%=board.getNo()%>'번의 게시물 정보가 없습니다.
		</p>

		<%
		    }

		    } catch (Exception e) {
		        e.printStackTrace();
		%>
		<%=e.getMessage()%>
		<%
		    }

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
