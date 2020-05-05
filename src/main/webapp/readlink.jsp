<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="it.contrader.dto.LinkDTO"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Link Read">
<meta name="author" content="Federico Lucido">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Read Link</title>
</head>
<body>
	<%@ include file="./css/header.jsp"%>
	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> 
		<a href="/user/getall">Users</a> 
		<a class="active" href="/folder/getall">Folders</a> 
		<a href="/user/logout" id="logout">Logout</a>
	</div>
	<br>

	<div class="main">
		<%
			LinkDTO u = (LinkDTO) request.getSession().getAttribute("dto");
		%>


		<table>
			<tr>
				<th>ID Nodo 1</th>
				<th>ID Nodo 2</th>
			</tr>
			<tr>
				<td><%=u.getIdNode1()%></td>
				<td><%=u.getIdNode2()%></td>
			</tr>
		</table>

		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br> <br> <br>


	</div>

	<%@ include file="./css/footer.jsp"%>
</body>
</html>