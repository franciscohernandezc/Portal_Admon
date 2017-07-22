/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.upiicsa.portal_admon.controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionListener;
import mx.ipn.upiicsa.portal_admon.pojo.PersonVO;
import mx.ipn.upiicsa.portal_admon.service.TestService;
import mx.ipn.upiicsa.portal_admon.util.JsfUtil;
import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Javier  para ingresar a la pagina principal es https://localhost:8181/Portal_Admon/login.xhtml
 * 
 * 
 * 
 */
@ManagedBean(name = "testController")
@ViewScoped
public class TestController implements Serializable {

    private static final long serialVersionUID = 8799656478674716638L;
    public final Logger log = Logger.getLogger(this.getClass().getName());

    private List<PersonVO> listaPersonas;

    private PersonVO personSelected;

    @ManagedProperty(value = "#{testService}")
    transient private TestService testService;
    
    private boolean renderGuardar;
// 

    @PostConstruct
    public void init() {
        log.debug("inicia parametros antes del despliege");
        listaPersonas = testService.obtienePerson();
        personSelected = new PersonVO();
    }

    public void preparaEditar(PersonVO editaPersona) {
renderGuardar = false;
        personSelected = editaPersona;
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('dlgCheck').show();");

    }

    
    
    public void edita(){
    personSelected.toString();
     JsfUtil.addMessage(FacesMessage.SEVERITY_INFO, "Edito", "person editado correctamente");
    }
    
    
    
    public void preparaAgregar() {
        renderGuardar = true;
        personSelected = new PersonVO();
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('dlgCheck').show();");

    }

    
    
    
    
    //service 
    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public TestService getTestService() {
        return testService;
    }

    public List<PersonVO> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<PersonVO> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public PersonVO getPersonSelected() {
        return personSelected;
    }

    public void setPersonSelected(PersonVO personSelected) {
        this.personSelected = personSelected;
    }

    public boolean isRenderGuardar() {
        return renderGuardar;
    }

    public void setRenderGuardar(boolean renderGuardar) {
        this.renderGuardar = renderGuardar;
    }
    
    
    

}
