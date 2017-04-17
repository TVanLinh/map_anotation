package View;

import Entities.Employee;
import Entities.Phone;
import Model.EmployeeDAO;
import Model.EmployeeIML;
import Model.PhoneDAO;
import Model.PhoneIML;

import java.util.Set;

/**
 * Created by linhtran on 13/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO=new EmployeeIML();

        Employee employee=new Employee("Tran Van ","Linh");
       // employeeDAO.insert(employee);

//        Phone phone=new Phone("Hai Phong","0948628725",employeeDAO.find(1));
//        PhoneDAO phoneDAO=new PhoneIML();
//        phoneDAO.insert(phone);

        Employee employee1=employeeDAO.find(1);

        Set<Integer> keys=employee1.getHashMapPhone().keySet();

        for(Integer str:keys)
        {
            System.out.println("Key "+str);
            System.out.println(employee1.getHashMapPhone().get(str));
        }
    }
}
