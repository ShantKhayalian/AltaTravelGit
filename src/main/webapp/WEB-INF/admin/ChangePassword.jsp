<%--
  Created by IntelliJ IDEA.
  User: Asus / BeautyIt +374 98 22 98 98
  Date: 12/11/2019
  Time: 12:27 AM
  
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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/fontawesome-free/css/all.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- icheck bootstrap -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/adminlte.min.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">

    <script type="text/javascript">
        $(document).ready(function(){
            $('#password, #confirm_password').on('keyup', function () {
                if ($('#password').val() == $('#confirm_password').val()) {
                    $('#message').html('Համապատասխան են,\n\n կարող էք փոխել գաղտնաբառը').css('color', 'green');
                } else
                    $('#message').html('Համապատասխան չեն,\n\n խնդրում ենք ուղեք սխալը').css('color', 'red');
            });
        });
    </script>
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="#"><b>Ադմին</b>Բաժին</a>
    </div>
    <!-- /.login-logo -->
    <div class="card">
        <div class="card-body login-card-body">
            <p class="login-box-msg">Դուք ընդամենը մեկ քայլ եք հեռու ձեր նոր գաղտնաբառից, վերականգնել հիմա ձեր գաղտնաբառը:</p>
            <%
                if (request.getAttribute("message") != null) {
            %>
            <%=request.getAttribute("message")%>
            <%
                }
            %>
            <p class="login-box-msg" id='message'></p>
            <form action="${pageContext.request.contextPath}/admin/UpdatePassword" method="post" >
                <div class="input-group mb-3">
                    <input type="password" class="form-control" placeholder="Password" id="password"  name="newPassword">
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <span class="fas fa-lock"></span>
                        </div>
                    </div>
                </div>
                <div class="input-group mb-3">
                    <input type="password" class="form-control" placeholder="Confirm Password" id="confirm_password">
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <span class="fas fa-lock"></span>

                        </div>
                    </div>
                </div>
                <div class="row">

                    <div class="col-12">
                        <input type="hidden" name="id" value="${requestScope.AdminId}">

                        <button type="submit" id="checkpass" class="btn btn-primary btn-block">Փոխել գաղտնաբառը</button>
                    </div>
                    <!-- /.col -->
                </div>
            </form>

            <p class="mt-3 mb-1">
                <a href="${pageContext.request.contextPath}/admin">Մուտք</a>
            </p>
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

