/*
 * InterceptorAcceso.java
 *
 * Creada el 24/06/2012, 11:44:37 PM
 *
 * Clase Java desarrollada por Alex para el blog http://javatutoriales.com/ el día 24/06/2012
 *
 * Para informacion sobre el uso de esta clase, asi como bugs, actualizaciones, o mejoras enviar un mail a
 * programadorjavablog@gmail.com
 *
 * No olviden hacerse fans del grupo de Java Tutoriales en facebook  http://www.facebook.com/pages/Java-Tutoriales/121935157864634
 *
 */
package com.javatutoriales.interceptores.interceptores;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alex
 * @version 1.0
 * @author-mail programadorjavablog@gmail.com @date 24/06/2012
 */
public class InterceptorAcceso extends AbstractInterceptor
{
    private String actionsPublicos;
    private List<String> actionsSinFiltrar = new ArrayList<String>();
    
    @Override
    public void init()
    {
        actionsSinFiltrar = Arrays.asList(actionsPublicos.split(","));
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception
    {
        String result = Action.LOGIN;

        String actionActual = (String)ActionContext.getContext().get(ActionContext.ACTION_NAME);
     
        if (actionInvocation.getInvocationContext().getSession().containsKey("usuario") || actionsSinFiltrar.contains(actionActual))
        {
            result = actionInvocation.invoke();
        }

        return result;
    }

    public void setActionsPublicos(String actionsPublicos)
    {
        this.actionsPublicos = actionsPublicos;
    }
}
