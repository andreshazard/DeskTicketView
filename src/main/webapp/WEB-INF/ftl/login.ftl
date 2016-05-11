<html lang="en" xmlns:th="http://java.sun.com/jsf/composite">
<head>
    <title>Desk Ticket View</title>
    <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <style>

        .form-login {
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }

        .form-login .form-control {
            position: relative;
            height: auto;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            padding: 10px;
            font-size: 16px;
        }
        .form-login .form-control:focus {
            z-index: 2;
        }
        .form-login input[type="username"] {
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }
        .form-login input[type="password"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }
    </style>
</head>
<body style="margin-left: 20%; margin-right: 20%">
<#include "common/navegation-login.ftl">
<div class="container">
      <form class="form-login" method="POST">
        <h2 class="form-signin-heading">Desk Ticket View</h2>
          <#if RequestParameters.error??>
              <div class="alert alert-danger" role="alert">
                  <p>Invalid username and password.You shall not pass!</p>
              </div>
          </#if>
          <#if RequestParameters.logout??>
              <div class="alert alert-info" role="alert">
                  <p>You have been logged out.</p>
              </div>
          </#if>
        <label for="username" class="sr-only">Username</label>
        <input type="text" id="username" class="form-control" placeholder="Username" name="username" required autofocus>
          <br/>
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" class="form-control" placeholder="Password" name="password" required><br>
          <div class="form-actions">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
          </div>
      </form>
</div>


<#include "common/footer.ftl">
