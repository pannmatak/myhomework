<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Homework Pann Matak</title>
	
	<!--**********************************************************************-->
    <link rel="stylesheet" href='<c:url value="/resources/design/signon/bootstrap.min.css"/>'>
    <script src='<c:url value="/resources/design/signon/jquery-1.11.1.min.js"/>'> </script>
    <script src='<c:url value="/resources/design/signon/bootstrap.min.js"/>'> </script>
    <!-- *********************************************************************-->
    
    <script>
		function validateForm() {
		    var x = document.forms["myForm"]["j_username"].value;
		    var y = document.forms["myForm"]["j_password"].value;
		    if (x == null || x == "" || x == "SignOn Name") {
		        alert("Must be filled SignOn Name");
		        return false;
		    }else if(y == null || y == "" || y == "SignOn Name"){
		    	alert("Must be filled Password");
		        return false;
		    }		    
		}
	</script>

</head>
<body>
	<div style="margin-top: 70px;"> </div>
	 <div class="container" style="margin-top:40px">
	  <div class="row">
	   <div class="col-sm-6 col-md-4 col-md-offset-4">
	    <div class="panel panel-default">
	     <div class="panel-heading" style="background-color: #285e8e;">
	      <strong style="margin-left: 70px; color: white; font-family: BruceOldStyle BT; font-size: 26px; font-weight: bold;">
	        Welcome SignOn
	      </strong>
	     </div>
	     
	     <div class="panel-body">
	     <form name="myForm" action="<c:url value='/j_spring_security_check' />" onsubmit="return validateForm()" method="post">
	       <fieldset>
	        <div class="row">
	         <div class="center-block">
	          <!-- <img class="profile-img" src="/resources/design/signon/img/appeallogo.jpg?size=50" alt="" style="margin-top: 10px; margin-left: 120px; max-height: 100px; max-width: 100px; object-fit: cover;"> -->
			  <img class="profile-img" src='<c:url value="/resources/img/rupp.jpg?size=50"/>' alt="" style="margin-top: 10px; margin-left: 130px; max-height: 130px; max-width: 100px; object-fit: cover;">
	         </div>
	        </div>
	        <div style="margin-top: 50px;">
	        </div>
	        
	        <div class="row">
	         <div class="col-sm-12 col-md-10  col-md-offset-1 ">
	         
	         <!-- // Block user name *******************************************************************************-->
	          <div class="form-group">
	           <div class="input-group">
	            <span class="input-group-addon">
	             <i class="glyphicon glyphicon-user"></i>
	            </span> 
	            <input class="form-control" placeholder="SignOn Name" name='j_username'  value="" type="text" autofocus>
	           </div>
	          </div>
	          
	          <!-- //Block password *************************************************************************************-->
	          <div class="form-group">
	           <div class="input-group">
	            <span class="input-group-addon">
	             <i class="glyphicon glyphicon-lock"></i>
	            </span>
	            <input class="form-control" placeholder="Password" name='j_password' type="password" value="">
	           </div>
	          </div>
	          
	          <!-- // Block error message *********************************************************************************** --> 
	           <div class="form-group">
	           <div class="input-group">
					<%
	                   String strError = "";
						if(session.getAttribute("ErrorMsg") !=null){
	                   		strError = (String) session.getAttribute("ErrorMsg");
	                   	}
	                %>
	            	<label id="lblUserName"> <%= strError %></label>
	           </div>
	          </div>            
	          
	          <!-- // Block of login ***********************************************************************************-->
	          <div class="form-group">
	          	<a href='<c:url value="/student" />'>
	           		<input class="btn btn-lg btn-primary btn-block" value="Sign in" style="color: white; background-color: #285e8e">
	          	</a>
	          </div>
	         </div>
	        </div>
	        
	       </fieldset>
	      </form>
	     </div>
	     
	    </div>
	   </div>
	  </div>
	 </div>
 
	 <div style="text-align: center; color: #999; font-family: BruceOldStyle BT; font-size: 13px;">
	  <p>Version 1.0.0.0</p>
	  <p>Released date: 2017-Feb-01</p>
	  <p>©Copyright 2017 by Pann Matak. All Rights Reserved.</p>
	 </div>
     <script type="text/javascript"> </script>

</body>
</html>