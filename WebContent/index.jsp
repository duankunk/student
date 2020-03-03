<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<caption>one</caption>
	<tr><th> name</thd></tr>
	<c:forEach items="${ stus }" var="s">
		<tr><td> ${ s.getName() }</td></tr>
<<<<<<< HEAD
=======
		
>>>>>>> refs/heads/xiao
	</c:forEach>
	</table>
</body>
</html>