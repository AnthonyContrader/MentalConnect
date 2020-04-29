<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.LinkDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Link Manager</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>

<div class="navbar">
  <a href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist">Users</a>
  <a class="active" href="FolderServlet?mode=folderlist&idUser=${user.getId()}">Folders</a>
  <a href="GuideServlet?mode=guidelist">Guides</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<div class="main">
	<% List<LinkDTO> list = (List<LinkDTO>) request.getAttribute("list"); %>	
	<% int idmap = (int) request.getAttribute("idmap"); %>	

<br>

	<table>
		<tr>
			<th>ID Nodo 1</th>
			<th>ID Nodo 2</th>
			<th></th>
		</tr>
		<%
			for (LinkDTO u : list) {
			
		%>
		<tr>
			<td><a href="NodeServlet?mode=read&idmap=<%=idmap%>&idNode=<%=u.getIdNode1()%>">
					<%= u.getIdNode1() %>
			</a></td>
			<td><a href="NodeServlet?mode=read&idmap=<%=idmap%>&idNode=<%=u.getIdNode2()%>">
					<%= u.getIdNode2() %>
			</a></td>
			
			<td><a href="LinkServlet?mode=delete&idmap=<%=idmap%>&idNode1=<%=u.getIdNode1()%>&idNode2=<%=u.getIdNode2()%>">Delete</a>
			</td>

		</tr>
		<%
			}
		%>
	</table>



<form id="floatright" action="LinkServlet?mode=insert&idmap=<%=idmap%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="idNode1">ID Nodo 1</label>
    </div>
    <div class="col-75">
      <input type="text" id="idNode1" name="idNode1" placeholder="inserisci ID nodo 1">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="idNode2">ID Nodo 2</label>
    </div>
    <div class="col-75">
      <input type="text" id="idNode2" name="idNode2" placeholder="inserisci ID nodo 2"> 
    </div>
  </div>
 
  <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="../css/footer.jsp" %>
</body>
</html>