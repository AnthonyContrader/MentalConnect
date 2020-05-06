<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.NodeDTO"%>
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
		<a href="/homeadmin.jsp">Home</a>
		<a	href="/user/getall">Users</a>
		 <a class=active href="/folder/getall?idUser=${user.getId()}">Folders</a>
		 <a href="/user/logout" id="logout">Logout</a>
	</div>
	
<div class="main">
	<%
	    List<NodeDTO> list = (List<NodeDTO>) request.getSession().getAttribute("list");
	    Long idMap = (Long) request.getAttribute("idMap");
	%>

<br>

	<table>
		<tr>
			<th>Text</th>
			<th></th>
			<th></th>
		</tr>
		<%
			for (NodeDTO u : list) {
			
		%>
		<tr>
			<td><a href="/node/read?idNode=<%=u.getIdNode()%>&idMap=<%=u.getIdMap()%>">
					<%=u.getText()%>
			</a></td>
			<td><a href="/node/preupdate?idNode=<%=u.getIdNode()%>&idMap=<%=u.getIdMap()%>">Edit</a>
			</td>
			<td><a href="/node/delete?idNode=<%=u.getIdNode()%>&idMap=<%=u.getIdMap()%>">Delete</a>
			</td>

		</tr>
		<%
			}
		%>
	</table>


<form id="floatright" action="/node/insert?idMap=<%=idMap%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="text">Text</label>
    </div>
    <div class="col-75">
      <input type="text" id="node" name="text" placeholder="insert text">
    </div>
  </div>
  
      <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="../css/footer.jsp" %>
</body>
</html>