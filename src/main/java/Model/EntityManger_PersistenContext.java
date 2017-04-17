package Model;

import Entities.Parent;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 * Created by linhtran on 15/04/2017.
 */
public  class EntityManger_PersistenContext {
    @PersistenceContext(unitName = "csdldemo2")
    EntityManager entityManager;

    public  boolean insertParent(Parent parent)
    {
        try
        {
            entityManager.persist(parent);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        EntityManger_PersistenContext persistenContext=new EntityManger_PersistenContext();
        persistenContext.insertParent(new Parent("Tran Quang Hieu"));
    }
}
