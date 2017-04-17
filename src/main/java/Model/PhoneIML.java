package Model;

import Entities.Employee;
import Entities.Phone;

import javax.persistence.EntityManager;

/**
 * Created by linhtran on 12/04/2017.
 */
public class PhoneIML implements PhoneDAO {
    public boolean insert(Phone phone) {
        EntityManager entityManager= PersistenceUtil.getEntityManager();
        try
        {
            entityManager.getTransaction().begin();
            entityManager.persist(phone);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(int id) {
        EntityManager entityManager= PersistenceUtil.getEntityManager();
        Phone phone=entityManager.find(Phone.class,id);
        if(phone==null)
        {
            return  false;
        }
        try
        {
            entityManager.getTransaction().begin();
            entityManager.remove(phone);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }
    }
}
