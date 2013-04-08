/*
 * LoginAction.java
 *
 * Creada el 25/06/2012, 08:17:59 PM
 *
 * Clase Java desarrollada por Alex para el blog http://javatutoriales.com/ el día 25/06/2012
 *
 * Para informacion sobre el uso de esta clase, asi como bugs, actualizaciones, o mejoras enviar un mail a
 * programadorjavablog@gmail.com
 *
 * No olviden hacerse fans del grupo de Java Tutoriales en facebook  http://www.facebook.com/pages/Java-Tutoriales/121935157864634
 *
 */
package com.javatutoriales.interceptores.actions;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 * @author Alex
 * @version 1.0
 * @author-mail programadorjavablog@gmail.com @date 25/06/2012
 */
public class LoginAction extends ActionSupport
{
    private String username;
    private String password;

    @Override
    public String execute() throws Exception
    {

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession sesion = request.getSession();
        
        sesion.setAttribute("usuario", username);
        
        return SUCCESS;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
}
