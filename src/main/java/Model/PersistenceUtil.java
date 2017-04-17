package Model;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by linhtran on 12/04/2017.
 */
public class PersistenceUtil
{
    private static final String NAME_PUNIT="csdldemo2";
    private  static EntityManager entityManager;

    public  static  EntityManager getEntityManager()
    {
        if(entityManager!=null)
        {
            return entityManager;
        }
        return (entityManager= Persistence.createEntityManagerFactory(NAME_PUNIT).createEntityManager());
    }
}
