<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <title>Home page</title>
</head>
<body>
<h1>Home page</h1>
<p>
    <div>${message}</div>
    <br/>
    <a href="${pageContext.request.contextPath}/player/add.html" class="test">Add new player</a><br/>
    <a href="${pageContext.request.contextPath}/tournament/add.html">Add new tournament</a><br/>
    <a href="${pageContext.request.contextPath}/player/list.html">Player list</a><br/>
    <a href="${pageContext.request.contextPath}/tournament/list.html">Tournament list</a><br/>
</p>
</body>
</html>