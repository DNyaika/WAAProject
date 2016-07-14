<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet"
              href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
        <script src="../resources/js/controllers.js"></script>

        <title>Cart</title>
    </head>
    <body>
        <section class="container" ng-app="cartApp">
            <div ng-controller="cartCtrl" ng-init="initCartId('${cartId}')">

                <div>
                    <a class="btn btn-danger pull-left"
                       href="<c:url value='/clearcart'/>"> <span
                            class="glyphicon glyphicon-remove-sign"></span> Clear Cart
                    </a> <a href="#" class="btn btn-success pull-right"> <span
                            class="glyphicon-shopping-cart glyphicon"></span> Check out
                    </a>
                </div>
                <table class="table table-hover">
                    <tr>
                        <th>Product Name</th>
                        <th>Unit price</th>
                        <th>model</th>
                        <th>Total Price</th>
                        <th>Action</th>
                    </tr>

                    <c:forEach items="${liveshoppingcart.cartItems}" var="cartitem"> 
                        <tr>
                            <td>${cartitem.value.product.productName}</td>
                            <td>${cartitem.value.product.price}</td>
                            <td>${cartitem.value.product.model}</td>
                            <td>${cartitem.value.totalPrice}</td>
                            <td><a href="<c:url value='/remove/${cartitem.value.product.productId}'/>" class="label label-danger"> <span
                                        class="glyphicon glyphicon-remove" /></span> Remove
                                </a></td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <th></th>
                        <th></th>
                        <th>Grand Total</th>
                        <th>${liveshoppingcart.grandTotal}</th>
                        <th></th>
                    </tr>
                </table>

                <a href='<c:url value="/" />' class="btn btn-default">
                    <span class="glyphicon-hand-left glyphicon"></span> Continue shopping
                </a>
                <a href='<c:url value="/thankyou" />' class="btn btn-default">
                    <span class="glyphicon-hand-right glyphicon"></span> Continue to checkout
                </a>
            </div>
        </section>
    </body>
</html>