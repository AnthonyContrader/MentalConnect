<%@ page import="it.contrader.dto.LinkDTO" import="it.contrader.dto.NodeDTO" import="it.contrader.dto.UserDTO" import="java.util.*"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Link Management">
<meta name="author" content="Federico Lucido">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Link Manager</title>

</head>
<body>
	<%@ include file="./css/header.jsp"%>

	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> 
		<a href="/user/getall">Users</a> 
		<a class="active" href="/folder/getall?idUser=${user.getId()}">Folders</a>
		<a href="/user/logout" id="logout">Logout</a>
	</div>
	<div class="main">
		<%
			List<LinkDTO> list = (List<LinkDTO>) request.getSession().getAttribute("list");
			List<NodeDTO> nodes = (List<NodeDTO>) request.getAttribute("nodes");
			UserDTO user = (UserDTO) request.getSession().getAttribute("user");
			
			Long idMap = (Long) request.getAttribute("idMap");		
		%>

		<br>

		<table>
			<tr>
				<th>Node 1</th>
				<th>Node 2</th>
				<th></th>
			</tr>
			<%
				for (LinkDTO u : list) {
			%>
			<tr>
				<td><a href="/node/read?idNode=<%=u.getIdNode1()%>"> 
					<%=u.getIdNode1()%>
					<%-- <%= nodes.stream().filter(x -> x.getIdNode() == u.getIdNode1()).findFirst().get().getText() --%>
				</a></td>
				<td><a href="/node/read?idNode=<%=u.getIdNode2()%>"> 
					<%=u.getIdNode2()%>
					<%-- <%= nodes.stream().filter(x -> x.getIdNode() == u.getIdNode2()).findFirst().get().getText() --%>
				</a></td>

				<td><a href="/link/delete?id=<%=u.getId()%>&idMap=<%=idMap%>">Delete</a></td>

			</tr>
			<%
				}
			%>
		</table>

		<form id="floatright" action="/link/insert?idMap=<%=idMap%>" method="post">
			<div class="row">
				<div class="col-25">
					<label for="idNode1">Node 1</label>
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
					<label for="idNode2">Node 2</label>
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
			
			<button type="submit">Insert</button>
		</form>

	</div>
	<br>
	<%@ include file="./css/footer.jsp"%>
</body>
</html>