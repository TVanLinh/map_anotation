package View;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entities.Parent;
import Entities.Person;
import Model.PersistenceUtil;
import java.util.List;

/**
 * Created by linhtran on 15/04/2017.
 */
public class TestNativeQuery {
    public static void main(String[] args) {
       String str="select id,name,address,weight,birth_day from Person";

       // System.out.println(testSelect3(str).size());

//        String str2="select sum(weight) as 'hello' from Person ";
//        System.out.println(testSelect4(str2));

        String str3="select * from Person p join employee e on p.id= e.IDEMPLOYEE";

        String str4="select * from Person p  inner join employee e on p.id= e.IDEMPLOYEE";
        String str5="select * from Person where name like '%i%'";
     //   in(testSelect3(str3));
        System.out.println("-------------------------------------");
        in2(testSelect1(str5));

    }

    public static List<Object[]> testSelect1(String str)
    {
        //String str="select * from Person,employee WHERE  Person.id=employee.IDEMPLOYEE ORDER BY Person.name";
        EntityManager entityManager= PersistenceUtil.getEntityManager();

        Query query= entityManager.createNativeQuery(str);

        return query.getResultList();
    }
    public static List<Person> testSelect2()
    {
        String str="select * from Person";
        EntityManager entityManager= PersistenceUtil.getEntityManager();

        Query query= entityManager.createNativeQuery(str,Person.class);

        return query.getResultList();
    }
    public  static List<Person> testSelect3(String str)
    {
       // String str4="select * from Person p  RIGHT join employee e on p.id= e.IDEMPLOYEE";
        EntityManager entityManager=PersistenceUtil.getEntityManager();

        return   entityManager.createNativeQuery(str,Person.class).getResultList();
    }
    public  static Double testSelect4(String str)
    {
        //String str4="select * from Person p    FULL join employee e on p.id= e.IDEMPLOYEE";
        EntityManager entityManager=PersistenceUtil.getEntityManager();

        return  (Double) entityManager.createNativeQuery(str).getSingleResult();
    }
//    public  static  List<Person> testJoin()
//    {
//
//    }

    public static void in(List<Person> list)
    {
        for (Person person:list)
        {
            System.out.println(person);
        }
    }
    public static void in2(List<Object[]> list)
    {
        for (Object[] persons:list)
        {
            for (int i=0;i<persons.length;i++)
            {
                System.out.print(persons[i]+"\t\t\t");
            }
            System.out.println();
        }
    }
}
