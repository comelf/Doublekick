<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>이단옆차기 실용음악 학원</title>
	
	<link rel="stylesheet" href="/css/styles.css">
	
	<body>        
        <div class="app">
            <div class="app-container">
                <div class="app-login-box">                                        
                    <div class="app-login-box-user"><img src="/assets/images/users/no-image.png" alt="Logo"></div>
                    <div class="app-login-box-title">
                        <div class="title">Already a member?</div>
                        <div class="subtitle">Sign in to your account</div>                        
                    </div>
                    <div class="app-login-box-container">
                        <form action="/account/loginp" method="post">
                            <div class="form-group">
                                <input type="text" class="form-control" name="account" placeholder="Login Id" value="${account}">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="password" placeholder="Password" maxlength="30">
                            </div>
                            <div class="form-group">
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
								<c:if test="${ not empty error }">
                                	<div class="row">
	                                    <div class="col-md-12 col-xs-12">
						                    <div class="error-message">
						                        <div class="title">${ error }</div>
						                    </div>
					                    </div>
				                    </div>
			                    </c:if>
                                <div class="row">
                                    <div class="col-md-6 col-xs-6">
                                        <div class="app-checkbox">
                                            <label><input type="checkbox" name="app-checkbox-1" value="0"> Remember me</label>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                  <div class="col-md-12 col-xs-12">
                                        <button class="btn btn-success btn-block">Log In</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="app-login-box-footer">
                        &copy; 2016 DUBLEKICK ACADEMY. all rights reserved
                    </div>
                </div>
                                
            </div>
           
        </div>        
        
       <script type="text/javascript" src="/js/lib/jquery/jquery.min.js"></script>
		<script type="text/javascript" src="/js/lib/jquery/jquery-migrate.min.js"></script>
	    <script type="text/javascript" src="/js/lib/jquery/jquery-ui.min.js"></script>
	    <script type="text/javascript" src="/js/lib/bootstrap/bootstrap.min.js"></script>
	    <script type="text/javascript" src="/js/lib/moment/moment.min.js"></script>>
	    <script type="text/javascript" src="/js/lib/customscrollbar/jquery.mCustomScrollbar.min.js"></script>
	    <script type="text/javascript" src="js/app.js"></script>
	    <script type="text/javascript" src="js/app_plugins.js"></script>
</head>