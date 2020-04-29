<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.NodeDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>User Manager</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>

<div class="navbar">
  <a  href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist">Users</a>
  <a class="active" href="FolderServlet?mode=folderlist&idUser=${user.getId()}">Folders</a>
  <a href="GuideServlet?mode=guidelist">Guides</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<div class="main">
	<%
		List<NodeDTO> list = (List<NodeDTO>) request.getAttribute("list");
	    int idmap = (int) request.getAttribute("idmap");
	%>

<br>

	<table>
		<tr>
			<th>Testo</th>
			<th></th>
			<th></th>
		</tr>
		<%
			for (NodeDTO u : list) {
			
		%>
		<tr>
			<td><a href="NodeServlet?mode=read&id=<%=u.getIdNode()%>&idmap=<%=u.getIdMap()%>">
					<%=u.getText()%>
			</a></td>
			<td><a href="NodeServlet?mode=read&update=true&id=<%=u.getIdNode()%>&idmap=<%=u.getIdMap()%>">Edit</a>
			</td>
			<td><a href="NodeServlet?mode=delete&id=<%=u.getIdNode()%>&idmap=<%=u.getIdMap()%>">Delete</a>
			</td>

		</tr>
		<%
			}
		%>
	</table>



<form id="floatright" action="NodeServlet?mode=insert&idmap=<%=idmap%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="text">Testo</label>
    </div>
    <div class="col-75">
      <input type="text" id="node" name="text" placeholder="inserisci testo">
    </div>
  </div>

      <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="../css/footer.jsp" %>
</body>
</html>