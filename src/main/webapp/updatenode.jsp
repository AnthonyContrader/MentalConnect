<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.NodeDTO"%>
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
		<a href="/homeadmin.jsp">Home</a>
		<a	href="/user/getall">Users</a>
		 <a class=active href="/folder/getall?idUser=${user.getId()}">Folders</a>
		 <a href="/user/logout" id="logout">Logout</a>
</div>
<br>
<div class="main">

<%NodeDTO u = (NodeDTO) request.getSession().getAttribute("dto");%>


<form id="floatleft" action="/node/update?idNode=<%=u.getIdNode()%>&idMap=<%=u.getIdMap()%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="node">Text</label>
    </div>
    <div class="col-75">
      <input type="hidden" id="idNode" name="idNode" value=<%=u.getIdNode()%>>
      <input type="text" id="idNode" name="text" value=<%=u.getText()%>>
      <input type="hidden" id="idMap" name="idMap" value=<%=u.getIdMap()%>>
    </div>
  </div>
      <button type="submit" >Edit</button>
</form>

	
</div>
<br>
<%@ include file="../css/footer.jsp" %>	
</body>
</html>