package mx.ipn.upiicsa.portal_admon.configuracion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. - ingjavierhc
 */


import java.io.IOException;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import mx.ipn.upiicsa.portal_admon.util.StackTraceUtil;
import org.apache.log4j.Logger;
import org.springframework.security.web.WebAttributes;

/**
 *
 * @author javierhc
 */
@ManagedBean(name = "loginManager")
@RequestScoped
public class LoginManager implements Serializable {

    private static final long serialVersionUID = 8799656478674716638L;
    public final Logger log = Logger.getLogger(this.getClass().getName());
    private String password;
    private String username;

    public String doLogin() throws IOException, ServletException {
        try {
            log.info("login.. ");
            log.info("User:" + username);
            log.debug(" pass: " + password);

            ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            RequestDispatcher dispatcher = ((ServletRequest) context.getRequest()).getRequestDispatcher("/j_spring_security_check?j_username=" + username + "&j_password=" + password);
            dispatcher.forward((ServletRequest) context.getRequest(), (ServletResponse) context.getResponse());
            FacesContext.getCurrentInstance().responseComplete();

            Exception ex = (Exception) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
                    .get(WebAttributes.AUTHENTICATION_EXCEPTION);

            if (ex != null) {
                log.error("login INCORRECTO " + username + " " + ex.getLocalizedMessage());
                HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
                request.getSession().setAttribute(WebAttributes.AUTHENTICATION_EXCEPTION, ex);
            } else {
                log.info("login correcto " + username);
            }

        } catch (IOException | ServletException e) {
            log.error(e.getLocalizedMessage());
            log.error(StackTraceUtil.getStackTrace(e));

        }
        return null;
    }

    public void updateMessages(boolean update) {

        try {
            Exception ex = (Exception) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
                    .get(WebAttributes.AUTHENTICATION_EXCEPTION);
            if (ex != null && ex.getLocalizedMessage() != null && ex.getLocalizedMessage().contains("Bad credentials")) {

                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR, "Credenciales Incorrectas", ""));
                HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
                request.getSession().setAttribute(WebAttributes.AUTHENTICATION_EXCEPTION, null);

            } else if (ex != null && ex.getLocalizedMessage() != null && ex.getLocalizedMessage().contains("User account has expired")) {

                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR, "Expiro su contraseña, cambie la contraseña para reactivar, en: ¿Olvido su contraseña?", ""));
                HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
                request.getSession().setAttribute(WebAttributes.AUTHENTICATION_EXCEPTION, null);
            }else if (ex != null && ex.getLocalizedMessage() != null && ex.getLocalizedMessage().contains("Maximum sessions of 1 for this principal exceeded")) {

                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR, "El máximo de sesiones excedido para dicho usuario...", ""));
                HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
                request.getSession().setAttribute(WebAttributes.AUTHENTICATION_EXCEPTION, null);
            }else if (ex != null && ex.getLocalizedMessage() != null 
                    && ex.getLocalizedMessage().contains("User is disabled")) {

                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR, "El usuario esta inhabilitado...", ""));
                HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
                request.getSession().setAttribute(WebAttributes.AUTHENTICATION_EXCEPTION, null);
          
            }else if (ex != null && ex.getLocalizedMessage() != null 
                    && ex.getLocalizedMessage().contains("termino su examen")) {

                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR, "Termino su session de examen...", ""));
                HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
                request.getSession().setAttribute(WebAttributes.AUTHENTICATION_EXCEPTION, null);
          
            }
            
            
            
            
            
            
            

        } catch (Exception e) {
            log.error(e.getLocalizedMessage());
            log.error(StackTraceUtil.getStackTrace(e));
        }
    }

    public String doLogOut() throws IOException, ServletException {
        try {

            //${pageContext.request.contextPath}/j_spring_security_logout
            log.info("logOUT");
            ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            RequestDispatcher dispatcher = ((ServletRequest) context.getRequest()).getRequestDispatcher("j_spring_security_logout");
            dispatcher.forward((ServletRequest) context.getRequest(), (ServletResponse) context.getResponse());
            FacesContext.getCurrentInstance().responseComplete();

        } catch (IOException | ServletException e) {
            log.error(e.getLocalizedMessage());
            log.error(StackTraceUtil.getStackTrace(e));

        }
        return null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
