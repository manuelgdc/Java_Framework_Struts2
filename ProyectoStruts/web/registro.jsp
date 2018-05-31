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
        <h1>Registro de usuario</h1>
        <html:form action="registro" method="post" >
            <bean:message key="formulario.email" /><html:text property="email" /> <span style="color:red"><html:errors property="error.registro.Email" /></span><br>
            <bean:message key="formulario.emailConf" /><html:text property="confEm" /> <span style="color:red"><html:errors property="error.registro.confEmail" /> </span><br>
            <bean:message key="formulario.pass" /><html:text property="pass" /> <span style="color:red"><html:errors property="error.registro.Pass" /> </span><br>
            <bean:message key="formulario.passConf" /><html:text property="confPass" /> <span style="color:red"><html:errors property="error.registro.confPass" /> </span><br>
            <bean:message key="formulario.nombre" /><html:text property="nombre" /> <span style="color:red"><html:errors property="error.registro.nombre" /> </span><br>
            <bean:message key="formulario.apellidos" /><html:text property="apellidos"/><span style="color:red"><html:errors property="error.registro.apellidos" /></span><br>
            <bean:message key="formulario.DNI" /><html:text property="DNI"/><span style="color:red"><html:errors property="error.registro.DNI" /></span><br>
            <bean:message key="formulario.IBAN" /> <html:text property="IBAN" /> <span style="color:red"><html:errors property="error.registro.IBAN" /></span><br>
            <html:submit value="Registrar" />
        </html:form>
             <a href="index.jsp">volver</a>
    </body>
</html:html>
