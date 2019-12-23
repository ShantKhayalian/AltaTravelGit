<%--
  Created by IntelliJ IDEA.
  User: Asus / BeautyIt +374 98 22 98 98
  Date: 12/23/2019
  Time: 11:33 AM
  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>View Photo</h1>
Title: <span >${requestScope.title}</span>
<img alt="sample" src="${requestScope.image}" />
</body>
</html>
