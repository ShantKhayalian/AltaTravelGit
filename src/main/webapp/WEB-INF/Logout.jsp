<%--
  Created by IntelliJ IDEA.
  User: Shant
  Date: 12/3/2019
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Ադմին Բաժին</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- jquery link to work with the timer -->
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/adminlte.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- icheck bootstrap -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/adminlte.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">

    <script type="text/javascript">
        $(document).ready(function () {
            window.setTimeout(function () {
                window.location.href = "${pageContext.request.contextPath}/"
            }, 4000);
        });
    </script>
    <script type="text/javascript">
        $(document).ready(function(){
            $("div").animate({
                width: "100%"
            },4000);

        });
    </script>

</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <%-- <a href="#"><b>Ադմին</b>Բաժին</a>--%>
    </div>
    <!-- /.login-logo -->
    <div class="card">
        <div class="social-auth-links text-center mb-3" id="box">
            <%--<p class="login-box-msg">Մուտք գործեք սկսելու համար</p>--%>
            <%
                if (request.getAttribute("message") != null) {
            %>
            <%=request.getAttribute("message")%>
            <%
                }
            %>

            <div class="social-auth-links text-center mb-3">
                <%--  <p>- OR -</p>
                  <a href="#" class="btn btn-block btn-primary">
                      <i class="fab fa-facebook mr-2"></i> Sign in using Facebook
                  </a>
                  <a href="#" class="btn btn-block btn-danger">
                      <i class="fab fa-google-plus mr-2"></i> Sign in using Google+
                  </a>--%>
            </div>
            <!-- /.social-auth-links -->

            <%--<p class="mb-1">
                <a href="forgot-password.html">I forgot my password</a>
            </p>
            <p class="mb-0">
                <a href="register.html" class="text-center">Register a new membership</a>
            </p>--%>
        </div>
        <!-- /.login-card-body -->
    </div>
</div>
<!-- /.login-box -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/dist/js/adminlte.min.js"></script>

</body>
</html>

