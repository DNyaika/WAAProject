<%-- 
    Document   : slidewindow
    Created on : Jul 11, 2016, 4:56:29 PM
    Author     : 985148
--%>

<link href="http://cdn.phpoll.com/css/animate.css" rel="stylesheet">
 <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
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
</style>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="http://phpoll.com/login" class="dropdown-toggle" data-toggle="dropdown">Log In <span class="caret"></span></a>
                    <ul class="dropdown-menu dropdown-lr animated slideInRight" role="menu">
                        <div class="col-lg-12">
                            <div class="text-center"><h3><b>Log In</b></h3></div>
                            <form id="ajax-login-form" action="http://phpoll.com/login/process" method="post" role="form" autocomplete="off">
                                <div class="form-group">
                                    <label for="username">Username</label>
                                    <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="" autocomplete="off">
                                </div>

                                <div class="form-group">
                                    <label for="password">Password</label>
                                    <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password" autocomplete="off">
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-xs-7">
                                            <input type="checkbox" tabindex="3" name="remember" id="remember">
                                            <label for="remember"> Remember Me</label>
                                        </div>
                                        <div class="col-xs-5 pull-right">
                                            <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-success" value="Log In">
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <div class="text-center">
                                                <a href="http://phpoll.com/recover" tabindex="5" class="forgot-password">Forgot Password?</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <input type="hidden" class="hide" name="token" id="token" value="a465a2791ae0bae853cf4bf485dbe1b6">
                            </form>
                        </div>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>