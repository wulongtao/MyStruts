<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:debug></s:debug>

<s:property value="name"/>

<s:property value="username"/>

<s:property value="user.username"/>
<s:property value="user.password"/>

<s:property value="list[0]"/>

<br>

<s:iterator value="list">
	<s:property value="username"/>
	<s:property value="password"/>
</s:iterator>

<br>

<s:iterator value="list" var="user">
	<s:property value="#user.username"/>
	<s:property value="#user.password"/>
</s:iterator>

<br>

<c:forEach items="${list }" var="user">
	${user.username }--
	${user.password }--
</c:forEach>

<s:textfield name="username" value="%{#user}"></s:textfield>

</body>
</html>