/*
 * PublicoAction.java
 *
 * Creada el 24/06/2012, 10:54:46 PM
 *
 * Clase Java desarrollada por Alex para el blog http://javatutoriales.com/ el día 24/06/2012
 *
 * Para informacion sobre el uso de esta clase, asi como bugs, actualizaciones, o mejoras enviar un mail a
 * programadorjavablog@gmail.com
 *
 * No olviden hacerse fans del grupo de Java Tutoriales en facebook  http://www.facebook.com/pages/Java-Tutoriales/121935157864634
 *
 */
package com.javatutoriales.interceptores.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Alex
 * @version 1.0
 * @author-mail programadorjavablog@gmail.com @date 24/06/2012
 */
public class PublicoAction extends ActionSupport
{
    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }
}
