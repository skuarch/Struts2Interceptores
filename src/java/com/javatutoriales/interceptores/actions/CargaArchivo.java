/*
 * CargaArchivo.java
 *
 * Creada el 27/05/2012, 01:35:38 PM
 *
 * Clase Java desarrollada por Alex para el blog http://javatutoriales.com/ el día 27/05/2012
 *
 * Para informacion sobre el uso de esta clase, asi como bugs, actualizaciones, o mejoras enviar un mail a
 * programadorjavablog@gmail.com
 *
 * No olviden hacerse fans del grupo de Java Tutoriales en facebook  http://www.facebook.com/pages/Java-Tutoriales/121935157864634
 *
 */
package com.javatutoriales.interceptores.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;

/**
 * @author Alex
 * @version 1.0
 * @author-mail programadorjavablog@gmail.com @date 27/05/2012
 */
public class CargaArchivo extends ActionSupport
{
    private File archivo;
    private String archivoContentType;

    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }

    public void setArchivo(File archivo)
    {
        this.archivo = archivo;
    }

    public String getArchivoContentType()
    {
        return archivoContentType;
    }

    public void setArchivoContentType(String archivoContentType)
    {
        this.archivoContentType = archivoContentType;
    }
}
