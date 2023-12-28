<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기...</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
	<div id="content">
		<h2>글 상세보기</h2>
		<table class="tbl_write">
			<tr>
				<td>
					<input type="text" name="boardTitle" 
						value="${board.boardTitle}" readonly>
				</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="boardWriter" 
						value="${board.boardWriter}" readonly>
				</td>
			</tr>
			<tr>
				<td>
					<textarea rows="5" cols="50" placeholder="글내용" readonly
						name="boardContent">${board.boardContent}</textarea>
				</td>
			</tr>	
			<tr>
				<td>
					<a href="/board/list"><button>목록</button></a>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>