package Entities;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Created by linhtran on 13/04/2017.
 */
@Entity
@Table(name = "class")
public class Class {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;


    @Basic
    @Column(name = "name")
    private String name;

//    @ElementCollection(fetch = FetchType.EAGER)
//    @CollectionTable(name = "student", joinColumns = @JoinColumn(name = "id"))
    //@MapKeyJoinColumn(name="id",referencedColumnName = "id")
    //@MapKeyColumn(name = "id")
    //@MapKey(name = "id")
    @Transient
    Map<Integer, String> students;

   // List<Student> students;

    public Class() {
    }

    public Class(String name) {
        this.name = name;
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


    public Map<Integer, String> getStudents() {
        return students;
    }

    public void setStudents(Map<Integer, String> students) {
        this.students = students;
    }

//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
}
