<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.GuideDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Guide Manager</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>

<div class="navbar">
  <a  href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist">Users</a>
  <a href="FolderServlet?mode=folderlist">Folders</a>
  <a class="active" href="GuideServlet?mode=guidelist">Guides</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<div class="main">
	<%
		List<GuideDTO> list = (List<GuideDTO>) request.getAttribute("list");
	%>

<br>

	<table>
		<tr>
			<th>Question</th>
			<th>Answer</th>
			<th></th>
			<th></th>
		</tr>
		<%
			for (GuideDTO g : list) {
		%>
		<tr>
			<td><a href=GuideServlet?mode=read&id=<%=g.getIdGuide()%>>
					<%=g.getQuestion()%>
			</a></td>
			<td><%=g.getAnswer()%></td>
			<td><a href=GuideServlet?mode=read&update=true&id=<%=g.getIdGuide()%>>Edit</a>
			</td>
			<td><a href=GuideServlet?mode=delete&id=<%=g.getIdGuide()%>>Delete</a>
			</td>

		</tr>
		<%
			}
		%>
	</table>



<form id="floatright" action="GuideServlet?mode=insert" method="post">
  <div class="row">
    <div class="col-25">
      <label for="question">Question</label>
    </div>
    <div class="col-75">
      <input type="text" id="question" name="question" placeholder="inserisci question">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="answer">Answer</label>
    </div>
    <div class="col-75">
      <input type="text" id="answer" name="answer" placeholder="inserisci answer"> 
    </div>
  </div>

      <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="../css/footer.jsp" %>
</body>
</html>