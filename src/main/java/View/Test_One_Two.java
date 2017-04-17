package View;

import Entities.One;
import Entities.Two;
import Model.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linhtran on 15/04/2017.
 */
public class Test_One_Two {
    public static void main(String[] args) {
        EntityManager entityManager= PersistenceUtil.getEntityManager();

//        One one=new One("One 1");
//        List<Two> twos=new ArrayList<Two>();
//        twos.add(new Two("t1"));
//        twos.add(new Two("t2"));
//        twos.add(new Two("t3"));
//        twos.add(new Two("t4"));
//        one.setTwos(twos);

        Two two=entityManager.find(Two.class,1);
       // Two two=new Two("Moi");
        List<One> list=new ArrayList<One>();
        list.add(entityManager.find(One.class,14));
        list.add(new One("oo2"));
        list.add(new One("oo3"));
        list.add(new One("oo4"));
        two.setOnes(list);
        entityManager.getTransaction().begin();
        entityManager.persist(two);
        entityManager.getTransaction().commit();
    }
}
