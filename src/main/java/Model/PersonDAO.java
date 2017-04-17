package Model;

import Entities.Person;

import java.util.List;

/**
 * Created by linhtran on 14/04/2017.
 */
public interface PersonDAO {
    boolean insert(Person person);
    List<Person> findALL();
}
