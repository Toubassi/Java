<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
<title>Fortune | Omikuji</title>
</head>
<body class="min-h-screen bg-[#faf5ed] flex items-center justify-center p-4">
<div class="w-full max-w-md bg-white rounded-2xl shadow-xl p-5 md:p-6">
	<h1 class="text-2xl font-bold text-gray-800">Here is your Omikuji:</h1>
	
	<div class="bg-[#faf5ed] border-l-4 border-red-800 rounded-lg p-4 mb-5">
		<p class="text-gray-700 text-base leading-relaxed">
			In <c:out value="${number}" ></c:out> years you will live in <c:out value="${city}"/> with <c:out value="${person}"/>, <c:out value="${hobby}"/> for a living. The next time you see a <c:out value="${lvingThing}"/>, you will have good luck! Also, <c:out value="${comment}"/>. 
		</p>
	</div>
	
	<a href="/omikuji" class="block w-full text-center bg-red-800 hover:bg-red-900 text-white font-semibold py-2.5 rounded-lg shadow-md hover:shadow-lg transition duration-200">Go back</a>
</div>
</body>
</html>