<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.FolderDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Edit User</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>
<div class="navbar">
  <a href="homeadmin.jsp">Home</a>
  <a class="active" href="UserServlet?mode=userlist">Users</a>
  <a href="FolderServlet?mode=folderlist">Folders</a>
<a href="GuideServlet?mode=guidelist">Guides</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<br>
<div class="main">

<%FolderDTO u = (FolderDTO) request.getAttribute("dto");%>


<form id="floatleft" action="FolderServlet?mode=update&idFolder=<%=u.getIdFolder()%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="folder">Folder</label>
    </div>
    <div class="col-75">
      <input type="text" id="folder" name="nameFolder" value=<%=u.getNameFolder()%>>
    </div>
  </div>
 
      <button type="submit" >Edit</button>
</form>

	
</div>
<br>
<%@ include file="../css/footer.jsp" %>	
</body>
</html>