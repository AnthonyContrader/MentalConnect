<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"  import="it.contrader.dto.NodeDTO"
	import="it.contrader.dto.LinkDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Link Manager</title>
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
<div class="main">
	<% 	List<LinkDTO> list = (List<LinkDTO>) request.getAttribute("list"); 	
		List<NodeDTO> nodes = (List<NodeDTO>) request.getAttribute("nodes"); 	
	 	int idmap = (int) request.getAttribute("idmap"); 
	 %>	

<br>

	<table>
		<tr>
			<th>Nodo 1</th>
			<th>Nodo 2</th>
			<th></th>
		</tr>
		<%
			for (LinkDTO u : list) {
			
		%>
		<tr>
			<td><a href="NodeServlet?mode=read&idmap=<%=idmap%>&id=<%=u.getIdNode1()%>">
					<%= nodes.stream().filter(x -> x.getIdNode() == u.getIdNode1()).findFirst().get().getText() %>
			</a></td>
			<td><a href="NodeServlet?mode=read&idmap=<%=idmap%>&id=<%=u.getIdNode2()%>">
					<%= nodes.stream().filter(x -> x.getIdNode() == u.getIdNode2()).findFirst().get().getText() %>
			</a></td>
			
			<td><a href="LinkServlet?mode=delete&idmap=<%=idmap%>&idNode1=<%=u.getIdNode1()%>&idNode2=<%=u.getIdNode2()%>">Delete</a>
			</td>

		</tr>
		<%
			}
		%>
	</table>



<form id="floatright" action="LinkServlet?mode=insert&idmap=<%=idmap%>" method="post">
<div class="row">
    <div class="col-25">
      <label for="idNode1">Nodo 1</label>
    </div>
   		 <div class="col-75">
 			<select id="idNode1" name="idNode1">
 			<%
 				for (NodeDTO n : nodes) {
			%>
  				<option value="<%=n.getIdNode()%>"><%=n.getText()%></option>
			<%
				}
			%>
			</select>
    	</div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="idNode2">Nodo 2</label>
    </div>
   		 <div class="col-75">
 			<select id="idNode2" name="idNode2">
  			<%
 				for (NodeDTO n : nodes) {
			%>
  				<option value="<%=n.getIdNode()%>"><%=n.getText()%></option>
			<%
				}
			%>
			</select>
    	</div>
  </div>
 
  <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="../css/footer.jsp" %>
</body>
</html>