<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Email-2-SMS SignIn Page</title>
</head>
<body>
    <div class="container" >    
 		
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
	        <div id="divInvalidLogin" class="alert alert-danger" style="text-align:center; display:none" role="alert">
	            <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
	            <strong >Invalid Login!</strong>
	        </div>                    
            <div class="panel panel-info" style="border-color:rgb(29,42,76)" >
                    <div class="panel-heading" style="background-color:rgb(29,42,76);color:#d9edf7">
                        <div class="panel-title">Sign In</div>
                       <!--   <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Contact Us</a></div> -->
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        <form id="loginform" method="post" action="SignIn" class="form-horizontal" role="form">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input  id="login-username" type="text" class="form-control" name="user" value="" placeholder="username or email">                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="pass" placeholder="password">
                                    </div>
                                    

                                
                           
                                <div style="margin-top:10px" class="form-group">
                                    <div class="col-sm-12 controls">
                                       <input type="submit" class="btn btn-primary pull-right" value="Sign In">
                                    </div>
                                </div>
                            </form>     



                        </div>                     
                    </div>  
        </div>
    </div>
    
</body>
</html>