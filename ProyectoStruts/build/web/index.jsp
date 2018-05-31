<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proyecto Struts</title>
    </head>
    <body>
        <h1>Proyecto Struts</h1>
        <html:form action="login" method="post"  >
            <bean:message key="formulario.email" /><html:text property="email" /> <span style="color:red"><html:errors property="error.login.email" /></span><br>
            <bean:message key="formulario.pass" /><html:password property="pass" /> <span style="color:red"><html:errors property="error.login.pass" /> </span><br>
            <html:submit value="Enviar" />
            <html:reset value="Reiniciar formulario" /> 
        </html:form>
            
        <a href="registro.jsp">Crear un nuevo usuario</a>
    </body>
</html:html>