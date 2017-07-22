/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. - ingjavierhc
 */
package mx.ipn.upiicsa.portal_admon.configuracion;

import java.io.File;
import org.apache.log4j.Logger;

/**
 *
 * @author javierhc
 * 
 * 
 * 
 * 
 * 
 @Configuration habilitar en caso de parametros en base de datos FJHC 19/07/2017
 */

public class Constantes implements java.io.Serializable {

    public final Logger log = Logger.getLogger(this.getClass().getName());

    private static final long serialVersionUID = 8799656478674716638L;

  

    public static final String SEPARADOR_LINEA = "\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------   \n";

    public static final String SEPARADOR = File.separator;


}
