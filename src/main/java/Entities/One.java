package Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "One")
public class One {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Basic
  @Column(name = "name")
  private String name;

  @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
  @JoinTable(name = "One_True",joinColumns = {@JoinColumn(name = "id_one")},inverseJoinColumns = {
          @JoinColumn(name = "id_true")
  })
  List<Two> twos;

  public One() {
  }

  public One(String name) {
    this.name = name;
  }

  public One(String name, List<Two> twos) {
    this.name = name;
    this.twos = twos;
  }

  public List<Two> getTwos() {
    return twos;
  }

  public void setTwos(List<Two> twos) {
    this.twos = twos;
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

  @Override
  public String toString() {
    return "One{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
