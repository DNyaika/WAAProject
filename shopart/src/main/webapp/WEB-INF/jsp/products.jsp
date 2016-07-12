<%-- 
    Document   : contact
    Created on : Jul 11, 2016, 2:34:13 AM
    Author     : davie
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <html>
    <head>
        <link rel="stylesheet"
              href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Products</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <div style="float:left">
                        <h1>Products</h1>
                        <p>All the available products in our store</p>
                    </div>
                </div>
            </div>
        </section>
        <section class="container">
            <div class="row">
                <c:forEach items="${products}" var="product"> 
                    <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                        <div class="thumbnail">
                            <div class="col-md-5">
                                <img src='<c:url value="/resources/images/${product.productId}.jpg">
                                     </c:url>'
                                     alt="image" style = "width:100%"/>
                            </div>
                            <div class="caption">
                                <h3>${product.name}</h3>
                                <p>${product.description}</p>
                                <p>${product.unitPrice} USD</p>
                                <p>Available ${product.unitsInStock} units in stock</p>
                            </div>
                            <input type="button" value="Details" onclick="location.href = '/waaspring/products/${product.productId}'" class="btn btn-primary">
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
    </body>
</html>