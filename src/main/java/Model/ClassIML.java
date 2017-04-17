package Model;

import Entities.Class;
import Entities.Employee;

import javax.persistence.EntityManager;

/**
 * Created by linhtran on 13/04/2017.
 */
public class ClassIML implements ClassDAO {
    public boolean insert(Class c) {
        EntityManager entityManager= PersistenceUtil.getEntityManager();
        try
        {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }
    }

    public boolean insert(java.lang.Class c) {
        return false;
    }

    public Class find(int id) {
         return PersistenceUtil.getEntityManager().find(Class.class,id);
    }
//    public boolean delete(int id) {
//        EntityManager entityManager= PersistenceUtil.getEntityManager();
//        Employee employee=entityManager.find(Employee.class,id);
//        if(employee==null)
//        {
//            return  false;
//        }
//        try
//        {
//            entityManager.getTransaction().begin();
//            entityManager.remove(employee);
//            entityManager.getTransaction().commit();
//            return true;
//        }catch (Exception e)
//        {
//            entityManager.getTransaction().rollback();
//            e.printStackTrace();
//            return false;
//        }
//    }


}
