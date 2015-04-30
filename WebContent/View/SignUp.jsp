<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="tab-pane active" id="tab-first">
                                       <!--     <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed dictum dolor sem, quis pharetra dui ultricies vel. Cras non pulvinar tellus, vel bibendum magna. Morbi tellus nulla, cursus non nisi sed, porttitor dignissim erat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc facilisis commodo lectus. Vivamus vel tincidunt enim, non vulputate ipsum. Ut pellentesque consectetur arcu sit amet scelerisque. Fusce commodo leo eros, ut eleifend massa congue at.</p> -->
<form name="frmSignUp" method="post" action="SignUp">
                                            <div class="form-group">
                                                <label class="col-md-3 col-xs-12 control-label">First Name</label>
                                                <div class="col-md-6 col-xs-12">                                                                                                                                                        
                                                    <input name="firstname" id="firstname" type="text" class="form-control" value=""/>                                                    
                                                </div>
                                                
                                            </div>

                                            <div class="form-group">
                                                <label class="col-md-3 col-xs-12 control-label">Last Name</label>
                                                <div class="col-md-6 col-xs-12">                                            
                                                    <input name="lastname" id="lastname" type="text" class="form-control" value=""/> 
                                                </div>
                                            </div>

                                            <div class="form-group">                                        
                                                <label class="col-md-3 col-xs-12 control-label">Date of birth</label>
                                                <div class="col-md-2">
                                                    <select class="form-control select">
                                                        <option>01</option>
                                                        <option>02</option>
                                                        <option>03</option>
                                                        <option>04</option>
                                                        <option>05</option>
                                                    </select>
                                                </div>
                                                <div class="col-md-2">
                                                    <select class="form-control select">
                                                        <option>01</option>
                                                        <option>02</option>
                                                        <option>03</option>
                                                        <option>04</option>
                                                        <option>05</option>
                                                    </select>
                                                </div>
                                                <div class="col-md-2">
                                                    <select class="form-control select">
                                                        <option>1985</option>
                                                        <option>1986</option>
                                                        <option>1987</option>
                                                        <option>1988</option>
                                                        <option>1989</option>                                                        
                                                    </select>
                                                </div>                                                
                                            </div>

                                                                                   

                                            <div class="form-group">
                                              <label class="col-md-3 col-xs-12 control-label">Email Address</label>
                                                <div class="col-md-6 col-xs-12">                                                                                                                                                        
                                                    <input name="emailid" id="emailid" type="text" class="form-control" value=""/>                                                    
                                                </div>
                                                
                                            </div>
                                                <label class="col-md-3 col-xs-12 control-label">Password</label>
                                                <div class="col-md-6 col-xs-12">                                                                                                                                                        
                                                    <input name="password" id="password" type="text" class="form-control" value=""/>                                                   
                                                </div>
                                                <input type="submit" class="btn btn-primary pull-right" value="Sign Up">
                                                </form>
                                        </div>
</body>
</html>