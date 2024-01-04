<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<jsp:include page="../layout/header.jsp" />
	<div id="container">
	  <section id="join">
		<h2>회원 가입</h2>
		<form action="/user/join" method="post">
			<fieldset>
				<ul>
				   <li>
				       <label>아이디</label>
					   <input type="text" name="userId" 
								placeholder="아이디" required>
					</li>
				    <li>
				        <label>비밀번호</label>
						<input type="password" name="userPasswd" 
								placeholder="비밀번호" required>
					</li>
				    <li>
				        <label>이름</label>
						<input type="text" name="userName" 
								placeholder="이름" required>
					</li>
				    <li>
				        <label>나이</label>
						<input type="text" name="userAge" placeholder="나이">
					</li>
				</ul>
			</fieldset>
			<div class="button">
				<input type="submit" value="등록">
				<input type="reset" value="취소">
			</div>
		  </form>
		</section>
	</div>
	<jsp:include page="../layout/footer.jsp" />
</body>
</html>