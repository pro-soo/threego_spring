<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>My page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="<c:url value='/css/bootstrap/css/bootstrap.min.css'/>" />
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="<c:url value='/css/bootstrap/js/bootstrap.min.js'/>" /></script>

</head>
<body>
	
	<table>
	<c:forEach var="vo" items="${list}">
		<h3>${vo}</h3>
		
	</c:forEach>
	</table>
 
</body>
</html>