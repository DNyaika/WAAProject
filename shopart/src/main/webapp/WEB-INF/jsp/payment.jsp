<%-- 
    Document   : signup
    Created on : Jul 12, 2016, 6:55:02 PM
    Author     : 985072
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <spring:url value="/resources/css/signup.css" var="signupCSS" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <link href="${signupCSS}" rel="stylesheet" />
		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
        <title>Shipment</title>
    </head>
    <body>
        <div class="container">
            <div class="row main">
                                
                <div class="main-login main-center">
                    <h1>Payment</h1>
                    <spring:url value="/signup" var="signupURL"/>
                    <form:form class="form-horizontal" modelAttribute="userInfoBean" method="post" action="#">
                        <div class="form-group">
                            <label for="street" class="cols-sm-2 control-label">Street</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="street" name="street" id="street"  placeholder="Enter your Street"/>
				</div>
			    </div>
                            <div class="">
                                <form:errors path="street" cssClass="text-danger">Error test</form:errors>
                            </div>
			</div>
                        
                        <div class="form-group">
                            <label for="zip" class="cols-sm-2 control-label">ZIP Code</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="zip" name="zip" id="zip"  placeholder="Enter your Zip"/>
				</div>
			    </div>
                            <div class="">
                                <form:errors path="zip" cssClass="text-danger"/>
                            </div>
			</div>

			<div class="form-group">
                            <label for="state" class="cols-sm-2 control-label">State</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="state" name="state" id="state"  placeholder="Enter your Email"/>
                                </div>
                            </div>
                            <div class="">
                                <form:errors path="state" cssClass="text-danger"/>
                            </div>
			</div>
                        
                        <div class="form-group">
                            <label for="phone" class="cols-sm-2 control-label">Phone</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="phone" name="phone" id="username"  placeholder="Enter your Username"/>
                                </div>
                            </div>
                            <div class="">
                                <form:errors path="phone" cssClass="text-danger"/>
                            </div>
                        </div>

                        <div class="form-group ">
                            <button type="submit" class="btn btn-primary btn-lg btn-block login-button">Next</button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>

    </body>
</html>
