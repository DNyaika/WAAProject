<%-- 
    Document   : signup
    Created on : Jul 12, 2016, 6:55:02 PM
    Author     : 985072
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <spring:url value="/resources/css/signup.css" var="signupCSS" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <link href="${signupCSS}" rel="stylesheet" />
        <title>Signup</title>
    </head>
    <body>
        <div class="container">
            <div class="row main">
                                
                <div class="main-login main-center">
                    <h1>Signup</h1>
                    <spring:url value="/shipment" var="signupURL"/>
                    <form:form class="form-horizontal" method="post" action="${signupURL}">
                        <div class="form-group">
                            <label for="name" class="cols-sm-2 control-label">First Name</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="name" name="name" id="name"  placeholder="Enter your Name"/>
				</div>
			    </div>
                            <div class=""
                                <form:errors path="userId" cssClass="text-danger">Error test</form:errors>
                            </div>
			</div>
                        
                        <div class="form-group">
                            <label for="name" class="cols-sm-2 control-label">Last Name</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="name" name="name" id="name"  placeholder="Enter your Name"/>
				</div>
			    </div>
                            <div class=""
                                <form:errors path="name" cssClass="text-danger"/>
                            </div>
			</div>

			<div class="form-group">
                            <label for="email" class="cols-sm-2 control-label">Email</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="email" name="email" id="email"  placeholder="Enter your Email"/>
                                </div>
                            </div>
                            <div class=""
                                <form:errors path="email" cssClass="text-danger"/>
                            </div>
			</div>
                        
                        <div class="form-group">
                            <label for="username" class="cols-sm-2 control-label">Username</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="username" name="username" id="username"  placeholder="Enter your Username"/>
                                </div>
                            </div>
                            <div class=""
                                <form:errors path="username" cssClass="text-danger"/>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="password" class="cols-sm-2 control-label">Password</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <form:input type="password" class="form-control" path="password" name="password" id="password"  placeholder="Enter your Password"/>
				</div>
                            </div>
                            <div class=""
                                <form:errors path="password" cssClass="text-danger"/>
                            </div>
			</div>
                        
                        <div class="form-group">
                            <label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <form:input type="password" path="confirm" class="form-control" name="confirm" id="confirm"  placeholder="Confirm your Password"/>
                                </div>
			    </div>
                            <div class=""
                                <form:errors path="confirm" cssClass="text-danger"/>
                            </div>
			</div>
                        <div class="form-group ">
                            <button type="button" class="btn btn-primary btn-lg btn-block login-button">Next</button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>

    </body>
</html>
