package Model;

import Entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Queue;

/**
 * Created by linhtran on 14/04/2017.
 */
public class PersonIML implements  PersonDAO{

    public boolean insert(Person person) {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(person);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e)
        {
            return false;
        }
    }

    public List<Person> findALL() {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        Query query=entityManager.createNamedQuery("person.findAll");
        return  query.getResultList();
    }
}
