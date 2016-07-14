<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet"
              href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <script src=
                "https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js">
        </script>
        <script src = "../resources/js/controllers.js">
        </script>
        <title>Products</title>
    </head>
    <body>
        <section class="container" ng-app="cartApp">
            <div class="row">
                <div class="col-md-5">
                    <img src='<c:url value="/resources/images/${product.productImage}.jpg"></c:url>' alt="image"  style = "width:100%"/>
                    </div>
                    <div class="col-md-5">
                        <h3>${product.productName}</h3>
                    <p>
                        <strong>Item model : </strong><span class="label label-warning">${product.model}</span>
                    </p>
                    <p>
                        <strong>manufacturer</strong> : ${product.manufacturer.manufacturerName}
                    </p>
                    <p>
                        <strong>category</strong> : ${product.productCategory.categoryName}
                    </p>
             
                    <h4>${product.price} USD</h4>
               <p ng-controller="cartCtrl">

                        <a href='<c:url value="/" />' class="btn btn-default">
                            <span class='glyphicon-hand-left glyphicon'>back</span>
                        </a>
                        <a href="#" class="btn btn-warning btn-large" onclick="location.href = '<c:url value='/addtocart/${product.productId}/${product.productCategory.categoryId}'/>'">
                            <span class="glyphicon-shopping-cart glyphicon"></span> Add to Cart
                        </a>

                    </p>
                </div>
            </div>
        </section>
    </body>
</html>