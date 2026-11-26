<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
    <title>All Books</title>
</head>
<body>

    <h1>My Books</h1>

    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Description</th>
                <th>Language</th>
                <th>Number of Pages</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td><c:out value="${book.id}"></c:out> </td>
                    <td><c:out value="${book.title}"></c:out></td>
                    <td><c:out value="${book.description}"></c:out></td>
                    <td><c:out value="${book.language}"></c:out></td>
                    <td><c:out value="${book.numberOfPages}"></c:out></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>