<%@ page import="it.contrader.dto.MapDTO" import="java.util.*"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Map Management">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Map Manager</title>

</head>
<body>
	<%@ include file="./css/header.jsp"%>

	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> 
		<a href="/user/getall">Users</a> 
		<a  class="active" href="/folder/getall?idUser=${user.getId()}">Folders</a> 
		<a href="/user/logout" id="logout">Logout</a>
	</div>
	<div class="main">
		<%List<MapDTO> list = (List<MapDTO>) request.getSession().getAttribute("list");%>
		<% 	Long idFolder = (Long) request.getAttribute("idFolder"); %>

		<br>

		<table>
			<tr>
				<th>Map</th>
				<th>Link</th>
				<th>Node</th>
				<th></th>
				<th></th>
			</tr>
			<%
				for (MapDTO u : list) {
			%>
			<tr>
				<td><a href="/map/read?idMap=<%=u.getIdMap()%>&idFolder=<%=u.getIdFolder()%>">
				<%=u.getMapName()%>
				</a></td>
				
				<td>
				<a href="/link/getall?idMap=<%=u.getIdMap()%>">
                    Open</a>
               </td>
				
				<td>
				<a href="/node/getall?idMap=<%=u.getIdMap()%>">
                    Open</a>
               </td>
				
				
				
				
				
				<td><a href="/map/preupdate?idMap=<%=u.getIdMap()%>">Edit</a></td>


				<td><a href="/map/delete?idMap=<%=u.getIdMap()%>&idFolder=<%=u.getIdFolder()%>">Delete</a></td>

			</tr>
			<%
				}
			%>
		</table>



		<form id="floatright" action="/map/insert?idFolder=<%=idFolder%>" method="post">
			<div class="row">
				<div class="col-25">
					<label for="mapName">Map name</label>
				</div>
				<div class="col-75">
					<input type="text" id="mapName" name="mapName"
						placeholder="insert map name">
				</div>
			</div>
						
			<button type="submit">Insert</button>
		</form>

	</div>
	<br>
	<%@ include file="./css/footer.jsp"%>
</body>
</html>