<%-- 
    Document   : menu
    Created on : Jul 11, 2016, 2:31:45 AM
    Author     : davie
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<ul class="nav list-group">
    <c:forEach items="${categories}" var="category"> 
        <li style='width:  200px;'>
            <a class="list-group-item" href="#"><i class="icon-home icon-1x"></i>${category.categoryName}</a>
        </li>
    </c:forEach>

</ul>