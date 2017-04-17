package View;

import Entities.Class;
import Entities.Student;
import Model.ClassDAO;
import Model.ClassIML;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linhtran on 13/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        ClassDAO classDAO=new ClassIML();
        Class a=new Class("A");
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("La Van Tai"));
        students.add(new Student("Hoang Tat Tai"));
       // a.setStudents(students);
        //classDAO.insert(a);
        Class cl=classDAO.find(5);
//        cl.getStudents().put(5,new Student("Tran Van Linh"));
    }
}
