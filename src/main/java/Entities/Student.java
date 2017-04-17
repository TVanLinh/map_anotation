package Entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by linhtran on 13/04/2017.
 */
@Embeddable
public class Student {
    @Column(name = "student_name")
    private  String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
