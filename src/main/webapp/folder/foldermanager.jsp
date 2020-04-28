<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.FolderDTO"%>
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
		List<FolderDTO> list = (List<FolderDTO>) request.getAttribute("list");
	int idUser = (int) request.getAttribute("idUser");
	   
	%>

<br>

	<table>
		<tr>
			<th>Folder</th>
			
			
			<th></th>
			<th></th>
		</tr>
		<%
			for (FolderDTO u : list) {
			
		%>
		<tr>
			<td><a href="FolderServlet?mode=read&idFolder=<%=u.getIdFolder()%>&idUser=<%=u.getIdUser()%>">
					<%=u.getNameFolder()%>
			</a></td>
			<td><a href="FolderServlet?mode=read&update=true&idFolder=<%=u.getIdFolder()%>&idUser=<%=u.getIdUser()%>">Edit</a>
			</td>
			<td><a href="FolderServlet?mode=delete&idFolder=<%=u.getIdFolder()%>>">Delete</a>
			</td>
			
		</tr>
		<%
			}
		%>
	</table>
	
	<form idFolder="floatright" action="FolderServlet?mode=insert&idUser=<%=idUser%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="text">Folder</label>
    </div>
    <div class="col-75">
      <input type="text" id="folder" name="nameFolder" placeholder="inserisci cartella">
    </div>
  </div>

      <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="../css/footer.jsp" %>
</body>
</html>
 

