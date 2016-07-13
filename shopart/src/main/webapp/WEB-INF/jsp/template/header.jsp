<%-- 
    Document   : header
    Created on : Jul 11, 2016, 2:31:09 AM
    Author     : davie
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<link href="http://cdn.phpoll.com/css/animate.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
    body {
        padding-top: 90px;
    }
    /* General sizing */
    ul.dropdown-lr {
        width: 300px;
    }

    /* mobile fix */
    @media (max-width: 768px) {
        .dropdown-lr h3 {
            color: #eee;
        }
        .dropdown-lr label {
            color: #eee;
        }
    }
    
#login-dp{
    min-width: 250px;
    padding: 14px 14px 0;
    overflow:hidden;
    background-color:rgba(255,255,255,.8);
}
#login-dp .help-block{
    font-size:12px    
}
#login-dp .bottom{
    background-color:rgba(255,255,255,.8);
    border-top:1px solid #ddd;
    clear:both;
    padding:14px;
}
#login-dp .social-buttons{
    margin:12px 0    
}
#login-dp .social-buttons a{
    width: 49%;
}
#login-dp .form-group {
    margin-bottom: 10px;
}
.btn-fb{
    color: #fff;
    background-color:#3b5998;
}
.btn-fb:hover{
    color: #fff;
    background-color:#496ebc 
}
.btn-tw{
    color: #fff;
    background-color:#55acee;
}
.btn-tw:hover{
    color: #fff;
    background-color:#59b5fa;
}
@media(max-width:768px){
    #login-dp{
        background-color: inherit;
        color: #fff;
    }
    #login-dp .bottom{
        background-color: inherit;
        border-top:0 none;
    }
    #disableSetting {
        display: none;
    }
    
    #enableSetting {
        display: list-item;
    }
}

</style>
<section >
    <div class="jumbotron" >
        <div class="container">
            <h1 style="text-align: center;"> <spring:message code= "shopart.welcomemesssage"/> </h1>
        </div>
    </div>
    <%--            <div style='float: right;'><%@ include file="/WEB-INF/jsp/slidewindow.jsp" %></div>--%>

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="">ShopArt</a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="">Home</a></li>
                    <li><a href="">About</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="" class="dropdown-toggle" data-toggle="dropdown">Login <span class="caret"></span></a>
                        <ul class="dropdown-menu dropdown-lr animated flipInX" role="menu">
                            <div class="col-lg-12">
                                <div class="text-center"><h3><b>Login</b></h3></div>
                                <spring:url value="/login" var="loginURL" />
                                <form:form modelAttribute="user" id="ajax-register-form" action="${loginURL}" method="POST" role="form" autocomplete="off">
                                    
                                    <div class="form-group">
                                        <form:input type="text" path="userId" id="username" tabindex="1" class="form-control" placeholder="Username" value=""/>
                                        <form:errors path="userId" cssClass="text-danger"/>
                                    </div>
<!--                                    <div class="form-group">
                                        <input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="">
                                    </div>-->
                                    <div class="form-group">
                                       <form:input type="password" path="password" id="password" tabindex="2" class="form-control" placeholder="Password"/>
                                       <form:errors path="password" cssClass="text-danger"/>
                                    </div>
                                <div class="form-group">
                                    <label>Remember Me
                                        <input type="checkbox" name="remember" 
                                               <c:if test="${cookie.containsKey('userId')}">Checked</c:if> 
                                    </label>
                                </div>
<!--                                    <div class="form-group">
                                        <input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password">
                                    </div>-->
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-xs-6 col-xs-offset-3">
                                                <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-info" value="Login"/>
                                            </div>
                                        </div>
                                    </div>
                                    <input type="hidden" class="hide" name="token" id="token" value="7c6f19960d63f53fcd05c3e0cbc434c0">
                                </form:form>
                                <div class="bottom text-center">New here ? <a href="#"><b>Join Us</b></a></div>
                            </div>
                        </ul>
                    </li>
                    <!-- User Profile Options -->
                    <li class="dropdown" id="${empty userLog.userId ?'disableSetting':'enableSetting'}">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b class="userNameLabel">Hello  ${userLog.personId.firstName}</b> <span class="caret"></span></a>
                        <ul id="login-dp" class="dropdown-menu">
                            <li><div class="row">
                            <spring:url value="/logout" var="logoutURL" />
                            <div class="list-group">
                              <a href="#" class="list-group-item">Your order</a>
                              <a href="#" class="list-group-item">Shipment Setting</a>
                              <a href="#" class="list-group-item">Payment Setting</a>
                              <a href="${logoutURL}" class="btn btn-info btn-sm">
                                    <span class="glyphicon glyphicon-log-out"></span> Log out
                              </a>
                              
                            </div>

                             </div>
                            </li>
			</ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</section>



