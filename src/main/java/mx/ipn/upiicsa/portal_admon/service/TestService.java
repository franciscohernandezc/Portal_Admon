/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.upiicsa.portal_admon.service;

import java.util.List;
import mx.ipn.upiicsa.portal_admon.pojo.PersonVO;

/**
 *
 * @author Javier
 */
public interface TestService {
    String getMsgError();
   List<PersonVO> obtienePerson();
   boolean guardaPerson(PersonVO vo);
   boolean eliminaPerson(PersonVO vo);
}
