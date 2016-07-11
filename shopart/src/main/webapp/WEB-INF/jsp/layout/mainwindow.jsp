<%-- 
    Document   : MainWindow
    Created on : Jul 11, 2016, 12:24:31 AM
    Author     : davie
--%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
    </head>
    <body>
        <div>
            <tiles:insertAttribute name="header" />
        </div>
        <div>
        <div>
            <tiles:insertAttribute name="menu" />
        </div>
        <div>
            <tiles:insertAttribute name="body" />
        </div>
        </div>
        <div>
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>
