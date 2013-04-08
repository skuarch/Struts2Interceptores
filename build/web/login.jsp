<%-- 
    Archivo   : login
    Creado el : 24/06/2012, 10:01:40 PM
    Autor     : Alex
    Autor mail: programadorjavablog@gmail.com
--%>

<?xml version="1.0" encoding="UTF-8"?>
<%@page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
    "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es" >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>JavaTutoriales.com - Struts 2 Interceptores</title>
    </head>
    <body>
        
        <s:actionerror />
        
        <s:form action="login">
            <s:textfield name="username"  label="Username" />
            <s:password name="password"  label="Password" />
            <s:submit value="Ingresar" />
        </s:form>
    </body>
</html>
