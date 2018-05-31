<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>inicio de sesion</title>
    </head>
    <body>
        <h1>inicio de sesion invalido</h1>
        <h2>El usuario  "<bean:write name="LoginForm" property="email" />" no existe</h2>
<a href="index.jsp">volver</a>
    </body>
</html:html>
