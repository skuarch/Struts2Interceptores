<%-- 
    Archivo   : index
    Creado el : 27/05/2012, 01:39:39 PM
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
        <s:form action="carga-archivo" enctype="multipart/form-data">
            <s:file name="archivo" label="Archivo" />
            <s:submit />
        </s:form>
    </body>
</html>
