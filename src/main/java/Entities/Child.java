package Entities;

import org.hibernate.annotations.*;

import javax.annotation.Resource;
import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

/**
 * Created by linhtran on 15/04/2017.
 */
@Entity
@Table(name = "Child")
@NamedNativeQueries({
        @NamedNativeQuery(name="Child.findAll",query = "SELECT * from Child ",resultClass = Child.class),
        @NamedNativeQuery(name="convertChildDTO",query = "SELECT id, name from Child",resultSetMapping = "id_and_name",resultClass = Child.class),
        @NamedNativeQuery(name="child_parent",query = "SELECT Parent.id,Parent.name,Child.id,Child.name from Child,Parent",resultSetMapping = "child_parent")
})

@SqlResultSetMapping(name = "id_and_name",
classes = @ConstructorResult(targetClass =
        ChildDTO.class,columns = {
            @ColumnResult(name="id"),
            @ColumnResult(name="name")}))
@SqlResultSetMappings(
        {
                @SqlResultSetMapping(name = "child_parent",entities = {
                        @EntityResult(
                                entityClass = Child.class,
                                fields = {
                                        @FieldResult(name="id",column = "Child.id"),
                                        @FieldResult(name="name",column = "Child.name")
                                }
                        ),
                        @EntityResult(entityClass = Parent.class,
                        fields = {
                                @FieldResult(name="id",column = "Parent.id"),
                                @FieldResult(name="name",column = "Parent.name")
                        }
                        )
                })
        }
)
public class Child {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_parent")
    private Parent parent;


    public Child() {
    }
    public Child(int id,String name) {
        this.id=id;
        this.name = name;
    }
    public Child(String name) {
        this.name = name;
    }

    public Child(String name, Parent parent) {
        this.name = name;
        this.parent = parent;
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

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
