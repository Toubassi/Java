
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <title>Ninja Gold</title>
</head>

<body class="min-h-screen bg-[#faf5ed] p-4 md:p-8">

    <div class="text-center mb-7">
        <h1 class="text-3xl md:text-4xl font-bold text-gray-800">Welcome, Ninja</h1>
    </div>

    <div class="max-w-6xl mx-auto bg-white rounded-xl shadow-md p-4 mb-7">
        <h3 class="text-xl font-bold text-gray-800">
            🪙 Your Gold: <c:out value="${ gold}"></c:out>
        </h3>
    </div>

    <div class="flex flex-wrap justify-center gap-5 mb-8">

        <!-- Farm -->
        <div class="bg-white rounded-xl shadow-md p-5 text-center hover:shadow-lg transition w-72 h-[280px] flex flex-col">
            <div class="w-full h-full flex flex-col">

                <form action="/process_money"
                    class="flex flex-col items-center h-full w-full"
                    method="post">

                    <p class="text-4xl mb-3">🌾</p>

                    <h5 class="text-lg font-bold text-gray-800 mt-2 mb-1">Farm</h5>

                    <p class="text-sm text-gray-500 mb-2">Go farming.</p>

                    <small class="text-xs font-semibold text-green-700">(0 - 5 Gold)</small>

                    <input type="hidden" name="building" value="farm" />

                    <button
                        type="submit"
                        class="w-full mt-auto bg-red-800 hover:bg-red-900 text-white font-semibold py-2.5 rounded-lg transition cursor-pointer"
                    >
                        Go Farming
                    </button>

                </form>
            </div>
        </div>

        <!-- Cave -->
        <div class="bg-white rounded-xl shadow-md p-5 text-center hover:shadow-lg transition w-72 h-[280px] flex flex-col">
            <div class="w-full h-full flex flex-col">

                <form action="/process_money"
                    class="flex flex-col items-center h-full w-full"
                    method="post">

                    <p class="text-4xl mb-3">⛏️</p>

                    <h5 class="text-lg font-bold text-gray-800 mt-2 mb-1">Cave</h5>

                    <p class="text-sm text-gray-500 mb-2">Go mining.</p>

                    <small class="text-xs font-semibold text-green-700">(6 - 10 Gold)</small>

                    <input type="hidden" name="building" value="cave" />

                    <button
                        type="submit"
                        class="w-full mt-auto bg-red-800 hover:bg-red-900 text-white font-semibold py-2.5 rounded-lg transition cursor-pointer"
                    >
                        Go Mining
                    </button>

                </form>
            </div>
        </div>

        <!-- House -->
        <div class="bg-white rounded-xl shadow-md p-5 text-center hover:shadow-lg transition w-72 h-[280px] flex flex-col">
            <div class="w-full h-full flex flex-col">

                <form action="/process_money"
                    class="flex flex-col items-center h-full w-full"
                    method="post">

                    <p class="text-4xl mb-3">🏠</p>

                    <h5 class="text-lg font-bold text-gray-800 mt-2 mb-1">House</h5>

                    <p class="text-sm text-gray-500 mb-2">Steal from a house.</p>

                    <small class="text-xs font-semibold text-green-700">(11 - 20 Gold)</small>

                    <input type="hidden" name="building" value="house" />

                    <button
                        type="submit"
                        class="w-full mt-auto bg-red-800 hover:bg-red-900 text-white font-semibold py-2.5 rounded-lg transition cursor-pointer"
                    >
                        Steal a house
                    </button>

                </form>
            </div>
        </div>

        <!-- Quest -->
        <div class="bg-white rounded-xl shadow-md p-5 text-center hover:shadow-lg transition w-72 h-[280px] flex flex-col">
            <div class="w-full h-full flex flex-col">

                <form action="/process_money"
                    class="flex flex-col items-center h-full w-full"
                    method="post">

                    <p class="text-4xl mb-3">⚔️</p>

                    <h5 class="text-lg font-bold text-gray-800 mt-2 mb-1">Quest</h5>

                    <p class="text-sm text-gray-500 mb-2">Complete a quest.</p>

                    <small class="text-xs text-gray-500">If successful: earn up to 50 Gold.</small>

                    <small class="text-xs text-gray-500 mb-2">If unsuccessful: lose up to 50 Gold.</small>

                    <input type="hidden" name="building" value="quest" />

                    <button
                        type="submit"
                        class="w-full mt-auto bg-red-800 hover:bg-red-900 text-white font-semibold py-2.5 rounded-lg transition cursor-pointer"
                    >
                        Complete a Quest
                    </button>

                </form>
            </div>
        </div>

    </div>

    <!-- Activities -->
    <div class="flex flex-col items-center mt-8">

        <h2 class="text-xl font-bold text-gray-800 mb-4">Activities:</h2>

        <div
            class="h-[180px] w-full max-w-md overflow-y-auto overflow-x-hidden border border-gray-300 rounded-lg p-3 bg-white shadow-md"
        >

            <c:forEach var="activity" items="${activities}">
                <p class="text-sm text-gray-700 mb-3 p-2 bg-[#faf5ed] rounded-md">
                    ${activity}.
                </p>
            </c:forEach>

        </div>

    </div>

    <!-- Retry -->
    <div class="flex justify-center mt-6">

        <a href="/clear">
            <button class="bg-red-800 hover:bg-red-900 text-white font-semibold px-8 py-2.5 rounded-lg shadow-md transition cursor-pointer">
                Retry
            </button>
        </a>

    </div>

</body>
</html>
