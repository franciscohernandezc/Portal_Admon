/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. - ingjavierhc
 */
package mx.ipn.upiicsa.portal_admon.util;

import java.io.Serializable;
import org.apache.log4j.Logger;

/**
 *
 * @author javierhc
 */
public final class StrUtil implements Serializable {

    private static final long serialVersionUID = 8799656478674716638L;

    public static final Logger log = Logger.getLogger(StrUtil.class);

 

 
    public static String cambiarCaracteresSpeciales(String texto) {

        texto = texto.replace("á", "&aacute;");

        texto = texto.replace("é", "&eacute;");

        texto = texto.replace("í", "&iacute;");

        texto = texto.replace("ó", "&oacute;");

        texto = texto.replace("ú", "&uacute;");

        texto = texto.replace("Á", "&Aacute;");

        texto = texto.replace("É", "&Eacute;");

        texto = texto.replace("Í", "&Iacute;");

        texto = texto.replace("Ó", "&Oacute;");

        texto = texto.replace("Ú", "&Uacute;");

        texto = texto.replace("Ñ", "&Ntilde;");

        texto = texto.replace("ñ", "&ntilde;");

        return texto;
    }
    
      
   
          
 
          
    
}
