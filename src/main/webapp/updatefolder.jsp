<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.FolderDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Folder Edit page">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Edit Folder</title>

</head>
<body>
<%@ include file="./css/header.jsp" %>
<div class="navbar">
  <a href="/homeadmin.jsp">Home</a>
  <a class="active" href="/user/getall">Users</a>
 <a href="/folder/getall?idUser=${user.getId()}">Folders</a>
  <a href="/user/logout" id="logout">Logout</a>
</div>
<br>
<div class="main">

<%FolderDTO u = (FolderDTO) request.getSession().getAttribute("dto");%>


<form id="floatleft" action="/folder/update" method="post">
  
  <div class="row">
    <div class="col-25">
      <label for="folder">Folder</label>
    </div>
    <div class="col-75">
      <input type="text" id="folder" name="nameFolder" value=<%=u.getNameFolder()%>>
    </div>
  </div>
 
  
   		<input type="hidden" name="idUser" value =<%=u.getIdUser() %>>
    	<input type="hidden" name="idFolder" value =<%=u.getIdFolder() %>>
 
      <button type="submit" >Edit</button>
 
 
 
 </form>
</div>
<br>
<%@ include file="./css/footer.jsp" %>	
</body>
</html>