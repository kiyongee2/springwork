<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>members...</title>
<style>
	.content{margin-left: 30px;}
</style>
</head>
<body>
    <div class="content">
		<h2>${sessionEmail}님 환영합니다.</h2>
		<h4>
			<button type="button" onclick="updateFn()">내정보 수정</button>&nbsp;  
			<button type="button" onclick="logout()">로그아웃</button>
			<button type="button" onclick="index()">Home</button>
		</h4>
	</div>
<script>
  let index = function(){
	  location.href = "/";
  }
  
  let logout = function(){
	  location.href = "/member/logout";
  }
  
  let updateFn = function(){
	  location.href = "/member/update";
  }

</script>
</body>
</html>