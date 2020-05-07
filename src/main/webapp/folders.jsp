<%@ page import="it.contrader.dto.FolderDTO" import="java.util.*"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="User Management">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>User Manager</title>

</head>
<body>
	<%@ include file="./css/header.jsp"%>


	<div class="navbar">
	<a href="/homeadmin.jsp">Home</a> <a href="/user/getall">Users</a> <a class="active" href="/folder/getall?idUser=${user.getId()}">Folders</a> <a href="/user/logout" id="logout">Logout</a>
	</div>
	<div class="main">
		<%List<FolderDTO> list = (List<FolderDTO>) request.getSession().getAttribute("list");%>
		   
		  <% 	Long idUser = (Long) request.getAttribute("idUser"); %>

		<br>

		<table>
			<tr>
				<th>Folder</th>
			    <th></th>
				<th></th>
				<th></th>
			</tr>
			<%
				for (FolderDTO u : list) {
			%>
			<tr>
				<td><a href="/folder/read?idFolder=<%=u.getIdFolder()%>"> <%=u.getNameFolder()%>
				</a></td>
				
				<td><a href="/folder/preupdate?idFolder=<%=u.getIdFolder()%>">Edit</a></td>


				<td><a href="/folder/delete?idFolder=<%=u.getIdFolder()%>">Delete</a></td>
				
				<td><a href="/map/getall?idFolder=<%=u.getIdFolder()%>">
                    Open
            </a></td>

			</tr>
			<%
				}
			%>
		</table>



		<form id="floatright" action="/folder/insert?idUser=<%=idUser%>" method="post">
			<div class="row">
				<div class="col-25">
					<label for="folder">Folder</label>
				</div>
				<div class="col-75">
					<input type="text" id="folder" name="nameFolder"
						placeholder="Insert folder">
				</div>
			
					
				
			</div>
			<button type="submit">Insert</button>
		</form>

	</div>
	<br>
	<%@ include file="./css/footer.jsp"%>
</body>
</html>