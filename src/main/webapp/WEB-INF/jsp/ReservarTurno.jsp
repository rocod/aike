<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!--  

${turno.especialidad}
${turno.fecha}
${turno.horario}
-->

	<form:form action="inicio_buscar" method="POST" modelAttribute="esp">
		<form:label path="especialidad">especialidad</form:label>
		<form:input path="especialidad"/>
		<input type="submit" value="Enviar">
	</form:form>


<c:if test="${not empty turnos}">
	<c:forEach items="${turnos}" var="turno">
	
	    <c:out value="${turno.especialidad}"/>
	    <c:out value="${turno.fecha}"/>
	    <c:out value="${turno.horario}"/><br>
	</c:forEach>

 </c:if>

	
</body>
</html>