<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String  nick = request.getParameter("nick");
	session.setAttribute("nick", nick);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successfully registered</title>
</head>
<body>
<p>
Thanks for registering on this site: <%= session.getAttribute("nick") %>, we will try to inform you if we add more content to this site!
</p>
<a href="default.jsp"><button>oops, I made a mistake</button></a>
<a href="image.jsp"><button>Leave this booring page</button></a>
</body>
</html>