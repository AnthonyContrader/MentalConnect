<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.UserDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Admin</title>
<link href="css/vittoriostyle.css" rel="stylesheet">
</head>
<body>
<%@include file="css/header.jsp"%>


<div class="navbar">
  <a class="active" href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist">Users</a>
  <a href="FolderServlet?mode=folderlist&idUser=${user.getId()}">Folders</a>
  <a href="GuideServlet?mode=guidelist">Guides</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>

<div class="main">
<h1>Welcome ${user.getUsername()} on MentalConnect</h1>

<p align="center">This web app allows you to create concept maps</p>
</div>

<%@ include file="css/footer.jsp" %>

</body>
</html>