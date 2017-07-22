package mx.ipn.upiicsa.portal_admon.serviceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import mx.ipn.upiicsa.portal_admon.dao.PersonTestDao;
import mx.ipn.upiicsa.portal_admon.pojo.PersonVO;
import mx.ipn.upiicsa.portal_admon.service.TestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Javier
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    public final Logger log = Logger.getLogger(this.getClass().getName());
    private String msgError;

    @Override
    public String getMsgError() {
        return msgError;
    }

    public void setMsgError(String msgError) {
        this.msgError = msgError;
    }

    // inyecta un dao 
    @Autowired
    PersonTestDao personTestDao;

    @Override
    public List<PersonVO> obtienePerson() {
        return personTestDao.getAll();

    }

    @Override
    public boolean guardaPerson(PersonVO vo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminaPerson(PersonVO vo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
