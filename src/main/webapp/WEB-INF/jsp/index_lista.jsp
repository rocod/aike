<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Listado de Turnosssss</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  </head>

  <body role="document">
  

    <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
         <a class="navbar-brand" href="lista_dinamica">Inicio</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="mis_turnos">Mis Turnos</a></li>
            <li><a href="">Contacto</a></li>      
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container theme-showcase" role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1>Listado de Turnos</h1>
        <form:form action="inicio_buscar" method="POST" modelAttribute="esp">
			<form:label path="especialidad">Especialidad</form:label>
			<form:input path="especialidad"/>
			<input type="submit" value="Enviar">
		</form:form>
      </div>

      <div class="row">
       
        <div class="col-md-12">
        
          <table class="table table-striped">
            <thead>
               <tr>
                
                <th>Especialidad</th>
                <th>Día y Horario</th>
             
                <th>Solicitar</th>
              </tr>
            </thead>
            <tbody>
            
            <c:if test="${not empty turnos}">
				<c:forEach items="${turnos}" var="turno">
				<!--
				    <c:out value="${turno.especialidad}"/>
				    <c:out value="${turno.fecha}"/>
				    <c:out value="${turno.horario}"/><br>
				    -->
					<tr>                
		                <td>${turno.especialidad}</td>
		                <td>${turno.fecha}</td>
		               
		                <td><a href="solicita?especialidad=${turno.especialidad}&fecha=${turno.fecha}&horario=${turno.horario}&id=${turno.id}"><span title="Solicitar" style="font-size:20px;" class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true"></span></a></td>
		              </tr>
						    
				    
				</c:forEach>
			
			 </c:if>
            
              
              
              
            </tbody>
          </table>
        </div>
      </div>



    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
  </body>
</html>
