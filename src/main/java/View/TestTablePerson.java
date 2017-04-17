package View;

import Entities.Person;
import Entities.Result;
import Model.PersistenceUtil;
import Model.PersonDAO;
import Model.PersonIML;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.text.html.parser.Entity;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by linhtran on 14/04/2017.
 */
public class TestTablePerson {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        PersonDAO personDAO=new PersonIML();
//      //
//        calendar.set(1995,07,18);
//        Date date=calendar.getTime();
//        Person person=new Person("Ma Van Tai",date,70,"Ha Noi");
//
//        personDAO.insert(person);
//        List<Person> people=personDAO.findALL();
//
//        for(Person person:people)
//        {
//            System.out.println(person);
//        }


        EntityManager entityManager= PersistenceUtil.getEntityManager();

//        String strQuery="select e from Person e where e.address in ("+
//                "'Hoa Binh',"+"'HaNoi'"
//                +")";
//        Query query=entityManager.createQuery(strQuery);
//        List<Person> people=query.getResultList();
//        for(Person person:people)
//        {
//            System.out.println(person);
//        }

        //String strQ="select e from Person e";
      //  Query query=entityManager.createQuery(strQ);
      //  List<Integer> list=query.getResultList();
//
//        for(Integer object:list)
//        {
//            System.out.println(object);
//        }
//        TypedQuery<Person> resultTypedQuery=entityManager.createQuery(strQ,Person.class);
//        List<Person> results=resultTypedQuery.getResultList();
//
//        for(Person object:results)
//        {
//            System.out.println(object);
//        }

//        String str="select e from Person e where e.address=:address";
//
//        Query query=entityManager.createQuery(str);
//        query.setParameter("address","Ha Noi");

//       List<Person> people=query.getResultList();
//        for(Person person:people)
//        {
//            System.out.println(person);
//        }

//        String str="select e from  Person e where  DATE(e.birthDay) >'2017-04-14'";
//        Query query=entityManager.createQuery(str);
//        List<Person> people=query.getResultList();
//        for(Person person:people)
//        {
//            System.out.println(person);
//        }

//        String str="select extract(Month from e.birthDay)from Person e where id=2";
//        Query query=entityManager.createQuery(str);
//        Integer year=(Integer)query.getSingleResult();
        //System.out.println(year);

        //String str="select  count (e.id) from Person e where  e.address='Ha Noi'";
//        Query query=entityManager.createQuery(str);
//        System.out.println(query.getSingleResult());
//      List<Person> people=query.getResultList();
//        for(Person person:people)
//        {
//            System.out.println(person);
//       }

        String str="select e from Person e where e.id>0 group by e.address having count (e.address)>=2";
        Query query=entityManager.createQuery(str);

        str="select e from Person  e where  e.id between 1 and 3";
        query=entityManager.createQuery(str);
        List<Person> people=query.getResultList();

        for(Person person:people)
        {
            System.out.println(person);
        }
    }

}
