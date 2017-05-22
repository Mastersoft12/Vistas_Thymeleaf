<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar Persona</h1>
        <sf:form method="POST" commandName="persona">
        Cedula: <sf:input path="cedula"/>
        Nombre: <sf:input path="nombre"/>
        Apellido: <sf:input path="apellido"/>
        Edad: <sf:input path="edad"/>
        <input type="submit" value="registrarPersona">
        </sf:form>
    </body>
</html>