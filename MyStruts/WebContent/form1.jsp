<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<h1>Struts form</h1>

<form action="${pageContext.request.contextPath}/data1.action" method="post">
	username:<input name="username" type="text" > <br>
	password:<input name="password" type="text" > <br>
	address:<input name="address" type="text" > <br>
	<input type="checkbox" name="a" value="111">
	<input type="checkbox" name="a" value="222">
	ok:<input type="submit">
</form>

</body>
</html>