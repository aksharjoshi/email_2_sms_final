<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<!-- META SECTION -->
<title>Email-2-SMS</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="icon" href="favicon.ico" type="image/x-icon" />
<!-- END META SECTION -->

<!-- CSS INCLUDE -->
<link rel="stylesheet" type="text/css" id="theme" href="css/theme-default.css"/>
<link rel="stylesheet" type="text/css" id="theme" href="css/bootstrap.min.css"/>
<!-- EOF CSS INCLUDE -->
<style>
.blk-container{
    margin-top:1%;
    padding: 10px;
    border: 1px solid #cccccc;
}
</style>
</head>
<body>
<!-- START PAGE CONTAINER -->
<div class="page-container"> 
  
  <!-- START PAGE SIDEBAR -->
  <div class="page-sidebar"> 
    <!-- START X-NAVIGATION -->
    <ul class="x-navigation">
      <li class="xn-logo"> <a href="index.html">Email-2-SMS</a> </li>
    </ul>
    <!-- END X-NAVIGATION --> 
  </div>
  <!-- END PAGE SIDEBAR --> 
  
  <!-- PAGE CONTENT -->
  <div class="page-content"> 
    <!-- START BREADCRUMB -->
    <ul class="breadcrumb">
      <li><a href="#">Home</a></li>
      <li><a href="#">Forms Stuff</a></li>
      <li><a href="#">Form Layout</a></li>
      <li class="active">Tabbed</li>
    </ul>
    <!-- END BREADCRUMB --> 
  </div>
  <!-- END PAGE CONTENT --> 
  <!-- PAGE CONTENT WRAPPER -->
  <div class="page-content-wrap">
    <div class="row">
      <div class="col-md-12">
        <form class="form-horizontal">
          <div class="panel panel-default tabs">
          <ul id="ulMainTab" class="nav nav-tabs" role="tablist">
            <li class="active"><a href="#personal" role="tab" data-toggle="tab">Personal Data</a></li>
            <li><a href="#settings" role="tab" data-toggle="tab"> Settings</a></li>
            <li><a href="#filters" role="tab" data-toggle="tab"> Filters</a></li>
            <!--   <li><a href="#tab-third" role="tab" data-toggle="tab">Email Settings</a></li> -->
          </ul>
          <div class="panel-body tab-content">
            <div class="tab-pane active" id="personal">
              <div class="form-group">
                <label class="col-md-3 col-xs-12 control-label">First Name</label>
                <div class="col-md-6 col-xs-12">
                  <input type="text" class="form-control" value=""/>
                </div>
              </div>
              <div class="form-group">
                <label class="col-md-3 col-xs-12 control-label">Last Name</label>
                <div class="col-md-6 col-xs-12">
                  <input type="text" class="form-control" value=""/>
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
                <label class="col-md-3 col-xs-12 control-label">User Name</label>
                <div class="col-md-6 col-xs-12">
                  <input type="text" class="form-control" value=""/>
                </div>
              </div>
              <label class="col-md-3 col-xs-12 control-label">Password</label>
              <div class="col-md-6 col-xs-12">
                <input type="text" class="form-control" value=""/>
              </div>
              <button class="btn btn-primary pull-right">Save Changes <span class="fa fa-floppy-o fa-right"></span></button>
            </div>
            <div class="tab-pane" id="settings">
              <div class="form-group">
                <div class="col-md-2"></div>
              </div>
              <div class="form-group">
                <label class="col-md-3 col-xs-12 control-label">Select Services</label>
                <div class="col-md-6 col-xs-12"> 
                  <!--   <input type="text" class="form-control" value="johndoe@domain.com"/>  --> 
                </div>
              </div>
              <div class="form-group">
                <label class="col-md-2 col-xs-12 control-label"></label>
                <div class="col-md-6 col-xs-12">
                  <label class="check">
                    <input type="checkbox" class="icheckbox" />
                    OutLook</label>
                </div>
              </div>
              <div class="form-group">
                <label class="col-md-2 col-xs-12 control-label"></label>
                <div class="col-md-6 col-xs-12">
                  <label class="check">
                    <input type="checkbox" class="icheckbox" />
                    GMAIL</label>
                </div>
              </div>
              <div class="form-group">
                <label class="col-md-2 col-xs-12 control-label"></label>
                <div class="col-md-9 col-xs-12">
                  <label class="check">
                    <input type="checkbox" class="icheckbox" />
                    Other Services Integrated with Gmail</label>
                  <button class="btn btn-primary pull-right">Save Changes and Finish <span class="fa fa-floppy-o fa-right"></span></button>
                </div>
              </div>
            </div>
            <div class="tab-pane" id="filters"> 
                <div id="divBlockGmail" class="blk-container">
                    <div class="form-group">
                        <label class="col-md-3 col-xs-12 control-label">Email</label>
                        <div class="col-md-6 col-xs-12">
                          <input name="txtGmail" type="text" class="form-control" value=""/>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="col-md-3 col-xs-12 control-label">Label</label>
                        <div class="col-md-6 col-xs-12">
                          <input name="txtGmailLabel[]" type="text" class="form-control" value=""/>
                        </div>
                        <div class="col-md-2 col-xs-10">
                          <button id="btnGmaillabAdd" class="btn btn-primary">+</button>
                        </div>
                      </div>
                      <div id="divGmaillabContent"></div>
                      <div class="form-group">
                        <label class="col-md-3 col-xs-12 control-label">Blocked Emails</label>
                        <div class="divGmailBlk col-md-6 col-xs-10">
                          <input name="txtGmailBlocked[]" type="text" class="form-control" style="margin-botton:12px;" value=""/>
                        </div>
                        <div class="col-md-2 col-xs-10">
                          <button id="btnGmailBlkAdd" class="btn btn-primary">+</button>
                        </div>
                      </div>
                      <div id="divGmailBlkContent"></div>
                  </div>
                  
                            <div id="divBlockOutlook" class="blk-container">
                    <div class="form-group">
                        <label class="col-md-3 col-xs-12 control-label">Email</label>
                        <div class="col-md-6 col-xs-12">
                          <input name="txtOutlook" type="text" class="form-control" value=""/>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="col-md-3 col-xs-12 control-label">Label</label>
                        <div class="col-md-6 col-xs-12">
                          <input name="txtOutlookLabel[]" type="text" class="form-control" value=""/>
                        </div>
                         <div class="col-md-2 col-xs-10">
                          <button id="btnOutlooklabAdd" class="btn btn-primary">+</button>
                        </div>
                        <div id="divOutlooklabContent"></div>
                      </div>
                      <div class="form-group">
                        <label class="col-md-3 col-xs-12 control-label">Blocked Emails</label>
                        <div class="divGmailBlk col-md-6 col-xs-10">
                          <input name="txtOutlookBlocked[]" type="text" class="form-control" value=""/>
                        </div>
                        <div class="col-md-2 col-xs-10">
                          <button id="btnOutlookBlkAdd" class="btn btn-primary">+</button>
                        </div>
                      </div>
                      <div id="divOutlookBlkContent"></div>
                  </div>
                  
                  
                 <!--   <div id="divBlockOutlook" class="blk-container">
                    <div class="form-group">
                        <label class="col-md-3 col-xs-12 control-label">Email</label>
                        <div class="col-md-6 col-xs-12">
                          <input name="txtOutlook" type="text" class="form-control" value=""/>
                        </div>
                      </div>
                  </div> -->
                  
                  <div id="divBlockOther" class="blk-container">
                    <div class="form-group">
                        <label class="col-md-3 col-xs-12 control-label">Email</label>
                        <div class="col-md-6 col-xs-12">
                          <input name="txtOther" type="text" class="form-control" value=""/>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="col-md-3 col-xs-12 control-label">Label</label>
                        <div class="col-md-6 col-xs-12">
                          <input name="txtOtherAdd[]" type="text" class="form-control" value=""/>
                        </div>
                         <div class="col-md-2 col-xs-10">
                          <button id="btnOtherlabAdd" class="btn btn-primary">+</button>
                        </div>
                        <div id="divOtherBlkContent"></div>
                      </div>
                      <div class="form-group">
                        <label class="col-md-3 col-xs-12 control-label">Blocked Emails</label>
                        <div class="divGmailBlk col-md-6 col-xs-10">
                          <input name="txtOtherBlocked[]" type="text" class="form-control" value=""/>
                        </div>
                        <div class="col-md-2 col-xs-10">
                          <button id="btnOtherBlkAdd" class="btn btn-primary">+</button>
                        </div>
                      </div>
                      <div id="divOtherBlkContent"></div>
                  </div>
                  
                  
                 <!-- <div id="divBlockOther" class="blk-container">
                    <div class="form-group">
                        <label class="col-md-3 col-xs-12 control-label">Email</label>
                        <div class="col-md-6 col-xs-12">
                          <input name="txtOther" type="text" class="form-control" value=""/>
                        </div>
                      </div>
                  </div>  -->
            </div>
          </div>
          </div>
        </form>
      </div>
    </div>
  </div>
  <!-- END PAGE CONTENT WRAPPER --> 
