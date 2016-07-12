<%-- 
    Document   : MainWindow
    Created on : Jul 11, 2016, 12:24:31 AM
    Author     : davie
--%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
        <%-- <script src='<spring:url value="/resources/css/main.css" />'></script>--%>
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    </head>
    <body>
        <div id="header" class="navbar navbar-default navbar-fixed-top">
            <tiles:insertAttribute name="header" />
        </div>
        <div id="wrapper">
            <div id="sidebar-wrapper" class="col-md-1" style="margin-top: 300px;">
                <div id="sidebar">
                    <tiles:insertAttribute name="menu" />
                </div>
            </div>
            <div id="main-wrapper" class="col-md-11 pull-right" style="margin-top: 250px;">
                <div id="main" style="margin-left: 100px;">
                    <tiles:insertAttribute name="body" />
                </div>
            </div>
        </div>
        <div style="margin-left: 50%;">
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>
