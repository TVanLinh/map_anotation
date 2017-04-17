package Entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by linhtran on 15/04/2017.
 */
@Entity
@Table(name = "Parent")
@NamedNativeQuery(name="Parent.findAll",query = "SELECT * from Parent ",resultClass = Parent.class)

public class Parent {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "parent",cascade = CascadeType.ALL)
    private Child childList;



    public Parent() {
    }
    public Parent(String name) {
        this.name = name;
    }
    public Parent(int id,String name) {
        this.id=id;
        this.name = name;
    }
    public Parent(String name,Child childList) {
        this.name = name;
        this.childList = childList;
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

//    public List<Child> getChildList() {
//        return childList;
//    }
//
//    public void setChildList(List<Child> childList) {
//        this.childList = childList;
//    }

    public Child getChild() {
        return childList;
    }

    public void setChild(Child childList) {
        this.childList = childList;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
