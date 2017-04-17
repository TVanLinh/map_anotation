package Model;

import Entities.Employee;

import javax.persistence.EntityManager;

/**
 * Created by linhtran on 12/04/2017.
 */
public class EmployeeIML implements EmployeeDAO {
    public boolean insert(Employee employee) {
        EntityManager entityManager= PersistenceUtil.getEntityManager();
        try
        {
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
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
        Employee employee=entityManager.find(Employee.class,id);
        if(employee==null)
        {
            return  false;
        }
        try
        {
            entityManager.getTransaction().begin();
            entityManager.remove(employee);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }
    }

    public Employee find(int id) {
        return PersistenceUtil.getEntityManager().find(Employee.class,id);
    }
}
