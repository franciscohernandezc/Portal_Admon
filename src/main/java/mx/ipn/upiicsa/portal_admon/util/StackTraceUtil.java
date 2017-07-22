/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. - ingjavierhc
 */
package mx.ipn.upiicsa.portal_admon.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import mx.ipn.upiicsa.portal_admon.configuracion.Constantes;

/**
 *
 * @author javierhc
 */
public final class StackTraceUtil {

    public static String getStackTrace(Throwable aThrowable) {
        Writer result = new StringWriter();
        PrintWriter printWriter = new PrintWriter(result);
        aThrowable.printStackTrace(printWriter);
        return ">>Detalle Error | " + aThrowable.getLocalizedMessage() + " | >>" + Constantes.SEPARADOR_LINEA + result.toString() + Constantes.SEPARADOR_LINEA;
    }

//  /**
//  * Defines a custom format for the stack trace as String.
//  */
//  public static String getCustomStackTrace(Throwable aThrowable) {
//    //add the class name and any message passed to constructor
//    StringBuilder result = new StringBuilder( "BOO-BOO: " );
//    result.append(aThrowable.toString());
//    String NEW_LINE = System.getProperty("line.separator");
//    result.append(NEW_LINE);
//
//    //add each element of the stack trace
//    for (StackTraceElement element : aThrowable.getStackTrace()){
//      result.append(element);
//      result.append(NEW_LINE);
//    }
//    return result.toString();
//  }
}
