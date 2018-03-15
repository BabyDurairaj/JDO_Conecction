<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="full.JDO.com.RegistrationControl"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Information</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<style type="text/css">
body {
	font-family: sans-serif;
	background-color: #8FBC8F;
}

.btn {
	display: inline-block;
}

.wrapper {
	margin-left: 170px;
	padding: 10px;
	overflow: hidden;
	text-align: center;
	font-size: 200%;
}

.table {
	display: inline-block;
	vertical-align: middle;
	padding: 20px;
}

img {
	display: inline-block;
	vertical-align: middle;
	float: left;
}

.nav-bar {
	text-align: center;
	padding: 10px;
}

.details {
	float: left;
	max-width: 160px;
	margin: 0;
	padding: 1 em;
}

a {
	border: 1px solid black;
	border-radius: 10px;
	padding: 10px;
	color: black;
}

h1 {
	background-color: black;
	color: white;
	text-align: center;
}
</style>
</head>
<body>
	<div class="nav-bar">
		<h1>Welcome</h1>
	</div>
	
	<div class="details">
		<img src="image1.png" class="rounded-circle" width="100" height="100" />

		<div class="table">

			<p>
				<%=(String) session.getAttribute("email")%><br />
				<%=(String) session.getAttribute("name")%><br />

				<%=(String) session.getAttribute("password")%><br />

				<%=(String) session.getAttribute("mobile")%><br />
			</p>
			<%
				response.setHeader("Cache-Control", "no-cache");
				response.setHeader("Cache-Control", "no-store");
				response.setHeader("Pragma", "no-cache");
				response.setDateHeader("Expires", 0);
				String userId = (String) session.getAttribute("email");
				if (userId == null) {
					response.sendRedirect("index.jsp");
				}
			%>

			<a href="index.jsp">LogOut</a>
		</div>
	</div>

	<div class="wrapper">
		<p>
			<span id="hrs">00</span>:<span id="min">00</span>:<span id="sec">00</span>
		<div id="a"></div>





		<div>
			<button id="button" class="btn btn-default">start/stop</button>
		</div>
	</div>
	

	<script type="text/javascript" src="CountDown.js"></script>
</body>
</html>

