<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.GuideDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Edit Guide</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>
<div class="navbar">
  <a href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist">Users</a>
  <a href="FolderServlet?mode=folderlist">Folders</a>
  <a class="active" href="GuideServlet?mode=guidelist">Guides</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<br>
<div class="main">

<%GuideDTO g = (GuideDTO) request.getAttribute("dto");%>


<form id="floatleft" action="GuideServlet?mode=update&id=<%=g.getIdGuide()%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="question">Question</label>
    </div>
    <div class="col-75">
      <input type="text" id="question" name="question" value=<%=g.getQuestion()%>>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="answer">Answer</label>
    </div>
    <div class="col-75">
      <input
			type="text" id="answer" name="answer" value=<%=g.getAnswer()%>> 
    </div>
  </div>
      <button type="submit" >Edit</button>
</form>

	
</div>
<br>
<%@ include file="../css/footer.jsp" %>	
</body>
</html>