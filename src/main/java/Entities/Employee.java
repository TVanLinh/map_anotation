package Entities;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by linhtran on 13/04/2017.
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "IDEMPLOYEE", nullable = false)
    private int idemployee;

    @Basic
    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    private String firstName;

    @Basic
    @Column(name = "LAST_NAME", nullable = false, length = 50)
    private String lastName;

    @OneToMany(mappedBy = "ownerIdemployee",cascade = CascadeType.PERSIST)
    //@MapKeyColumn(name ="PROVIDER" )//column map work key
    @MapKey(name = "idPhone")
    private Map<Integer,Phone> hashMapPhone;


    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, Map<Integer, Phone> hashMapPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hashMapPhone = hashMapPhone;
    }

    public int getIdemployee() {
        return idemployee;
    }

    public void setIdemployee(int idemployee) {
        this.idemployee = idemployee;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<Integer, Phone> getHashMapPhone() {
        return hashMapPhone;
    }

    public void setHashMapPhone(Map<Integer, Phone> hashMapPhone) {
        this.hashMapPhone = hashMapPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (idemployee != employee.idemployee) return false;
        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idemployee;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idemployee=" + idemployee +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
