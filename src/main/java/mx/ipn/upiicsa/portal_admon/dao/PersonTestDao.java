/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. - ingjavierhc
 */
package mx.ipn.upiicsa.portal_admon.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import mx.ipn.upiicsa.portal_admon.pojo.PersonVO;
import mx.ipn.upiicsa.portal_admon.util.StackTraceUtil;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author javierhc en esta capa va el acceso a la inforamcion de la base de
 * datos por medio del data sourse
 */
@Repository("personTestDao")
public class PersonTestDao {

    public final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    private String msgError;

    public void setMsgError(String msgError) {
        this.msgError = msgError;
    }

    public String getMsgError() {
        return msgError;
    }

//    @Transactional(readOnly = true)  //general mente lleva esta anotacion para que se conecte de forma trasaccional
    public List<PersonVO> getAll() {
        List<PersonVO> lista = null;

        try {
//            lista = (List<PersonVO>) sessionFactory.getCurrentSession()
//                    .createCriteria(PersonVO.class).addOrder(Order.asc("nombre"))
//                    .list();

            lista = new ArrayList<>();
            lista.add(new PersonVO(BigDecimal.ONE, "a", "a-p"));
            lista.add(new PersonVO(BigDecimal.valueOf(2), "b", "b-p"));
            lista.add(new PersonVO(BigDecimal.valueOf(3), "c", "c-p"));
            lista.add(new PersonVO(BigDecimal.valueOf(4), "d", "d-p"));

            log.debug("personas size" + lista.size());
        } catch (HibernateException | NullPointerException e) {
            msgError = e.getLocalizedMessage();
            log.error(StackTraceUtil.getStackTrace(e));
        }
        return lista;
    }

    @Transactional
    public boolean save(PersonVO person) {
        boolean error = false;
        try {
            sessionFactory.getCurrentSession().save(person);
            log.debug("save PersonVO");
        } catch (DataAccessException e) {
            error = false;
            msgError = e.getLocalizedMessage();
            log.error(StackTraceUtil.getStackTrace(e));
        } catch (HibernateException | NullPointerException e) {
            error = true;
            msgError = e.getLocalizedMessage();
            log.error(StackTraceUtil.getStackTrace(e));
        } catch (Exception e) {
            error = true;
            msgError = e.getLocalizedMessage();
            log.error(StackTraceUtil.getStackTrace(e));
        }

        return error;
    }

    @Transactional
    public boolean update(PersonVO person) {
        boolean error = false;
        try {
            sessionFactory.getCurrentSession().update(person);
            log.debug("save PersonVO");
        } catch (DataAccessException e) {
            error = false;
            msgError = e.getLocalizedMessage();
            log.error(StackTraceUtil.getStackTrace(e));
        } catch (HibernateException | NullPointerException e) {
            error = true;
            msgError = e.getLocalizedMessage();
            log.error(StackTraceUtil.getStackTrace(e));
        } catch (Exception e) {
            error = true;
            msgError = e.getLocalizedMessage();
            log.error(StackTraceUtil.getStackTrace(e));
        }

        return error;
    }

    public boolean delete(PersonVO person) {
        boolean error = false;
        try {
            sessionFactory.getCurrentSession().delete(person);
            log.debug("save PersonVO");
        } catch (DataAccessException e) {
            error = false;
            msgError = e.getLocalizedMessage();
            log.error(StackTraceUtil.getStackTrace(e));
        } catch (HibernateException | NullPointerException e) {
            error = true;
            msgError = e.getLocalizedMessage();
            log.error(StackTraceUtil.getStackTrace(e));
        } catch (Exception e) {
            error = true;
            msgError = e.getLocalizedMessage();
            log.error(StackTraceUtil.getStackTrace(e));
        }
        return error;
    }

}
