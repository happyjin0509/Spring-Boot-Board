<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ include file="/WEB-INF/views/layout/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>board</title>
<style>
body {
	padding-top: 70px;
	padding-bottom: 30px;
}
</style>

<script>
	$(document).on('click', '#btnWriteForm', function(e) {
		e.preventDefault();
		location.href = "${contextPath}/boardForm";
	});
	
	
</script>


</head>
<body>
	<h2>board list</h2>
	<article>
		<div class="container">
			<div class="table-responsive">
				<table class="table table-striped table-sm">

		<colgroup>
			<col style="width: 5%;" />
			<col style="width: auto;" />
			<col style="width: 15%;" />
			<col style="width: 10%;" />
			<col style="width: 10%;" />
		</colgroup>
					<thead>
						<tr>
							<th>NO</th>						
							<th>글제목</th>
							<th>작성자</th>
							<th>작성일</th>
							<th>조회수</th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${empty boardList }">
							<tr>
								<td colspan="5" align="center">데이터가 없습니다.</td>
							</tr>
						</c:if>
						 
						<c:if test="${!empty boardList}">
							<c:forEach var="list" items="${boardList}">
								<tr>
									<td><c:out value="${list.article_no}" /></td>
									<td><a href="${contextPath}/getBoardContent?article_no=${list.article_no}"><c:out value="${list.title}"/></a></td>
									<td><c:out value="${list.member_id}" /></td>
									<td><fmt:formatDate  value="${list.regdate}" pattern="yyyy/MM/dd"/> </td>
									<td><c:out value="${list.read_cnt}" /></td>
								</tr>
							</c:forEach>
						</c:if>
					</tbody>
				</table>
				</div>
			<div>
				<button type="button" class="btn btn-sm btn-primary"
					id="btnWriteForm">글쓰기</button>
			</div>


		</div>

</article>
</body>
</html>
