package Model;

import Entities.Employee;

/**
 * Created by linhtran on 12/04/2017.
 */
public interface EmployeeDAO {
    boolean insert(Employee employee);
    boolean delete(int id);
    Employee find(int id);
}
