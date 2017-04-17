package View;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import javax.persistence.metamodel.CollectionAttribute;

import Entities.Employee;
import Entities.Person;
import Entities.User;
import Model.PersistenceUtil;
import org.hibernate.Criteria;

import java.util.List;

/**
 * Created by linhtran on 14/04/2017.
 */
public class TestCriteria
{
    public static void main(String[] args) {
//
//        EntityManager entityManager= PersistenceUtil.getEntityManager();
//        CriteriaBuilder  criteriaBuilder=entityManager.getCriteriaBuilder();
//
//        CriteriaQuery<Person> query=criteriaBuilder.createQuery(Person.class);
//
//        Root<Person> root=query.from(Person.class);
//
//        query.select(root);
//
//        query.where(criteriaBuilder.equal(root.get("name"),"Tran Van Linh"));
//
//        List<Person> list=entityManager.createQuery(query).getResultList();
//
//        for (Person person:list)
//        {
//            System.out.println(person);
//        }

        //selectName();
       // multiselect();
      // testSelectWithContruct();
       // testMultiSelectWithContruct();
       // testPredicate();
        testJoin();
    }
    public static void selectName()
    {
        EntityManager entityManager=PersistenceUtil.getEntityManager();

        CriteriaBuilder builder=entityManager.getCriteriaBuilder();

        CriteriaQuery<String> query=builder.createQuery(String.class);

        Root<Person> root=query.from(Person.class);

        query.select(root.<String>get("name"));

        query.distinct(true);
        List<String> list=entityManager.createQuery(query).getResultList();

        for(String list1:list)
        {
            System.out.println(list1);
        }
    }

    public static void multiselect()
    {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        CriteriaBuilder builder=entityManager.getCriteriaBuilder();

        CriteriaQuery<Object[]> query=builder.createQuery(Object[].class);

        Root<Person> root=query.from(Person.class);

        query.multiselect(root.get("name"),root.get("address"));

        List<Object[]> list=entityManager.createQuery(query).getResultList();

        for(Object[] objects: list)
        {
            for (int i=0;i<objects.length;i++)
            {
                System.out.print(objects[i]+"\t");
            }
            System.out.println();
        }
    }

    public  static  void testSelectWithContruct()
    {
        EntityManager entityManager=PersistenceUtil.getEntityManager();

        CriteriaBuilder builder=entityManager.getCriteriaBuilder();

        CriteriaQuery<User> query=builder.createQuery(User.class);

        Root<Person> root=query.from(Person.class);

        query.select(builder.construct(User.class,root.get("id"),root.get("name")));
        query.where(builder.equal(root.get("id"),2));
        List<User> users =entityManager.createQuery(query).getResultList();

        for (User user:users)
        {
            System.out.println(user);
        }
    }


    public static void testMultiSelectWithContruct()
    {
        EntityManager entityManager=PersistenceUtil.getEntityManager();

        CriteriaBuilder builder=entityManager.getCriteriaBuilder();

        CriteriaQuery<Object[]> query=builder.createQuery(Object[].class);

        Root<Person> root=query.from(Person.class);

        query.multiselect(builder.construct(User.class,root.get("id"),root.get("name")));

        List<Object[]> list=entityManager.createQuery(query).getResultList();
        System.out.println(list.size());
    }

    public  static  void testPredicate()
    {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        CriteriaBuilder builder=entityManager.getCriteriaBuilder();
        CriteriaQuery<User> query=builder.createQuery(User.class);

        Root<Person> root=query.from(Person.class);
        query.select(builder.construct(User.class,root.get("id"),root.get("name")));

        Predicate predicate=builder.and(builder.notEqual(root.get("id"),2),builder.notEqual(root.get("name"),"A"));
        Predicate predicate2=builder.and(builder.equal(root.get("id"),2),builder.notEqual(root.get("address"),"A"));

       // query.where(builder.and(predicate));
        query.where(builder.or(predicate,predicate2));
        List<User> list=entityManager.createQuery(query).getResultList();
        System.out.println(list.size());
    }

    public static void testJoin()
    {
        EntityManager entityManager=PersistenceUtil.getEntityManager();
        CriteriaBuilder builder=entityManager.getCriteriaBuilder();

        CriteriaQuery query=builder.createQuery(Person.class);

        Root<Person> root=query.from(Person.class);

        //Join<Person, Employee> join=root.join();
    }
}
