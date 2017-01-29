<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<h1>login</h1>

<form action="${pageContext.request.contextPath}/customer_login.action" method="post" enctype="multipart/form-data">
	username:<input name="username" type="text" > <br>
	password:<input name="password" type="text" > <br>
	file:<input type="file" name="file">
	ok:<input type="submit">
</form>

</body>
</html>