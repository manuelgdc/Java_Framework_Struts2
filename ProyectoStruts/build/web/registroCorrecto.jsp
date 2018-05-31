<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
   
   <h1>Bienvenido,</h1>
        <h4>Nuevo cliente dado de alta satisfactoriamente</h4>
        <p>Email: <bean:write name="RegistroForm" property="email" /></p>
        <p>Contraseña: <bean:write name="RegistroForm" property="pass" /></p>
        <p>Nombre: <bean:write name="RegistroForm" property="nombre" /></p>
        <p>Apellidos: <bean:write name="RegistroForm" property="apellidos" /></p>
        <p>DNI: <bean:write name="RegistroForm" property="DNI" /></p>
        <p>IBAN: <bean:write name="RegistroForm" property="IBAN" /></p>
        <a href="index.jsp">volver</a>
    </body>
</html:html>