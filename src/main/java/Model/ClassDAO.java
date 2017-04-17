package Model;

/**
 * Created by linhtran on 13/04/2017.
 */
import  Entities.Class;
public interface ClassDAO {
    boolean insert(Class c);
    Class find(int id);
}
