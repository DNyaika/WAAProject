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
        <title>Signup</title>
    </head>
    <body>
        <%--        <div class="container">
            <div class="row main">
                                
                <div class="main-login main-center">
                    <h1>Signup</h1>
                    <spring:url value="/shipment" var="signupURL"/>
                    <form:form class="form-horizontal" modelAttribute="userInfoBean" method="POST" action="${signupURL}">
                        <div class="form-group">
                            <label for="firstName" class="cols-sm-2 control-label">First Name</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="firstName" name="firstName" id="firstName"  placeholder="Enter your First Name"/>
				</div>
			    </div>
                            <div class="">
                                <form:errors path="firstName" cssClass="text-danger">Error test</form:errors>
                            </div>
			</div>
                        
                        <div class="form-group">
                            <label for="lastName" class="cols-sm-2 control-label">Last Name</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="lastName" name="lastName" id="lastName"  placeholder="Enter your Last Name"/>
				</div>
			    </div>
                            <div class=""
                                <form:errors path="lastName" cssClass="text-danger"/>
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
                            <div class="">
                                <form:errors path="email" cssClass="text-danger"/>
                            </div>
			</div>
                        
                        <div class="form-group">
                            <label for="userName" class="cols-sm-2 control-label">Username</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="userName" name="userName" id="userName"  placeholder="Enter your Username"/>
                                </div>
                            </div>
                            <div class="">
                                <form:errors path="userName" cssClass="text-danger"/>
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
                            <div class="">
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
                            <div class="">
                                <form:errors path="confirm" cssClass="text-danger"/>
                            </div>
			</div>
                        <div class="form-group ">
                            <button type="submit" class="btn btn-primary btn-lg btn-block login-button">Next</button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
--%>
<div class="container">
                    <h1>Signup</h1>
                    <spring:url value="/signupForm" var="signupURL"/>
                    <div class="row-fluid">
                        <div class="span12">
                            <div class="col-md-12 well">
                                <div class="area">
                    <form:form class="" modelAttribute="userInfoBean" method="POST" action="${signupURL}">
                        <div class="heading">
                            <h3 class="form-heading">Personal Info</h4>
                        </div>
                        <div class="form-group">
                            <label for="firstName" class="cols-sm-2 control-label">First Name</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="firstName" name="firstName" id="firstName"  placeholder="Enter your First Name"/>
				</div>
			    </div>
                            <div class="">
                                <form:errors path="firstName" class="alert alert-danger"></form:errors>
                            </div>
			</div>
                        
                        <div class="form-group">
                            <label for="lastName" class="cols-sm-2 control-label">Last Name</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="lastName" name="lastName" id="lastName"  placeholder="Enter your Last Name"/>
				</div>
			    </div>
                            <div class="">
                                <form:errors path="lastName" class="alert alert-danger"/>
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
                            <div class="">
                                <form:errors path="email" class="alert alert-danger"/>
                            </div>
			</div>
                        
                        <div class="form-group">
                            <label for="userName" class="cols-sm-2 control-label">Username</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="userName" name="userName" id="userName"  placeholder="Enter your Username"/>
                                </div>
                            </div>
                            <div class="">
                                <form:errors path="userName" class="alert alert-danger"/>
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
                            <div class="">
                                <form:errors path="password" class="alert alert-danger"/>
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
                            <div class="">
                                <form:errors path="confirm" class="alert alert-danger"/>
                            </div>
			</div>

                        </div>
                           
                <%--    </form:form> --%>
                                </div>
                            </div>
                            
                      <div class="col-md-12 well">
                            <div class="area">
                                <spring:url value="/signup" var="signupURL"/>
                                <%--   <form:form class=""  modelAttribute="userInfoBean" method="post" action="#"> --%>
                                        <div class="heading">
                                            <h3 class="form-heading">Shipment Info</h4>
                                        </div>
                                    <div class="form-group">
                                        <label for="street" class="cols-sm-2 control-label">Street</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i></span>
                                                <form:input type="text" class="form-control" path="street" name="street" id="street"  placeholder="Enter your Street"/>
                                            </div>
                                        </div>
                                        <div class="">
                                            <form:errors path="street" class="alert alert-danger">Error test</form:errors>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="zip" class="cols-sm-2 control-label">ZIP Code</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-home" aria-hidden="true"></i></span>
                                                <form:input type="text" class="form-control" path="zip" name="zip" id="zip"  placeholder="Enter your Zip"/>
                                            </div>
                                        </div>
                                        <div class="">
                                            <form:errors path="zip" class="alert alert-danger"/>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="state" class="cols-sm-2 control-label">State</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-home" aria-hidden="true"></i></span>
                                                <form:input type="text" class="form-control" path="state" name="state" id="state"  placeholder="Enter your State"/>
                                            </div>
                                        </div>
                                        <div class="">
                                            <form:errors path="state" cssClass="text-danger" class="alert alert-danger"/>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="phone" class="cols-sm-2 control-label">Phone</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i></span>
                                                <form:input type="text" class="form-control" path="phone" name="phone" id="username"  placeholder="Enter your Phone"/>
                                            </div>
                                        </div>
                                        <div class="">
                                            <form:errors path="phone" cssClass="text-danger" class="alert alert-danger"/>
                                        </div>
                                    </div>
                                            <%--       </form:form> --%>
                                </div>
                            </div>
                     </div>
                <div  class="col-md-12 well">
                   <div class="area">
                    <spring:url value="/signup" var="signupURL"/>
                    <%--        <form:form class="" modelAttribute="userInfoBean" method="post" action="#"> --%>
                        <div class="heading">
                            <h3 class="form-heading">Payment Info</h4>
                        </div>
                        <div class="form-group">
                            <label for="cardNumber" class="cols-sm-2 control-label">Card Number</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <form:input type="text" class="form-control" path="cardNumber" name="cardNumber" id="cardNumber"  placeholder="Enter your Card Number"/>
				</div>
			    </div>
                            <div class="">
                                <form:errors path="cardNumber" cssClass="text-danger" class="alert alert-danger"></form:errors>
                            </div>
			</div>
                        
                        <div class="form-group">
                            <label for="zip" class="cols-sm-2 control-label">Card Type</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <form:select class="form-control" path="cardType" name="cardType" id="cardType">
                                        <form:option value="">Card Type</form:option>
                                        <form:option value="Americavisa">America Visa</form:option>
                                        <form:option value="Mastercard">Master Card</form:option>
                                    </form:select>
				</div>
			    </div>
                            <div class="">
                                <form:errors path="cardType" cssClass="text-danger" class="alert alert-danger"/>
                            </div>
			</div>

			<div class="form-group">
                            <label for="state" class="cols-sm-2 control-label">Expiration Date</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-calendar" aria-hidden="true"></i></span>
                                    <form:input type="date" class="form-control" path="expirationDate" name="expirationDate" id="expirationDate"  placeholder="Card Expiration"/>
                                </div>
                            </div>
                            <div class="">
                                <form:errors path="expirationDate" class="alert alert-danger" cssClass="text-danger"/>
                            </div>
			</div>
                        <div class="control-group">
                            <div class="controls">
                            <button type="submit" class="btn btn-primary btn-lg login-button">Register</button>
                        </div>
                    </form:form>
                                    </div>
                                </div>
                         
                    </div>
    </div>
    
    
    </body>
</html>
