package View;

import javax.persistence.EntityManager;

import Entities.Child;
import Entities.ChildDTO;
import Entities.Parent;
import Entities.Person;
import Model.PersistenceUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linhtran on 15/04/2017.
 */
public class TestParent_Child {
    public static void main(String[] args) {
        EntityManager entityManager= PersistenceUtil.getEntityManager();
//        List<Child> childList=new ArrayList<Child>();
//        Parent parent=new Parent("Tran ");
//
//        childList.add(new Child("Tran Van linh",parent));
//        parent.setChildList(childList);
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(parent);
//        entityManager.getTransaction().commit();

//        Child child=new Child("ok men");
//        Parent parent=entityManager.find(Parent.class,1);
//        child.setParent(parent);
//        entityManager.getTransaction().begin();
//        entityManager.persist(parent);
//        entityManager.getTransaction().commit();
//          List<Child> childs=entityManager.createNamedQuery("Child.findAll").getResultList();
//
//          for (Child child:childs)
//          {
//              System.out.println(child);
//          }
//          List<Parent> parents=entityManager.createNamedQuery("Parent.findAll").getResultList();
//
//          for (Parent person:parents)
//          {
//              System.out.println(person);
//          }

//        Parent parent=new Parent("Tran Van Bao");
//        Child child=new Child("La Van Tai");
//        parent.setChild(child);
//        child.setParent(parent);
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(parent);
//        entityManager.getTransaction().commit();

//        List<ChildDTO> dtoList=entityManager.createNamedQuery("convertChildDTO").getResultList();
//        for (ChildDTO childDTO1:dtoList)
//        {
//            System.out.println(childDTO1);
//        }

//        List<Object[]> list=entityManager.createNamedQuery("child_parent").getResultList();

        entityManager.getTransaction().begin();
       // Child child=entityManager.find(Child.class,1);
      //  child.setName("La Van Tai new");

        Parent parent=new Parent("parent1");
        Child child=new Child("Child1");
        child.setParent(parent);
       // entityManager.getTransaction().rollback();



        entityManager.persist(child);
        entityManager.getTransaction().commit();
//
//       System.out.println(child);
    }
}
