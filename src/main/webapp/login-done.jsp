<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String uname=request.getParameter("uname");
	String upass=request.getParameter("upass");
	
	%>
	<h3>User Details</h3>
	<span>UserName : </span><%=uname %>
	<span>UserPass : </span><%=upass %>
	
	
	<h3>This is data From the ServletConfig</h3>
	
	<%
		String lang1=config.getInitParameter("lang1");
	String lang2=config.getInitParameter("lang2");
	%>
	
	<br/>
	<span>Language 1 :</span><%=lang1 %>
	<span>Language 2 :</span><%=lang2 %>
</body>
</html>