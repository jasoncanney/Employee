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
    <title>Consumer List</title>
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
			<h2 class="page-header">Manage Consumers</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
                    
                    <!-- put new button: Add Customer -->
		
                        <p><a class="btn btn-md btn-default" href="showFormForAdd" role="button">Add Consumer&raquo;</a></p>

			<!--  add our html table here -->
			<table class="table table-striped">
                            <thead>
				<tr>
                                    <th>Consumer ID </th>
                                    <th>First Name </th>
                                    <th>Middle Initial </th>
                                    <th>Last Name </th>
                                    <th>Email </th>
                                    <th>Phone </th>
                                    <th>Address </th>
                                    <th>City </th>
                                    <th>State </th>
                                    <th>Zip </th>
                                    <th>Social Email </th>
                                    <th>Demo ID </th>
                                    <th>DeviceLoc ID </th>
                                    <th>Provider ID </th>
				</tr>
                            </thead>
                            <tbody>
                                <!-- loop over and print our consumers -->
				<c:forEach var="tempConsumer" items="${consumers}">
                                        <!-- construct an "update" link with consumer ID -->
					<c:url var="updateLink" value="/consumer/showFormForUpdate">
						<c:param name="consumerID" value="${tempConsumer.consumerID}" />
					</c:url>	
                                        <!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/consumer/delete">
						<c:param name="consumerID" value="${tempConsumer.consumerID}" />
                                        </c:url>
                                        <!-- construct an "interests" link with customer id -->
					<c:url var="interestLink" value="/interest/listA">
						<c:param name="consumerID" value="${tempConsumer.consumerID}" />
					</c:url>			
                                        
                                        <tr>
                                                <td>${tempConsumer.consumerID}</td>
                                                <td>${tempConsumer.consumerFirstName}</td>
                                                <td>${tempConsumer.consumerMiddleInitial}</td>
                                                <td>${tempConsumer.consumerLastName}</td>
                                                <td>${tempConsumer.consumerEmail}</td>
                                                <td>${tempConsumer.consumerPhone}</td>
                                                <td>${tempConsumer.consumerAddress}</td>
                                                <td>${tempConsumer.consumerCity}</td>
                                                <td>${tempConsumer.consumerState}</td>
                                                <td>${tempConsumer.consumerZip}</td>
                                                <td>${tempConsumer.consumerSocEmail}</td>
                                                <td>${tempConsumer.demoID}</td>
                                                <td>${tempConsumer.deviceLocID}</td>
                                                <td>${tempConsumer.providerID}</td>
                                        <td>        
                                         <!-- display the update link -->
					<a href="${updateLink}">Update</a>      
                                        <a href="${deleteLink}"
                                            onclick="if (!(confirm('Are you sure you want to delete this consumer?'))) return false">Delete</a>
                                         <a href="${interestLink}">Interests</a>         
                                        </td>        
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
