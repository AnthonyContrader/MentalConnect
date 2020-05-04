<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.MapDTO"%>
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
  <a  href="UserServlet?mode=userlist">Users</a>
  <a class="active" href="FolderServlet?mode=folderlist&idUser=${user.getId()}">Folders</a>
  <a href="GuideServlet?mode=guidelist">Guides</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<div class="main">
	<%
		List<MapDTO> list = (List<MapDTO>) request.getAttribute("list");
	   int idfolder = (int) request.getAttribute("idfolder");
	%>

<br>

	<table>
		<tr>
			<th>Maps</th>
			<th>Links</th>
			<th>Nodes</th>
			<th></th>
			<th></th>
		</tr>
		<%
			for (MapDTO u : list) {
			
		%>
		
		<tr>
			
			<td><a href="MapServlet?mode=read&id=<%=u.getIdMap()%>&idfolder=<%=u.getIdFolder() %>">
					<%=u.getMapName()%>
			</a></td>
			<td><a href="LinkServlet?mode=linklist&idmap=<%=u.getIdMap()%>">
					Open
			</a></td>
			<td><a href="NodeServlet?mode=Nodelist&idmap=<%=u.getIdMap()%>">
					Open
			</a></td>
			
			<td><a href="MapServlet?mode=read&update=true&id=<%=u.getIdMap()%>&idfolder=<%=u.getIdFolder() %>">Edit</a>
			</td>
			<td><a href="MapServlet?mode=delete&id=<%=u.getIdMap()%>&idfolder=<%=u.getIdFolder() %>">Delete</a>
			</td>

		</tr>
		<%
			}
		%>
	</table>

	

<form id="floatright" action="MapServlet?mode=insert&idfolder=<%=idfolder%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="map">Map</label>
    </div>
    <div class="col-75">
      <input type="text" id="map" name="mapname" placeholder="Insert map">
    </div>
  </div>
 
 
      <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="../css/footer.jsp" %>
</body>
</html>