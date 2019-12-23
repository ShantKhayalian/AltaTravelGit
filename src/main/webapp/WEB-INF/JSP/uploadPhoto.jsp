<%--
  Created by IntelliJ IDEA.
  User: Asus / BeautyIt +374 98 22 98 98
  Date: 12/23/2019
  Time: 11:32 AM
  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="/photos/add" enctype="multipart/form-data">
    Title:<input type="text" name="title" />
    Image:<input type="file" name="image" accept="image/*" />
    <input type="submit" value="Upload" />
</form>
</body>
</html>
