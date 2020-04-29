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
  <a class="active" href="UserServlet?mode=userlist">Users</a>
  <a href="FolderServlet?mode=folderlist">Folders</a>
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
			<th>Mappe</th>
			<th>Relazioni</th>
			<th>Nodi</th>
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
					Apri
			</a></td>
			<td><a href="NodeServlet?mode=Nodelist&idmap=<%=u.getIdMap()%>">
					Apri
			</a></td>
			
			<td><a href=MapServlet?mode=read&update=true&id=<%=u.getIdMap()%>>Edit</a>
			</td>
			<td><a href=MapServlet?mode=delete&id=<%=u.getIdMap()%>>Delete</a>
			</td>

		</tr>
		<%
			}
		%>
	</table>

	

<form id="floatright" action="MapServlet?mode=insert&idfolder=<%=idfolder%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="map">Mappa</label>
    </div>
    <div class="col-75">
      <input type="text" id="map" name="mapname" placeholder="Inserisci mappa">
    </div>
  </div>
 
 
      <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="../css/footer.jsp" %>
</body>
</html>