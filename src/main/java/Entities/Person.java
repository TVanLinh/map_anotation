package Entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by linhtran on 14/04/2017.
 */
@Entity
@Table(name = "Person")
@NamedQueries({
        @NamedQuery(name = "person.findAll",query = "select e from Person  e")
})
public class Person
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int id;

    @Basic
    @Column(name = "name")
    private  String name;

    @Column(name = "weight")
    private double weight;

    @Column(name = "birth_day")
    private Date birthDay;

    @Column(name = "address")
    private  String address;

    public Person() {
    }

    public Person(int id,String name) {
        this.id=id;
        this.name = name;
    }

    public Person(String name, Date birthDay, double weight, String address) {
        this.name = name;
        this.weight = weight;
        this.birthDay = birthDay;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getDate() {
        return birthDay;
    }

    public void setDate(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", birthDay=" + birthDay +
                ", address='" + address + '\'' +
                '}';
    }
}
