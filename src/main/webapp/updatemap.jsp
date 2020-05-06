<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.MapDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Map Edit page">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Edit Map</title>

</head>
<body>
<%@ include file="./css/header.jsp" %>
<div class="navbar">
  <a href="/homeadmin.jsp">Home</a>
  <a class="active" href="/user/getall">Users</a>
  <a href="/folder/getall?idUser="${user.getId()}>Folders</a>
  <a href="/user/logout" id="logout">Logout</a>
</div>
<br>
<div class="main">

<%MapDTO u = (MapDTO) request.getSession().getAttribute("dto");%>


<form id="floatleft" action="/map/update?idMap=<%=u.getIdMap()%>&idFolder=<%=u.getIdFolder()%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="mapName">Mappa</label>
    </div>
    <div class="col-75">
      <input type="text" id="mapName" name="mapName" value=<%=u.getMapName()%>>
    </div>
  </div>
 	<input type="hidden" name="idMap" value =<%=u.getIdMap() %>>
    	<input type="hidden" name="idFolder" value =<%=u.getIdFolder() %>>	 
 
      <button type="submit" >Edit</button>
</form>

	
</div>
<br>
<%@ include file="./css/footer.jsp" %>	
</body>
</html>