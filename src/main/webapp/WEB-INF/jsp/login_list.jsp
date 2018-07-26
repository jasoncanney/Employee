<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Custom styles for this template -->
    <link href="https://getbootstrap.com/docs/3.3/examples/navbar/navbar.css" rel="stylesheet">
        <title>Login List</title>
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
			<h2 class="page-header">Login List</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
                    
                    <!-- put new button: Add Customer -->
		    <p><a class="btn btn-md btn-default" href="showFormForAdd" role="button">Add Login&raquo;</a></p>
		
			<!--  add our html table here -->
		
			<table class="table table-striped">
                            <thead>
				<tr>
                                    <th>UserName</th>
                                    <th>PassWord</th>
				</tr>
                            </thead>
                            <tbody>
				<!-- loop over and print our consumers -->
				<c:forEach var="tempLogin" items="${logins}">
					<tr>
                                            	<td>${tempLogin.UserName}</td>
						<td>${tempLogin.PassWord}</td>
                                                
					</tr>
				</c:forEach>
				</tbody>
                        </table>	
		</div>
	</div>
         <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    </body>
</html>
