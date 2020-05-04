<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.MapDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Edit Map</title>
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
<br>
<div class="main">

<%MapDTO u = (MapDTO) request.getAttribute("dto");%>


<form id="floatleft" action="MapServlet?mode=update&id=<%=u.getIdMap()%>&idfolder=<%=u.getIdFolder()%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="user">Map</label>
    </div>
    <div class="col-75">
      <input type="text" id="user" name="map" value=<%=u.getMapName()%>>
    </div>
  </div>

  
      <button type="submit" >Edit</button>
</form>

	
</div>
<br>
<%@ include file="../css/footer.jsp" %>	
</body>
</html>