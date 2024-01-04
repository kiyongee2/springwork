<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기</title>
</head>
<body>
    <jsp:include page="../layout/header.jsp" />
	<div id="container">
	  <section id="board_detail">
		<h2>글 상세보기</h2>
		<table>
		   <tbody>
				<tr>
					<td> 
					    <input type="text" name="boardTitle"
						   value="${board.boardTitle}" readonly>
					</td>
				</tr>
				<tr>
					<td>
						<input type="text" name="boardTitle"
						   value="${board.userId}" readonly>
					</td>
				</tr>
				<tr>
					<td>
						<textarea rows="5" cols="60" readonly
							name="boardContent">${board.boardContent}</textarea>
					</td>
				</tr>
				<tr>
					<td>조회수: ${board.hit}</td>
				</tr>
				<tr>
				   <td>
				     <!-- 수정일이 있는 경우 수정일 표시, 없는 경우 작성일 표시 -->
				     <c:choose>
				     	<c:when test="${not empty board.updatedTime }">
				     	  수정일: <fmt:formatDate value="${board.updatedTime}"
								pattern="yyyy-MM-dd HH:mm:ss" />
				     	</c:when>
				     	<c:otherwise>
				     	  작성일: <fmt:formatDate value="${board.createdTime}"
								pattern="yyyy-MM-dd HH:mm:ss" />
				     	</c:otherwise>
				     </c:choose>
					</td>
				</tr>
				<tr>
					<td>
					    <!-- 세션 적용: 로그인한 사용자만 수정/삭제 보임 -->
					    <c:if test="${board.userId eq sessionId}">
							<a href="/board/update?id=${board.id}">
								<button>수정</button>
							</a>
							<a href="/board/delete?id=${board.id}"
							   onclick="return confirm('정말로 삭제하시겠습니까?')">
								<button>삭제</button>
							</a>
						</c:if>
						<a href="/board/"><button>목록</button></a>
					</td>
				</tr>
			</tbody>
		  </table>
		  <!-- 댓글 목록 -->
		  
		  <!-- 댓글 등록 -->
		  <form action="/reply/insert" method="post"
		    	id="replyform">
		    <input type="hidden" name="boardId" value="${board.id}">
		  	<p>
		  		<input type="text" name="replyer" placeholder="작성자">
	  		</p> 
		  	<p>
		  		<textarea rows="3" cols="50" name="replyContent"
		  		   placeholder="댓글을 남겨주세요"></textarea>
		  	</p>
		    <input type="submit" value="등록">
		  </form>
		</section>
	</div>
	<jsp:include page="../layout/footer.jsp" />
</body>
</html>