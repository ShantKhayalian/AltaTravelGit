<%--
  Created by IntelliJ IDEA.
  User: Asus / BeautyIt +374 98 22 98 98
  Date: 12/23/2019
  Time: 11:35 AM
  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>View Video</h1>
Title: <span>${requestScope.title}</span>
<video width="400" controls>
    <source src="${requestScope.url}"/>
</video>
</body>
</html>
