<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Custom styles for this template -->
    <link href="https://getbootstrap.com/docs/3.3/examples/navbar/navbar.css" rel="stylesheet">
    <title>Create Consumer</title>
</head>

<body>

    <!-- Static navbar -->
    <nav class="navbar navbar-default navbar-static-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Canopy Audience</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="../">Home</a></li>
              <li><a href="#">About</a></li>
              <li><a href="#">Contact</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Manage <span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="${pageContext.request.contextPath}/consumer/list">Consumer</a></li>
                  <li><a href="${pageContext.request.contextPath}/preference/list">Preferences</a></li>
                  <li><a href="${pageContext.request.contextPath}/advertisement/list">Advertisements</a></li>
                  <li><a href="${pageContext.request.contextPath}/coupon/list">Coupons</a></li>
                  <li><a href="${pageContext.request.contextPath}/adimpression/list">Ad Impressions</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Admin</li>
                  <li><a href="#">Interests</a></li>
                  <li><a href="#">Login Mgmt</a></li>
                </ul>
              </li>
            </ul>
           <ul class="nav navbar-nav navbar-right">       
            <li><a href="#">User: <security:authentication property="principal.username" /></a></li>
               <!-- Add a logout button -->
            <li><form:form action="${pageContext.request.contextPath}/logout" 
			   method="POST">
		<input type="submit" value="Logout" class="btn btn-lg btn-default"/>
                </form:form></li>            
            <!-- <li><a href="${pageContext.request.contextPath}/showMyLoginPage">Login</a></li> -->
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    
	<div id="wrapper">
		<div id="header">
			<h2 class="page-header">Create Consumer</h2>
		</div>
	</div>

	<div id="container">
	
                <form:form action="saveConsumer" modelAttribute="consumer" method="POST">
		
                    <!-- need to associate this data with customer id -->
			<form:hidden path="consumerID" />
                    
			<table>
				<tbody>
					<tr>
						<td><label>First Name:</label></td>
						<td><form:input path="consumerFirstName" /></td>
					</tr>
				
					<tr>
						<td><label>Middle Initial:</label></td>
						<td><form:input path="consumerMiddleInitial" /></td>
					</tr>

					<tr>
						<td><label>Last Name:</label></td>
						<td><form:input path="consumerLastName" /></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="consumerEmail" /></td>
					</tr>

                                        <tr>
						<td><label>Phone:</label></td>
						<td><form:input path="consumerPhone" /></td>
					</tr>

                                        <tr>
						<td><label>Address:</label></td>
						<td><form:input path="consumerAddress" /></td>
					</tr>

                                        <tr>
						<td><label>City:</label></td>
						<td><form:input path="consumerCity" /></td>
					</tr>

                                        <tr>
						<td><label>State:</label></td>
						<td><form:input path="consumerState" /></td>
					</tr>

                                        <tr>
						<td><label>Zip:</label></td>
						<td><form:input path="consumerZip" /></td>
					</tr>

                                        <tr>
						<td><label>Social Email:</label></td>
						<td><form:input path="consumerSocEmail" /></td>
					</tr>

                                        <tr>
						<td><label>Demo ID:</label></td>
						<td><form:input path="demoID" /></td>
					</tr>
                                        
                                        <tr>
						<td><label>Device Loc ID:</label></td>
						<td><form:input path="deviceLocID" /></td>
					</tr>
                                        
                                        <tr>
						<td><label>Provider ID:</label></td>
						<td><form:input path="providerID" /></td>
					</tr>
                                        
                                        
                                        <tr>
						<td><label>Password:</label></td>
						<td><form:input path="consumerPWD" /></td>
					</tr>
                                        
                                        <tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
                                        
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
	</div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>                

</body>

</html>










