<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false"%>

<%@ include file="Headers/Login2Header.jsp" %>

    <body ng-app="myApp" class="ng-cloak" ng-controller="Ctrl">

        <!-- Navigation -->
        <nav class="navbar navbar-light bg-light static-top">
          <div class="container">
            <a class="navbar-brand" href="/"><img src="img/app/logo.png" title="${pageTitle}" width="170" height="50"/></a>
          </div>
        </nav>

        <!-- Top content -->
        <div class="top-content">

            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1>{{'login.page.signin.label' | translate}}</h1>
                        </div>
                    </div>
                    <c:if test="${param.error != null}">
                        <div class="col-sm-8 col-sm-offset-2 text alert alert-error">
                            <h1>ERROR</h1>
                        </div>
                    </c:if>
                    <c:if test="${param.logout != null}">
                        <div class="col-sm-8 col-sm-offset-2 text alert alert-error">
                            <h1>LOGGED OUT</h1>
                        </div>
                    </c:if>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                            		<p>{{'login.page.enter.username.password.label' | translate}}</p>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="/login" method="post" class="login-form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-username">Username</label>
			                        	<input type="text" name="username" placeholder="{{'login.page.username.placeholder.label' | translate}}" class="form-username form-control" id="form-username">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">Password</label>
			                        	<input type="password" name="password" placeholder="{{'login.page.password.placeholder.label' | translate}}" class="form-password form-control" id="form-password">
			                        </div>
			                        <button type="submit" class="btn">{{'login.page.signin.button.label' | translate}}</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 social-login">
                        	<h3>{{'login.page.or.signin.label' | translate}}</h3>
                        	<div class="social-login-buttons">
	                        	<a class="btn btn-link-2" href="#">
	                        		<i class="fa fa-facebook"></i> Facebook
	                        	</a>
	                        	<a class="btn btn-link-2" href="#">
	                        		<i class="fa fa-twitter"></i> Twitter
	                        	</a>
	                        	<a class="btn btn-link-2" href="#">
	                        		<i class="fa fa-google-plus"></i> Google Plus
	                        	</a>
                        	</div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

<%@ include file="Footers/Login2Footer.jsp" %>