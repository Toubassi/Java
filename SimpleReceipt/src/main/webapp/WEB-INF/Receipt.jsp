<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Receipt</title>
</head>
<body>
	<h1>Customer Name: <c:out value="${name}"/></h1>
	<p>Item name: <c:out value="${item}" /></p>
	<p>Item price: $<c:out value="${price}"/></p>
	<p>Description: <c:out value="${desc}"/></p>
	<p>Vendor: <c:out value="${vendor}"/></p>
</body>
</html>