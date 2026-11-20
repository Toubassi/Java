<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
<title>Omikuji Form</title>
</head>
<body class="min-h-screen bg-[#faf5ed] flex items-center justify-center p-4">
	<div class="w-full max-w-md bg-white rounded-2xl shadow-xl p-5 md:p-6">
	
	<div class="text-center mb-3">
		<h1 class="text-3xl font-bold text-gray-800 mb-3">Send an Omikuji</h1>
	</div>
		
		
		<form action="/send" method="post" class="space-y-2">
			<div>
				<label name="number" class="block text-sm font-semibold text-gray-700 mb-1">Choose any number between 5 - 25</label>
				<input class="w-full rounded-lg border border-gray-300 px-4 py-2 outline-none focus:border-red-700 focus:ring-2 focus:ring-red-100 transition" type="number" name="number" min="5" max="25" step="1" value="5">
			</div>
			
			<div>
				<label name="city" class="block text-sm font-semibold text-gray-700 mb-1">Enter the name of the city:</label>
				<input class="w-full rounded-lg border border-gray-300 px-4 py-2 outline-none focus:border-red-700 focus:ring-2 focus:ring-red-100 transition" type="text" name="city"></input>
			</div>
			
			<div>
				<label name="person" class="block text-sm font-semibold text-gray-700 mb-1">Enter the name of a real person:</label>
				<input class="w-full rounded-lg border border-gray-300 px-4 py-2 outline-none focus:border-red-700 focus:ring-2 focus:ring-red-100 transition" type="text" name="person"></input>
			</div>
			
			<div>
				<label name="hobby" class="block text-sm font-semibold text-gray-700 mb-1">Enter the the hobby:</label>
				<input class="w-full rounded-lg border border-gray-300 px-4 py-2 outline-none focus:border-red-700 focus:ring-2 focus:ring-red-100 transition" type="text" name="hobby"></input>
			</div>
		
			<div>
				<label name="livingThing">Enter the name a living thing:</label>
				<input class="w-full rounded-lg border border-gray-300 px-4 py-3 outline-none focus:border-red-700 focus:ring-2 focus:ring-red-100 transition" type="text" name="livingThing"></input>
			</div>
		
			<div>
				<label name="comment" class="block text-sm font-semibold text-gray-700 mb-1">Say something nice:</label>
				<textarea class="w-full rounded-lg border border-gray-300 px-4 py-2 outline-none focus:border-red-700 focus:ring-2 focus:ring-red-100 transition resize-none" rows="2" name="comment"></textarea>
			</div>
			<p>Send and show a friend</p>
			<button class="w-full bg-red-800 hover:bg-red-900 text-white font-semibold py-2 rounded-lg shadow-md hover:shadow-lg transition duration-200 cursor-pointer" type="submit">Send</button>
		</form>
		
	</div>
</body>
</html>