<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.NodeDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Read Node</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>
<div class="navbar">
		<a href="/homeadmin.jsp">Home</a>
		<a	href="/user/getall">Users</a>
		<a class=active href="/folder/getall&idUser="${user.getId()}>Folders</a>
		<a href="/user/logout" id="logout">Logout</a>
	</div>
<br>

<div class="main">
<%NodeDTO u = (NodeDTO) request.getSession().getAttribute("dto");%>


<table>
	<tr> 
		<th>Text</th>
	</tr>
	<tr>
		<td><%=u.getText()%></td>
	</tr>	
</table>

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>


</div>

<%@ include file="../css/footer.jsp" %>
</body>
</html>