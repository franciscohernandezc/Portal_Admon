/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. - ingjavierhc
 */
package mx.ipn.upiicsa.portal_admon.util;

import java.text.MessageFormat;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author VIEXFGB
 */
public final class JsfUtil {

    public static void addMessage(FacesMessage.Severity severidad, String claveMsg, String details, Object... params) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severidad, getMessage(claveMsg, params), details));
        if (severidad == FacesMessage.SEVERITY_ERROR) {
            FacesContext.getCurrentInstance().validationFailed();
        }
    }

    public static String getMessage(String claveMsg, Object params[]) {
        MessageFormat messageFormat = new MessageFormat(getMessage(claveMsg));
        return messageFormat.format(params);
    }

    public static String getMessage(String claveMsg) {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            return context.getApplication().getResourceBundle(context, "msg").getString(claveMsg);
        } catch (Exception e) {
            return claveMsg;
        }
    }


}