</div>
<!-- END PAGE CONTAINER --> 

<!-- MESSAGE BOX-->
<div class="message-box animated fadeIn" data-sound="alert" id="mb-signout">
  <div class="mb-container">
    <div class="mb-middle">
      <div class="mb-title"><span class="fa fa-sign-out"></span> Log <strong>Out</strong> ?</div>
      <div class="mb-content">
        <p>Are you sure you want to log out?</p>
        <p>Press No if youwant to continue work. Press Yes to logout current user.</p>
      </div>
      <div class="mb-footer">
        <div class="pull-right"> <a href="pages-login.html" class="btn btn-success btn-lg">Yes</a>
          <button class="btn btn-default btn-lg mb-control-close">No</button>
        </div>
      </div>
    </div>
  </div>
</div>
<!-- END MESSAGE BOX--> 

<!-- START SCRIPTS --> 
<!-- START PLUGINS --> 
<script type="text/javascript" src="js/jquery.min.js"></script> 
<script type="text/javascript" src="js/jquery-ui.min.js"></script> 
<script type="text/javascript" src="js/bootstrap.min.js"></script> 
<script type="text/javascript" src="js/Home.js"></script> 
<!-- END PLUGINS --> 

<!-- THIS PAGE PLUGINS --> 
<script type='text/javascript' src='js/plugins/icheck/icheck.min.js'></script> 
<script type="text/javascript" src="js/plugins/mcustomscrollbar/jquery.mCustomScrollbar.min.js"></script> 
<script type="text/javascript" src="js/plugins/bootstrap/bootstrap-datepicker.js"></script> 
<script type="text/javascript" src="js/plugins/bootstrap/bootstrap-file-input.js"></script> 
<script type="text/javascript" src="js/plugins/bootstrap/bootstrap-select.js"></script> 
<script type="text/javascript" src="js/plugins/tagsinput/jquery.tagsinput.min.js"></script> 
<!-- END THIS PAGE PLUGINS --> 

<!-- START TEMPLATE --> 
<script type="text/javascript" src="js/settings.js"></script> 
<script type="text/javascript" src="js/plugins.js"></script> 
<script type="text/javascript" src="js/actions.js"></script> 
<!-- END TEMPLATE --> 
<!-- END SCRIPTS -->
</body>
</html>